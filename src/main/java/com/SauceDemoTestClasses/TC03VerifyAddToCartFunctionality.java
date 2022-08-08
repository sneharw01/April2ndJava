package com.SauceDemoTestClasses;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;


import com.SauceDemoPOMclasses.HomePagePOMClass;
import com.SauceDemoPOMclasses.LogOutPOMClass;
import com.SauceDemoPOMclasses.LoginPOMClass;

public class TC03VerifyAddToCartFunctionality extends TestBaseClass
{

	@Test
	public void verifyaddtocart()
	{
		HomePagePOMClass homepage = new HomePagePOMClass(driver);
		homepage.clickBagButton();
		System.out.println("The Product Added To the Cart ");

		String actualCount = homepage.getTextFromCartButton();
		String expectedCount = "1";

		Assert.assertEquals(actualCount, expectedCount);

	}

}
