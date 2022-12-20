package com.spacejetGenericUtility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class proprtyFileUtility {
	 FileInputStream fis;
	public String getDataFromPropertyFiles(String File_path,String value)
	{
	  
	try {
		fis = new FileInputStream(File_path);
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		Properties pro=new Properties();
		try {
			pro.load(fis);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String value1 = pro.getProperty(value);
		return value1;
	}
	
	
}
