package com.rewiev05;

public class palindrome {

	public static void main(String[] args) {
		// write a java prog to find whether a string is a palindrome or not
		
		String str="kayak radar kayak1a";
		
	// 1st way
		String reverse="";
		
		char[]charArray=str.toCharArray();
		for (int i=charArray.length-1;i>=0;i--) {
			reverse+=charArray[i];
		}
		System.out.println(reverse);
		System.out.println();
		
			if (str.equals(reverse)) {
				System.out.println("True");
			}else {
				System.out.println("False");
			}
		}

	}


