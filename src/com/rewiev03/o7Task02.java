package com.rewiev03;

import java.util.Scanner;

public class o7Task02 {

	/*
	 * I want to use scanner and loop at the same time ask user to enter many
	 * positive numbers and add it to total he should enter (-1) to stop
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int num=0;
		int total = 0;
		
		//System.out.println("enter a positive number. in order to stop enter -1");
		//num = input.nextInt();

		//while (num != -1) {
		//	total += num;

		//}
		//System.out.println("the total is " + total);

		do {
			System.out.println("Enter a number. To stop enter number -1");
			num = input.nextInt();
			
			if (num!=-1) {
				total += num;
			}
			
			
			System.out.println(total);
		} while (num != -1);
		System.out.println("The total is "+total);

	}

}
