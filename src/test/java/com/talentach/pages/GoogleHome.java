package com.talentach.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoogleHome {
	WebDriver driver;
	public GoogleHome(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(name="q") // identifiy , if its xpath, we put xpath
	WebElement searchBox;
	
	public WebElement searchEdiBox() {
		return searchBox;
	}
	@FindBy(xpath="//input[@name='btnK']")
	WebElement googleButton;
	public WebElement googleSerch() {
		
		return googleButton;
		
	}

}
