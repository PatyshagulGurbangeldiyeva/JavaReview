package com.review02;

import java.util.Scanner;

public class SwitchMonth03 {

	public static void main(String[] args) {
		
		Scanner input=new Scanner (System.in);
		
		System.out.println("Enter a number for the month:");
		int month=input.nextInt();
		
		System.out.println("The month you entered is "+month);
		
		String monthName; // or String monthname=null (null means it is not initialized. it is a keyword)
		
		switch (month) {
		case 1:
			monthName="January";
			break; // it used as parantesis like in if statement
		case 2:
			monthName="February";// if you dont have break it will read tll the next break and give last output!!!!
			break;
		case 3:
			monthName="March";
			break;
		case 4:
			monthName="April";
			break;
		case 5:
			monthName="May";
			break;
		case 6:
			monthName="June";
			break;
		case 7:
			monthName="July";
			break;
		case 8:
			monthName="August";
			break;
		case 9:
			monthName="September";
		case 10:
			monthName="October";
			break;
		case 11:
			monthName="November";
			break;
		case 12:
			monthName="December";
			default:
				monthName="Invalid";
			
		}
		System.out.println("the month is "+monthName);
	}

}
