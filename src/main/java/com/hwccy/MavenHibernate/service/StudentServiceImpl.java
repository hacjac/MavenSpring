package com.hwccy.MavenHibernate.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hwccy.MavenHibernate.dao.StudentDAO;
import com.hwccy.MavenHibernate.entity.Student;

@Service
public class StudentServiceImpl extends BaseServiceImpl<Student> implements StudentService {

	@SuppressWarnings("unused")
	private StudentDAO studentDAO;
	
	@Autowired
	public void setStudentDAO(StudentDAO studentDAO) {
		this.studentDAO = studentDAO;
		super.setBaseDAO(studentDAO);
	}


}
