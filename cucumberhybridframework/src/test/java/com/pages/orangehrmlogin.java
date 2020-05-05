package com.pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class orangehrmlogin {
	WebDriver driver;
	
	@FindBy(id="txtUsername")
	WebElement Uname;
	
	@FindBy(id="txtPassword")
	WebElement Pwd;
	
	@FindBy(id="btnLogin")
	WebElement LoginButton;
	
	public orangehrmlogin(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	

	public void login(String username, String pwd) {
		Uname.sendKeys(username);
		Pwd.sendKeys(pwd);
		LoginButton.click();
	}



	public void click() {
		// TODO Auto-generated method stub
		
	}
}