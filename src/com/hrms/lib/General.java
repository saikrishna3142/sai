package com.hrms.lib;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;

import com.hrms.utility.Log;

public class General extends Global {

	//to provide Reusable functions /methods  related to whole application
	//fuctions/methods
public void openApplication()
{
	System.setProperty("webdriver.gecko.driver", "C:\\Users\\ksaik\\Downloads\\geckodriver-v0.30.0-win64\\geckodriver.exe");
	 driver=new FirefoxDriver();
	 System.out.println("Application opened");
	 Reporter.log("Application Opened");
	 Log.info("application opened");
	
}
public void closeApplication()
{
	driver.close();
	System.out.println("Application closed");
	 Reporter.log("Application closed");
	 Log.info("application closed");
}
public void loginApplication()
{
	driver.get(url);
	driver.findElement(By.name(txt_log)).sendKeys(txt_un);
	driver.findElement(By.name(txt_passw)).sendKeys(txt_pas);
	driver.findElement(By.name(btn_login)).click();
	System.out.println("Login completed");
	 Reporter.log("login completed");
	 Log.info("Login completed");
}
public void logoutApplication()
{
	driver.findElement(By.linkText(link_logout)).click();
	System.out.println("logout completed");
	 Reporter.log("logout completed");
	 Log.info("Logout completed");
}
public void enterFrame()
{
	driver.switchTo().frame(id);
	System.out.println("Entered into frame");
	Log.info("enter into frame completed");
}
public void exitFrame()
{
	driver.switchTo().defaultContent();
}
public void addEmployee()
{
	driver.findElement(By.xpath(btn_add)).click();
	driver.findElement(By.name(txt_fn)).sendKeys(fn);
	driver.findElement(By.name(txt_ln)).sendKeys(ln);
	driver.findElement(By.id(btn_save)).click();
	System.out.println("Add employee");
	 Reporter.log("Added employee");
	 Log.info("added employee");
}
public void editEmp()
{
	driver.findElement(By.xpath(txt_empname)).click();
	driver.findElement(By.name(btn_edit)).click();
	driver.findElement(By.name(txt_ln)).clear();
	driver.findElement(By.name(txt_fn)).clear();
	driver.findElement(By.name(txt_ln)).sendKeys(ln1);
	driver.findElement(By.name(txt_fn)).sendKeys(fn1);
	driver.findElement(By.xpath(btn_save1)).click();
	System.out.println("emp edited");
	 Reporter.log("Employee edited");
	 Log.info("employee edited");
}
/*public void delectEmp()
{
	driver.findElement(By.name(btn_checkbox)).click();
	driver.findElement(By.xpath(btn_del)).click();
	System.out.println("delect emp");
			
}*/
}














