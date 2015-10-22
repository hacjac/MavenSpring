package com.hwccy.MavenHibernate.service;

import java.util.List;
import java.util.Map;

public interface BaseService<T> {

	public boolean save(T t);
	
	public List<T> get(Map<String, Object> map);
	
}
