package com.sunbird.PageObjects;

import com.sunbird.GenericLibrary.Listeners;
import com.sunbird.GenericLibrary.UtilityFunctions;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class DashboardPage {
  //  @FindBy(how = How.XPATH, using = "//span[contains(text(),'English')]//following::div[contains(@class,'avatar-container')]")
	@FindBy(how=How.XPATH,using="//span[contains(text(),'English')]//following::div[@class='sb-avatar__img']")
    private WebElement userProfileIcon;

    @FindBy(how = How.XPATH, using = "//*[contains(text(),'Workspace')]")
    private WebElement workspace;
    
    @FindBy(how = How.XPATH, using = "//div[@class='avatar-container']")
    private List<WebElement> profileIcon;

	@FindBy(how=How.XPATH,using="//li[text()=' Logout ']")
	private WebElement logout;

    @FindBy(how=How.XPATH,using="//input[@placeholder='Search or enter QR code']")
    private WebElement searchTextbox;

    @FindBy(how=How.XPATH,using="//button[@title='Search in undefined']")
    private WebElement searchIcon;

    @FindBy(how=How.XPATH,using="//div[@class='sb--card__meta']")
    private WebElement firstContentCard;

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

    public void enterContentInSearchBox(String contentName) throws InterruptedException {
        Thread.sleep(6000);
UtilityFunctions.waitForVisibilityOfWebElement(searchTextbox);
        UtilityFunctions.waitToBeClickableAndSendKeys(searchTextbox,contentName);
        Listeners.addLogs("Clicked on searchTextbox and entered text ");

    }
    public void clickSearchIcon()
    {

        UtilityFunctions.waitToBeClickableAndClick(searchIcon);
        Listeners.addLogs("Clicked on searchIcon ");

    }
    public void clickOnFirstContent() throws InterruptedException {
        Thread.sleep(6000);
UtilityFunctions.waitForVisibilityOfWebElement(firstContentCard);
        UtilityFunctions.waitToBeClickableAndClick(firstContentCard);
        Listeners.addLogs("Clicked on firstContentCard ");

    }

}
