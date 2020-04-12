package com.rewiev05;

public class TwoDArraySumMaxMin {

	public static void main(String[] args) {


		int [][]num= {
				{7,1,6,12},
				{9,6,2,8},
				{3,0,8,5}
				};
		
		int rows= num.length;
		for (int i=0;i<rows;i++) {
			System.out.println("I am at row index: "+i);// here we are counting the rows
			
			int length=num[i].length;
			for (int j=0;j<length;j++) {
				int element=num[i][j];
				System.out.print(element+" ");
			}
			System.out.println();
		}

		// Sum all elements in a 2D array
		int sum=0;
		for (int row=0;row<num.length;row++) {
			for (int col=0; col<num[row].length; col++) {
				sum=sum+num[row][col];
			}
		}
		System.out.print(sum+" ");
		
		// find the minimum and maximum element
		
		int max=num[0][0];
		int min=num[0][0];
		
		for (int i=0; i<num.length; i++) {
			for (int j=0; j<num[i].length;j++) {
				if (num[i][j]<min){
					min=num[i][j];
				}else if (num[i][j]>max) { // or here you can use else if
					max=num[i][j];
				}
			}
				
		}
		
		System.out.println("The min number is: "+min);
		System.out.println("The max number is: "+max);
		}
	}


