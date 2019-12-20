package com.javapractice.files;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class WriteText{
	
	public static void main(String[] args){
		String filePath = "C:\\Users\\Admin\\Documents\\WorkSpace\\JavaBasics\\src\\abc.txt";


		
		FileReader file;
		try {
			file = new FileReader(filePath);
			BufferedReader ir = new BufferedReader(file);
			String str;
			while((str = ir.readLine()) != null){
				
				System.out.println(str);
				
			}
			
			FileWriter fr = new FileWriter(filePath);
			BufferedWriter br = new BufferedWriter(fr);
				
			br.write("TEST");
			//br.flush();
			br.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}