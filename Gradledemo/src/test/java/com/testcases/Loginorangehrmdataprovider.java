package com.testcases;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class Loginorangehrmdataprovider {
	WebDriver driver;
	@Test(dataProvider="orangehrmdemologin")
	public void loginTofacebook(String username,String password) {
	System.setProperty("webdriver.chrome.driver","C:\\Swati\\Selenium\\chromedriver_win32\\chromedriver.exe");
	 driver=new ChromeDriver();
	 driver.get("https://opensource-demo.orangehrmlive.com/");
	driver.manage().window().maximize();
	driver.findElement(By.id("txtUsername")).sendKeys(username);
	driver.findElement(By.id("txtPassword")).sendKeys(password);
	driver.findElement(By.xpath("//*[@id=\"btnLogin\"]")).click();
	Assert.assertEquals("https://opensource-demo.orangehrmlive.com/index.php/dashboard",driver.getCurrentUrl());
	System.out.println(driver.getCurrentUrl());
	System.out.println("User is login sucessfully");
	//driver.findElement(By.xpath("//*[@id=\"menu_admin_viewAdminModule\"]/b")).click();
}
@AfterMethod
public void teardown() throws InterruptedException {
	Thread.sleep(3000);
	driver.quit();
}

@DataProvider(name="orangehrmdemologin")
public Object[][] passData(){
	
	Object[][]data=new Object[1][2];
	//username
	data[0][0]="Admin";
	//password
	data[0][1]="admin123";
	
	//data[1][0]="simi1";
			//data[1][1]="demo123";
	
	//data[2][0]="shri";
	//data[2][1]="demo1234";
	
	
	return data;
	
}
}
	
	
	


