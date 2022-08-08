package com.SauceDemoUtilityClasses;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShotClass 
{
	static WebDriver driver;
	
	public static void screenShotmethod(WebDriver driver) throws IOException
	{
		Date date = new Date();
		DateFormat d1 = new SimpleDateFormat("DD-MM-YY & HH-MM-SS");
		String fdate = d1.format(date);
		
		TakesScreenshot ts =  (TakesScreenshot)driver;
		File sourceFile = ts.getScreenshotAs(OutputType.FILE);
		File myFile = new File("./ScreenshotFolder/SauceDemo" + fdate +".jpg");
		FileHandler.copy(sourceFile, myFile);
		System.out.println("The ScreenShot is Taken");
	}

}
