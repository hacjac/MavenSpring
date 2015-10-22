package com.hwccy.MavenHibernate.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hwccy.MavenHibernate.dao.BaseDAO;

@Service
public abstract class BaseServiceImpl<T> implements BaseService<T>{

	private BaseDAO<T> baseDAO;

	public void setBaseDAO(BaseDAO<T> baseDAO) {
		this.baseDAO = baseDAO;
	}
	
	@Override
	public boolean save(T t) {
		return baseDAO.save(t);
	}
	
	@Override
	public List<T> get(Map<String, Object> map) {
		return baseDAO.select(map);
	}
	
}
