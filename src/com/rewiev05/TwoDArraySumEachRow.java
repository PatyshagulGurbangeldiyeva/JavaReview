package com.rewiev05;

public class TwoDArraySumEachRow {

	public static void main(String[] args) {
		
		int [][]num= {
				{7,1,6,12}, // find sum
				{9,6,2,8},  // find sum
				{3,0,8,5}   // find sum
				};

		
		
		int []sum = new int [num.length]; // we used here [] coz we are dealing with
		
		/* 2d array // here we used [num.length] coz we want to know in each row
		 * 
		 * for (int []row:num) { // first loop will give you one dimensial array/row for
		 * (int elemnt:row) { // in iteration of row i am getting elements
		 * 
		 * } }
		 * 
		 
		 */	
		
		for (int row=0;row<num.length; row++) {
			for (int col=0; col<num[row].length;col++) {
				int elem=num[row][col];
				sum[row]+=elem;
				
			}
		}
		for (int elem:sum) {
			System.out.println("the sum of row is "+elem);
		}
		
	}

}
