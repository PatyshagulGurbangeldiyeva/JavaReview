package com.rewiev05;

public class StringManipulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="Hello";
		int length=str.length();
		System.out.println(length);
		System.out.println(str.toUpperCase());// here all the characters will be upper case
		System.out.println(str);// but when you print str---> it will be Hello not HELLO
								// the last change that you make. because string is immutable
		
		boolean starts=str.toLowerCase().startsWith("he"); // we look to the last method that we used. so it is boolean
		System.out.println(starts);  // this is called method chaining
	
		
		// getting elements from array: reverse
		
		String str1="Hello2! ";
		char []charArray=str1.toCharArray();  // is one method to get all charecters one by one 
		for (int i=charArray.length-1; i>=0;i--) { 
			
			System.out.print(charArray[i]);
		}
		System.out.println();
		int index=str1.indexOf("llo");
		System.out.println(index);
		String example="Something inside here";
		int index2=example.indexOf("e",16); /// (finde charecter, start from this index)
		System.out.println(index2);
	}

}
