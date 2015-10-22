package com.hwccy.MavenHibernate.dao.impl;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.hwccy.MavenHibernate.dao.CustomerDAO;
import com.hwccy.MavenHibernate.entity.Customer;

@Repository
public class CustomerDAOImpl extends BaseDAOImpl<Customer> implements CustomerDAO {

	public boolean save(Customer t) {
		// TODO Auto-generated method stub
		return super.save(t);
	}

	public List<Customer> select(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return super.select(map);
	}

	@Override
	Class<Customer> getEntityClass() {
		// TODO Auto-generated method stub
		return Customer.class;
	}

}
