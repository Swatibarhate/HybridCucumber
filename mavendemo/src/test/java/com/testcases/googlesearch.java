package com.testcases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class googlesearch {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Swati\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String url = "https://google.com";
		
		driver.get (url);
		WebElement find = driver.findElement(By.name("q"));
		find.sendKeys("testing");
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div[1]/div[1]/div/div[2]/input")).sendKeys("Testing");
		
		
		
		WebElement click = driver.findElement(By.name("btnK"));
		click.click();
		Thread.sleep(3000);	
		
		//List<WebElement> links = driver.findElements(By.xpath("//a"));
		 List<WebElement>  list = driver.findElements(By.tagName("a"));
		
		int linkCount = list.size();
		
		System.out.println("Total Number of links count on webpage = " + linkCount );
		
				
		driver.close();
		
		
				
		
		

	}

	

}
