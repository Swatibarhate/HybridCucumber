package com.testcases;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Excellinkedinlogin {

	@Test
	public void login() throws IOException, InterruptedException {
		FileInputStream fil = new FileInputStream(new File("C:\\Swati\\Excel\\linkedinlogin.xlsx"));
		XSSFWorkbook workbook = new XSSFWorkbook(fil);
		XSSFSheet sheet=workbook.getSheet("Sheet1");
		int count =sheet.getLastRowNum();
		System.out.println(count);
		for(int i=1; i<=count;i++) {
			XSSFRow row= sheet.getRow(i);
			XSSFCell cell=row.getCell(0);
			String un = cell.getStringCellValue();
			XSSFCell cell1=row.getCell(1);
			String pwd = cell1.getStringCellValue();
			System.setProperty("webdriver.chrome.driver","C:\\Swati\\Selenium\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.get("https://www.linkedin.com");
			driver.findElement(By.xpath("/html/body/nav/a[3]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id='username']")).sendKeys(un);
			driver.findElement(By.xpath("//*[@id='password']")).sendKeys(pwd);
	Thread.sleep(3000);	
	driver.close();

		}
		}

	}


