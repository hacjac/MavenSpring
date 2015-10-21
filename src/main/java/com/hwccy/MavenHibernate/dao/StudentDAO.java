package com.hwccy.MavenHibernate.dao;

import java.util.List;
import java.util.Map;

import com.hwccy.MavenHibernate.entity.Student;

public interface StudentDAO extends BaseDAO<Student> {
	public List<Student> select(Map<String, Object> map);
}
