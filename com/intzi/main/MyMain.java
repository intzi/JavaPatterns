package com.intzi.main;

import com.intzi.observer.example2.DisplayDevice;
import com.intzi.observer.example2.StatisticsDisplay;
import com.intzi.observer.example2.WeatherStation;

public class MyMain {

	public static void main(String[] args) {
		
		/* ~~~ Singleton ~~~
		Logger logger = Logger.getInstance();
		logger.add("Main Called");
		MyClass myClass = new MyClass();
		System.out.println(logger);
		*/
		
		
		/* ~~~ Factory ~~~
		Calculate cal = new CalculateFactory().getCalculation("subtract");
		
		if(cal instanceof Add) {
			System.out.print("a+b: ");
		}else{
			System.out.print("a-b: ");
		}
		System.out.println(cal.calculate(8, 2));
		*/
		
		/* ~~~ Factory 2 ~~~
		ArrayList<Product> products = new ArrayList<>();
		Product smartphone = new MarketFactory("Iphone 7", 700).getProduct(ProductType.SmartPhone);
		Product laptop = new MarketFactory("Dell 13 XPS", 1700).getProduct(ProductType.Laptop);
		
		((SmartPhone)smartphone).setCameraResolution(12);
		products.add(smartphone);
		((Laptop)laptop).setOS("Windows");
		products.add(laptop);
		
		for(Product p : products) {
			System.out.print("Name: "+p.getName()+" Price: "+p.getPrice());
			
			if(p instanceof SmartPhone) {
				System.out.print(" Camera: "+((SmartPhone)p).getCameraResolution());
			}else if(p instanceof Laptop) {
				System.out.print(" OS: "+((Laptop)p).getOS());
			}else {
				//
			}
			System.out.println("\n");
		}
		*/
		
		/* ~~~ Template Method ~~~
		WriteTextFile txt1 = new WriteTextFile();
		txt1.openFileWriteAndSave();
		WriteXML txt2 = new WriteXML();
		txt2.openFileWriteAndSave();
		
		FileProcessor txt = new WriteTextFile();
		txt.fileOpenEditAndSave();
		((WriteTextFile)txt).textMethod();
		txt = new WriteXML();
		txt.fileOpenEditAndSave();
		((WriteXML)txt).xmlMethod();
		*/


		// Strategy Design Pattern
		/*
			TextFile file = new TextFile("Hello i'm Dimitris");
			file.encrypt();
			System.out.println(file);
			file.setEncrypt(new FakeEncryptionTwo());
			file.encrypt();
			System.out.println(file);
		*/

		// Observer Design Pattern
		/*
			Publisher publisher = new Publisher();
			FirstSubscriber s1 = new FirstSubscriber(publisher);
			SecondSubscriber s2 = new SecondSubscriber(publisher);
			publisher.addNewspaperAndNotify("Hello 1");
			publisher.addNewspaperAndNotify("Hello 2");
		*/

		// Observer Design Pattern 2
		/*
			WeatherStation station = new WeatherStation();
			new DisplayDevice(station);
			new DisplayDevice(station);
			new StatisticsDisplay(station);
			station.start();
		*/

	}

}


