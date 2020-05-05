package com.testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class Testcase {
  
	@Test
  public void testcase1() {
	System.out.println("testcase1");	
  }
  
  @Test
  public void testcase2() {
	  System.out.println("testcase2");
  }
  @Test
  public void testcase3() {
	  System.out.println("testcase3");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("beforeMthod : launch app");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("afterMethod : close app");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("beforeClass : prepare test data");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("afterClass : clear test data");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("beforeTest : smoke testing");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("afterTest : generate report");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("beforeSuite:open db connection");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("afterSuite : close db connection");
  }

}
