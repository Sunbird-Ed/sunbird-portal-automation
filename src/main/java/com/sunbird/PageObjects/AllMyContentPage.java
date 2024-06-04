package com.sunbird.PageObjects;

import com.sunbird.GenericLibrary.Listeners;
import com.sunbird.GenericLibrary.UtilityFunctions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AllMyContentPage {

	@FindBy(how=How.XPATH,using="//input[@placeholder='Search content']")
	private WebElement searchTextbox;

	@FindBy(how=How.XPATH,using="//*[@class='circular search link icon']")
	private WebElement searchIcon;

	@FindBy(how=How.XPATH,using="//div[@class='UpReviewHeader']")
	private WebElement clickFirstContent;

	@FindBy(how=How.XPATH,using="//div[contains(text(),'No results found')]")
	private WebElement assertNoResultFound;

	public void searchIcon() {
		UtilityFunctions.waitToBeClickableAndClick(searchIcon);
		Listeners.addLogs("clicked on searchIcon");
	}

	public void enterContentInSearchBox(String contentName) {
UtilityFunctions.waitForVisibilityOfWebElement(searchTextbox);
		UtilityFunctions.waitToBeClickableAndSendKeys(searchTextbox, contentName);
		Listeners.addLogs("entered contentName in searchTextbox");

	}
	public void firstContent() {
		UtilityFunctions.waitToBeClickableAndClick(clickFirstContent);
		Listeners.addLogs("clicked on clickFirstContent");
	}

	public void assertNoResultFound() {
		UtilityFunctions.waitForVisibilityOfWebElement(assertNoResultFound);
		Listeners.addLogs("No Result found in All my content bucket");
	}
}
