package com.sunbird.PageActions;

import com.sunbird.GenericLibrary.BaseTestConfig;
import com.sunbird.PageObjects.DashboardPage;
import com.sunbird.PageObjects.LoginPage;
import org.openqa.selenium.support.PageFactory;


public class DashboardPageActions extends BaseTestConfig {

	static DashboardPage dashboardPage = PageFactory.initElements(driver, DashboardPage.class);
	public static void clickUserProfileIcon() throws InterruptedException {
		dashboardPage.userProfileIcon();
			}
	public static void clickOnWorkSpace() throws InterruptedException {
		dashboardPage.workspace();
	}


}
	
