package com.testcases;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Forbes1 {
	public WebDriver driver;
	public void takescreenshot() throws IOException  { 
		//WebDriver driver = null;
		//TakesScreenshot ts = (TakesScreenshot)driver;
		File file=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile (file,new File ("C:\\Swati\\Screenshot\\forbes.png"));
		driver.close();
		
	
}
	public static void main(String[] args) throws IOException {
		
		Forbes1 forbes=new Forbes1();					
	System.setProperty("webdriver.chrome.driver","C:\\Swati\\Selenium\\chromedriver_win32\\chromedriver.exe");
	 forbes.driver=new ChromeDriver();
	forbes.driver.manage().window().maximize();
	forbes.driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
			forbes.driver.get("https://www.forbes.com/");
						System.out.println("The Title of the page is:"+forbes.driver.getTitle());
				forbes.takescreenshot();
			}
			
			

			




	}


