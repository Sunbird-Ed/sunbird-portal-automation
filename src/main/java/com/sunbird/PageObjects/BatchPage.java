package com.sunbird.PageObjects;

import com.sunbird.GenericLibrary.Listeners;
import com.sunbird.GenericLibrary.UtilityFunctions;
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
	
}
