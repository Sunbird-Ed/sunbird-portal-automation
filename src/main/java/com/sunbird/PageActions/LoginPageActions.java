package com.sunbird.PageActions;

import com.sunbird.GenericLibrary.Listeners;
import org.openqa.selenium.support.PageFactory;

import com.sunbird.GenericLibrary.BaseTestConfig;
import com.sunbird.PageObjects.LoginPage;


/* Handle login flow by accepting username and password as parameter */
public class LoginPageActions extends BaseTestConfig {
    static LoginPage loginpage = PageFactory.initElements(driver, LoginPage.class);

    /* this method will handle to login flow based on the user role */
    public static void Login(String usrName, String passWord) throws InterruptedException {
        DashboardPageActions.clickUserProfileIcon();
        loginpage.LoginButtonInProfileIconDropdown();
        loginpage.LoginUserName(usrName);
        loginpage.LoginPassword(passWord);
        loginpage.TapLoginButton();


    }

    public static void fetchText() {
        LoginPage loginpage = PageFactory.initElements(driver, LoginPage.class);
        String chec = loginpage.getTeacherText();
        System.out.println("Able to fetch text" + chec);
    }
}
	
