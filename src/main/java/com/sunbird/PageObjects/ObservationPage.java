package com.sunbird.PageObjects;

import com.sunbird.GenericLibrary.Listeners;
import com.sunbird.GenericLibrary.UtilityFunctions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ObservationPage {

	@FindBy(how=How.XPATH,using="//*[@class='sb--card__meta']")
	private WebElement observationCard;

	@FindBy(how=How.XPATH,using="//*[@class='badge']")
	private WebElement observationCount;

	@FindBy(how=How.XPATH,using="//*[contains(text(),'Observation Details ')]")
	private WebElement assertObservationDetails;

	public void observationCard() {
		UtilityFunctions.waitToBeClickableAndClick(observationCard);
		Listeners.addLogs("clicked on observationCard");
	}

	public void assertObservationDetails()
	{
		UtilityFunctions.waitForElementIsVisible(assertObservationDetails);
		UtilityFunctions.validatIsElementPresent(assertObservationDetails,"assertObservationDetails not displayed");
		Listeners.addLogs("assertObservationDetails is validated");
	}
	public void assertObservationCount()
	{
UtilityFunctions.waitForElementIsVisible(observationCount);
UtilityFunctions.validatIsElementPresent(observationCount,"observationCount not displayed");
Listeners.addLogs("observationCount is validated");
	}
}
