package com.SauceDemoUtilityClasses;

import java.io.IOException;

//import org.apache.poi.xssf.usermodel.XSSFCell;
//import org.apache.poi.xssf.usermodel.XSSFRow;
//import org.apache.poi.xssf.usermodel.XSSFSheet;
//import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ExcelsheetUtility
{
	 WebDriver driver;
		
//	@FindBy(xpath ="//input[@id='user-name']")
//	private WebElement user;
//	
//	@FindBy(xpath ="//input[@id='password']")
//	private WebElement pass;
//   
//	@FindBy(xpath="//input[@id='login-button']")
//	private WebElement logout;
//
//	public void excelsheetmethod() throws IOException
//	{ 
//		XSSFWorkbook workbook = new XSSFWorkbook("C:\\Users\\shree\\OneDrive\\Documents\\ExcelSheetSelenium\\Book2.xlsx");
//	    XSSFSheet sheet = workbook.getSheet("SwagLab");	
//	    String Username = sheet.getRow(0).getCell(0).getStringCellValue();                  
//	    user.sendKeys(Username);
//	    String Password = sheet.getRow(1).getCell(0).getStringCellValue();                
//	    pass.sendKeys(Password);
//	    logout.click();
//	}
	
	 public ExcelsheetUtility(WebDriver driver)    
	    {
	    	this.driver = driver;
	    	PageFactory.initElements(driver, this);
	    }

	

}
