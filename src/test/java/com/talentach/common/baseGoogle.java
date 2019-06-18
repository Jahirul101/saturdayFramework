package com.talentach.common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class baseGoogle {
	WebDriver driver;
	String browser ="chrome";
	public String url="http://www.google.com";
	public WebDriver getdriver() {
		if(browser=="chorme") {
			System.setProperty("webdriver.chrome.driver","./webdriver/chromedriver.exe" );
			driver=new ChromeDriver();
		}
		else if(browser=="firefox") {
		
	}
		return driver;

}}
