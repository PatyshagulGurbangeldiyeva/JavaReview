package com.rewiev08;

public class Phone {

	private String serialNumber;
	private String brand;
	double price;
	
	public String getSerialNumber() {
		return serialNumber;
	}

	public void setSerialNumber(String serialNumber) { // set means we can change the data from outside
		this.serialNumber = serialNumber;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getBrand() { // we cannot change the brand from outside as we just have get method
		return brand;
	}


	
	public Phone(String serialNumber,String brand ) {
		this.serialNumber=serialNumber;
		this.brand=brand;
		
	}
	
	public void displayInfo() {
		System.out.println("This is "+brand+" with serial number "+serialNumber);
		System.out.println("It costs $"+price);
	}
	
}
