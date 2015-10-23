package com.hwccy.MavenHibernate.controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.hwccy.MavenHibernate.entity.Student;
import com.hwccy.MavenHibernate.service.StudentService;

@Controller
public class StudentController {
	
	@Autowired
	private StudentService service;
	
	@RequestMapping(value="/student/show",method=RequestMethod.GET)
	public String show(HttpServletRequest request,HttpServletResponse response,ModelMap modelMap){
		List<Student> list= service.get(null);
		modelMap.put("stus", list);
		return "student";
	}
	
}
