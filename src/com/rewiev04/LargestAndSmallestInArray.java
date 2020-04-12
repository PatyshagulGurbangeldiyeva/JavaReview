package com.rewiev04;

public class LargestAndSmallestInArray {

	public static void main(String[] args) {
		// find largest and smallest number in an array
		
		
		int []numbers= {34,67,3,34,21,6,89,60}; // index is from 0-7---> there are 8 elements
		
		// finding the largest one
		int largest=numbers[0]; // bir sayi seciyoruz index koyup onun uzerinden calisiyoruz
		int smallest=numbers[0];
		int sum=0;
		for (int num:numbers) {
			if (num>largest) {
				largest=num;
			}
			if (num<smallest) {
				smallest=num;
			}
			sum+=num;
		}
System.out.println("The largest number is "+largest);
System.out.println("The smallest number is "+smallest);
	}

}
