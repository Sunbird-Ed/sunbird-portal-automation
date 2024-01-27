package com.sunbird.PageObjects;

import com.sunbird.GenericLibrary.Listeners;
import com.sunbird.GenericLibrary.SunbirdConstants;
import com.sunbird.GenericLibrary.UtilityFunctions;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

public class DashboardPage {
    @FindBy(how = How.XPATH, using = "//span[contains(text(),'English')]//following::div[contains(@class,'avatar-container')]")
//	@FindBy(how=How.XPATH,using="//span[contains(text(),'English')]//following::div[@class='sb-avatar__img']")
    private WebElement userProfileIcon;

    @FindBy(how = How.XPATH, using = "//*[contains(text(),'Workspace')]")
    private WebElement workspace;
    
    @FindBy(how = How.XPATH, using = "//div[@class='avatar-container']")
    private List<WebElement> profileIcon;

	@FindBy(how=How.XPATH,using="//li[text()=' Logout ']")
	private WebElement logout;
	
	@FindBy(how=How.XPATH,using="//a[contains(text(),'Drafts')]")
	private WebElement drafts;
	
	@FindBy(how=How.XPATH,using="//span[contains(text(),'Book')]")
	private WebElement book;

    public void userProfileIcon() throws InterruptedException {

        UtilityFunctions.waitToBeClickableAndClick(userProfileIcon);
        Listeners.addLogs("Clicked on UserProfile Icon");

    }

    public void workspace() {

        UtilityFunctions.waitToBeClickableAndClick(workspace);
        Listeners.addLogs("Clicked on Workspace");

    }

    public String assertWorkspace() {
        UtilityFunctions.waitForVisibilityOfWebElement(workspace);
        String getActualText = UtilityFunctions.getTextFromElement(workspace);
        return getActualText;
    }
    public void clickProfileIcon() {

        UtilityFunctions.waitToBeClickableAndClick(profileIcon.get(1));
        Listeners.addLogs("Clicked on profile icon");

    }
    public void clickLogout()
    {
    	
    	 UtilityFunctions.waitToBeClickableAndClick(logout);
         Listeners.addLogs("Clicked on logout ");

    }
    
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
