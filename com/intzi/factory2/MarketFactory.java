package com.intzi.factory2;

public class MarketFactory {
	String productName;
	Double price;
	
	public MarketFactory(String productName, double price) {
		this.productName = productName;
		this.price = price;
	}
	
	public Product getProduct(ProductType type) {
		Product product;
		if(type == ProductType.Laptop) {
			product = new Laptop(productName, price);
		}else if(type == ProductType.SmartPhone) {
			product = new SmartPhone(productName, price);
		}else {
			throw new ProductNotFound("Product Type not supported!");
		}
		
		return product;
	}
}
