package com.hwccy.MavenHibernate.entity;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

public class Customer implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private long id;
	private String name;
	private Set<Order> set=new HashSet<Order>(0);
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Set<Order> getSet() {
		return set;
	}
	public void setSet(Set<Order> set) {
		this.set = set;
	}
	public String toString2() {
		return "Customer [id=" + id + ", name=" + name  + "]";
	}
	

}
