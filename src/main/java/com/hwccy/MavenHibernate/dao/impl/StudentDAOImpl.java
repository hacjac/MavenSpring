package com.hwccy.MavenHibernate.dao.impl;

import java.util.List;
import java.util.Map;

import com.hwccy.MavenHibernate.dao.StudentDAO;
import com.hwccy.MavenHibernate.entity.Student;

public class StudentDAOImpl extends BaseDAOImpl<Student> implements StudentDAO {

	public boolean save(Student t) {
		// TODO Auto-generated method stub
		return super.save(t);
	}

	public List<Student> select(Map<String, Object> map) {
		return super.select(map, "Student");
	}

}