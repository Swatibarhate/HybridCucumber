package com.stepdefination;



import java.io.IOException;

import com.baseclass.Library;
import com.pages.orangehrmlogin;
import com.seleniumutils.Seleniumutils;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class orangehrmloginstep extends Library{
	Seleniumutils utils;
	orangehrmlogin login;
	@Given("^launch the browser and enter the url$")
	public void launch_the_browser_and_enter_the_url() throws IOException {
	    
	    launchApplication();
	}

	@When("^login page is opened$")
	public void login_page_is_opened() throws IOException {
	   utils=new Seleniumutils(driver);
	   utils.getTitle();
		utils.screenshot("src\\test\\resources\\Screenshots\\login.png");
	}

	@Then("^enter the \"([^\"]*)\" and \"([^\"]*)\"$")
	public void enter_the_and(String username, String password)  {
		login=new orangehrmlogin(driver);
	   login.login(username, password);
	}

	@Then("^click the login button$")
	public void click_the_login_button()  {
		
		
	}   
	    
	@Then("^take screenshot and close the browser$")
	public void take_screenshot_and_close_the_browser() throws IOException  {
	 screenshot("\\src\\test\\resources\\Screenshots\\login.png");
	 quit();
	}
}
