package com.hwccy.MavenSpring.entity;

public class Car {
	
	private double price=0;
	private String brand="no";
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	@Override
	public String toString() {
		return "Car [price=" + price + ", brand=" + brand + "]";
	}
	
	
}
