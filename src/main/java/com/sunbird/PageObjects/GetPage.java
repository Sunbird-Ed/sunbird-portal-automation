package com.sunbird.PageObjects;

import com.sunbird.GenericLibrary.Listeners;
import com.sunbird.GenericLibrary.UtilityFunctions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class GetPage {

	@FindBy(how=How.XPATH,using="//input[@name='search']")
	private WebElement enterQrCode;

	@FindBy(how=How.XPATH,using="//input[@name='search']//following::button[contains(text(),'Search')]")
	private WebElement searchIcon;

	@FindBy(how=How.XPATH,using="//*[contains(text(),' Share ')]")
	private WebElement assertContent;

	public void searchIconInGetPage() {
		UtilityFunctions.waitToBeClickableAndClick(searchIcon);
		Listeners.addLogs("clicked on searchIcon");
	}

	public void enterQRCode(String qrcodeValue) {
UtilityFunctions.waitForVisibilityOfWebElement(enterQrCode);
		UtilityFunctions.waitToBeClickableAndSendKeys(enterQrCode, qrcodeValue);
		Listeners.addLogs("entered qrcodeValue");

	}

	public void assertContent()
	{
UtilityFunctions.waitForElementIsVisible(assertContent);
UtilityFunctions.validatIsElementPresent(assertContent,"Content not displayed");
Listeners.addLogs("Content is displayed ");
	}
}
