package com.sunbird.PageActions;

import com.sunbird.GenericLibrary.BaseTestConfig;
import com.sunbird.GenericLibrary.Listeners;
import com.sunbird.GenericLibrary.SunbirdConstants;
import com.sunbird.GenericLibrary.UtilityFunctions;
import com.sunbird.PageObjects.AddUserPage;
import com.sunbird.PageObjects.GetPage;
import org.openqa.selenium.support.PageFactory;


public class AddUserPageActions extends BaseTestConfig {

    public static void clickAddPlusIcon() {
        AddUserPage addUserPage = PageFactory.initElements(driver, AddUserPage.class);
        addUserPage.addPlusIcon();
    }

    public static String enterName() throws Exception {
        AddUserPage addUserPage = PageFactory.initElements(driver, AddUserPage.class);
        String name = UtilityFunctions.generateRandomName("A");
        addUserPage.enterName(name);
        return name;
    }

    public static void addUserBtnInCreation() {
        AddUserPage addUserPage = PageFactory.initElements(driver, AddUserPage.class);
        addUserPage.addButtonInCretion();
    }

    public static void assertAddedUserToastrMsg() {
        AddUserPage addUserPage = PageFactory.initElements(driver, AddUserPage.class);
        addUserPage.assertAddedUserToastr();

    }

    public static void clickChangeUser() {
        AddUserPage addUserPage = PageFactory.initElements(driver, AddUserPage.class);
        addUserPage.changeUserBtn();
    }

    public static void clickOnCreatedUser(String name) throws InterruptedException {
        String createdName = SunbirdConstants.XPATH_CONTAINS + name + SunbirdConstants.XPATH_CONAINSCLOSEBRACKET;
        UtilityFunctions.findElementAndClick(createdName);

    }

    public static void checkBoxClick() {
        AddUserPage addUserPage = PageFactory.initElements(driver, AddUserPage.class);
        addUserPage.checkBox();
    }

    public static void clickContinue() {
        AddUserPage addUserPage = PageFactory.initElements(driver, AddUserPage.class);
        addUserPage.continueBtn();
    }

    public static void VerifyAddUserButton() {
        AddUserPage addUserPage = PageFactory.initElements(driver, AddUserPage.class);

        String actualMsg = addUserPage.VerifyAddUserButtonDisplay();
        UtilityFunctions.stringValueComparision(actualMsg, SunbirdConstants.VerifyAddUserButtonDisplay, "Add Another User is not displayed");
        Listeners.addLogs("Add Another User is displayed ");


    }

    public static void assertAddUserPage() throws InterruptedException {
        AddUserPage addUserPage = PageFactory.initElements(driver, AddUserPage.class);
        String actualMsg = addUserPage.assertAddUserLabel();
        UtilityFunctions.stringValueComparision(actualMsg, SunbirdConstants.assertAddUserLabel, "Add User label is not displayed");
        Listeners.addLogs("Add User label is displayed");


        String actualMsg1 = addUserPage.assertNameTextField();
        UtilityFunctions.stringValueComparision(actualMsg1, SunbirdConstants.assertNameTextField, "Name Text field is not displayed");
        Listeners.addLogs("Name Text field is displayed");

        String actualMsg2 = addUserPage.assertDisplayedTextBelowNameField();
        UtilityFunctions.stringValueComparision(actualMsg2, SunbirdConstants.assertDisplayedTextBelowNameField, "Correct text is not displayed");
        Listeners.addLogs("Correct text is displayed");
    }


    public static void assertCancelButton() throws InterruptedException {
        AddUserPage addUserPage = PageFactory.initElements(driver, AddUserPage.class);
        addUserPage.assertCancelButtonInAddUserPage();


    }

    public static void assertAddUserButton() throws InterruptedException {
        AddUserPage addUserPage = PageFactory.initElements(driver, AddUserPage.class);
        addUserPage.assertAddUserButtonInAddUserPage();

    }

}