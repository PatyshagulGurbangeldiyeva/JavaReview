package com.rewiev05;

public class TwoDArrayEnhanced {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [][]num= {
				{7,1,6,12},
				{9,6,2,8},
				{3,0,8,5}
				};
		int sum=0;
		for (int[] row:num) { // we use [] because we iterating 2d array, I itterate each row
			for (int element:row) {// itterating elements
				System.out.print(element+" ");
				sum+=element;
		}
			System.out.println();	
		}
		System.out.println("the sum is "+sum);
	}

}
