package com.rewiev06;

public class O2World {

	public static void main(String[] args) {
		O1Baby baby1;
		baby1=new O1Baby(); // here we created the baby.
		
		baby1.cry(); // after creating we can give verbs to baby 
		baby1.name="Yusup";
		baby1.lastName="Gurbangeldiyev";
		baby1.gender='M';
		baby1.weight=30;
		baby1.hairColor="brown";
		
		System.out.println("the frist baby's name is "+ baby1.name+" and the last name is "+baby1.lastName+". He is "+baby1.weight+" lb and the gender is "+baby1.gender);
		System.out.println();
		// let's reassign
		
		baby1.weight=32;
		System.out.println("the frist baby's name is "+ baby1.name+" and the last name is "+baby1.lastName+". He is "+baby1.weight+" lb and the gender is "+baby1.gender);
		
       baby1.cry(); // it will not be printed as we used return string. So when there is return we need to use sout!!
       System.out.println(baby1.cry());
       baby1.talk(3);
       
       System.out.println();
       System.out.println();
       System.out.println("let's create another baby");
       
       O1Baby baby2=new O1Baby();
       baby2.cry();// as this method returns String you need to print it
       System.out.println(baby2.cry());
       
       baby2.name="Alparlsan";
       baby2.lastName="Gurbangeldiyev";
       baby2.gender='M';
       baby2.weight=27;
       baby2.hairColor="brown";
       
       System.out.println("second baby's name is "+baby2.name+" and the last name is "+baby2.lastName);
       System.out.println();
       
       baby1.displayBabyInfo();
       baby2.displayBabyInfo();
	}

}
