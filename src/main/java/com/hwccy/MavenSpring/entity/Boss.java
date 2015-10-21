package com.hwccy.MavenSpring.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("boss")
public class Boss {

	@Qualifier("office2")
	@Autowired
	private Office office;
	@Qualifier("car2")
	@Autowired
	private Car car;
	public Office getOffice() {
		return office;
	}
	public Car getCar() {
		return car;
	}
	@Override
	public String toString() {
		return "Boss [office=" + office + ", car=" + car + "]";
	}
	
	
	
}
