package com.hrms.scripts;

import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;

import com.hrms.lib.General;

public class TC_001 {
	//Test steps
	//object are calling for methods
	@Test
	public void tc001()throws Exception
	{
		  DOMConfigurator.configure("log4j.xml");
		General ob=new General();
		ob.openApplication();
		Thread.sleep(3000);
		ob.loginApplication();
		Thread.sleep(3000);
		ob.logoutApplication();
		Thread.sleep(3000);
		ob.closeApplication();
	}

}
