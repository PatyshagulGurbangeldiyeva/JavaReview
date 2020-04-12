package com.rewiev03;

public class o4SumEvenFor {

	public static void main(String[] args) {
		// add even numbers
		//also add odd numbers in one loop
		// also add all numbers
		// btw 1-50
		// you have 4 minutes
		// you can use while or do while
		// you can use mod operator or add by 2

		int evenSum=0;
		int oddSum=0;
		int allTotal=0;
		
		for (int a=1; a<=50; a++) {
			if (a%2==0) {
				evenSum+=a;
			}else {
				oddSum+=a;
			}
			// 1st way is allTotal=evenSum+oddSum;
			allTotal+=a;// 2nd way to calculate grandtotal
		}
		System.out.println("Total even is "+evenSum);
		System.out.println("Total odd is "+oddSum);
		System.out.println("All total is "+allTotal);
	}

}
