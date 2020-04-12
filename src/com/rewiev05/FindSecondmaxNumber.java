package com.rewiev05;

import java.util.Arrays;

public class FindSecondmaxNumber {

	public static void main(String[] args) {
		// write a java program 
		// find the second largest number in the array
		// max and min number in the array
		
		int [] numbers= {32, 56,34,2,64,6};
		
		// 1st way
		Arrays.sort(numbers);
		System.out.println("Smallest "+numbers[0]);
		System.out.println("Biggest "+numbers[numbers.length-1]);
		System.out.println("Second Largest " +numbers[numbers.length-2]);
		
		System.out.println();
		
		//2nd way
		int [] numbers2= {34,23,64,76,8,2};
		int smallest=numbers2[0];
		int largest= numbers2[0];
		int largest2= numbers2[0];
		
		for (int i=0; i<numbers2.length; i++) { // you can start with i=1 as we declared index 0 smallest...
			int element=numbers2[i];
			if (element>largest) {
				largest2=largest;
				largest=element;
				
			}else if (element>largest2) { // check if it is bigger than second largest
				largest2=element;
			
			}else if  (element<smallest) {
				smallest=element;
		}

	}
		System.out.println("smallest "+smallest);
		System.out.println("largest "+largest);
		System.out.println("second largest "+largest2);
	}
}
