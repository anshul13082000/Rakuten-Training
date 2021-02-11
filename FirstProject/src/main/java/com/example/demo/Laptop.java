package com.example.demo;

import org.springframework.stereotype.Component;

@Component("lap1")
public class Laptop {
	
	private int id;
	private int brand_name;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getBrand_name() {
		return brand_name;
	}
	public void setBrand_name(int brand_name) {
		this.brand_name = brand_name;
	}
	
	
	
	@Override
	public String toString() {
		return "Laptop [id=" + id + ", brand_name=" + brand_name + "]";
	}
	public void compile() {
		System.out.println("Compiling...");
	}

}
