package com.review01;

import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		String firsLine=input.nextLine();// if there is nextline it will read whole line untill the enter bottom
		System.out.println("firstLine was:"+firsLine);
		
		String firstWord=input.next();// when there is just next it will just read first word untill the space
		System.out.println("firstWord was: "+firstWord);
		
		String secondWord=input.nextLine();
		System.out.println("secondWord was: "+secondWord);
		
	}

}
