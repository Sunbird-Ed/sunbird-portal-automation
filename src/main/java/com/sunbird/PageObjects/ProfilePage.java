package com.sunbird.PageObjects;

import com.sunbird.GenericLibrary.Listeners;
import com.sunbird.GenericLibrary.UtilityFunctions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

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

	public String checkColorOfSubmitDetails() throws InterruptedException  {
		String actualColor = UtilityFunctions.getColorValue(assertSubmitDetails);
		return actualColor;
	}

	public void clickOnSubmitDetails() throws InterruptedException  {
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

}