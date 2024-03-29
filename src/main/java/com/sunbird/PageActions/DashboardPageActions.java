package com.sunbird.PageActions;

import com.sunbird.GenericLibrary.BaseTestConfig;
import com.sunbird.GenericLibrary.Listeners;
import com.sunbird.GenericLibrary.SunbirdConstants;
import com.sunbird.GenericLibrary.UtilityFunctions;
import com.sunbird.PageObjects.DashboardPage;
import org.openqa.selenium.support.PageFactory;


public class DashboardPageActions extends BaseTestConfig {


    /* click on userProfileIcon */
    public static void clickUserProfileIcon() throws InterruptedException {
        DashboardPage dashboardPage = PageFactory.initElements(driver, DashboardPage.class);
        dashboardPage.userProfileIcon();
        Listeners.addLogs("Clicked on UserProfileIcon");
    }

    /*Click on workspace option*/
    public static void clickOnWorkSpace() throws InterruptedException {
        DashboardPage dashboardPage = PageFactory.initElements(driver, DashboardPage.class);
        dashboardPage.workspace();
    }


    /* validating workspace is availble after login */
    public static void assertWorkspace() {
        DashboardPage dashboardPage = PageFactory.initElements(driver, DashboardPage.class);
        String actualMsg = dashboardPage.assertWorkspace();
        UtilityFunctions.stringValueComparision(actualMsg, SunbirdConstants.validateWorkspace, "Failed to Login: Workspace didn't load ");

    }

    /* click on profileIcon and clicks logout */
    public static void logOut() throws InterruptedException {
        DashboardPage dashboardPage = PageFactory.initElements(driver, DashboardPage.class);

     //  dashboardPage.clickProfileIcon();
       dashboardPage.clickProfileIcon2();
       // DashboardPageActions.clickUserProfileIcon();
        dashboardPage.clickLogout();
        Thread.sleep(6000);
    }

    /* search the content in searchbar and click on the first content */
public static void searchContentAndClickOnContentCard(String searchText) throws InterruptedException {
        DashboardPage dashboardPage = PageFactory.initElements(driver, DashboardPage.class);
        dashboardPage.enterContentInSearchBox(searchText);
        dashboardPage.clickSearchIcon();
        dashboardPage.clickOnFirstContent();
    }

    /* click on HomeTab */
    public static void clickHomeTab()
    {
        DashboardPage dashboardPage = PageFactory.initElements(driver, DashboardPage.class);
dashboardPage.homeTab();
    }

    /* click on DigitalTextbookTab */
    public static void clickDigitalTextbookTab()
    {
        DashboardPage dashboardPage = PageFactory.initElements(driver, DashboardPage.class);
        dashboardPage.digitalTxtbookTab();
    }

    /* click on courseTab */
    public static void clickCourseTab()
    {
        DashboardPage dashboardPage = PageFactory.initElements(driver, DashboardPage.class);
        dashboardPage.courseTab();
    }

    /* click on myGroups Page */
    public static void clickOnMyGroups() throws InterruptedException {
        DashboardPage dashboardPage = PageFactory.initElements(driver, DashboardPage.class);
        dashboardPage.myGroups();
    }

    public static void clickOnObservationTab() throws InterruptedException {
        DashboardPage dashboardPage = PageFactory.initElements(driver, DashboardPage.class);
        dashboardPage.observationTab();
    }
}
	
