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

    @FindBy(how=How.XPATH,using="//*[@aria-controls='overlaySidebarID']")
    private WebElement profileIcon2;

    @FindBy(how=How.XPATH,using="//*[contains(text(),'Home')]")
    private WebElement homeTab;

    @FindBy(how=How.XPATH,using="//*[contains(text(),'Digital textbooks')]")
    private WebElement digitalTxtBookTab;

    @FindBy(how=How.XPATH,using="//*[contains(text(),'Courses')]")
    private WebElement courseTab;

    @FindBy(how=How.XPATH,using="//*[contains(text(),' My Groups ')][@role='link']")
    private WebElement myGroups;

    @FindBy(how=How.XPATH,using="//*[contains(text(),' Observations ')]")
    private WebElement observationTab;

    @FindBy(how=How.XPATH,using="//*[contains(text(),' TV classes ')]")
    private WebElement tVClasses;

    @FindBy(how=How.XPATH,using="//*[contains(text(),'Profile')]")
    private WebElement profileOption;

    @FindBy(how=How.XPATH,using="//*[@routerlink='profile']")
    private WebElement profileOptionForLoginUser;

    @FindBy(how=How.XPATH,using="//*[contains(text(),'Merge Account')]")
    private WebElement mergeAccount;

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
    public void clickProfileIcon() throws InterruptedException {
Thread.sleep(9000);
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
    public void clickProfileIcon2()
    {

        UtilityFunctions.waitToBeClickableAndClick(profileIcon2);
        Listeners.addLogs("Clicked on profileIcon2 ");

    }

    public void homeTab() {

        UtilityFunctions.waitForElementAndClickable(homeTab);
        Listeners.addLogs("Clicked on homeTab");

    }
    public void digitalTxtbookTab() {
           UtilityFunctions.waitForElementAndClickable(digitalTxtBookTab);
        Listeners.addLogs("Clicked on digitalTxtBookTab");

    }

    public void courseTab() {
        UtilityFunctions.waitForElementAndClickable(courseTab);
        Listeners.addLogs("Clicked on courseTab");

    }
    public void myGroups() {
        UtilityFunctions.waitForElementAndClickable(myGroups);
        Listeners.addLogs("Clicked on myGroups");

    }
    public void observationTab() {
        UtilityFunctions.waitForElementAndClickable(observationTab);
        Listeners.addLogs("Clicked on observationTab");

    }
    public void tvClass() {
        UtilityFunctions.waitForElementIsVisible(tVClasses);
        UtilityFunctions.waitForElementAndClickable(tVClasses);
        Listeners.addLogs("Clicked on tVClasses");

    }
    public void profileOption() {
        UtilityFunctions.waitForElementAndClickable(profileOption);
        Listeners.addLogs("Clicked on profileOption");

    }
    public void profileOptionForLoginUser() {
        UtilityFunctions.waitForElementAndClickable(profileOptionForLoginUser);
        Listeners.addLogs("Clicked on profileOptionForLoginUser");

    }
    public void observationTabShouldNotDisplay() {
        UtilityFunctions.validatElementNotPresent(observationTab,"Observationtab displayed");
        Listeners.addLogs("Observationtab not displayed");

    }
    public void mergeAccountBtn() {
        UtilityFunctions.waitForElementAndClickable(mergeAccount);
        Listeners.addLogs("Clicked on mergeAccount");

    }
}
