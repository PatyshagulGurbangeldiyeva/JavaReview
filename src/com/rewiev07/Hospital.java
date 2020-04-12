package com.rewiev07;

public class Hospital {
	
	
	// this is our main class of the software
	 public static void main (String [] args) {
		 Doctor.hospitalName="Vefa"; // static variable calling
		 
		 Doctor doc1=new Doctor("Yusup G.", "1231", 3450000);
		 // instance and object are the same thing
		 
		// as we created constructor we don't need info above
		 //doc1.name="John Smith";
		//doc1.licenceId="12345";
		 //doc1.salary=160000;
		 doc1.checkUp();
		 doc1.treatPatient("Adam Smith");
		 doc1.displayInfo();
		 
		 Doctor doc2=new Doctor("ALp G.", "342455",566000);
		 
		 doc2.checkUp();
		 doc2.treatPatient("Paty");
		 doc2.displayInfo();
		 
	 }

}
