package com.sunbird.PageObjects;

import com.sunbird.GenericLibrary.Listeners;
import com.sunbird.GenericLibrary.UtilityFunctions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class DraftsPage {


	@FindBy(how=How.XPATH,using="//div[contains(@class,'mat-tooltip-trigger')]")
	private WebElement clickFirstContent;

	public void firstContent() {
		UtilityFunctions.waitToBeClickableAndClick(clickFirstContent);
		Listeners.addLogs("clicked on clickFirstContent");
	}


}
