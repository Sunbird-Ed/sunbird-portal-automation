package com.sunbird.PageActions;

import com.sunbird.GenericLibrary.BaseTestConfig;
import com.sunbird.PageObjects.AllMyContentPage;
import com.sunbird.PageObjects.GetPage;
import org.openqa.selenium.support.PageFactory;


public class AllMyContentPageActions extends BaseTestConfig {


	public static void enterContentInSearchBox(String contentName) throws Exception {
		AllMyContentPage allMyContentPage = PageFactory.initElements(driver, AllMyContentPage.class);
		allMyContentPage.enterContentInSearchBox(contentName);
allMyContentPage.searchIcon();
		Thread.sleep(2000);
	}

	public static void clickFirstCard()
	{
		AllMyContentPage allMyContentPage = PageFactory.initElements(driver, AllMyContentPage.class);
		allMyContentPage.firstContent();

	}




}