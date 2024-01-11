package com.sunbird.PageActions;

import org.openqa.selenium.support.PageFactory;

import com.sunbird.GenericLibrary.BaseTestConfig;
import com.sunbird.PageObjects.LoginPage;



public class LoginPageActions extends BaseTestConfig {
	

	/* this method will handle to login flow based on the user role */
	public static void Login(String usrName,String passWord) throws InterruptedException {
		LoginPage loginpage = PageFactory.initElements(driver, LoginPage.class);
		loginpage.userProfileIcon();
		loginpage.LoginButtonInProfileIconDropdown();
		loginpage.LoginUserName(usrName);
		loginpage.LoginPassword(passWord);
		loginpage.TapLoginButton();
		

	}

	public static void fetchText()
	{
		LoginPage loginpage = PageFactory.initElements(driver, LoginPage.class);
	 String chec=loginpage.getTeacherText();
	 System.out.println("Able to fetch text" +chec);
	}
}
	
