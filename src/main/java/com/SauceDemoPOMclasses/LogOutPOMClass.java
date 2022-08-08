package com.SauceDemoPOMclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogOutPOMClass 
{
	WebDriver driver;
	@FindBy(xpath="//button[text()='Open Menu']")
	private WebElement Settingbtn;

	public void settingbutton()
	{
		Settingbtn.click();
	}

	@FindBy(xpath="//a[text()='Logout']")
	private WebElement LogOutbtn;

	public void Logoutbutton()
	{
		LogOutbtn.click();
	}

	public LogOutPOMClass(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}


}
