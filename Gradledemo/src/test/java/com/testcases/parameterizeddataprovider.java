package com.testcases;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class parameterizeddataprovider {
	WebDriver driver;
	@Test(dataProvider="facebooklogin")
	public void loginTofacebook(String username,String password)throws Exception {
	System.setProperty("webdriver.chrome.driver","C:\\Swati\\Selenium\\chromedriver_win32\\chromedriver.exe");
	 driver=new ChromeDriver();
	 driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	driver.findElement(By.id("email")).sendKeys(username);
	driver.findElement(By.id("pass")).sendKeys(password);
	//driver.findElement(By.xpath("//*[@id=\"u_0_b\"]")).click();
	Assert.assertEquals("https://www.facebook.com/",driver.getCurrentUrl());
	System.out.println(driver.getCurrentUrl());
	System.out.println("User is login sucessfully");
}
@AfterMethod
public void teardown() throws InterruptedException {
	Thread.sleep(3000);
	driver.quit();
}

@DataProvider(name="facebooklogin")
public Object[][] passData(){
	
	Object[][]data=new Object[3][2];
	//username
	data[0][0]="swati";
	//password
	data[0][1]="demo1";
	
	data[1][0]="simi1";
			data[1][1]="demo123";
	
	data[2][0]="shri";
	data[2][1]="demo1234";
	
	
	return data;
	
}
}
	
	
	


