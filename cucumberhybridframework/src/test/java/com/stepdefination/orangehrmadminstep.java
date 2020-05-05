package com.stepdefination;

import java.io.IOException;

import com.baseclass.Library;
import com.pages.orangehrmAdmin;
import com.pages.orangehrmlogin;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class orangehrmadminstep extends Library {
	orangehrmlogin hrm;
	orangehrmAdmin adpage;

	@Given("^launch the oreangehrm application and login$")
	public void launch_the_browser_and_login() throws IOException  {
		launchApplication();
		
	}
	
	@When("^login page openes$")
	public void login_page_is_opened() throws IOException {
	   hrm=new orangehrmlogin(driver);
	}
	
	@Then("^put usename and password$")
	public void enter_the_and(String username, String password)  {
		hrm=new orangehrmlogin(driver);
	   hrm.login("Admin","admin123");
	}
	
	@Then("^click on login button$")
	public void click_the_login_button()  {
	         hrm.click();
	}   
	
	 @When("^Select Admin menu$")
	   public void select_admin_menu()  {
	//   adpage=new orangehrmAdmin(driver);
	   adpage.clickadmin();
		   
	 }

	@Then("^enter adminusername$")
	public void enter_adminusername() {
	//	adpage=new orangehrmAdmin(driver);
		   adpage.username("swati");
	   
	}

	@Then("^Select userrole$")
	public void select_userrole ()  {
		adpage.userroll("Admin");
		
	}

	//@Given("^launch orangehrm application$")
	//public void launch_orangehrm_application()  {
	   
	//}

	//@Then("^Click on admin$")
	//public void click_on_admin()  {
	    
	//}

	//@Then("^enter uesrname$")
	//public void enter_uesrname() {
	   
	    
	//}

	//@Then("^enter userrole$")
	//public void enter_userrole() throws Throwable {
	   
	//}

	@Then("^enter Employeename$")
	 public void enter_employeename() {
		adpage.employeename("barhate");
	   
	
	}
	    
   	@Then("^select status$")
	public void select_status()  {
		adpage.status("Enabled");
	   
	}

	@Then("^click on the search button$")
	public void click_on_the_search_button()  {
	   
	}
	
	@Then("^take screenshot and close the browser$")
	public void take_screenshot_and_close_the_browser() throws IOException  {
	 screenshot("\\src\\test\\resources\\Screenshots\\admin.png");
	 quit();
	}


}
