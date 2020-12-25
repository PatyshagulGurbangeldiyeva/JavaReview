package com.rewiev08;

public class PhoneDemo {

	public static void main(String[] args) {
		
		Phone p1=new Phone("1234EU", "Iphone");
		
		p1.displayInfo();
		
		p1.price=1200; // as in method we did not declared the price.
//		p1.serialNumber="23w49"; // we are changing the serial number
//		p1.displayInfo();
		// before our variables were public and we could change their brand and serial number
		// but right now we cannot do it. as we make them private
		
		
		

	}

}
