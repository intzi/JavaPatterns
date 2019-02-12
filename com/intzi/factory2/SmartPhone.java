package com.intzi.factory2;

public class SmartPhone implements TechProduct{
	
	double price;
	String name;
	int cores;
	double cameraResolution;
	
	public SmartPhone(String name, Double price) {
		setName(name);
		setPrice(price);
		
		cores = 0;
		cameraResolution = 0;
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
	
	public void setCameraResolution(double cameraResolution) {
		this.cameraResolution = cameraResolution;
	}

	public double getCameraResolution() {
		return cameraResolution;
	}


}
