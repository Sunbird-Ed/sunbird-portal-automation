package com.sunbird.PageActions;

import com.sunbird.GenericLibrary.BaseTestConfig;
import com.sunbird.GenericLibrary.Listeners;
import com.sunbird.GenericLibrary.SunbirdConstants;
import com.sunbird.GenericLibrary.UtilityFunctions;
import com.sunbird.PageObjects.OnBoarding;
import com.sunbird.PageObjects.ProfilePage;
import org.openqa.selenium.support.PageFactory;


public class ProfilePageActions extends BaseTestConfig {


	public static void assertGuestName() throws Exception {
		ProfilePage profilePage = PageFactory.initElements(driver, ProfilePage.class);
		profilePage.verifyGuestName();

	}
	public static void assertRole() throws Exception {
		ProfilePage profilePage = PageFactory.initElements(driver, ProfilePage.class);
		profilePage.verifyRoleName();

	}
	public static void assertDistrictAndStateWithEditBtn() throws Exception {
		ProfilePage profilePage = PageFactory.initElements(driver, ProfilePage.class);
		profilePage.verifyLocationDetailsWithEditBtn();

	}
	public static void assertBMCWithEditBtn() throws Exception {
		ProfilePage profilePage = PageFactory.initElements(driver, ProfilePage.class);
		profilePage.verifyBMCDetailsWithEditBtn();

	}
	public static void clickEditButtonLocationDetails() throws Exception {
		ProfilePage profilePage = PageFactory.initElements(driver, ProfilePage.class);
		profilePage.locationDetailsEdit();

	}
	public static void clickRoleDropdown() throws Exception {
		ProfilePage profilePage = PageFactory.initElements(driver, ProfilePage.class);
		profilePage.roleDropdown();

	}
	public static void selectRoleType(String type) throws Exception {
		ProfilePage profilePage = PageFactory.initElements(driver, ProfilePage.class);
		profilePage.selectRoleType(type);

	}
	public static void clickBackButtonInProfilePage() throws Exception {
		ProfilePage profilePage = PageFactory.initElements(driver, ProfilePage.class);
		profilePage.backBtnInProfilePage();

	}
	public static void clickSubRoleDropdown() throws Exception {
		ProfilePage profilePage = PageFactory.initElements(driver, ProfilePage.class);
		profilePage.subRoleDropdown();

	}
	public static void selectSubRoleType(String subroletype) throws Exception {
		ProfilePage profilePage = PageFactory.initElements(driver, ProfilePage.class);
		profilePage.selectSubRoleType(subroletype);

	}
	public static void verifySubmitDetails() throws InterruptedException {
		ProfilePage profilePage = PageFactory.initElements(driver, ProfilePage.class);

		String actualMsg = profilePage.assertSubmitDetails();
		UtilityFunctions.stringValueComparision(actualMsg, SunbirdConstants.assertSubmitDetails, "Submit Details is not displayed");
		Listeners.addLogs("Submit Details is displayed ");

		String colorName = profilePage.checkColorOfSubmitDetails();
		UtilityFunctions.stringValueComparision(colorName, SunbirdConstants.colorOfSubmitDetails, "Green Color button is not displayed");
		Listeners.addLogs("Green Color button is displayed ");
	}

	public static void clickOnSubmitDetails() throws InterruptedException {
		ProfilePage profilePage = PageFactory.initElements(driver, ProfilePage.class);
		profilePage.clickOnSubmitDetails();

	}

	public static void clickOnTenantDropDown() throws InterruptedException {
		ProfilePage profilePage = PageFactory.initElements(driver, ProfilePage.class);
		profilePage.clickOnTenantDropDown();

	}
	public static void selectTenantFromDropDown() throws InterruptedException {
		ProfilePage profilePage = PageFactory.initElements(driver, ProfilePage.class);
		profilePage.selectTenantFromDropDown();

	}
	public static void selectCheckBoxFromTeacherForm() throws InterruptedException {
		ProfilePage profilePage = PageFactory.initElements(driver, ProfilePage.class);
		profilePage.selectCheckBoxFromTeacherForm();
	}
	public static void clickOnSubmitButtonInTeacherForm() throws InterruptedException {
		ProfilePage profilePage = PageFactory.initElements(driver, ProfilePage.class);
		profilePage.clickOnSubmitButtonInTeacherForm();
	}
	public static void assertToasterMsgOfTeacherForm() throws InterruptedException {
		ProfilePage profilePage = PageFactory.initElements(driver, ProfilePage.class);
		String actualMsg = profilePage.validateToasterMsgOfTeacherForm();
		UtilityFunctions.stringValueComparision(actualMsg, SunbirdConstants.validateToasterMsgOfTeacherForm, "Toaster Msg of Teacher Form is not handled");
		Listeners.addLogs("Toaster Msg of Teacher Form is handled");
	}
	public static void clickOnOkButtonInAlertMsgOfTeacherForm() throws InterruptedException {
		ProfilePage profilePage = PageFactory.initElements(driver, ProfilePage.class);
		profilePage.clickOnOkButtonInAlertMsgOfTeacherForm();
	}
	public static void validateMyDetailsLabel() throws InterruptedException {
		ProfilePage profilePage = PageFactory.initElements(driver, ProfilePage.class);
		UtilityFunctions.scrollUpUsingPixelValue();
		String actualMsg1 = profilePage.validateMyDetailsLabel();
		UtilityFunctions.stringValueComparision(actualMsg1, SunbirdConstants.validateMyDetailsLabel, "My details is not displayed");
		Listeners.addLogs("My details is displayed ");
	}
	public static void assertExternalIdField() throws InterruptedException {
		ProfilePage profilePage = PageFactory.initElements(driver, ProfilePage.class);
		profilePage.assertExternalIdField();

	}

	public static void assertMobileField() throws InterruptedException {
		ProfilePage profilePage = PageFactory.initElements(driver, ProfilePage.class);
		profilePage.assertMobileField();

	}

	public static void assertEmailIdField() throws InterruptedException {
		ProfilePage profilePage = PageFactory.initElements(driver, ProfilePage.class);
		profilePage.assertEmailIdField();

	}

	public static void clickOnTeacherFormUpdateButton() throws InterruptedException {
		ProfilePage profilePage = PageFactory.initElements(driver, ProfilePage.class);
		profilePage.clickOnTeacherFormUpdateButton();

	}

	public static void assertUpdateToasterMsg() throws InterruptedException {
		ProfilePage profilePage = PageFactory.initElements(driver, ProfilePage.class);
		String actualMsg = profilePage.assertUpdateToasterMsg();
		UtilityFunctions.stringValueComparision(actualMsg, SunbirdConstants.assertUpdateToasterMsg, "Update Successfully Toaster Msg of Teacher Form is not handled");
		Listeners.addLogs("Update Successfully Toaster Msg of Teacher Form is handled");
	}
	public static void assertConsentTextForPolicy() {
		ProfilePage profilePage = PageFactory.initElements(driver, ProfilePage.class);
		String actualMsg1 = profilePage.assertConsentTextForPolicy();
		UtilityFunctions.stringValueComparision(actualMsg1, SunbirdConstants.assertConsentTextForPolicy, "Consent for policy is not displayed");
		Listeners.addLogs("Consent for policy is displayed ");

	}
	public static void selectOnNewTenantFromDropDown() throws InterruptedException {
		ProfilePage profilePage = PageFactory.initElements(driver, ProfilePage.class);
		profilePage.selectOnNewTenantFromDropDown();

	}
	public static void selectSchoolHeadOrOfficials() {
		ProfilePage profilePage = PageFactory.initElements(driver, ProfilePage.class);
		profilePage.schoolHeadOrOfficials();
	}
	public static void clickStateFromDropdown() {
		ProfilePage profilePage = PageFactory.initElements(driver, ProfilePage.class);
		profilePage.stateFromDropdown();

	}
	public static void selectAPFromDropdown() throws InterruptedException {
		ProfilePage profilePage = PageFactory.initElements(driver, ProfilePage.class);
		profilePage.selectAPFromDropdown(SunbirdConstants.APBoardValue);
	}
	public static void assertOngoingStatusAndValidateColor() {
		ProfilePage profilePage = PageFactory.initElements(driver, ProfilePage.class);
		String actualMsg1 = profilePage.verifyOngoingStatusAndRetunColor();
		UtilityFunctions.stringValueComparision(actualMsg1, SunbirdConstants.ongoingStatusTextColor, "Ongoing status is not displayed in Blue Color");
		Listeners.addLogs("Ongoing status is displayed in Blue Color");
	}
	public static void assertCompletedStatusAndValidateColor() {
		ProfilePage profilePage = PageFactory.initElements(driver, ProfilePage.class);
		String actualMsg1 = profilePage.verifyCompletedStatusAndRetunColor();
		UtilityFunctions.stringValueComparision(actualMsg1, SunbirdConstants.completedStatusTextColor, "Completed status is not displayed in Green Color");
		Listeners.addLogs("Completed status is displayed in Green Color");
	}
	public static void assertProfileUpdateToasterMsg() {
		ProfilePage profilePage = PageFactory.initElements(driver, ProfilePage.class);
		String actualMsg1 = profilePage.assertProfileUpdateToasterMsg();
		UtilityFunctions.stringValueComparision(actualMsg1, SunbirdConstants.assertProfileUpdateToasterMsg, "Update toaster msg is not displayed");
		Listeners.addLogs("Update toaster msg is displayed ");

	}
	public static void assertBMCWithEditBtnForLoggedInUser() throws Exception {
		ProfilePage profilePage = PageFactory.initElements(driver, ProfilePage.class);
		profilePage.verifyBMCDetailsWithEditBtnForLoggedInUser();
	}
	public static void updateBMGInGuestUser() throws InterruptedException {
		ProfilePage profilePage = PageFactory.initElements(driver, ProfilePage.class);
		OnBoarding onboard = PageFactory.initElements(driver, OnBoarding.class);
		profilePage.clickOnBMGEditBtn();
		String frameworkValue=profilePage.getValueOfBoard();
		if(frameworkValue.equals(SunbirdConstants.cbseBoardValue))
		{
			onboard.BoardDropdown();
			onboard.updateBoardValueSelect(SunbirdConstants.guestUserBoardValue);
		}
		else
		{
			onboard.BoardDropdown();
			onboard.BoardValueSelect("CBSE");
		}
		onboard.MediumDropDown();
		onboard.MediumValueSelect();
		UtilityFunctions.MoveByOffSet(50, 100);
		onboard.ClassDropDown();
		onboard.ClassValueSelect();
		UtilityFunctions.MoveByOffSet(50, 100);
		onboard.BMCSubmit();
	}

}