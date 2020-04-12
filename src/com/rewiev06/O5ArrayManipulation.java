package com.rewiev06;

public class O5ArrayManipulation {
	
	public int largestNumber (int []array) {
		int largest=array[0];
		for (int i=0; i<array.length; i++) {
			if (array[i]>largest) {
			largest=array[i];
			}
		}
		return largest;
		
	}
		int smallestNumber(int [] array) {
			int smallest=array[0];
			for(int num:array) {
				if (num<smallest) {
					smallest=num;
				
			}
		}
			return smallest;
	}
		


	
	public static void main (String [] args) {
		int [] array= {1,6,4,2,8};
	
	O5ArrayManipulation manip=new O5ArrayManipulation();		
	int largest=manip.largestNumber(array);
	System.out.println("the largets is "+largest);
	
	
	System.out.println("the smallest is "+manip.smallestNumber(array));
	}
}
