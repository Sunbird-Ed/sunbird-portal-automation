package com.sunbird.PageActions;

import com.sunbird.GenericLibrary.BaseTestConfig;
import com.sunbird.GenericLibrary.Listeners;
import com.sunbird.GenericLibrary.SunbirdConstants;
import com.sunbird.GenericLibrary.UtilityFunctions;
import com.sunbird.PageObjects.DashboardPage;
import com.sunbird.PageObjects.WorkspaceDashboardPage;
import org.openqa.selenium.support.PageFactory;


public class WorkspaceDashboardPageActions extends BaseTestConfig {

static WorkspaceDashboardPage workspacedashboardPage=PageFactory.initElements(driver, WorkspaceDashboardPage.class);
    public static void assertDrafts()
    {
        workspacedashboardPage.assertDrafts();
    }
    
    public static void clickBook() throws InterruptedException {
        workspacedashboardPage.clickBook();
        
    }
}
	
