package com.testcases;

import java.io.IOException;
import org.testng.annotations.Test;

public class callwrapper {
	
	@Test
	public void facebooklogin() throws IOException, InterruptedException {
		wrappermethod wm=new wrappermethod();
		wm.inserttapp("https://www.facebook.com/");
		wm.enterbyid("email", "swati");
		wm.enterbyid("pass", "abc");
		wm.clickbyxpath("//*[@id=\"u_0_b\"]");
		wm.takescreenshot("C:\\Swati\\Screenshot\\facebook.png");
		wm.closeapp();
	}

}
