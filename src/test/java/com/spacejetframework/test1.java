package com.spacejetframework;

import org.openqa.selenium.WebDriver;

import com.spacejetGenericUtility.ConstantPaths;
import com.spacejetGenericUtility.DriverGenericUtility;
import com.spacejetGenericUtility.ExcellpropertyFile;
import com.spacejetGenericUtility.propertyKeys;
import com.spacejetGenericUtility.proprtyFileUtility;
import com.spacejetGenericUtility.sheetName;
import com.spacejetObjectRepository.HomePage;

public class test1 {

	public static void main(String[] args) {
	      DriverGenericUtility DriverGenericUtility=new DriverGenericUtility();
	      proprtyFileUtility property=new proprtyFileUtility();
	     ExcellpropertyFile excel=new ExcellpropertyFile();
	     
	    String url = property.getDataFromPropertyFiles(ConstantPaths.PROPERTYFILE_PATH,propertyKeys.URL.converToString());
	    String chrome = property.getDataFromPropertyFiles(ConstantPaths.PROPERTYFILE_PATH, propertyKeys.CHROME.converToString());
	    
	   String fromlocation = excel.getExcelData(ConstantPaths.EXCEL_PATH,sheetName.HOMEPAGE.converTostring(), 1, 0);
	  String destinationlocation = excel.getExcelData(ConstantPaths.EXCEL_PATH,sheetName.HOMEPAGE.converTostring(), 1, 1);
	    System.out.println(url);
	    System.out.println(chrome);
	    WebDriver driver = DriverGenericUtility.browserLaunch(chrome, url, 15);
	    
	    
	   HomePage homepage=new HomePage(driver);
	   
	   homepage.clickOnRound_tripRadioButton();
	   homepage.selectFrom_Locatin(fromlocation);
	   homepage.selectDestination_Locatin(destinationlocation);
	   homepage.clickOnDepartureCalender();
	   homepage.selectDepartureDate();
	   homepage.clickOnreturnDateButton();
	   homepage.selectreturnDate();
	    
	}

}
