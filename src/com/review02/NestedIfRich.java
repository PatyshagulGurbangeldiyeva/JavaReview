package com.review02;

import java.util.Scanner;

public class NestedIfRich {

	public static void main(String[] args) {
		// type "main" and then cntrl+space
		// if you type input.nextLine (); program will read everything on that line
		// but if you eneter input.next(); program will read just the word or charecters
		// till the space
		// input.nextBoolean, or char etc will just read till the space/ just line reads
		// all the line!!!!

		Scanner input = new Scanner(System.in);
		System.out.println("Are you a boy a girl?");
		String boyGirl = input.next();/// input boy and girl then check what it reads

		System.out.println("Are you rich true/false?");
		boolean rich = input.nextBoolean();

		System.out.println("You are a " + boyGirl + " and you are rich " + rich);

		if (boyGirl.equals("boy")) {
			System.out.println("Yaay");
			
			if (rich) {// we do not need to write rich==true as it is boolean
				System.out.println("Buy a ferrari");
			} else {
				System.out.println("Play sports");
			}

		} else if (boyGirl.equals("girl")) {
			System.out.println("Yay");
			if (rich) {
				System.out.println("Buy Louis Vuitton");
			} else {
				System.out.println("Read a book");
			}
		} else {
			System.out.println("You entered the wrong choice");

		}
		System.out.println("We are done");
	}

}
