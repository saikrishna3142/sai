package com.hrms.scripts;

import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;

import com.hrms.lib.General;

public class Tc_002 {
	@Test
	public void tc002()throws Exception
	{
		  DOMConfigurator.configure("log4j.xml");
		General ob=new General();
		ob.openApplication();
		Thread.sleep(9000);
		ob.loginApplication();
		Thread.sleep(3000);
		ob.enterFrame();
		ob.addEmployee();
		Thread.sleep(5000);
		ob.exitFrame();
		ob.logoutApplication();
		Thread.sleep(3000);
		ob.closeApplication();
	}
	

}
