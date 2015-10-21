package com.hwccy.MavenHibernate.dao.impl;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.hwccy.MavenHibernate.dao.BaseDAO;
import com.hwccy.MavenHibernate.util.HibernateUtil;

public class BaseDAOImpl<T> implements BaseDAO<T> {

	private Session session;
	private Transaction transaction;
	
	public boolean save(T t) {
		try {
			session=HibernateUtil.getSessionFactory().openSession();
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

	//键值对的值是字符串时要用''包裹
	public List<T> select(Map<String, Object> map,String name) {
		List<T> list=null;
		try {
			session=HibernateUtil.getSessionFactory().openSession();
			transaction=session.beginTransaction();
			
			String hql="from "+ name +" a";
			Set<String> keys= map.keySet();
			if (!map.isEmpty()) {
				hql+=" where";
				Iterator<String> iterator=keys.iterator();
				while (iterator.hasNext()) {
					String key= iterator.next();
					hql+=" a."+key+"=:"+key+" and";
				}			
				hql=hql.substring(0, hql.length()-4);
			}
			Query query=session.createQuery(hql);
			if (!map.isEmpty()) {
				for (Iterator iterator = keys.iterator(); iterator.hasNext();) {
					String key = (String) iterator.next();
					query.setEntity(key, map.get(key));
				}
			}
			list=query.list();
			
			transaction.commit();
			
		} catch (Exception e) {
			if (transaction!=null) {
				transaction.rollback();
			}
			e.printStackTrace();
		}finally {
			if (session!=null) {
				session.close();
			}
		}
		return list;
	}

}
