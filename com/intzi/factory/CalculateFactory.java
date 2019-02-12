package com.intzi.factory;

public class CalculateFactory {
	//Gather All plug-ins(Add, Subtract) to one class using interfaces and then use
	//that class return you the corresponding plug-in.
	public Calculate getCalculation(String type) {
		
		Calculate calculate = null;

		if(type.toLowerCase() == "add") {
			calculate = new Add();
		}else if(type.toLowerCase() == "subtract") {
			calculate = new Subtract();
		}else {
			System.out.println("Wrong type");
		}
		
		return calculate;
	}

}
