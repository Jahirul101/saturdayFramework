package com.telentach.steps;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import com.talentach.pages.GoogleHome;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class googleSearch {
	WebDriver driver;
	GoogleHome gh; // = new GoogleHome(driver);
	@Given("^I am on google home page$")
	public void i_am_on_google_home_page() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "./webdriver/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://www.google.com");
		
		
	    
	}

	@When("^I enter search term\"([^\"]*)\"$")
	public void i_enter_search_term(String arg1) throws Throwable {
		gh=PageFactory.initElements(driver, GoogleHome.class);
		gh.searchEdiBox().sendKeys("Quality Assurance");
		
		driver.findElement(By.name("q")).sendKeys("Quality Assurance");
		
	    
	}

	@When("^I clicked on Search button$")
	public void i_clicked_on_Search_button() throws Throwable {
		driver.findElement(By.xpath("//input[@name='btnK']")).click();
		gh.googleSerch().click();
	   
	}

	@Then("^I find relative search contant on google$")
	public void i_find_relative_search_contant_on_google() throws Throwable {
		//assert.assertEquals(driver.getTitle(),"Quality AssuranceQuality Assurance");
		driver.close();
	   
	}
	
	

}
