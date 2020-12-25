package com.rewiev11;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesDemo {

	public static void main(String[] args) throws IOException {
		
		String projectPath=System.getProperty("user.dir");
		System.out.println(projectPath);
		
		
		String filePath=projectPath+"/extra/demo.properties";
		System.out.println(filePath);
		
		FileInputStream fis=new FileInputStream(filePath);
		
		Properties prop=new Properties();// will help us to load and read the file
		prop.load(fis);
		
		System.out.println(prop);
		
		//1.way-->get as an Obj and downcast to String
//		String value=(String)prop.get("LastName");
		
		//2.way---> Get the value as a string
		String FirstName=prop.getProperty("FirsName");
		System.out.println("firs name--->"+FirstName);
		
		// add more key--> value  pairs
		prop.setProperty("city", "Garland");
		System.out.println(prop.get("city"));
		
		// or we can reassign
		prop.setProperty("FirstName", "Omar");
		System.out.println(prop);
		
		
		// lets write back into the properties file
//		FileOutputStream fos=new FileOutputStream(filePath);
//		prop.store(fos, "hi there"); // it will delete everything then print everything that we updated
		
		System.out.println("done");
		

	}

}
