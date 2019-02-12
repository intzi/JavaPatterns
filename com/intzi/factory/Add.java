package com.intzi.factory;

public class Add implements Calculate{

	@Override
	public Double calculate(double a, double b) {
		return a+b;
	}

}
