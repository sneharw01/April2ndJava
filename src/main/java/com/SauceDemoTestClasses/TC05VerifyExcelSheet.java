package com.SauceDemoTestClasses;

import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.SauceDemoUtilityClasses.ExcelsheetUtility;

public class TC05VerifyExcelSheet 
{   
	@Test
	public void verifyExcelSheet() throws IOException
	{
	System.setProperty("webdriver.chrome.driver", 
			"C:\\Users\\shree\\Downloads\\Selenium Browser\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	System.out.println("The Browser Launched And Screen Maximized Successfully");
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.get("https://www.saucedemo.com/");
	
	ExcelsheetUtility excel = new ExcelsheetUtility(driver);
//	excel.excelsheetmethod();
	System.out.println("Fetched The Data from Excel Sheet and Logged In");

	}
	
}
