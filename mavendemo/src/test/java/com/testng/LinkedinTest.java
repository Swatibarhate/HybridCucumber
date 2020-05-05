
package com.testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;

public class LinkedinTest {
	WebDriver driver = null;
  @BeforeMethod
  public void openbrowser(){
	  
  }
  @Test
  public void beforeMethod(ChromeDriver driver) {
	  driver=new ChromeDriver();
  }

  @AfterMethod
  public void afterMethod() {
  }

  @BeforeTest
  public void beforeTest() {
  }

}
