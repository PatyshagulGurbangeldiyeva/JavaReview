package com.rewiev06;

public class O1Baby {

	String name;
	String lastName;
	char gender;
	int weight;
	String hairColor;
	
	public void walk () {
		System.out.println("Crawling....");
	}
	public String cry () {
		return "cry every minute...";
	}
	public void talk (int times) {
		for (int i=1; i<=times; i++)
		System.out.print("bla"+" ");
	}
	
	public void displayBabyInfo() {
		System.out.println("Full name of the baby is "+name+" and the last name is "+lastName);
		System.out.println("gender is "+gender);
		
		if (gender=='M') {
			System.out.println("Boy");
		}else if(gender=='F') {
			System.out.println("Girl");
		}else {
			System.out.println("Unknown");
		}
		System.out.println("And hair color is "+hairColor);
	}
}
