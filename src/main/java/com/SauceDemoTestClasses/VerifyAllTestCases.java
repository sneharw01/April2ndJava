package com.SauceDemoTestClasses;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.SauceDemoPOMclasses.HomePagePOMClass;
import com.SauceDemoPOMclasses.LogOutPOMClass;
import com.SauceDemoUtilityClasses.ScreenShotClass;

public class VerifyAllTestCases extends TestBaseClass
{
	@Test(priority = 1) 
	public void verifylogin() throws IOException
	{	
		String ExpectedTitle = "Swag Labs";
		String ActualTitle = driver.getTitle();
		System.out.println("The Title is-> "+ActualTitle);

		Assert.assertEquals(ActualTitle, ExpectedTitle);             // Hard Assertion

		ScreenShotClass.screenShotmethod(driver);
		System.out.println("-------------TC 01 Passed--------------");
	}
	

	@Test(priority = 2)
	public void verifylogout() 
	{
		LogOutPOMClass hp = new LogOutPOMClass(driver);
		hp.settingbutton();
    	hp.Logoutbutton();
	
		String ExpectedTitle = "Swag Labs";
		String ActualTitle = driver.getTitle();
		System.out.println("The Title is-> "+ActualTitle);

		Assert.assertEquals(ActualTitle, ExpectedTitle);
		System.out.println("-------------TC 02 Passed---------------");
	}
//	@Test(priority=3)
//	public void verifyaddtocart()
//	{
//		AddToCartPOMClass homepage = new AddToCartPOMClass(driver);
//		homepage.clickBagButton();
//		System.out.println("The Product Added To the Cart ");
//
//		String actualCount = homepage.getTextFromCartButton();
//		String expectedCount = "5";
//         
//		Assert.assertEquals(actualCount, expectedCount);
//		
//		System.out.println("--------------TC 03 Passed----------------");
//	}

	@Test(priority = 3)
	public void verifyallproducts()
	{
		HomePagePOMClass homepage = new HomePagePOMClass(driver);
		homepage.clickAddToCartButton();
		System.out.println("All Products Added To the Cart ");

		String actualCount = homepage.getTextFromCartButton();
		String expectedCount = "6";

		Assert.assertEquals(actualCount, expectedCount);
		System.out.println("---------------------TC 04 Passed-------------------");
	}

}
