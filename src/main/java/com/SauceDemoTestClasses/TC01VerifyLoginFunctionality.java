package com.SauceDemoTestClasses;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.SauceDemoPOMclasses.LogOutPOMClass;
import com.SauceDemoPOMclasses.LoginPOMClass;
import com.SauceDemoUtilityClasses.ScreenShotClass;
import com.SauceDemoUtilityClasses.ScreenShotClass;

public class TC01VerifyLoginFunctionality extends TestBaseClass
{
	@Test   
	public void verifylogin() throws IOException
	{	
		String ExpectedTitle = "Swag Labs";
		String ActualTitle = driver.getTitle();
		System.out.println("The Title is-> "+ActualTitle);

		Assert.assertEquals(ActualTitle, ExpectedTitle);
	}

}
