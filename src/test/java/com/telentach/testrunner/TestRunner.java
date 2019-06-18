package com.telentach.testrunner;

import cucumber.api.CucumberOptions;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
		features= {"features"},
		glue="com.telentach.steps",
		tags="@googlesreach"
		
		
		)



public class TestRunner extends AbstractTestNGCucumberTests {
	
	@Given("^I am on google home page$")
	public void i_am_on_google_home_page() throws Throwable {
	    
	}

	@When("^I enter search term\"([^\"]*)\"$")
	public void i_enter_search_term(String arg1) throws Throwable {
	    
	}

	@When("^I clicked on Search button$")
	public void i_clicked_on_Search_button() throws Throwable {
	   
	}

	@Then("^I find relative search contant on google$")
	public void i_find_relative_search_contant_on_google() throws Throwable {
	   
	}
	

}
