package com.rewiev05;

public class TwoDArray {

	public static void main(String[] args) {
		// initializing 2d arrays
		
		//1st way
		
		int [][]numbers1=new int [3][4]; // if you will not declare each index of row and col 
//      System.out.println(numbers1[1][2]);		// the console will show just zero (0)
		
		// let's initialize them
		 numbers1[0][0]=0;
		 numbers1[0][1]=1;
		 numbers1[0][2]=2;
		 numbers1[0][3]=3;
		 
		 numbers1[1][0]=5;
		 numbers1[1][1]=6;
		 numbers1[1][2]=7;
		 numbers1[1][3]=8;
		 
		 
		System.out.println(numbers1[1][2]);
		
		
		// 2nd way
		int[][]numbers2= {
				{0,1,2,3},
				{5,6,7,8},
				{10,11,12,13}				
		};
		
		System.out.println(numbers2[2][2]);// 7
		//let's get row number. how may rowas there
		
		int row=numbers2.length;
		System.out.println("rows: "+row);
		
		int length0=numbers2[0].length;// length (size) of the first row
		int length1=numbers2[1].length; // length of the second row
		int length2=numbers2[2].length;// length of the third row
		
		
		
		
		// 3rd way
		int [][] numbers3= new int [3][];
		numbers3[0]=new int [4]; // the first row = has 4 elements [[0,0,0,0], null, null]
		numbers3[1]=new int [7]; // the second row [1]= has 7 [7] elements
		numbers3[2]=new int [4]; // the third row [2] has 4 elements ----> new int[4] 
		
		System.out.println(numbers3 [0][1]); // the result will be 0 as we didnt initialize the column
	}

}
