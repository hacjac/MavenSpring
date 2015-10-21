package com.hwccy.MavenHibernate.dao;

import java.util.List;
import java.util.Map;

public interface BaseDAO<T> {

	public boolean save(T t);
	
	public List<T> select(Map<String, Object> map,String name); 
	
}
