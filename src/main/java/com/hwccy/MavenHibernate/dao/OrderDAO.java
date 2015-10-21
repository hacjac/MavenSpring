package com.hwccy.MavenHibernate.dao;

import java.util.List;
import java.util.Map;

import com.hwccy.MavenHibernate.entity.Order;

public interface OrderDAO extends BaseDAO<Order> {
	public List<Order> select(Map<String, Object> map);
}
