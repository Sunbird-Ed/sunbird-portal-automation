package com.sunbird.PageActions;

import com.sunbird.GenericLibrary.BaseTestConfig;
import com.sunbird.PageObjects.GetPage;
import com.sunbird.PageObjects.MergeAccountPage;
import org.openqa.selenium.support.PageFactory;


public class MergeAccountPageActions extends BaseTestConfig {



	public static void clickMergeInMergePopup()
	{
		MergeAccountPage mergeAccount = PageFactory.initElements(driver, MergeAccountPage.class);
mergeAccount.MergeInMergePopup();
	}


	public static void assertMergedAccountSuccessMsg()
	{
		MergeAccountPage mergeAccount = PageFactory.initElements(driver, MergeAccountPage.class);
		mergeAccount.assertMergeMSg();
	}


}