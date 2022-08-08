package com.SauceDemoTestClasses;

import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import com.SauceDemoPOMclasses.HomePagePOMClass;
import com.SauceDemoPOMclasses.LogOutPOMClass;
import com.SauceDemoPOMclasses.LoginPOMClass;
import com.SauceDemoUtilityClasses.ScreenShotClass;



public class TestBaseClass 
{
	WebDriver driver;
	@Parameters("browserName")
	@BeforeClass
	public void beforeClass(String browserName)
	{   
		if(browserName.equals("chrome")) 
		{
			System.setProperty("webdriver.chrome.driver",
					"./DriverFolder/chromedriver.exe");

			driver = new ChromeDriver();
		}
		else
		{
			System.setProperty("webdriver.gecko.driver",
					"./DriverFolder/geckodriver.exe");

			driver = new FirefoxDriver();
		}

		System.out.println("Browser Opened Successfully");
		driver.manage().window().maximize();
		System.out.println("Window Maximized Successfully.");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.saucedemo.com/");
		System.out.println("URL Launched successfully.");
	}

	@BeforeMethod
	public void beforeMethod() throws IOException 
	{
		LoginPOMClass lp = new LoginPOMClass(driver);            
		lp.sendusername();
		System.out.println("The Username Entered Successfully");

		lp.sendpassword();
		System.out.println("The Password Entered Successfully");

		lp.clickloginbutton();
		System.out.println("LoginButton clicked");
		ScreenShotClass.screenShotmethod(driver);
	}
	@AfterMethod
	public void logoutMethod()
	{
		LogOutPOMClass logout = new LogOutPOMClass(driver);
		logout.settingbutton();
		System.out.println("The Setting Button Clicked");

		logout.Logoutbutton();
		System.out.println("The Logout Button Clicked");
	}

	@AfterClass
	public void browserClosed()
	{
		driver.quit();
		System.out.println("The Browser Closed Successfully");
	}

}
