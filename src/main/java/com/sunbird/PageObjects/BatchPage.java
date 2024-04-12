package com.sunbird.PageObjects;

import com.sunbird.GenericLibrary.Listeners;
import com.sunbird.GenericLibrary.UtilityFunctions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class BatchPage {

	@FindBy(how=How.XPATH,using="//button[contains(text(),'Create Batch')]")
	private WebElement createBatchBtn;

	@FindBy(how=How.XPATH,using="//input[@name='name']")
	private WebElement enterBatchName;

	@FindBy(how=How.XPATH,using="//label[@for='no']")
	private WebElement issueCertificateNo;

	@FindBy(how=How.XPATH,using="//input[@id='yes']")
	private WebElement issueCertificateYes;
	@FindBy(how=How.XPATH,using="//textarea[@name='description']")
	private WebElement batchDescription;

	@FindBy(how=How.XPATH,using="//input[@role='checkbox']")
	private WebElement termsAndCheckBox;

	@FindBy(how=How.XPATH,using="//input[@formcontrolname='startDate']")
	private WebElement startDateCalender;

	@FindBy(how=How.XPATH,using="//input[@formcontrolname='endDate']")
	private WebElement endDateCalender;

	@FindBy(how=How.XPATH,using="//input[@formcontrolname='enrollmentEndDate']")
	private WebElement enrollmentEndDataCalender;

	@FindBy(how=How.XPATH,using="//button[@id='submitbutton']")
	private WebElement batchCreationSubmit;

	@FindBy(how=How.XPATH,using="//strong[contains(text(),'Batch created successfully...')]")
	private WebElement assertBatchCreationToastrMsg;

	@FindBy(how=How.XPATH,using="//*[@class='calendar outline icon']")
	private WebElement assertCalenderIcon;

	@FindBy(how=How.XPATH,using="//button[contains(text(),'Join Course')]")
	private WebElement joinCourse;

	@FindBy(how=How.XPATH,using="//label[contains(text(),'User Name')]")
	private WebElement assertUserName;

	@FindBy(how=How.XPATH,using="//label[contains(text(),'State')]")
	private WebElement assertState;

	@FindBy(how=How.XPATH,using="//label[contains(text(),'User ID')]")
	private WebElement assertUserID;

	@FindBy(how=How.XPATH,using="//label[contains(text(),'External Id')]")
	private WebElement assertExternalrID;

	@FindBy(how=How.XPATH,using="//label[contains(text(),'District')]")
	private WebElement assertDistrict;

	@FindBy(how=How.XPATH,using="//label[contains(text(),'Block')]")
	private WebElement assertBlock;

	@FindBy(how=How.XPATH,using="//label[contains(text(),'School ID')]")
	private WebElement assertSchoolID;
	@FindBy(how=How.XPATH,using="//label[contains(text(),'School or Org name')]")
	private WebElement assertSchoolOrg;
	@FindBy(how=How.XPATH,using="//label[contains(text(),'Mobile Number')]")
	private WebElement assertMobileNo;
	@FindBy(how=How.XPATH,using="//label[contains(text(),'Email address')]")
	private WebElement assertEmailId;

	@FindBy(how=How.XPATH,using="//input[@type='checkbox']")
	private WebElement termsCheckBoxInConsentPopup;

	@FindBy(how=How.XPATH,using="//button[contains(text(),'Do not share')]")
	private WebElement doNotShare;

	@FindBy(how=How.XPATH,using="//button[contains(text(),'Do not share')]//following::button[1]")
	private WebElement sharebtn;

	@FindBy(how=How.XPATH,using="//span[contains(text(),'Batch expiring in:')]")
	private WebElement batchExpiringText;

	@FindBy(how=How.XPATH,using="//*[contains(text(),'day')]")
	private WebElement batchEndTimeStamp;

	@FindBy(how=How.XPATH,using="//button[contains(text(),'Leave course')]")
	private WebElement leaveCourse;

	@FindBy(how=How.XPATH,using="//button[@id='unenrollFromCourse']")
	private WebElement leaveCourseInUnEnrollPopup;

	@FindBy(how=How.XPATH,using="//strong[contains(text(),'This course does not have any open batches')]")
	private WebElement assertNoOpenBatchesToastrMsg;

	@FindBy(how=How.XPATH,using="//strong[contains(text(),'Profile share settings submitted successfully')]")
	private WebElement profileShareTostrtMsg;

	@FindBy(how=How.XPATH,using="//button[contains(text(),' Share ')]")
	private WebElement shareIconCouseToc;

	@FindBy(how=How.XPATH,using="//label[@for='true']")
	private WebElement enableDisussionYes;

	@FindBy(how=How.XPATH,using="//button[contains(text(),' View course dashboard ')]")
	private WebElement viewCourseDashboard;

	@FindBy(how=How.XPATH,using="//*[contains(text(),'Batches')]//following::mat-select[1]")
	private WebElement selectBatchDropdown;


	@FindBy(how=How.XPATH,using="//*[contains(text(),'Batches')]//following::mat-option[@role='option']")
	private WebElement selectCreatedBatchName;

	@FindBy(how=How.XPATH,using="//*[contains(text(),' Last updated on')]")
	private WebElement assertLastUpdatedLabel;

	@FindBy(how=How.XPATH,using="//*[contains(text(),'2024')]")
	private WebElement assertLastUpdatedDateAndTime;


	public void createBatchClick() {
		UtilityFunctions.waitToBeClickableAndClick(createBatchBtn);
		Listeners.addLogs("createBatchBtn");
	}

	public void enterBatchName(String randomBatchName) throws InterruptedException {
		UtilityFunctions.waitToBeClickableAndSendKeys(enterBatchName, randomBatchName);
		Listeners.addLogs("Enter batchname");
	}
	public void enterbatchDescription(String randomBatchDes) throws InterruptedException {
		UtilityFunctions.waitToBeClickableAndSendKeys(batchDescription, randomBatchDes);
		Listeners.addLogs("Enter batch desciption");
	}

	public void issueCertificateNo() {
		UtilityFunctions.waitToBeClickableAndClick(issueCertificateNo);
		Listeners.addLogs("issueCertificateNo");
	}

	public void startDate(String startDate) {
		UtilityFunctions.waitToBeClickableAndSendKeys(startDateCalender,startDate);
		Listeners.addLogs("entered startDate");
	}

	public void endData(String endDate) {
		UtilityFunctions.waitToBeClickableAndSendKeys(endDateCalender,endDate);
		Listeners.addLogs("entered endDate");
	}
	public void enrollmentEndDate(String enrollmentEndDate) {
		UtilityFunctions.waitToBeClickableAndSendKeys(enrollmentEndDataCalender,enrollmentEndDate);
		Listeners.addLogs("entered enrollmentEndDate");
	}
	public void termsAndCheckbox() {
		UtilityFunctions.waitToBeClickableAndClick(termsAndCheckBox);
		Listeners.addLogs("termsAndCheckBox clicked");
	}
	public void batchCreationSubmit() {
		UtilityFunctions.waitToBeClickableAndClick(batchCreationSubmit);
		Listeners.addLogs("batchCreationSubmit clicked");
	}

	public String assertBatchCretionToastrMsg() {
		UtilityFunctions.waitForVisibilityOfWebElement(assertBatchCreationToastrMsg);
		String actualText=UtilityFunctions.getTextFromElement(assertBatchCreationToastrMsg);
		Listeners.addLogs("assertBatchCreationToastrMsg validated");
		return actualText;
	}
	public void waitBatchCreationToastrMsgDisAppear() {
		UtilityFunctions.waitForElementToDisappear(assertBatchCreationToastrMsg);
	}


	public void createBatchShouldNotDisplay() {
		UtilityFunctions.waitForVisibilityOfWebElement(assertCalenderIcon);
		UtilityFunctions.validatIsElementPresent(assertCalenderIcon,"Create Batch option is displayed for already createdBatch");
		Listeners.addLogs("calender icon validated");
	}

	public void JoinCourseButton() {

		UtilityFunctions.waitForElementAndClickable(joinCourse);
		Listeners.addLogs("clicked on JoinCourse");
	}
	public  void assertConsentPopupAttributes() {
		UtilityFunctions.waitForVisibilityOfWebElement(assertUserName);
		UtilityFunctions.validatIsElementPresent(assertUserName,"assertUserName is not displayed");
		Listeners.addLogs("UserName attributes validated");
		UtilityFunctions.validatIsElementPresent(assertState,"assertState is not displayed");
		Listeners.addLogs("assertState attributes validated");
		UtilityFunctions.validatIsElementPresent(assertUserID,"assertUserID is not displayed");
		Listeners.addLogs("assertUserID attributes validated");
		UtilityFunctions.validatIsElementPresent(assertExternalrID,"assertExternalrID is not displayed");
		Listeners.addLogs("assertExternalrID attributes validated");
		UtilityFunctions.validatIsElementPresent(assertDistrict,"assertDistrict is not displayed");
		Listeners.addLogs("assertDistrict attributes validated");
		UtilityFunctions.validatIsElementPresent(assertBlock,"assertBlock is not displayed");
		Listeners.addLogs("assertBlock attributes validated");
		UtilityFunctions.validatIsElementPresent(assertSchoolID,"assertSchoolID is not displayed");
		Listeners.addLogs("assertSchoolID attributes validated");
		UtilityFunctions.validatIsElementPresent(assertSchoolOrg,"assertSchoolOrg is not displayed");
		Listeners.addLogs("assertSchoolOrg attributes validated");
		UtilityFunctions.validatIsElementPresent(assertMobileNo,"assertMobileNo is not displayed");
		Listeners.addLogs("assertMobileNo attributes validated");
		UtilityFunctions.validatIsElementPresent(assertEmailId,"assertEmailId is not displayed");
		Listeners.addLogs("assertEmailId attributes validated");
	}

	public void termsCheckBoxInConsentPopup() {
		UtilityFunctions.scrollInToviewUsingJavaScript(termsCheckBoxInConsentPopup);
		UtilityFunctions.waitToBeClickableAndClick(termsCheckBoxInConsentPopup);
		Listeners.addLogs("clicked on termsCheckBoxInConsentPopup");
	}
	public void shareBtn() {
		UtilityFunctions.waitToBeClickableAndClick(sharebtn);
		Listeners.addLogs("clicked on sharebtn");
	}
	public void assertBatchTimerStamp() {
		UtilityFunctions.waitForVisibilityOfWebElement(batchExpiringText);
		UtilityFunctions.validatIsElementPresent(batchExpiringText,"batchExpiringText is not displayed");
		Listeners.addLogs("Validated BatchExpire text");
		UtilityFunctions.validatIsElementPresent(batchEndTimeStamp,"batchEndTimeStamp is not displayed");
		Listeners.addLogs("Validated batchEndTimeStamp ");
	}

	public void leaveCourse() {
		UtilityFunctions.scrollDownUsingPixelValue();
	//	UtilityFunctions.scrollInToviewUsingJavaScript(leaveCourse);
		UtilityFunctions.waitForElementAndClickable(leaveCourse);
		Listeners.addLogs("clicked on leaveCourse");
	}
	public void leaveCourseInUnenrollPopup() {
		UtilityFunctions.waitForElementIsVisible(leaveCourseInUnEnrollPopup);
		UtilityFunctions.waitForElementAndClickable(leaveCourseInUnEnrollPopup);
		Listeners.addLogs("clicked on leaveCourseInUnEnrollPopup");
	}
	public void assertJoinCourse()
	{
		UtilityFunctions.waitForElementIsVisible(joinCourse);
		UtilityFunctions.validatIsElementPresent(joinCourse,"Failed for UnEnroll");
		Listeners.addLogs("JoinCourse button Validated");
	}

	public String assertNoOpenBatchToastrMsg() {
		UtilityFunctions.waitForVisibilityOfWebElement(assertNoOpenBatchesToastrMsg);
		String actualText=UtilityFunctions.getTextFromElement(assertNoOpenBatchesToastrMsg);
		Listeners.addLogs("NoOpenBatchesToastrMsg validated");
		return actualText;
	}
	public String assertProfileShareToastrMsg() {
		UtilityFunctions.waitForVisibilityOfWebElement(profileShareTostrtMsg);
		String actualText=UtilityFunctions.getTextFromElement(profileShareTostrtMsg);
		Listeners.addLogs("profileShareTostrtMsg validated");
		return actualText;
	}
	public void waitProfileShareToastrMsgDisappear() {

		UtilityFunctions.waitForElementToDisappear(profileShareTostrtMsg);
	}
	public void assertShareIcon()
	{
		UtilityFunctions.waitForElementIsVisible(shareIconCouseToc);
		UtilityFunctions.validatIsElementPresent(shareIconCouseToc,"Share icon not displayed in course TOC");
		Listeners.addLogs("Share Icon is validated");
	}
	public void enableDiscussionYes() {
		UtilityFunctions.waitToBeClickableAndClick(enableDisussionYes);
		Listeners.addLogs("clicked on enableDisussionYes");
	}
	public void viewcoursedashboard() {
		UtilityFunctions.waitForElementAndClickable(viewCourseDashboard);
		Listeners.addLogs("clicked on viewCourseDashboard");
	}
	public void selectbatchdropddown() {

		UtilityFunctions.waitForElementAndClickable(selectBatchDropdown);
		Listeners.addLogs("clicked on selectBatchDropdown");
	}
	public void selectcreatedBatch() {
		UtilityFunctions.waitForElementAndClickable(selectCreatedBatchName);
		Listeners.addLogs("clicked on selectCreatedBatchName");
	}
	public void assertLastUpdatedDateAndTime()
	{
		UtilityFunctions.waitForElementIsVisible(assertLastUpdatedLabel);
		UtilityFunctions.validatIsElementPresent(assertLastUpdatedLabel,"Last update label not displayed");
		Listeners.addLogs("assertLastUpdatedLabel is validated");
		UtilityFunctions.validatIsElementPresent(assertLastUpdatedDateAndTime,"Last update date and time not displayed");

	}
}

