package com.SauceDemoTestClasses;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.SauceDemoPOMclasses.HomePagePOMClass;
import com.SauceDemoPOMclasses.LogOutPOMClass;
import com.SauceDemoPOMclasses.LoginPOMClass;

public class TC04VerifyAllProductFunctionality extends TestBaseClass
{
	@Test
	public void verifyallproducts()
	{
		HomePagePOMClass homepage = new HomePagePOMClass(driver);
		homepage.clickAddToCartButton();
		System.out.println("All Products Added To the Cart ");

		String actualCount = homepage.getTextFromCartButton();
		String expectedCount = "6";

		Assert.assertEquals(actualCount, expectedCount);
	}
}
