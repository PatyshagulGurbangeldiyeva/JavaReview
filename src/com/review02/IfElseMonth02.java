package com.review02;

import java.util.Scanner;

public class IfElseMonth02 {

	public static void main(String[] args) {
		
		Scanner input=new Scanner (System.in);
		System.out.println("Please eneter the month number");
		
		int month=input.nextInt();
		String name;
		if (month==1) {
			name="January";
		}else if (month==2) {
			name="February";
		}else if (month==3) {
			name="March";
		}else if (month==4) {
			name="April";
		}else if (month==5) {
			name="May";
		}else if (month==6) {
			name="June";
		}else if (month==7) {
		name="July";
		}else if (month==8) {
			name="Aougust";
		}else if (month==9) {
			name="September";
		}else if (month==10) {
			name="October";
		}else if (month==11) {
			name="November";
		}else if (month==12) {
			name="December";
		}else {
			name= "invalid";
		}
	System.out.println("your month is "+name);

	}

}
