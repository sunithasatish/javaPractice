package com.javapractice.files;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class PropertyFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		String filePath = "C:\\Users\\Admin\\Documents\\WorkSpace\\JavaBasics\\src\\environment.properties";
		
		FileReader file = new FileReader(filePath);
		
		
		
		Properties prop = new Properties();
		
		prop.load(file);
		
		System.out.println(prop.containsKey("url"));
		System.out.println(prop.getProperty("browser"));
		System.out.println(prop.getProperty("env"));
		
		FileWriter fileWriter = new FileWriter(filePath);
		Properties prop1 = new Properties();
		//prop1.
		
		prop1.setProperty("password", "test");
		prop1.store(fileWriter, "Saved values");
		
		
		
		
	}

}
