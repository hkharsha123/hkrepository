package com.spacejetGenericUtility;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverGenericUtility {
     WebDriver driver;
	public WebDriver browserLaunch(String browser,String url,int seconds)
	{
		if(browser.equals("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			 driver=new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(seconds));
			driver.get(url);
		}
		if(browser.equals("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			 driver=new FirefoxDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(seconds));
			driver.get(url);
		}
		
		
		return driver;
	}
	
	
	
}
