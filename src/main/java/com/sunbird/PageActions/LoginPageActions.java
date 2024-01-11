package com.sunbird.PageActions;

import org.openqa.selenium.support.PageFactory;

import com.sunbird.GenericLibrary.BaseTestConfig;
import com.sunbird.PageObjects.LoginPage;



public class LoginPageActions extends BaseTestConfig {
	

	/* this method will handle to login flow based on the user role */
	public static void Login() throws InterruptedException {
		LoginPage loginpage = PageFactory.initElements(driver, LoginPage.class);
		loginpage.userProfileIcon();
		loginpage.LoginButtonInProfileIconDropdown();
		String usrname=frameworkconfig.getFramework("CREATOR_USRNAME");
		loginpage.LoginUserName(usrname);
		String password=frameworkconfig.getFramework("CREATOR_PASSWORD");
		loginpage.LoginPassword(password);
		loginpage.TapLoginButton();
		
		


	}
}
	
