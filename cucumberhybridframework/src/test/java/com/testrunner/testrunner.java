package com.testrunner;


     
	import org.junit.AfterClass;
	import org.junit.runner.RunWith;

	import com.cucumber.listener.Reporter;

	import cucumber.api.CucumberOptions;
	import cucumber.api.junit.Cucumber;


	
	//Cucumber class
			@RunWith(Cucumber.class)
			@CucumberOptions 
			(
			
				
	// features = "C:\\Users\\shrik\\eclipse-workspace\\cucumberhybridframework\\src\\test\\resources\\Features\\TestCase.feature",
	 features =  "/cucumberhybridframework/src/test/resources/Features/TestCaseAdmin.feature",
	 glue = {"com.stepdefination"},	        
	 plugin = {"pretty", "html:src/test/resources/Reports/cucumber-html-report","json:src/test/resources/reports/cucumber-html-report/jsonreport",
	"com.cucumber.listener.ExtentCucumberFormatter:src/test/resources/Reports/Extentreports/Extentreport.html"}
					     //  tags = {"@tc_01_login"}
					       
					      //  monochrome = true
					        
			)
		
	
			public class testrunner {	
			    @AfterClass
			      public static void extendReport()
			    {
			        Reporter.loadXMLConfig("\\src\\test\\resources\\TestData\\extent-config.xml");
			        Reporter.setSystemInfo("user", System.getProperty("user.name"));
			        Reporter.setSystemInfo("os", "Windows");
			        Reporter.setTestRunnerOutput("Sample test runner output message");
			  
			    }
}

		    
