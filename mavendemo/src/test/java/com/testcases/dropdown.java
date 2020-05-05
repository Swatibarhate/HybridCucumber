package com.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Swati\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		//selectByVisibleText
		Select month=new Select (driver.findElement(By.id("month")));
		month.selectByVisibleText("Jul");
		
		//selectByIndex
		Select day=new Select (driver.findElement(By.id("day")));
		day.selectByIndex(25);
		
		//selectByValue
		Select year=new Select (driver.findElement(By.id("year")));
		year.selectByValue("1977");
		

	}

}
