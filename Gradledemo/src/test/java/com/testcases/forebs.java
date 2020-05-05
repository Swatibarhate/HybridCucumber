package com.testcases;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class forebs {
public static	WebDriver driver;
	@BeforeMethod()
	public void openbrowser() throws IOException {
		System.setProperty("webdriver.chrome.driver","C:\\Swati\\Selenium\\chromedriver_win32\\chromedriver.exe");
		 driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://www.forbes.com/");
		String title=driver.getTitle();
		Assert.assertEquals(title,"Forbes");
		System.out.println("The Title of the page is:"+driver.getTitle());
		TakesScreenshot ts = (TakesScreenshot)driver;
		File source=ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile (source,new File ("C:\\Swati\\Screenshot\\forbes"+System.currentTimeMillis()+".png"));
		driver.close(); 
		
	}
		
			
	@Test(priority=1)
	public void billionair() throws IOException {
		WebElement Billionaires=driver.findElement(By.xpath("//*[@id=\"row-0\"]/div[1]/div[1]/h3/a"));
	Billionaires.click();
	String billionair=driver.getTitle();
	System.out.println("The title of the Billionaires page is:"+driver.getTitle());
	Assert.assertEquals(billionair, "Worlds Billionaires");
	TakesScreenshot ts = (TakesScreenshot)driver;
	File source=ts.getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile (source,new File ("C:\\Swati\\Screenshot\\billionair"+System.currentTimeMillis()+".png"));
	
		
	}
	//	@Test(priority=2)	
		//public void 
	//public void takescreenshot() throws IOException  {                                                   
			//TakesScreenshot ts = (TakesScreenshot)driver;
		//	File source=ts.getScreenshotAs(OutputType.FILE);
		//	FileUtils.copyFile (source,new File ("C:\\Swati\\Screenshot\\forbes.png"));
		//	driver.close(); 
			
			
		
	}
	
	


