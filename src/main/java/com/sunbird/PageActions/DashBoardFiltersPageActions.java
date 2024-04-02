package com.sunbird.PageActions;

import com.sunbird.GenericLibrary.BaseTestConfig;
import com.sunbird.PageObjects.DashboardFilterPage;
import com.sunbird.PageObjects.GetPage;
import org.openqa.selenium.support.PageFactory;


public class DashBoardFiltersPageActions extends BaseTestConfig {


	public static void verifyAllFilter() throws Exception {
		DashboardFilterPage filterPage = PageFactory.initElements(driver, DashboardFilterPage.class);
		filterPage.assertAllTheFilters();
	}




}