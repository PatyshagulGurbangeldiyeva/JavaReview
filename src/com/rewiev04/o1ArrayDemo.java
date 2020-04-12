package com.rewiev04;

public class o1ArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int []numbers= new int[5];// we are saving multiple numbers, [5]means there stored 5 elements
		numbers[0]=1;
		numbers[1]=6;
		numbers [2]=67;
		numbers[3]=4;
		numbers[4]=12;
		// you can print all the elements by using three loops
		
		// 1. using for loop
		// you can use here reverse
		System.out.println("reading from array using FOR LOOP");
		for (int i=0;i<5;i++) {
			System.out.println(numbers[i]);
		}
		// 2. using for-each/advanced/enhanced -for loop
		//    this method iterates the whole array
		// here we cannot use reverse
		for (int number:numbers) {
			System.out.println(number);
		}

		
	}

}
