package com.hwccy.MavenHibernate.dao;

import java.util.List;
import java.util.Map;

import org.hibernate.SessionFactory;

public interface BaseDAO<T> {

	public boolean save(T t);
	
	public List<T> select(Map<String, Object> map); 
	
	public void setSessionFactory(SessionFactory sessionFactory);

}
