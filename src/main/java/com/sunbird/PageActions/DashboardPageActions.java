package com.sunbird.PageActions;

import com.sunbird.GenericLibrary.BaseTestConfig;
import com.sunbird.GenericLibrary.Listeners;
import com.sunbird.GenericLibrary.SunbirdConstants;
import com.sunbird.GenericLibrary.UtilityFunctions;
import com.sunbird.PageObjects.DashboardPage;
import com.sunbird.PageObjects.LoginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;


public class DashboardPageActions extends BaseTestConfig {

    static DashboardPage dashboardPage = PageFactory.initElements(driver, DashboardPage.class);

    public static void clickUserProfileIcon() throws InterruptedException {
        dashboardPage.userProfileIcon();
        Listeners.addLogs("Clicked on UserProfileIcon");
    }

    public static void clickOnWorkSpace() throws InterruptedException {
        dashboardPage.workspace();
    }


    /* validating workspace is availble after login */
    public static void assertWorkspace() {
        String actualMsg = dashboardPage.assertWorkspace();
        UtilityFunctions.stringValueComparision(actualMsg, SunbirdConstants.validateWorkspace, "Failed to Login: Workspace didn't load ");

    }

    public static void logOut() throws InterruptedException {
        dashboardPage.clickProfileIcon();
        dashboardPage.clickLogout();
        
    }
    

}
	
