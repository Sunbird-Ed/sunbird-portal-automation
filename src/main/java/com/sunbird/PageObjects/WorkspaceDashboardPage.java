package com.sunbird.PageObjects;

import com.sunbird.GenericLibrary.Listeners;
import com.sunbird.GenericLibrary.UtilityFunctions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;

public class WorkspaceDashboardPage {

	@FindBy(how=How.XPATH,using="//a[contains(text(),'Drafts')]")
	private WebElement drafts;
	
	@FindBy(how=How.XPATH,using="//span[contains(text(),'Book')]")
	private WebElement book;


    public void assertDrafts()
    {
        UtilityFunctions.waitForVisibilityOfWebElement(drafts);
        UtilityFunctions.validatIsElementPresent(drafts, "Draft Section not displayed");
    	
    }
    public void clickDrafts()
     {
    	
    	 UtilityFunctions.waitToBeClickableAndClick(drafts);
         Listeners.addLogs("Clicked on drafts ");

    }
    public void clickBook()
    {
   	
   	 UtilityFunctions.waitToBeClickableAndClick(book);
        Listeners.addLogs("Clicked on book ");

   }

}
