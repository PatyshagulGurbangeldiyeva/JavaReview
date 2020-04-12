package com.rewiev03;

public class o2DoWhileDemo {

	public static void main(String[] args) {
		// i want to celebrate my child bday till 11 years
		
		// similarity btw while and do while
		int age=0;
		while(age<5) {
			//age++; (burda koyarsan hemen ekleyip basliyor)---> 0+1=1 ile baslar
			System.out.println("Happy birthday! You are "+age+" years old.");
			age++; // burda koyarsan baslangic ile baslar 0 ile
		}
		System.out.println("Now you are grown! You don't need celebration.");

		System.out.println(" ");
		int age2=0;
		do {
			age2++;
			System.out.println("Happy birthday! You are "+age2+" years old.");
		}while (age2<5);
		System.out.println("Now you are grown! You don't need celebration.");
		
		System.out.println(" ");
		
		// differences btw while and do while
		String greeting="Hi";
		boolean happy=false;
		while (happy) {
			System.out.println(greeting+" inside while");
			
		}
		
		do {
			System.out.println(greeting+" inside do-while");
		}while (false);
	}

}
