package com.amazon;

public class Product {
	private String _name;
	
	private double _price;
	
	public Product(String name, double price) {
		this._name = name;
		this._price = price;
	}
	
	public String GetName() {
		return this._name;
	}
	
	public double GetPrice() {
		return this._price;
	}
}