package com.hrms.lib;

import org.openqa.selenium.WebDriver;

public class Global {

	//to provide testdata and objects to related to ahole application
//Test Data
	public WebDriver driver;
	String url="http://127.0.0.1/orangehrm-2.6/login.php";
	String txt_un="admin";
	String txt_pas="admin";
	String fn="sai";
	String ln="krish";
	String fn1="ssss";
	String ln1="teja";

	//objects
	String txt_log="txtUserName";
	String txt_passw="txtPassword";
	String btn_login="Submit";
	String link_logout="Logout";
	String btn_add="//input[@value='Add']";
	String txt_fn="txtEmpFirstName";
	String txt_ln="txtEmpLastName";
	String btn_save="btnEdit";
	
	//string btn_checkbox="chkLocID[]";
	//string btn_del="//*[@id='standardView']/div[3]/div[1]/input[2]";
	String id="rightMenu";
	String txt_empname="//*[@id='standardView']/table/tbody/tr[1]/td[3]/a";
	String btn_edit="EditMain";
	String btn_save1="//*[@id=\"btnEditPers\"]";

}
