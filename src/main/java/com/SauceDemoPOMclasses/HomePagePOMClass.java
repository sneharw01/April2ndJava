package com.SauceDemoPOMclasses;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class HomePagePOMClass
{

	   private WebDriver driver;
	   
	    @FindBy(xpath="(//button[text()='Add to cart'])[1]")
		private WebElement bagButton;
		
		public void clickBagButton()
		{

			bagButton.click();
		}
		
		@FindBy(xpath="//span[@class='shopping_cart_badge']")
		private WebElement CartButton;
		
		public String getTextFromCartButton()
		{
			String totalProducts = CartButton.getText();
			return totalProducts;
		}
		
		@FindBy(xpath="//button[text()='Add to cart']")	
		private List<WebElement> AddToCart;
		
		public void clickAddToCartButton()
		{
			for(WebElement products : AddToCart)
			{
				products.click();	
			}
		}
	
	    public HomePagePOMClass(WebDriver driver)    //constructor
	    {
	    	this.driver = driver;
	    	PageFactory.initElements(driver, this);
	    }


	
}
