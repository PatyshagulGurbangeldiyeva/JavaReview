package com.rewiev03;

public class o5ContinueDemo {

	// I want to celebrate my son's 20th bday 
			// but not 13th birthday
			
	public static void main(String[] args) {
		
		
		for (int age=0; age<=20; age++) {
			if (age==13) { // or you can writ if (age!=13)
				System.out.println("I will not celebrate it");
				continue; // 13 gelecek kutlamayacak ama ondan sonra yine devam edecek continue dedigimiz icin
				          // break deseydik 13 gelirdi sonra 20 yasa kadar gitmezdi
			}
			System.out.println("Happy bday"+ age);
		}

	}

}
