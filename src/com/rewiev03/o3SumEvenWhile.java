package com.rewiev03;

public class o3SumEvenWhile {

	public static void main(String[] args) {
		// add even numbers
		//also add odd numbers in one loop
		// btw 1-50
		// you have 4 minutes
		// you can use while or do while
		// you can use mod operator or add by 2
		
		int a=1;
		int sumOdd=0;// in the beginning they are equal to zero
		int sumEven=0;
		
		// 1st way:
		while (a<=50) {
			if (a%2==0) {
				sumEven=sumEven+a;
			}else {
				sumOdd+=a;
			}
			a++;
		}
		System.out.println("sum even is "+sumEven);// in these you can add both of them
		System.out.println("sum odd is "+sumOdd);
		System.out.println(" ");		
         
		//2nd way I can do just one of them
		 a=1;
		 sumOdd=0;
		do {
			sumOdd+=a;
			a+=2;
		}while (a<=50);
		System.out.println("sum even is "+sumOdd);
	}

}
