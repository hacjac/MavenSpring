package com.hwccy.MavenHibernate.dao.impl;

import java.util.List;
import java.util.Map;

import com.hwccy.MavenHibernate.dao.OrderDAO;
import com.hwccy.MavenHibernate.entity.Order;

public class OrderDAOImpl extends BaseDAOImpl<Order> implements OrderDAO {

	public boolean save(Order t) {
		// TODO Auto-generated method stub
		return super.save(t);
	}

	public List<Order> select(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return super.select(map);
	}

	@Override
	Class<Order> getEntityClass() {
		// TODO Auto-generated method stub
		return Order.class;
	}

}
