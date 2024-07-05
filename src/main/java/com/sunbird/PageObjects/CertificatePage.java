package com.sunbird.PageObjects;

import com.sunbird.GenericLibrary.Listeners;
import com.sunbird.GenericLibrary.UtilityFunctions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class CertificatePage {

	@FindBy(how=How.XPATH,using="//*[contains(text(),'Add certificate')]")
	private WebElement addCertificateBtn;

	@FindBy(how=How.XPATH,using="//button[@id='addNewCert']")
	private WebElement addCertificatePlusIcon;

	@FindBy(how=How.XPATH,using="//*[contains(text(),'Create template')]")
	private WebElement createTemplate;

	@FindBy(how=How.XPATH,using="//input[@id='certificateTitle-input']")
	private WebElement certificateTitle;

	@FindBy(how=How.XPATH,using="//input[@id='stateName-input']")
	private WebElement stateName;

	@FindBy(how=How.XPATH,using="//button[contains(text(),' Browse ')]")
	private WebElement stateBrowseBtn;

	@FindBy(how=How.XPATH,using="//img[@rel='placeholder']")
	private WebElement selectStateLogo;

	@FindBy(how=How.XPATH,using="//button[contains(text(),' Select ')]")
	private WebElement selectBtnInUploadImg;

	@FindBy(how=How.XPATH,using="//label[contains(text(),'Signature 1')]//following::button[1]")
	private WebElement signatureBrowseBtn;

	@FindBy(how=How.XPATH,using="//input[@name='file']")
	private WebElement uploadBrowseBtn;

	@FindBy(how=How.XPATH,using="//button[contains(text(),' Upload and use ')]")
	private WebElement uploadAndUseBtn;

	@FindBy(how=How.XPATH,using="//input[@id='authoritySignature_0-input']")
	private WebElement Enterdesignation1;

	@FindBy(how=How.XPATH,using="//input[@id='authoritySignature_1-input']")
	private WebElement Enterdesignation2;

	@FindBy(how=How.XPATH,using="//label[@for='check2']")
	private WebElement checkBox;

	@FindBy(how=How.XPATH,using="//label[contains(text(),'Select layout')]//following::img[@alt='certificate template'][2]")
	private WebElement selectLayout;

	@FindBy(how=How.XPATH,using="//button[contains(text(),'Save template')]")
	private WebElement saveTemplate;

	@FindBy(how=How.XPATH,using="//strong[contains(text(),'Certificate added successfully')]")
	private WebElement certificateAddedMsg;

	@FindBy(how=How.XPATH,using="//button[@aria-label='close dialog']")
	private WebElement closeDialogBox;

	@FindBy(how=How.XPATH,using="//button[contains(text(),' Refresh ')]")
	private WebElement refreshBtn;

	@FindBy(how=How.XPATH,using="//div[@class='overlay-container']")
	private WebElement templateCard;

	@FindBy(how=How.XPATH,using="//span[contains(text(),'Preview')]")
	private WebElement previewOnTemplate;

	@FindBy(how=How.XPATH,using="//button[contains(text(),'Select template')]")
	private WebElement selectTemplateInCertificatePreview;

	@FindBy(how=How.XPATH,using="//div[contains(text(),' Certificate rules')]//following::mat-select[@role='listbox']")
	private WebElement issueCertificateToDropdown;

	@FindBy(how=How.XPATH,using="//div[contains(text(),' Certificate rules')]//following::span[contains(text(),'All')][2]")
	private WebElement selectAllInIssueCertificateDropdown;

	@FindBy(how=How.XPATH,using="//button[contains(text(),'Add certificate')]")
	private WebElement addCertificateforCreation;

	@FindBy(how=How.XPATH,using="//img[@alt='certificate edit']")
	private WebElement assertCertificateAdded;

	public void addCertificatebtn() {
		UtilityFunctions.waitToBeClickableAndClick(addCertificateBtn);
		Listeners.addLogs("clicked on addCertificateBtn");
	}
	public void addCertificatePlusIcon() {
		UtilityFunctions.waitToBeClickableAndClick(addCertificatePlusIcon);
		Listeners.addLogs("clicked on addCertificatePlusIcon");
	}
	public void createTemplateBtn() {
		UtilityFunctions.waitToBeClickableAndClick(createTemplate);
		Listeners.addLogs("clicked on createTemplate");
	}

	public void certificateTitle(String title) {

		UtilityFunctions.waitToBeClickableAndSendKeys(certificateTitle, title);
		Listeners.addLogs("entered certificateTitle");

	}
	public void stateName(String name) {

		UtilityFunctions.waitToBeClickableAndSendKeys(stateName, name);
		Listeners.addLogs("entered stateName");
	}
	public void stateBrowseBtn() {
		UtilityFunctions.waitToBeClickableAndClick(stateBrowseBtn);
		Listeners.addLogs("clicked on stateBrowseBtn");
	}
	public void selectStateLogo() {
		UtilityFunctions.waitToBeClickableAndClick(selectStateLogo);
		Listeners.addLogs("clicked on selectStateLogo");
	}
	public void selectBtnInUploadPage() {
		UtilityFunctions.waitToBeClickableAndClick(selectBtnInUploadImg);
		Listeners.addLogs("clicked on selectBtnInUploadImg");
	}
	public void signatureBrowseBtn() {
		UtilityFunctions.waitToBeClickableAndClick(signatureBrowseBtn);
		Listeners.addLogs("clicked on signatureBrowseBtn");
	}
	public void uploadSignatureFile(String filePath) {

		UtilityFunctions.uploadSendKeys(uploadBrowseBtn, filePath);
		Listeners.addLogs("uploaded file");
	}
	public void uploadAndUse() {
		UtilityFunctions.waitToBeClickableAndClick(uploadAndUseBtn);
		Listeners.addLogs("clicked on uploadAndUseBtn");
	}
	public void enterDesignation1(String name) {

		UtilityFunctions.waitToBeClickableAndSendKeys(Enterdesignation1, name);
		Listeners.addLogs("entered Enterdesignation1");
	}
	public void enterDesignation2(String name) {

		UtilityFunctions.waitToBeClickableAndSendKeys(Enterdesignation2, name);
		Listeners.addLogs("entered Enterdesignation2");
	}
	public void checkBox() {
		UtilityFunctions.waitToBeClickableAndClick(checkBox);
		Listeners.addLogs("clicked on checkBox");
	}
	public void selectLayout() {
		UtilityFunctions.waitToBeClickableAndClick(selectLayout);
		Listeners.addLogs("clicked on selectLayout");
	}
	public void saveTemplate() {
		UtilityFunctions.waitToBeClickableAndClick(saveTemplate);
		Listeners.addLogs("clicked on saveTemplate");
	}

	public String verifyCertificateAddedMsg() {
		UtilityFunctions.waitForVisibilityOfWebElement(certificateAddedMsg);
		String actualText=UtilityFunctions.getTextFromElement(certificateAddedMsg);
		Listeners.addLogs("certificateAddedMsg validated");
		UtilityFunctions.waitForElementToDisappear(certificateAddedMsg);
		return actualText;
	}
	public void closeDialogBox() {
		UtilityFunctions.waitToBeClickableAndClick(closeDialogBox);
		Listeners.addLogs("clicked on closeDialogBox");
	}
	public void issueCertficateDrodown() {
		UtilityFunctions.waitToBeClickableAndClick(issueCertificateToDropdown);
		Listeners.addLogs("clicked on issueCertificateToDropdown");
	}
	public void selectAllInIssueCertificateDropdown() {
		UtilityFunctions.waitToBeClickableAndClick(selectAllInIssueCertificateDropdown);
		Listeners.addLogs("clicked on selectAllInIssueCertificateDropdown");
	}
	public void refreshBtn() {
		UtilityFunctions.waitToBeClickableAndClick(refreshBtn);
		Listeners.addLogs("clicked on refreshBtn");
	}
	public void chooseTemplate() throws InterruptedException {
		UtilityFunctions.mouseHoverOnElement(templateCard);
		Listeners.addLogs("MouseHover on template card");
		UtilityFunctions.threadSleep(2000);
	//	UtilityFunctions.waitForElementAndClickable(previewOnTemplate);
		Listeners.addLogs("clicked on preview");
	}
	public void selectTemplateInPreviewPopup() {
	//	UtilityFunctions.clickUsingJavaScriptExecutor(selectTemplateInCertificatePreview;
		UtilityFunctions.waitToBeClickableAndClick(selectTemplateInCertificatePreview);
		Listeners.addLogs("clicked on selectTemplateInCertificatePreview");
	}
	public void addCertificateButtonForCreation() {
		UtilityFunctions.waitToBeClickableAndClick(addCertificateforCreation);
		Listeners.addLogs("clicked on addCertificateButtonForCreation");
	}
	public void assertCertificateAdded() {
		UtilityFunctions.waitForVisibilityOfWebElement(assertCertificateAdded);
		UtilityFunctions.validatIsElementPresent(assertCertificateAdded,"Certificate didn't add");
		Listeners.addLogs("assertCertificateAdded");
	}
}
