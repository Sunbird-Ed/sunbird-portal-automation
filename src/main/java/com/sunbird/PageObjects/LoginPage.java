package com.sunbird.PageObjects;

import com.sunbird.GenericLibrary.Listeners;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.sunbird.GenericLibrary.UtilityFunctions;

public class LoginPage {

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'English')]//following::div[@class='sb-avatar__img']")
    private WebElement userProfileIcon;

    @FindBy(how = How.XPATH, using = "//a[text()=' Login ']")
    private WebElement loginLink;

    @FindBy(how = How.XPATH, using = "//input[@id='username']")
    private WebElement userName;

    @FindBy(how = How.XPATH, using = "//input[@id='password']")
    private WebElement password;

    @FindBy(how = How.XPATH, using = "//button[@id='login']")
    private WebElement login;

    @FindBy(how = How.XPATH, using = "//div[@class='title mt-4']")
    private WebElement checkAssert;


    @FindBy(how=How.XPATH, using="//button[@id='login']//following::div[1]")
    private WebElement checkDontYouHaveAccount;

    @FindBy(how=How.XPATH, using="//button[@id='login']//following::span")
    private WebElement checkRegisterHere;

    @FindBy(how=How.XPATH, using="//button[@id='googleSignInBtn']")
    private WebElement checkSignInWithGoogle;

    @FindBy(how=How.XPATH, using="//img[@alt='Sign in with Google']")
    private WebElement checkGoogleImage;

    @FindBy(how=How.XPATH, using="//button[@id='stateButton']")
    private WebElement checkLoginWithStateSystem;

    @FindBy(how=How.XPATH, using="(//p[contains(text(),'Login')])[1]")
    private WebElement validateLoginHeading;

    @FindBy(how=How.XPATH, using="//input[@id='username']")
    private WebElement emailTextField;

    @FindBy(how=How.XPATH, using="//input[@id='password']")
    private WebElement passwordTextField;

    @FindBy(how=How.XPATH, using="//div[@class='ui header centered mb-8']//following::img[@alt='Sunbird logo']")
    private WebElement imageSunbirdLogo;

    public void userProfileIcon() {

        UtilityFunctions.waitToBeClickableAndClick(userProfileIcon);
    }

    public void LoginButtonInProfileIconDropdown() {

        UtilityFunctions.waitToBeClickableAndClick(loginLink);
        Listeners.addLogs("Clicked on Login Link");
    }


    /* Enter username data into the field */
    public void LoginUserName(String userNameValue) {

        UtilityFunctions.waitToBeClickableAndSendKeys(userName, userNameValue);
        Listeners.addLogs("Entered Username " + userNameValue);

    }


    public void LoginPassword(String passwordValue) {

        UtilityFunctions.waitToBeClickableAndSendKeys(password, passwordValue);
        Listeners.addLogs("Entered Password " + passwordValue);

    }

    public void TapLoginButton() {

        UtilityFunctions.waitToBeClickableAndClick(login);
        Listeners.addLogs("Tap on Loginbutton");

    }

    public String getTeacherText() {
        String d = UtilityFunctions.getTextFromElement(checkAssert);
        return d;

    }
    public String checkDontYouHaveAccount() {

        UtilityFunctions.waitForVisibilityOfWebElement(checkDontYouHaveAccount);
        String getActualText = UtilityFunctions.getTextFromElement(checkDontYouHaveAccount);
        return getActualText;
    }

    public String checkRegisterHere() {

        UtilityFunctions.waitForVisibilityOfWebElement(checkRegisterHere);
        String getActualText = UtilityFunctions.getTextFromElement(checkRegisterHere);
        return getActualText;
    }

    public String checkSignInWithGoogle() {
        UtilityFunctions.waitForVisibilityOfWebElement(checkSignInWithGoogle);
        String getActualText = UtilityFunctions.getTextFromElement(checkSignInWithGoogle);
        return getActualText;
    }

    public String checkColorOfSignInWithGoogle() {
        UtilityFunctions.waitForVisibilityOfWebElement(checkSignInWithGoogle);
        WebElement t=checkSignInWithGoogle;
        String getActualColor = t.getCssValue("color");
        String actualColor = Color.fromString(getActualColor).asHex();
        return actualColor;

    }


    public void checkGoogleImage() {
        UtilityFunctions.waitForVisibilityOfWebElement(checkGoogleImage);
        UtilityFunctions.validatIsElementPresent(checkGoogleImage, "Google image not displayed");
        Listeners.addLogs("Google image is displayed ");
    }

    public String checkLoginWithStateSystem() {
        UtilityFunctions.waitForVisibilityOfWebElement(checkLoginWithStateSystem);
        String getActualText = UtilityFunctions.getTextFromElement(checkLoginWithStateSystem);
        return getActualText;
    }

    public String checkColorOfLoginWithStateSystem() {
        UtilityFunctions.waitForVisibilityOfWebElement(checkLoginWithStateSystem);
       return   UtilityFunctions.getColorValue(checkLoginWithStateSystem);
    }

    public String validateLoginHeading() {
        UtilityFunctions.waitForVisibilityOfWebElement(validateLoginHeading);
        String getActualText = UtilityFunctions.getTextFromElement(validateLoginHeading);
        System.out.print(getActualText);
        return getActualText;

    }

    public String assertEmailTextField() throws InterruptedException {
        UtilityFunctions.waitForVisibilityOfWebElement(emailTextField);

        String actualText=UtilityFunctions.getAttributeValue(emailTextField, "placeholder");
        return actualText;

    }

    public String verifyPasswordField() throws InterruptedException {
        UtilityFunctions.waitForVisibilityOfWebElement(passwordTextField);

        String actualText=UtilityFunctions.getAttributeValue(passwordTextField, "placeholder");
        return actualText;
    }

    public void assertLoginButton() throws InterruptedException {
        UtilityFunctions.waitForVisibilityOfWebElement(login);
        String getActualText = UtilityFunctions.getTextFromElement(login);
        Listeners.addLogs("Login button is displayed ");

    }
    public void imageSunbirdLogo() {
        UtilityFunctions.waitForVisibilityOfWebElement(imageSunbirdLogo);
        Listeners.addLogs("Sunbird Logo is displayed ");
    }
}
