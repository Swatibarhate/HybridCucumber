package com.testcases;

import java.io.IOException;

import org.testng.annotations.Test;

public class Orangehrmcallwrapper {
	
	@Test
	public void Orangehrm() throws IOException, InterruptedException {
	wrappermethod wm=new wrappermethod();
	wm.inserttapp("https://opensource-demo.orangehrmlive.com/index.php/auth/validateCredentials");
	wm.enterbyid("txtUsername", "Admin");
	wm.enterbyid("txtPassword", "admin123");
	wm.clickbyxpath("//*[@id=\"btnLogin\"]");
	wm.clickbyxpath("//*[@id=\"menu_admin_viewAdminModule\"]/b");
	
	wm.enterbyid("searchSystemUser_userName", "Arti");
	wm.dropdown("//*[@id=\"searchSystemUser_userType\"]", "Admin");
	wm.enterbyid("searchSystemUser_employeeName_empName", "Ramesh");
	wm.dropdown("//*[@id=\"searchSystemUser_status\"]", "Enabled");
	wm.clickbyxpath("//*[@id=\"searchBtn\"]");
	wm.takescreenshot("C:\\Swati\\Screenshot\\orangehrm.png");
	wm.closeapp();
	}
	

}
