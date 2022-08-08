package com.SauceDemoPOMclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LoginPOMClass 
{
		private WebDriver driver;
		
		@FindBy(xpath="/html/body/div/div/div[2]/div[1]/div[1]/div/form/div[1]/input")
		private WebElement username;
		
		public void sendusername()
		{
			username.sendKeys("standard_user");
		}

		@FindBy(xpath="/html/body/div/div/div[2]/div[1]/div[1]/div/form/div[2]/input")
		private WebElement password;
		
		public void sendpassword()
		{
			password.sendKeys("secret_sauce");
		}
		
		@FindBy(xpath="/html/body/div/div/div[2]/div[1]/div[1]/div/form/input")
		private WebElement loginbutton;
		
		public void clickloginbutton()
		{
			loginbutton.click();
		}
		
		public LoginPOMClass(WebDriver driver)
		{
			this.driver = driver;
			PageFactory.initElements(driver, this);
		}

}
