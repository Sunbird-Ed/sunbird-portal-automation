package com.sunbird.PageActions;

import org.openqa.selenium.support.PageFactory;

import com.sunbird.GenericLibrary.BaseTestConfig;
import com.sunbird.GenericLibrary.Listeners;
import com.sunbird.GenericLibrary.SunbirdConstants;
import com.sunbird.GenericLibrary.UtilityFunctions;
import com.sunbird.PageObjects.DashboardPage;
import com.sunbird.PageObjects.HelpPage;

public class HelpPageActions extends BaseTestConfig {
	
	public static void assertFAQSection() throws InterruptedException {
		HelpPage helpPage = PageFactory.initElements(driver, HelpPage.class);
		
		helpPage.assertFAQ();
		helpPage.ClickOnFAQ();
		helpPage.ClickYesButton();
			
		String actualMsg1 = helpPage.assertYesClickedFeedback();
		UtilityFunctions.stringValueComparision(actualMsg1, SunbirdConstants.assertYesClickedFeedback, "Feedback is not displayed");
		Listeners.addLogs("Feedback is displayed ");
			
		}

	

}
