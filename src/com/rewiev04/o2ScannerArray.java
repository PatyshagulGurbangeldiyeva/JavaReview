package com.rewiev04;

import java.util.Scanner;

public class o2ScannerArray {

	public static void main(String[] args) {
		// use scanner to as for the size of array
		// then read numbers from the scanner into the array
		// then print the whole array

		Scanner scan=new Scanner (System.in);
		System.out.println("How many elements do you want to store?");
		int size=scan.nextInt();
		System.out.println(size);
		
		// I am creating an array with size= what ever the person wrote (gave us)
		int [] nums= new int[size];
		
		 // this for loop inserts numbers into array
		for (int i=0; i<size;i++) { //we can write nums.length ----> they are the same things
			System.out.println("Give me the number to store in the array");
			nums [i]=scan.nextInt();
			
		}
		System.out.println("Let's see what you give me");
		// this enhanced for loop reads numbers from the array
		
		for (int n:nums) {
			System.out.println(n);
		}
	}

}
