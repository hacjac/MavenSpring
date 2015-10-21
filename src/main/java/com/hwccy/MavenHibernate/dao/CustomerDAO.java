package com.hwccy.MavenHibernate.dao;

import java.util.List;
import java.util.Map;

import com.hwccy.MavenHibernate.entity.Customer;

public interface CustomerDAO extends BaseDAO<Customer> {
	public List<Customer> select(Map<String, Object> map);
}
