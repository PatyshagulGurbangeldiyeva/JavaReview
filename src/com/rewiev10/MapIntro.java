package com.rewiev10;
import java.util.*;

public class MapIntro {

	public static void main(String[] args) {
		
//								Map
//	HashMap					LinkedHashMap		TreeMap			TableHashMap	
		
		Map <Integer, String> phoneBook=new HashMap<>();
		
		phoneBook.put(123456, "John Smith");
		phoneBook.put(234567, "James London");
		phoneBook.put(345678, "Rohani Smith");
		phoneBook.put(456789, "Donald Trump");
		phoneBook.put(111111, "Brad Pitt");
		phoneBook.put(567890, "Obama");
		
		// it will override Rophanni
		phoneBook.put(6785433, "Julia Roberts");
		
		System.out.println();
		
		String name=phoneBook.get(123456); // ---> here you will get by getting key the value
		System.out.println(name+"is calling");
		System.out.println();
		
		String name2=phoneBook.get(5555);// here we are getting again value by getting key
		
		System.out.println(name2+"is calling");// as there is no person with this phone number the person name will be null!!
		
		System.out.println();
		

		boolean contains=phoneBook.containsKey(55555); 
		System.out.println("5555 is in the map: "+contains);
		
		System.out.println();
		
		phoneBook.remove(456789); //--> by using key we are removing the value
		
		System.out.println(phoneBook);
	}

}
