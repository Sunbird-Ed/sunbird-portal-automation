package com.sunbird.PageObjects;

import com.sunbird.GenericLibrary.Listeners;
import com.sunbird.GenericLibrary.UtilityFunctions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class MergeAccountPage {

	@FindBy(how=How.XPATH,using="//button[contains(text(),'Merge')]")
	private WebElement mergeInMergeAccountPopup;

	@FindBy(how=How.XPATH,using="//*[contains(text(),' Account merge initiated successfully. you will be notified once it is completed')]")
	private WebElement assertMerge;



	public void MergeInMergePopup() {
		UtilityFunctions.waitToBeClickableAndClick(mergeInMergeAccountPopup);
		Listeners.addLogs("clicked on mergeInMergeAccountPopup");
	}

	public void assertMergeMSg() {
		UtilityFunctions.waitForElementIsVisible(assertMerge);
		UtilityFunctions.waitForElementUsingForLoopAndAssert(assertMerge,8);
		UtilityFunctions.validatIsElementPresent(assertMerge,"Failed to merge custodian user");
		Listeners.addLogs("validated merge account succcess msg");
	}

}
