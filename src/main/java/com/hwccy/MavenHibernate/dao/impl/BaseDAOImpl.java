package com.hwccy.MavenHibernate.dao.impl;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;

import com.hwccy.MavenHibernate.dao.BaseDAO;

public abstract class BaseDAOImpl<T> implements BaseDAO<T> {

	private Session session;
	private Transaction transaction;
	private SessionFactory sessionFactory;
	
	@Autowired
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	public Session getSession() {
		return sessionFactory.openSession();
	}
	
	abstract Class<T> getEntityClass();
	
	public boolean save(T t) {
		try {
			session=sessionFactory.openSession();
			transaction=session.beginTransaction();
			
			session.save(t);
			transaction.commit();
			
		} catch (Exception e) {
			if (transaction!=null) {
				transaction.rollback();				
			}
			e.printStackTrace();
			return false;
		}finally {
			if (session!=null) {
				session.close();				
			}
		}
		return true;
	}
	
	public List<T> select(Map<String, Object> map) {
		Criteria criteria= getSession().createCriteria(getEntityClass());
		List<T> list=null;
		if (map!=null) {
			if (!map.isEmpty()) {
				Set<String> keys=map.keySet();
				for (Iterator iterator = keys.iterator(); iterator.hasNext();) {
					String key = (String) iterator.next();
					Object value=map.get(key);
					if (value instanceof Collection<?>) {
						criteria.add(Restrictions.in(key, (Collection<?>)value));
					}else if (value instanceof Object[]) {
						criteria.add(Restrictions.in(key, (Object[]) value));
					}else {
						criteria.add(Restrictions.eq(key, value));
					}
				}
			}
		}
		list=criteria.list();
		return list;
	}
}
