package com.sunbird.PageObjects;

import com.sunbird.GenericLibrary.Listeners;
import com.sunbird.GenericLibrary.SunbirdConstants;
import com.sunbird.GenericLibrary.UtilityFunctions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ConsumptionPage {

    @FindBy(how = How.XPATH, using = "//span[@class='pageNumberFullcount']")
    private WebElement pdfPageTotalcount;

    @FindBy(how = How.XPATH, using = "//span[@class='pageNumberFullcount']//following::button[2]")
    private WebElement nextIcon;

    @FindBy(how = How.XPATH, using = "//div[contains(text(),' Enjoyed this content? ')]")
    private WebElement assertRatingPopup;

    @FindBy(how = How.XPATH, using = "//*[@class='icon ng-star-inserted']")
    private List<WebElement> ratingStars;

    @FindBy(how = How.XPATH, using = "//label[@role='img']")
    private List<WebElement> tellUsMoreCheckbox;

    @FindBy(how = How.XPATH, using = "//button[contains(text(),'Submit')]")
    private WebElement submitButtonRatingPopup;

    @FindBy(how = How.XPATH, using = "//Strong[contains(text(),'Thank you for rating this content!')]")
    private WebElement assertThankYouRatingTostrMsg;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Fullscreen')]")
    private WebElement fullScreen;

    @FindBy(how = How.XPATH, using = "//div[contains(text(),'Congratulations!!')]")
    private WebElement assertCongratulationsMsg;

    @FindBy(how = How.XPATH, using = "//*[contains(text(),'You have successfully completed the course')]")
    private WebElement coursecompletedMsg;

    @FindBy(how = How.XPATH, using = "//button[@aria-label='close dialog']")
    private WebElement closeIconInCompletedPopup;

    @FindBy(how = How.XPATH, using = "//div[contains(@class,'kabab-menu ')]")
    private WebElement kababMenu;

    @FindBy(how = How.XPATH, using = "//div[contains(text(),' Sync progress now')]")
    private WebElement syncProgressNow;

    public int getPDFTotalCount() {

        UtilityFunctions.waitForVisibilityOfWebElement(pdfPageTotalcount);
        String pageCount = UtilityFunctions.getTextFromElement(pdfPageTotalcount);
        int totalPDFCount = Integer.parseInt(pageCount);
        return totalPDFCount;
    }

    public void clickOnNextIcon() throws InterruptedException {
        UtilityFunctions.waitToBeClickableAndClick(nextIcon);
        Listeners.addLogs("Clicked on nextIcon");

    }

    public void giveRatingStars(int a) throws InterruptedException {
        UtilityFunctions.waitForVisibilityOfWebElement(assertRatingPopup);
        UtilityFunctions.waitForElementAndClickable(ratingStars.get(a));
        Listeners.addLogs("Clicked on ratingStars");

    }

    public void tellusMorecheckbox() throws InterruptedException {
        UtilityFunctions.waitForElementAndClickable(tellUsMoreCheckbox.get(3));
        Listeners.addLogs("Clicked on tellusMorecheckbox");

    }

    public void clickSubmitRatingPopup() throws InterruptedException {
        UtilityFunctions.waitForElementAndClickable(submitButtonRatingPopup);
        Listeners.addLogs("clickSubmitRatingPopup");

    }

    public String assertThankYouToastrMsg() {
        UtilityFunctions.waitForVisibilityOfWebElement(assertThankYouRatingTostrMsg);
        String getActualText = UtilityFunctions.getTextFromElement(assertThankYouRatingTostrMsg);
        UtilityFunctions.waitForElementToDisappear(assertThankYouRatingTostrMsg);
        return getActualText;
    }

    public void fullScreen() throws InterruptedException {
        UtilityFunctions.waitToBeClickableAndClick(fullScreen);
        Listeners.addLogs("Clicked on fullScreen");

    }

    public void assertCourseCompleteMsg() {
        UtilityFunctions.waitForElementUsingForLoopAndAssert(assertCongratulationsMsg, 4);
        UtilityFunctions.validatIsElementPresent(assertCongratulationsMsg, "assertCongratulationsMsg not displayed");
        Listeners.addLogs("assertCongratulationsMsg is displayed ");
        UtilityFunctions.validatIsElementPresent(coursecompletedMsg, "coursecompletedMsg not displayed");
        Listeners.addLogs("coursecompletedMsg is displayed ");
    }
    public void closeIconInCongratsPopup() throws InterruptedException {
        UtilityFunctions.waitToBeClickableAndClick(closeIconInCompletedPopup);
        Listeners.addLogs("Clicked on closeIconInCompletedPopup");

    }
    public void kababMenuOption() throws InterruptedException {
        UtilityFunctions.waitToBeClickableAndClick(kababMenu);
        Listeners.addLogs("Clicked on kababMenu");

    }
    public void syncProgressNow() throws InterruptedException {
        UtilityFunctions.waitToBeClickableAndClick(syncProgressNow);
        Listeners.addLogs("Clicked on syncProgressNow");

    }
}