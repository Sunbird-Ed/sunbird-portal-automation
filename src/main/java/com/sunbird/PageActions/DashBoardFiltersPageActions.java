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

	public static void assertOrderOfMediumClassSubjectFiltres() throws Exception {
		DashboardFilterPage filterPage = PageFactory.initElements(driver, DashboardFilterPage.class);
		filterPage.assertOrderofFiltres();
	}

	public static void clickPublishedFilter() throws Exception {
		DashboardFilterPage filterPage = PageFactory.initElements(driver, DashboardFilterPage.class);
		filterPage.clickPublishedUserType();
	}
	public static void selectPublishedType(String type) throws Exception {
		DashboardFilterPage filterPage = PageFactory.initElements(driver, DashboardFilterPage.class);
		filterPage.selectPublishedType(type);
	}
	public static void clickResetButton() throws Exception {
		DashboardFilterPage filterPage = PageFactory.initElements(driver, DashboardFilterPage.class);
		filterPage.resetBtn();
	}
	public static void assertContentDisplayed() throws Exception {
		DashboardFilterPage filterPage = PageFactory.initElements(driver, DashboardFilterPage.class);
		filterPage.assertContentDisplayed();
	}
}