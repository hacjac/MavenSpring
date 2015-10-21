package com.hwccy.MavenHibernate.dao.impl;

import java.util.List;
import java.util.Map;

import com.hwccy.MavenHibernate.dao.CustomerDAO;
import com.hwccy.MavenHibernate.entity.Customer;

public class CustomerDAOImpl extends BaseDAOImpl<Customer> implements CustomerDAO {

	public boolean save(Customer t) {
		// TODO Auto-generated method stub
		return super.save(t);
	}

	public List<Customer> select(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return super.select(map, "Customer");
	}

}
