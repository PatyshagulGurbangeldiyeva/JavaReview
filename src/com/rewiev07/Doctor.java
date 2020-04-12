package com.rewiev07;

public class Doctor {
	static String hospitalName;
	String name;
	String licenceId;
	int salary;
	public Doctor(String name, String licenceId, int salary) {
		this.name=name;
		this.licenceId=licenceId;
		this.salary=salary;
	}
	
	public void checkUp() {
		System.out.println("Doctor "+name+" has ordered blood test.");
	}
	public void treatPatient(String name) { 
		System.out.println("Docor "+this.name+" gives prescription to "+name);
	}
	public void chargePatient() {
		System.out.println("let me chatge 100$");
	}
	public void displayInfo() {
		System.out.println("Doctor "+name+" with licencedId "+" has a salary "+salary+" and works in "+hospitalName+" hospital");
	}

}
