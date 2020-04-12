package com.rewiev04;

import java.util.Scanner;

public class o3TaskArrayLargestSmallestScanner {

	public static void main(String[] args) {
		// use scanner
		// ask " how many animals do you have?"
		//

		Scanner input = new Scanner(System.in); // 1. you have to write Scanner code in order to scan the input

		System.out.println("How many animals do you have?");
		int length = input.nextInt(); // we write here the length coz he gives the number of animals that he has

		String[] animals = new String[length]; // we used here String coz animals names are String
												// we use her [length] coz we need elements number

		for (int i = 0; i < length; i++) {
			System.out.println("Give me an animal");
			String animal = input.next();
			animals[i] = animal;
		}

		System.out.println("--------------SECOND WAY USING FOR--------------------");
		
		for (String a:animals) { // here we are printing all array
			System.out.println(a);// IT WILL NOT WORH WITH REVERSE 
		}
		System.out.println("------------PRINT IN REVERSE--------------");
		for (int i=length-1; i>=0;i--) {
			String abc=animals[i];
			System.out.println(abc);
		}
		
		
	}

}
