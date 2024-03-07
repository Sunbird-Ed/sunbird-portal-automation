package com.sunbird.PageActions;

import com.sunbird.GenericLibrary.BaseTestConfig;
import com.sunbird.GenericLibrary.Listeners;
import com.sunbird.GenericLibrary.SunbirdConstants;
import com.sunbird.GenericLibrary.UtilityFunctions;
import com.sunbird.PageObjects.DashboardPage;
import com.sunbird.PageObjects.WorkspaceDashboardPage;
import org.openqa.selenium.support.PageFactory;


public class WorkspaceDashboardPageActions extends BaseTestConfig {

/* validate Drafts sections is available */
    public static void assertDrafts() throws InterruptedException {
        WorkspaceDashboardPage workspacedashboardPage=PageFactory.initElements(driver, WorkspaceDashboardPage.class);
        workspacedashboardPage.assertDrafts();
    }

    /* click on book option in workspace */
    public static void clickBook() throws InterruptedException {
        WorkspaceDashboardPage workspacedashboardPage=PageFactory.initElements(driver, WorkspaceDashboardPage.class);
        workspacedashboardPage.clickBook();
        
    }

    /* click on course option in workspace */
    public static void clickCourse() throws InterruptedException {
        WorkspaceDashboardPage workspacedashboardPage=PageFactory.initElements(driver, WorkspaceDashboardPage.class);
        workspacedashboardPage.clickCourse();

    }

    /* click on resource option in workspace */
    public static void clickResource() throws InterruptedException {
        WorkspaceDashboardPage workspacedashboardPage=PageFactory.initElements(driver, WorkspaceDashboardPage.class);
        workspacedashboardPage.clickResource();

    }
}
	
