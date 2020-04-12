package com.rewiev03;

public class o6Task {
    /* print numbers from 15-35
     * but don't print the numbers that are divisible by both 2 and 3
     */
	
	public static void main(String[] args) {
		
		for (int a=15; a<=35;a++) {
			if (a%2==0 && a%3==0) { // if you wrote || it means that yo dont want the numbers that divisible 
				                    // by 2 and by 3
				continue;
			}
			System.out.println(a);
		}
		

	}

}
