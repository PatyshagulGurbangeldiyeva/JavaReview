package com.rewiev03;

public class o1WhileDemo {

	public static void main(String[] args) {
		
		// 1. WHILE
		
		// we want to say "hello" 5 times
		
		String greeting="hello";
		int count=1;
		while (count<=5) {
			count++; // count=count+1;
			System.out.println(greeting);// if you will just finish here. comp will print it infinitely
			                             // so i need to add limitation loop before or after println
		}
		
		System.out.println("----------------------------------");
		System.out.println("");
		
		count=1; // reassigning
		while (true) {
			//count++; burda koyarsan 5 kere print eder. ciktidan once arttirir
			System.out.println(greeting);// the system will print infinitely as it is declared truely. 
			                             // so you need to put condition
			if (count==6) {
				break;// it will break the loop. looping is stopped
			}
			count++;// burda yazarsak 6 defa print eder. if'den sonra arttirir
		}

	}

}
