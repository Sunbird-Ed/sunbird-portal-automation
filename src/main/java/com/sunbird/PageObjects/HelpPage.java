package com.sunbird.PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.sunbird.GenericLibrary.Listeners;
import com.sunbird.GenericLibrary.UtilityFunctions;

public class HelpPage {
	
	 @FindBy(how = How.XPATH, using = "//h4[contains(text(),'Faq(s)')]")
	    private WebElement faqSection;
	 
	 @FindBy(how = How.XPATH, using = "//h4[contains(text(),'Faq(s)')]//following::div[2]")
	    private WebElement clickfaq;
	 
	 @FindBy(how = How.XPATH, using = "//button[@id='btn-yes']")
	    private WebElement clickYesButtonOfFAQ;
	 
	 @FindBy(how = How.XPATH, using = "//legend[@id='yes-clicked']")
	    private WebElement assertYesClicked;
	 
	 
	public void assertFAQ() {
		UtilityFunctions.waitForElementIsVisible(faqSection);
	    Listeners.addLogs("FAQs section is displayed");

	}
	
	public void ClickOnFAQ() {
		UtilityFunctions.waitForElementIsVisible(clickfaq);
		UtilityFunctions.waitToBeClickableAndClick(clickfaq);
	    Listeners.addLogs("Clicked on FAQ");
	}
	
	public void ClickYesButton() {
		UtilityFunctions.scrollDownUsingPixelValue();
	    UtilityFunctions.waitToBeClickableAndClick(clickYesButtonOfFAQ);
	    Listeners.addLogs("Yes Button Clicked");

	}
	
	public String assertYesClickedFeedback() {
	    UtilityFunctions.waitForVisibilityOfWebElement(assertYesClicked);
	    String getActualText = UtilityFunctions.getTextFromElement(assertYesClicked);
	    return getActualText;
	}

}
