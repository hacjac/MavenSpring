package com.hwccy.MavenSpring.entity;

public class Office {

	private int officeNo=001;

	public int getOfficeNo() {
		return officeNo;
	}

	public void setOfficeNo(int officeNo) {
		this.officeNo = officeNo;
	}

	@Override
	public String toString() {
		return "Office [officeNo=" + officeNo + "]";
	}
	
	
	
}
