package com.rewiev04;

public class o4TwoArrayDemo {

	public static void main(String[] args) {
		
		// 1st way of creating 2d array
		
		int [][]numbers=new int [2][3];
		numbers [0][0]=1;
		numbers [0][1]=2;
		numbers [0][2]=3;
		
		numbers [1][0]=4;
		numbers [1][1]=5;
		numbers [1][2]=6;
		
		
		// 2nd way of creating 2d array
		int [][]numbers2= {
				{1,2,3},
				{4,5,6}
				};
		
	for (int row=0;row<numbers2.length;row++) {
		for (int col=0;col<numbers2[row].length;col++) {
			System.out.print(numbers[row][col]+" ");
			
		}System.out.println();
	}

	}

}
