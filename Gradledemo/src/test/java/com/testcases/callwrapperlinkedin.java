package com.testcases;


import java.io.IOException;

import org.testng.annotations.Test;

public class callwrapperlinkedin {
	@Test
	
	public void wrapperlinkedin() throws IOException, InterruptedException  {
	Gradlelinkedinwrapper wm=new Gradlelinkedinwrapper();
	wm.linkedinlogin("https://www.linkedin.com/");
	wm.takescreenshot("C:\\Swati\\Screenshot\\linkedin.png");
	wm.closeapp();
	}
		
   }




	
	