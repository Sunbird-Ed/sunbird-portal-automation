package com.sunbird.PageActions;

import com.sunbird.GenericLibrary.BaseTestConfig;
import com.sunbird.PageObjects.AllMyContentPage;
import com.sunbird.PageObjects.DraftsPage;
import org.openqa.selenium.support.PageFactory;


public class DraftsPageActions extends BaseTestConfig {



	public static void clickFirstCard()
	{
		DraftsPage draftsPage = PageFactory.initElements(driver, DraftsPage.class);
		draftsPage.firstContent();

	}




}