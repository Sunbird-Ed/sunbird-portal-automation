package com.sunbird.PageObjects;

import com.sunbird.GenericLibrary.Listeners;
import com.sunbird.GenericLibrary.SunbirdConstants;
import com.sunbird.GenericLibrary.UtilityFunctions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;

public class ProfilePage {

	@FindBy(how = How.XPATH, using = "//div[contains(text(),'Guest')]")
	private WebElement assertGuestName;

	@FindBy(how = How.XPATH, using = "//div[contains(text(),'Role :')]//following::div[contains(text(),'Teacher')]")
	private WebElement assertTeacherRole;

	@FindBy(how = How.XPATH, using = "//div[contains(text(),'District :')]//following::div[1]")
	private WebElement assertDistrict;

	@FindBy(how = How.XPATH, using = "//div[contains(text(),'State :')]//following::div[1]")
	private WebElement assertState;

	@FindBy(how = How.XPATH, using = "//div[contains(text(),'State :')]//following::div[1]//following::button[1]")
	private WebElement assertEditBtnForLocation;

	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Board')]//following::span[1]")
	private WebElement assertBoard;

	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Medium')]//following::span[1]")
	private WebElement assertMedium;

	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Grade')]//following::span[1]")
	private WebElement assertClass;

	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Medium')]//following::span[1]//following::button[1]")
	private WebElement assertEditBtnForBMC;

	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Role')]//following::span[2]")
	private WebElement clickRoleDropdown;

	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Teacher')]")
	private WebElement selectTeacherRole;

	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Student')]")
	private WebElement selectStudentRole;

	@FindBy(how = How.XPATH, using = "//span[contains(text(),'School head OR Officials')]")
	private WebElement selectSchoolHead;

	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Subrole')]//following::li[1]")
	private WebElement clickSubRoleDropdown;

	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Subrole')]//following::span[contains(text(),'HM')][1]")
	private WebElement selectHMSubRole;

	@FindBy(how = How.XPATH, using = "//button[@aria-label='Back']")
	private WebElement backBtnInProfilePage;

	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Submit details')]")
	private WebElement assertSubmitDetails;

	@FindBy(how = How.XPATH, using = "//div[@id='tenant']")
	private WebElement clickOnTenantDropDown;

	@FindBy(how = How.XPATH, using = "//div[@id='tenant']//following::span[1]")
	private WebElement selectTenantFromDropDown;

	@FindBy(how = How.XPATH, using = "//input[@type='checkbox']//following::span[1]")
	private WebElement selectCheckBoxFromTeacherForm;

	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Submit')]")
	private WebElement clickOnSubmitButtonInTeacherForm;

	@FindBy(how = How.XPATH, using = "//strong[contains(text(),'Profile share settings submitted successfully')]")
	private WebElement validateToasterMsgOfTeacherForm;

	@FindBy(how = How.XPATH, using = "//button[contains(text(),'OK')]")
	private WebElement clickOnOkButtonInAlertMsgOfTeacherForm;

	@FindBy(how = How.XPATH, using = "//div[contains(text(),'My details')]")
	private WebElement validateMyDetailsLabel;

	@FindBy(how = How.XPATH, using = "//input[@id='declared-ext-id']")
	private WebElement assertExternalIdField;

	@FindBy(how = How.XPATH, using = "//input[@id='declared-phone']")
	private WebElement assertMobileField;

	@FindBy(how = How.XPATH, using = "//input[@id='declared-email']")
	private WebElement assertEmailIdField;

	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Update')]")
	private WebElement clickOnTeacherFormUpdateButton;

	@FindBy(how = How.XPATH, using = "//strong[contains(text(),'updated successfully')]")
	private WebElement assertUpdateToasterMsg;

	@FindBy(how = How.XPATH, using = "//span[contains(text(),'consent to provide my Profile Details')]")
	private WebElement assertConsentTextForPolicy;

	@FindBy(how = How.XPATH, using = "//div[@id='tenant']//following::span[1]")
	private List<WebElement> selectOnNewTenantFromDropDown;

	@FindBy(how = How.XPATH, using = "//span[contains(text(),'School head OR Officials')]")
	private WebElement schoolHeadOrOfficials;

	@FindBy(how = How.XPATH, using = "//div[@id='state']")
	private WebElement updateStateFromDropdown;
	@FindBy(how = How.XPATH, using = "//div[contains(text(),'Ongoing')]")
	private WebElement ongoingStatus;
	@FindBy(how = How.XPATH, using = "//div[contains(text(),'Completed')]")
	private WebElement completedStatus;


	public void verifyGuestName() {
		UtilityFunctions.waitForElementIsVisible(assertGuestName);
		UtilityFunctions.validatIsElementPresent(assertGuestName, "assertGuestName not displayed");
		Listeners.addLogs("assertGuestName is displayed ");

	}

	public void verifyRoleName() {
		UtilityFunctions.validatIsElementPresent(assertTeacherRole, "assertTeacherRole not displayed");
		Listeners.addLogs("assertTeacherRole is displayed ");
	}

	public void verifyLocationDetailsWithEditBtn() {
		UtilityFunctions.waitForElementIsVisible(assertDistrict);
		UtilityFunctions.validatIsElementPresent(assertDistrict, "assertDistrict not displayed");
		Listeners.addLogs("assertDistrict is displayed ");
		UtilityFunctions.validatIsElementPresent(assertState, "assertState not displayed");
		Listeners.addLogs("assertState is displayed ");
		UtilityFunctions.validatIsElementPresent(assertEditBtnForLocation, "assertEditBtnForLocation not displayed");
		Listeners.addLogs("assertEditBtnForLocation is displayed ");
	}

	public void verifyBMCDetailsWithEditBtn() {
		UtilityFunctions.waitForElementIsVisible(assertBoard);
		UtilityFunctions.validatIsElementPresent(assertBoard, "assertBoard not displayed");
		Listeners.addLogs("assertBoard is displayed ");
		UtilityFunctions.validatIsElementPresent(assertMedium, "assertMedium not displayed");
		Listeners.addLogs("assertMedium is displayed ");
		UtilityFunctions.validatIsElementPresent(assertClass, "assertClass not displayed");
		Listeners.addLogs("assertClass is displayed ");
		UtilityFunctions.validatIsElementPresent(assertEditBtnForBMC, "assertEditBtnForBMC not displayed");
		Listeners.addLogs("assertEditBtnForBMC is displayed ");
	}

	public void locationDetailsEdit() {
		UtilityFunctions.waitForElementAndClickable(assertEditBtnForLocation);
		Listeners.addLogs("assertEditBtnForLocation is clicked ");
	}

	public void roleDropdown() {
		UtilityFunctions.waitForElementAndClickable(clickRoleDropdown);
		Listeners.addLogs("clickRoleDropdown is clicked ");
	}

	public void selectRoleType(String roleType) {
		switch (roleType) {
			case "Teacher":
				UtilityFunctions.waitForElementAndClickable(selectTeacherRole);
				Listeners.addLogs("Selected Teacher");
				break;
			case "Student":
				UtilityFunctions.waitForElementAndClickable(selectStudentRole);
				Listeners.addLogs("Selected Student");
				break;
			case "SchoolHead":
				UtilityFunctions.waitForElementAndClickable(selectSchoolHead);
				Listeners.addLogs("Selected school head");
				break;
		}

	}

	public void backBtnInProfilePage() {
		UtilityFunctions.waitForElementAndClickable(backBtnInProfilePage);
		Listeners.addLogs("clicked on back button");

	}

	public void subRoleDropdown() {
		UtilityFunctions.waitForElementAndClickable(clickSubRoleDropdown);
		Listeners.addLogs("clickSubRoleDropdown");

	}

	public void selectSubRoleType(String subRoleType) {
		switch (subRoleType) {
			case "HM":
				UtilityFunctions.waitForElementAndClickable(selectHMSubRole);
				Listeners.addLogs("Selected HM");
				break;

		}

	}

	public String assertSubmitDetails() {
		UtilityFunctions.waitForVisibilityOfWebElement(assertSubmitDetails);
		String getActualText = UtilityFunctions.getTextFromElement(assertSubmitDetails);
		return getActualText;
	}

	public String checkColorOfSubmitDetails() throws InterruptedException {
		String actualColor = UtilityFunctions.getColorValue(assertSubmitDetails);
		return actualColor;
	}

	public void clickOnSubmitDetails() throws InterruptedException {
		UtilityFunctions.waitForElementAndClickable(assertSubmitDetails);
		Listeners.addLogs("Clicked on Submit Details button");
	}

	public void clickOnTenantDropDown() {
		UtilityFunctions.waitForElementAndClickable(clickOnTenantDropDown);
		Listeners.addLogs("Clicked on Tenant drop down");

	}

	public void selectTenantFromDropDown() {
		UtilityFunctions.waitForElementAndClickable(selectTenantFromDropDown);
		Listeners.addLogs("Selected Tenant from drop down");

	}

	public void selectCheckBoxFromTeacherForm() {
		UtilityFunctions.waitForElementAndClickable(selectCheckBoxFromTeacherForm);
		Listeners.addLogs("Clicked on Checkbox of Teacher Form");

	}

	public void clickOnSubmitButtonInTeacherForm() {
		UtilityFunctions.waitForElementAndClickable(clickOnSubmitButtonInTeacherForm);
		Listeners.addLogs("Clicked on Submit button of Teacher Form");

	}

	public String validateToasterMsgOfTeacherForm() {
		UtilityFunctions.waitForVisibilityOfWebElement(validateToasterMsgOfTeacherForm);
		String getActualText = UtilityFunctions.getTextFromElement(validateToasterMsgOfTeacherForm);
		UtilityFunctions.waitForElementToDisappear(validateToasterMsgOfTeacherForm);
		return getActualText;
	}

	public void clickOnOkButtonInAlertMsgOfTeacherForm() {
		UtilityFunctions.waitForElementAndClickable(clickOnOkButtonInAlertMsgOfTeacherForm);
		Listeners.addLogs("Clicked on Ok button in Alert Msg of Teacher Form");

	}

	public String validateMyDetailsLabel() {
		UtilityFunctions.waitForVisibilityOfWebElement(validateMyDetailsLabel);
		String getActualText = UtilityFunctions.getTextFromElement(validateMyDetailsLabel);
		return getActualText;
	}

	public void assertExternalIdField() {
		UtilityFunctions.waitForElementIsVisible(assertExternalIdField);
		UtilityFunctions.validatIsElementPresent(assertExternalIdField, "assertGuestName not displayed");
		Listeners.addLogs("assertGuestName is displayed ");

	}

	public void assertMobileField() {
		UtilityFunctions.waitForElementIsVisible(assertMobileField);
		UtilityFunctions.validatIsElementPresent(assertMobileField, "assertMobileField not displayed");
		Listeners.addLogs("assertMobileField is displayed ");

	}

	public void assertEmailIdField() {
		UtilityFunctions.waitForElementIsVisible(assertEmailIdField);
		UtilityFunctions.validatIsElementPresent(assertEmailIdField, "assertEmailIdField not displayed");
		Listeners.addLogs("assertEmailIdField is displayed ");

	}

	public void clickOnTeacherFormUpdateButton() {
		UtilityFunctions.waitForElementAndClickable(clickOnTeacherFormUpdateButton);
		Listeners.addLogs("clickOnTeacherFormUpdateButton is clicked ");
	}

	public String assertUpdateToasterMsg() {
		UtilityFunctions.waitForVisibilityOfWebElement(assertUpdateToasterMsg);
		String getActualText = UtilityFunctions.getTextFromElement(assertUpdateToasterMsg);
		UtilityFunctions.waitForElementToDisappear(assertUpdateToasterMsg);
		return getActualText;
	}

	public String assertConsentTextForPolicy() {
		UtilityFunctions.waitForVisibilityOfWebElement(assertConsentTextForPolicy);
		String getActualText = UtilityFunctions.getTextFromElement(assertConsentTextForPolicy);
		return getActualText;

	}

	public void selectOnNewTenantFromDropDown() {
		UtilityFunctions.waitForElementAndClickable(selectOnNewTenantFromDropDown.get(3));
		Listeners.addLogs("Selected New Tenant drop down");

	}

	public void schoolHeadOrOfficials() {

		UtilityFunctions.waitForElementAndClickable(schoolHeadOrOfficials);
		Listeners.addLogs("School head or Official role is selected");

	}

	public void clickStateDropdown() {

		UtilityFunctions.waitForElementAndClickable(assertState);
		Listeners.addLogs("School head or Official role is selected");
	}
	public void stateFromDropdown() {

		UtilityFunctions.waitForElementAndClickable(updateStateFromDropdown);
		Listeners.addLogs("Clicked on State dropdown");
	}
	public void selectAPFromDropdown(String boardName) throws InterruptedException {
		String boardXpath = "(" + SunbirdConstants.XPATH_CONTAINS + boardName + SunbirdConstants.XPATH_CONAINSCLOSEBRACKET + ")[3]";
		UtilityFunctions.findElementAndClick(boardXpath);
		Listeners.addLogs("Selected Board " + boardName);

	}
	public String verifyOngoingStatusAndRetunColor() {
		UtilityFunctions.waitForElementIsVisible(ongoingStatus);
		UtilityFunctions.validatIsElementPresent(ongoingStatus, "Ongoing status in My Learning Section is not displayed");
		Listeners.addLogs("Ongoing status in My Learning Section is displayed");
		String getActualText = UtilityFunctions.getColorValue(ongoingStatus);
		return getActualText;

	}

	public String verifyCompletedStatusAndRetunColor() {
		UtilityFunctions.waitForElementIsVisible(completedStatus);
		UtilityFunctions.validatIsElementPresent(completedStatus, "Completed status in My Learning Section is not displayed");
		Listeners.addLogs("Completed status in My Learning Section is displayed");
		String getActualText = UtilityFunctions.getColorValue(completedStatus);
		return getActualText;
	}
}