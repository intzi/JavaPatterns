package com.intzi.factory2;


public class Laptop implements TechProduct{
	
	double price;
	String name;
	int cores;
	String OS;
	
	public Laptop(String name, double price) {
		setName(name);
		setPrice(price);
		
		cores = 0;
		OS = "";
	}
	
	@Override
	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public double getPrice() {
		return price;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public void setCores(int cores) {
		this.cores = cores;
	}

	public void setOS(String oS) {
		OS = oS;
	}
	
	public String getOS() {
		return OS;
	}



}
