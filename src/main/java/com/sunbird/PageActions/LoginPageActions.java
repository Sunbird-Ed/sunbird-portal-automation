package com.sunbird.PageActions;

import com.sunbird.GenericLibrary.Listeners;
import com.sunbird.GenericLibrary.SunbirdConstants;
import com.sunbird.GenericLibrary.UtilityFunctions;
import org.openqa.selenium.support.PageFactory;

import com.sunbird.GenericLibrary.BaseTestConfig;
import com.sunbird.PageObjects.LoginPage;


/* Handle login flow by accepting username and password as parameter */
public class LoginPageActions extends BaseTestConfig {

    /* this method will handle to login flow based on the user role */
    public static void Login(String usrName, String passWord) throws InterruptedException {
        DashboardPageActions.clickUserProfileIcon();
        LoginPage loginpage = PageFactory.initElements(driver, LoginPage.class);
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
    public static void clickLoginInPopup()
    {
        LoginPage loginpage = PageFactory.initElements(driver, LoginPage.class);
        loginpage.LoginButtonInProfileIconDropdown();
    }
    public static void LoginForJoinCourse(String usrName, String passWord) throws InterruptedException {
        LoginPage loginpage = PageFactory.initElements(driver, LoginPage.class);
        loginpage.LoginUserName(usrName);
        loginpage.LoginPassword(passWord);
        loginpage.TapLoginButton();

    }
    public static void assertLoginPage() throws Exception {

        LoginPage loginpage = PageFactory.initElements(driver, LoginPage.class);
        String actualMsg = loginpage.checkDontYouHaveAccount();
        UtilityFunctions.stringValueComparision(actualMsg, SunbirdConstants.checkDontYouHaveAccount, "Don't have an account is not displayed");
        Listeners.addLogs("Don't have an account is displayed ");
        String actualMsg1 = loginpage.checkRegisterHere();
        UtilityFunctions.stringValueComparision(actualMsg1, SunbirdConstants.checkRegisterHere, "Register here is not displayed");
        Listeners.addLogs("Register here is displayed ");
        String actualMsg2 = loginpage.checkSignInWithGoogle();
        UtilityFunctions.stringValueComparision(actualMsg2, SunbirdConstants.checkSignInWithGoogle, "Sign in with Google is not displayed");
        Listeners.addLogs("Sign in with Google is displayed ");

        String actualMsg3 = loginpage.checkColorOfSignInWithGoogle();
        UtilityFunctions.stringValueComparision(actualMsg3, SunbirdConstants.colorOfSignInWithGoogle, "Blue color button is not displayed");
        Listeners.addLogs("Blue color button is displayed ");

        loginpage.checkGoogleImage();

        String actualMsg4 = loginpage.checkLoginWithStateSystem();
        UtilityFunctions.stringValueComparision(actualMsg4, SunbirdConstants.checkLoginWithStateSystem, "Login with State System is not displayed");
        Listeners.addLogs("Login with State System is displayed ");

        String actualMsg5 = loginpage.checkColorOfLoginWithStateSystem();
        UtilityFunctions.stringValueComparision(actualMsg5, SunbirdConstants.colorOfLoginWithStateSystem, "White color button is not displayed");
        Listeners.addLogs("White color button is displayed ");

    }
    }
	
