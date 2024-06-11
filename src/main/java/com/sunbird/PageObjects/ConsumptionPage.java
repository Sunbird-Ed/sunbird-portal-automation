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

    @FindBy(how = How.XPATH, using = "//img[@alt='Sidebar Menu Icon']//following::a[@class='nav-icon nav-next']")
    private WebElement nextButtonQuestionSet;

    @FindBy(how = How.XPATH, using = "//button[@type='submit']")
    private WebElement submitInPlayer;

    @FindBy(how = How.XPATH, using = "//strong[contains(text(),'This is the last remaining attempt')]")
    private WebElement assertLastAttemptToastrMsg;

    @FindBy(how = How.XPATH, using = "//strong[contains(text(),'You have exceeded the maximum number of attempts that can be submitted')]")
    private WebElement maximumAttemptsExceeded;

    @FindBy(how = How.XPATH, using = "//div[contains(@class,'sbchapter__item')]//following::div[2]")
    private WebElement contentInTOC;

    @FindBy(how = How.XPATH, using = "//div[contains(text(),' This is the last remaining attempt')]")
    private WebElement lastAttemptPopup;

    @FindBy(how = How.XPATH, using = "//button[contains(text(),' OK ')]")
    private WebElement okBtnInLastAttemptPopup;

    @FindBy(how = How.XPATH, using = "//button[@title='zoom in']")
    private WebElement zoominpdf;
    @FindBy(how = How.XPATH, using = "//button[@title='zoom out']")
    private WebElement zoomoutpdf;
    @FindBy(how = How.XPATH, using = "//img[@class='rotate-icon']")
    private WebElement rotatepdf;
    @FindBy(how = How.XPATH, using = "//button[@class='navigation-arrows player-nextIcon paginate right ml-4']//preceding::div[@class='d-flex player-slides ml-8']")
    private WebElement nextbtnpdf;
    @FindBy(how = How.XPATH, using = "//span[@class='pageNumberFullcount']//following::button[1]")
    private WebElement previousicon;

    @FindBy(how = How.XPATH, using = "//div[text()='You just completed']")
    private WebElement assertCompletionMsg;

    @FindBy(how = How.XPATH, using = "//em[@id='ariaLabelValue']")
    private WebElement assertHamburgerMenu;

    @FindBy(how = How.XPATH, using = "//span[text()='Minimize']")
    private WebElement assertMinimizeScreen;

    @FindBy(how = How.XPATH, using = "//button[@title='Mute']")
    private WebElement mute;
    @FindBy(how = How.XPATH, using = "//button[@title='Unmute']")
    private WebElement assertmute;
    @FindBy(how = How.XPATH, using = "//button[@title='Mute']")
    private WebElement assertunmute;
    @FindBy(how = How.XPATH, using = "//button[@title='Unmute']")
    private WebElement unmute;

    @FindBy(how = How.XPATH, using = "//ul[@id='sidebar-list']//following::li[contains(text(),'Download')]")
    private WebElement assertDownload;

    @FindBy(how = How.XPATH, using = "//div[contains(@class,'pdf-reading-')]")
    private WebElement PageLocationAndPercentagepdf;
    @FindBy(how = How.XPATH, using = "//span[text()='Minimize']")
    private WebElement minimizeScreen;
    @FindBy(how = How.XPATH, using = "//em[text()='Player Menu Close']")
    private WebElement closebtn;

    @FindBy(how = How.XPATH, using = "//span[contains(@class,'share')]//following::*[contains(text(),'Download')]")
    private WebElement assertDownloadButton;

    @FindBy(how = How.XPATH, using = "//button[text()=' Share ']")
    private WebElement shareIcon;
    @FindBy(how = How.XPATH, using = "//button[text()=' Copy link ']")
    private WebElement copyShareIcon;
    @FindBy(how = How.XPATH, using = "//button[@type='button']//preceding::div[text()=' Share ']")
    private WebElement closeShareIcon;

    @FindBy(how = How.XPATH, using = "//button[text()='Join Course']")
    private WebElement assertjoinCourse;

    @FindBy(how = How.XPATH, using = "//div[@class='title']")
    private WebElement assertconsentPopupTitle;
    @FindBy(how = How.XPATH, using = "//p[contains(text(),'I consent to share')]")
    private WebElement assertconsentPopupMessage;

    @FindBy(how = How.XPATH, using = "//label[text()='User Name']")
    private WebElement assertconsentPopupUserName;

    @FindBy(how = How.XPATH, using = "//button[text()='Do not share']")
    private WebElement assertDoNotShare;
    @FindBy(how = How.XPATH, using = "//button[text()='Share']")
    private WebElement assertConsentShare;

    @FindBy(how = How.XPATH, using = "//input[@type='checkbox']")
    private WebElement profilePopup;
    @FindBy(how = How.XPATH, using = "//p[contains(text(),' Do not show this message again ')]")
    private WebElement assertProfilePopuptext;
    @FindBy(how = How.XPATH, using = "//input[@type='checkbox']")
    private WebElement assertProfilePopup;
    @FindBy(how = How.XPATH, using = "//button[text()=' Continue ']")
    private WebElement profilePopupcontinue;

    @FindBy(how = How.XPATH, using = "//button[text()='Continue learning']")
    private WebElement continueLearningCourse;
    @FindBy(how = How.XPATH, using = "//button[@aria-label='Back']")
    private WebElement backButtonCourse;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Enrolments for this batch closed on')]")
    private WebElement assertEnrolmentEndDateExpired;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Last date for enrolment:')]")
    private WebElement assertEnrolmentEndDate;

    @FindBy(how = How.XPATH, using = "//span[text()='Note: This course does not have a certificate']")
    private WebElement assertcourseCompletionNoCertificateMessage;

    @FindBy(how = How.XPATH, using = "(//span[contains(text(),'Currently, this course does not have a certificate')])[2]")
    private WebElement assertNoCertificate;

    @FindBy(how = How.XPATH, using = "//span[text()='Certificate criteria']")
    private WebElement clickCertificateDetails;
    @FindBy(how = How.XPATH, using = "//li[text()=' The completion certificate will be issued upon 100% completion']")
    private WebElement assertCertificateRule;

    @FindBy(how = How.XPATH, using = "//p[contains(text(),'You will be notified')]")
    private WebElement assertcourseCompletionCertificateInPopUp;

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
    public String assertThankYouToastrMsg1() {
        UtilityFunctions.waitForVisibilityOfWebElement(assertThankYouRatingTostrMsg);
        String getActualText = UtilityFunctions.getTextFromElement(assertThankYouRatingTostrMsg);
        return getActualText;
    }
    public void assertCourseCompleteMsg() {
        UtilityFunctions.waitForVisibilityOfWebElement(assertCongratulationsMsg);
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
    public void clickOnNextIconInQuestionSet() throws InterruptedException {
        UtilityFunctions.waitToBeClickableAndClick(nextButtonQuestionSet);
        Listeners.addLogs("Clicked on nextButtonQuestionSet");

    }
    public void submitBtnInPlayer() throws InterruptedException {
        UtilityFunctions.waitToBeClickableAndClick(submitInPlayer);
        Listeners.addLogs("Clicked on submitInPlayer");

    }
    public String validateLastAttemptToastrMsg() {
        UtilityFunctions.waitForVisibilityOfWebElement(assertLastAttemptToastrMsg);
        String actualText=UtilityFunctions.getTextFromElement(assertLastAttemptToastrMsg);
        Listeners.addLogs("assertLastAttemptToastrMsg validated");
        UtilityFunctions.waitForElementToDisappear(assertLastAttemptToastrMsg);
        return actualText;
    }
    public String validateMaximumNoofAttemptsExceeded() {
        UtilityFunctions.waitForVisibilityOfWebElement(maximumAttemptsExceeded);
        String actualText=UtilityFunctions.getTextFromElement(maximumAttemptsExceeded);
        Listeners.addLogs("maximumAttemptsExceeded validated");
        UtilityFunctions.waitForElementToDisappear(maximumAttemptsExceeded);
        return actualText;
    }

    public void contentInTOC() throws InterruptedException {
        UtilityFunctions.waitToBeClickableAndClick(contentInTOC);
        Listeners.addLogs("Clicked on contentInTOC");

    }
    public String lastRemainingAttemptPopup() {
        UtilityFunctions.waitForVisibilityOfWebElement(lastAttemptPopup);
        String actualText=UtilityFunctions.getTextFromElement(lastAttemptPopup);
        Listeners.addLogs("lastAttemptPopup validated");
        return actualText;
    }
    public void okBtnInLastAttemptPopup() throws InterruptedException {
        UtilityFunctions.waitToBeClickableAndClick(okBtnInLastAttemptPopup);
        Listeners.addLogs("Clicked on okBtnInLastAttemptPopup");

    }

    public void clickZoomInPDF() throws InterruptedException {
        UtilityFunctions.waitToBeClickableAndClick(zoominpdf);
        Listeners.addLogs("Clicked on Zoom In");
    }
    public void clickZoomOutPDF() throws InterruptedException {
        UtilityFunctions.waitToBeClickableAndClick(zoomoutpdf);
        Listeners.addLogs("Clicked on Zoom Out");
    }
    public void clickRotatePDF() throws InterruptedException {
        UtilityFunctions.waitToBeClickableAndClick(rotatepdf);
        Listeners.addLogs("Clicked on Zoom Out");
    }
    public void clicknextPDF() throws InterruptedException {
        UtilityFunctions.waitToBeClickableAndClick(nextIcon);
        Listeners.addLogs("Clicked on Next button");
    }
    public void clickOnPreviousIcon() throws InterruptedException {
        UtilityFunctions.waitToBeClickableAndClick(previousicon);
        Listeners.addLogs("Clicked on Previous button");
    }
    public void clickNextButton() throws InterruptedException {
        UtilityFunctions.waitToBeClickableAndClick(nextIcon);
        Listeners.addLogs("Verified on Next Button");
    }
    public void assertCompleteMsg() throws InterruptedException {
        UtilityFunctions.waitForVisibilityOfWebElement(assertCompletionMsg);
        UtilityFunctions.validatIsElementPresent(assertCompletionMsg, "assert You just completed not displayed");
        Listeners.addLogs("assert You just completed Msg is displayed ");
    }
    public void clickonHamburger() throws InterruptedException {
        UtilityFunctions.waitForElementAndClickable(assertHamburgerMenu);
        Listeners.addLogs("Clicked on Hamburgermenu");
    }
    public void assertminiScreen() throws InterruptedException {
        UtilityFunctions.waitForVisibilityOfWebElement(assertMinimizeScreen);
        Listeners.addLogs("Clicked on MinimizeScreen");
    }
    public void clickMute() throws InterruptedException {
        UtilityFunctions.waitToBeClickableAndClick(mute);
        Listeners.addLogs("click on mute");
    }
    public void assertClickMute() throws InterruptedException {
        UtilityFunctions.waitForVisibilityOfWebElement(assertmute);
        UtilityFunctions.validatIsElementPresent(assertmute, "assertmute not displayed");
        Listeners.addLogs("Verify on mute");
    }

    public void clickUnMute() throws InterruptedException {
        UtilityFunctions.waitToBeClickableAndClick(unmute);
        Listeners.addLogs("click on mute");
    }


    public void assertClickUnMute() throws InterruptedException {
        UtilityFunctions.waitForVisibilityOfWebElement(assertunmute);
        UtilityFunctions.validatIsElementPresent(assertunmute, "assertunmute not displayed");
        Listeners.addLogs("Verify on unmute");
    }
    public void assertClickonDownload() throws InterruptedException {
        UtilityFunctions.waitForVisibilityOfWebElement(assertDownload);
        UtilityFunctions.validatIsElementPresent(assertDownload, "assertDownload not displayed");
        Listeners.addLogs("Verified Download Link");
    }
    public void clickPageLocationAndPercentage() throws InterruptedException {
        UtilityFunctions.waitForVisibilityOfWebElement(PageLocationAndPercentagepdf);
        UtilityFunctions.validatIsElementPresent(PageLocationAndPercentagepdf,"Percentage not displayed");
        Listeners.addLogs("Verified on Location");
    }
    public void minimizeScreen() throws InterruptedException {
        UtilityFunctions.waitToBeClickableAndClick(minimizeScreen);
        Listeners.addLogs("Clicked on MinimizeScreen");
    }
    public void clickCloseBtn() throws InterruptedException {
        UtilityFunctions.clickUsingJavaScriptExecutor(closebtn);
        //    UtilityFunctions.waitToBeClickableAndClick(closebtn);
        Listeners.addLogs("Clicked on Close Button");
    }
    public void clickonDownloadButton() throws InterruptedException {
        UtilityFunctions.waitForElementAndClickable(assertDownloadButton);
        Listeners.addLogs("Clicked on Download Button");
    }
    public void shareIcon() throws InterruptedException {
        UtilityFunctions.waitToBeClickableAndClick(shareIcon);
        Listeners.addLogs("Clicked on Share Icon");
    }
    public void copyShareIcon() throws InterruptedException {
        UtilityFunctions.waitToBeClickableAndClick(copyShareIcon);
        Listeners.addLogs("Clicked on Copy Icon");
    }
    public void closeShareIcon() throws InterruptedException {
        UtilityFunctions.waitToBeClickableAndClick(closeShareIcon);
        Listeners.addLogs("Clicked on close Icon");
    }
    public void assertjoinCourse() throws InterruptedException {
        UtilityFunctions.waitForVisibilityOfWebElement(assertjoinCourse);
        UtilityFunctions.validatIsElementPresent(assertjoinCourse,"Join Course Pop Up not displayed");
        Listeners.addLogs("Verified on Join Course");
    }

    public void assertconsentPopupTitle() throws InterruptedException {
        UtilityFunctions.waitForVisibilityOfWebElement(assertconsentPopupTitle);
        UtilityFunctions.validatIsElementPresent(assertconsentPopupTitle,"Consent Pop up Title not displayed");
        Listeners.addLogs("Verified on Consent Pop up Title");
    }
    public void assertconsentPopupMessage() throws InterruptedException {
        UtilityFunctions.waitForVisibilityOfWebElement(assertconsentPopupMessage);
        UtilityFunctions.validatIsElementPresent(assertconsentPopupMessage,"Consent Pop up Message not displayed");
        Listeners.addLogs("Verified on Consent Pop up Message");
    }
    public void assertDoNotShare() throws InterruptedException {
        UtilityFunctions.waitForVisibilityOfWebElement(assertDoNotShare);
        UtilityFunctions.validatIsElementPresent(assertDoNotShare,"Donot Share Popup Consent Pop up is displayed");
        Listeners.addLogs("Verified on Donot Share Consent Pop up");
    }
    public void assertConsentShareEnable() throws InterruptedException {
        UtilityFunctions.assertWebElementIsDisabled(assertConsentShare);
        Listeners.addLogs("Verified on Consent Share");
    }

    public void assertProfilePopuptext() throws InterruptedException {
        UtilityFunctions.waitForVisibilityOfWebElement(assertProfilePopuptext);
        UtilityFunctions.validatIsElementPresent(assertProfilePopuptext,"Profile Pop up text not displayed");
        Listeners.addLogs("Verified on profile Pop up text");
    }
    public void profilePopupCheckBox() throws InterruptedException {
        UtilityFunctions.clickUsingJavaScriptExecutor(profilePopup);
        Listeners.addLogs("Clicked on profile Pop up");
    }
    public void assertProfilePopupCheckBox() throws InterruptedException {
        UtilityFunctions.waitForVisibilityOfWebElement(assertProfilePopup);
        UtilityFunctions.validatIsElementPresent(assertProfilePopup,"Profile Pop up not displayed");
        Listeners.addLogs("Verified on profile Pop up checkbox");
    }
    public void profilePopupcontinue() throws InterruptedException {
        UtilityFunctions.waitToBeClickableAndClick(profilePopupcontinue);
        Listeners.addLogs("Clicked on continue");
    }

    public void backButtonCourse() throws InterruptedException {
        UtilityFunctions.waitToBeClickableAndClick(backButtonCourse);
        Listeners.addLogs("Clicked on Back Button");
    }
    public void continueLearningCourse() throws InterruptedException {
        UtilityFunctions.waitToBeClickableAndClick(continueLearningCourse);
        Listeners.addLogs("Clicked on continueLearningCourse");
    }
    public void assertNoProfilePopuptext() throws InterruptedException {
        UtilityFunctions.validatIsElementNotPresent(assertProfilePopuptext);
        Listeners.addLogs("Verified on profile Pop up text not displayed");
    }
    public String assertEnrolmentEndDateExpired() throws InterruptedException {
        UtilityFunctions.waitForVisibilityOfWebElement(assertEnrolmentEndDateExpired);
        UtilityFunctions.validatIsElementPresent(assertEnrolmentEndDateExpired, "EnrolmentEndDateExpired not displayed");
        String actualColor = UtilityFunctions.getColorValue(assertEnrolmentEndDateExpired);
        Listeners.addLogs("Verified on Enrolment End Date Expired");
        return actualColor;
    }
    public void assertNoEnrolmentEndDate() throws InterruptedException {
        UtilityFunctions.validatIsElementNotPresent(assertEnrolmentEndDate);
        Listeners.addLogs("Verified on Enrolment End Date not displayed");
    }

    public void assertcourseCompletionNoCertificateMessage() throws InterruptedException {
        UtilityFunctions.waitForVisibilityOfWebElement(assertcourseCompletionNoCertificateMessage);
        UtilityFunctions.validatIsElementPresent(assertcourseCompletionNoCertificateMessage, "courseCompletionNoCertificate not displayed");
        Listeners.addLogs("Verify on courseCompletionNoCertificate");
    }
    public void assertNoCertificate() throws InterruptedException {
        UtilityFunctions.waitForVisibilityOfWebElement(assertNoCertificate);
        UtilityFunctions.validatIsElementPresent(assertNoCertificate,"Certificate attachment Pop Up not messaged");
        Listeners.addLogs("Verified Certificate attachment message");
    }

    public void clickCertificateDetails() throws InterruptedException {
        UtilityFunctions.waitToBeClickableAndClick(clickCertificateDetails);
        Listeners.addLogs("Clicked on Certificate");
    }
    public void assertCertificateRule() throws InterruptedException {
        UtilityFunctions.waitForVisibilityOfWebElement(assertCertificateRule);
        UtilityFunctions.validatIsElementPresent(assertCertificateRule,"CertificateRule is displayed");
        Listeners.addLogs("Verified on Certificate Rule");
    }

    public String assertcourseCompletionCertificateInPopUp() throws InterruptedException {
        UtilityFunctions.waitForVisibilityOfWebElement(assertcourseCompletionCertificateInPopUp);
        UtilityFunctions.validatIsElementPresent(assertcourseCompletionCertificateInPopUp, "courseCompletionNoCertificate not displayed");
        String actualColor = UtilityFunctions.getColorValue(assertcourseCompletionCertificateInPopUp);
        Listeners.addLogs("Verify on courseCompletionCertificate");
        return actualColor;
    }




}