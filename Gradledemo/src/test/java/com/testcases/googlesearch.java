package com.testcases;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class googlesearch {
	WebDriver driver;
	@Test()
	public void searchgoogle()throws Exception {
	System.setProperty("webdriver.chrome.driver","C:\\Swati\\Selenium\\chromedriver_win32\\chromedriver.exe");
	 driver=new ChromeDriver();
	 driver.get("https://www.google.com/");
	driver.manage().window().maximize();
		
	driver.findElement(By.name("q")).sendKeys("testing");
	driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div[1]/div[1]/div/div[2]/input")).click();
	}
	
	@AfterMethod
	public void teardown() throws InterruptedException {
		Thread.sleep(3000);
		driver.quit();
}




			
		}


		
		
		
		