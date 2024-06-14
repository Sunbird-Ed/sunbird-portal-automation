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

    @FindBy(how=How.XPATH,using="//img[@alt='SUNBIRD']")
    private WebElement sunbirdLogo;

    @FindBy(how = How.XPATH, using = "//h4[contains(text(),'Showing results')]//following::span[2]")
    private WebElement displayedTextInloginSearch;

    @FindBy(how = How.XPATH, using = "//*[contains(text(),'Help')]")
    private WebElement helpLink;


    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Switch to classic theme')]")
    private WebElement clickOnSwitchToClassicTheme;

    @FindBy(how = How.XPATH, using = "//div[@class='sb-avatar__img']")
    private WebElement clickUserProfileIconInClassicTheme;

    @FindBy(how = How.XPATH, using = "//app-main-menu")
    private WebElement assertClassicThemeProfilePageHeader;

    @FindBy(how = How.XPATH, using = "//div[@class='four wide column contantDetails']//following::a[contains(text(),'Terms and Privacy')]")
    private WebElement assertClassicThemeProfilePageFooter;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Switch to joyful theme')]")
    private WebElement clickOnSwitchToJoyfulTheme;

    @FindBy(how = How.XPATH, using = "//header")
    private WebElement assertJoyfulThemeProfilePageHeader;

    @FindBy(how = How.XPATH, using = "//div[contains(@class,'six wide')]//following::a[contains(text(),'Terms and Privacy')]")
    private WebElement assertJoyfulThemeProfilePageFooter;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'English')]")
    private WebElement clickOnLanguageSelection;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'ಕನ್ನಡ')]")
    private WebElement selectKannadaLanguage;

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
        UtilityFunctions.validatIsElementNotPresent(observationTab);
        Listeners.addLogs("Observationtab not displayed");

    }
    public void mergeAccountBtn() {
        UtilityFunctions.waitForElementAndClickable(mergeAccount);
        Listeners.addLogs("Clicked on mergeAccount");

    }
    public void verifySunbirdLogo() {
        UtilityFunctions.waitForElementAndClickable(sunbirdLogo);
        Listeners.addLogs("verified sunbirdLogo ");

    }
    public String displayedTextInloginSearch() {

        UtilityFunctions.waitForVisibilityOfWebElement(displayedTextInloginSearch);
        String getActualText = UtilityFunctions.getTextFromElement(displayedTextInloginSearch);
        return getActualText;

    }
    public void ClickOnHelp() {
        UtilityFunctions.waitForElementAndClickable(helpLink);
        Listeners.addLogs("Clicked on Help Link");
    }




    public void switchToClassicTheme() {
        UtilityFunctions.waitForElementIsVisible(clickOnSwitchToClassicTheme);
        UtilityFunctions.waitForElementAndClickable(clickOnSwitchToClassicTheme);
        Listeners.addLogs("Clicked on Classic theme");
    }

    public void clickUserProfileIconInClassicTheme() {
        UtilityFunctions.waitForElementIsVisible(clickUserProfileIconInClassicTheme);
        UtilityFunctions.waitForElementAndClickable(clickUserProfileIconInClassicTheme);
        Listeners.addLogs("Clicked on Profile Icon in Classic theme");

    }
    public void classicThemeProfilePageHeader() {
        UtilityFunctions.waitForElementIsVisible(assertClassicThemeProfilePageHeader);
        UtilityFunctions.validatIsElementPresent(assertClassicThemeProfilePageHeader, "Tabs Menu are not displayed in Profile Page in Classic theme");
        Listeners.addLogs("Tabs Menu are displayed in Profile Page in Classic theme");
    }

    public void classicThemeProfilePageFooter() {
        UtilityFunctions.waitForElementIsVisible(assertClassicThemeProfilePageFooter);
        UtilityFunctions.validatIsElementPresent(assertClassicThemeProfilePageFooter, "Terms and Privacy is not displayed in right side of Profile Page in Classic theme");
        Listeners.addLogs("Terms and Privacy is displayed in right side of Profile Page in Classic theme");

    }
    public void clickOnSwitchToJoyfulTheme() {
        UtilityFunctions.waitForElementIsVisible(clickOnSwitchToJoyfulTheme);
        UtilityFunctions.waitForElementAndClickable(clickOnSwitchToJoyfulTheme);
        Listeners.addLogs("Clicked on Joyful theme");
    }
    public void joyfulThemeProfilePageHeader() {
        UtilityFunctions.waitForElementIsVisible(assertJoyfulThemeProfilePageHeader);
        UtilityFunctions.validatIsElementPresent(assertClassicThemeProfilePageFooter, "Header is not displayed in Joyful theme");
        Listeners.addLogs("Header is displayed in Joyful theme");
    }

    public void joyfulThemeProfilePageFooter() {
        UtilityFunctions.waitForElementIsVisible(assertJoyfulThemeProfilePageFooter);
        UtilityFunctions.validatIsElementPresent(assertClassicThemeProfilePageFooter, "Terms and Privacy is not displayed in right side of Profile Page in Joyful theme");
        Listeners.addLogs("Terms and Privacy is displayed in right side of Profile Page in Joyful theme");

    }

    public void languageSelection() {
        UtilityFunctions.waitForElementIsVisible(clickOnLanguageSelection);
        UtilityFunctions.waitForElementAndClickable(clickOnLanguageSelection);
        Listeners.addLogs("Clicked on Language Selection section");
    }

    public void kannadaLanguage() {
        UtilityFunctions.waitForVisibilityOfWebElement(selectKannadaLanguage);
        UtilityFunctions.waitForElementAndClickable(selectKannadaLanguage);
        Listeners.addLogs("Clicked on Language Selection section");
    }

}
