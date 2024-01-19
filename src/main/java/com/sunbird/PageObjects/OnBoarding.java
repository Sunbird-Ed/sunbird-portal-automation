package com.sunbird.PageObjects;

import com.sunbird.GenericLibrary.Listeners;
import com.sunbird.GenericLibrary.SunbirdConstants;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.sunbird.GenericLibrary.BaseTestConfig;
import com.sunbird.GenericLibrary.UtilityFunctions;

public class OnBoarding extends BaseTestConfig {

    @FindBy(how = How.XPATH, using = "//a[@data-translate='btnExploreDiksha']")
    private WebElement exploreDiksha;

    @FindBy(how = How.XPATH, using = "//mat-form-field[@id='board']")
    private WebElement Board;

    @FindBy(how = How.XPATH, using = "//*[contains(text(),'CBSE')]")
    private WebElement Cbsc;

    @FindBy(how = How.XPATH, using = "//div[@id='mat-select-value-39']")
//@FindBy(how=How.XPATH,using="//div[@id='mat-select-value-9']")
    private WebElement Medium;


    //@FindBy(how=How.XPATH,using="//div[@id='mat-select-value-9']//following::span[@class='mat-option-text']")
    @FindBy(how = How.XPATH, using = "//div[@id='mat-select-value-39']//following::span[@class='mat-option-text']")

    private WebElement MediumValue;

    @FindBy(how = How.XPATH, using = "//div[@id='mat-select-value-43']")
    //@FindBy(how=How.XPATH,using="//mat-form-field[@id='gradeLevel']")
    private WebElement Classs;

    //@FindBy(how=How.XPATH,using="//mat-form-field[@id='gradeLevel']//following::span[@class='mat-option-text']")
    @FindBy(how = How.XPATH, using = "//div[@id='mat-select-value-43']//following::span[@class='mat-option-text']")
    private WebElement ClassValue;

    @FindBy(how = How.XPATH, using = "//button[@class='sb-btn sb-btn-normal sb-btn-primary']")
    private WebElement BMCSubmit;

    @FindBy(how = How.XPATH, using = "//img[@alt='Teacher']")
    private WebElement Teacher;

    @FindBy(how = How.XPATH, using = "//button[@type='submit']")
    private WebElement ContinueButton;


    @FindBy(how = How.XPATH, using = "//span[contains(text(),'State')]//following::li[1]")
    private WebElement ClickStateDropDown;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'State')]//following::li[3]")
    private WebElement SelectStateValue;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'District')]//following::li[1]")
    private WebElement clickDistrictDropdown;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'District')]//following::li[3]")
    private WebElement SelectDistrictvalue;

    @FindBy(how = How.XPATH, using = "(//button[@type='submit'])[2]")
    private WebElement LocationPopupSubmitButton;

//	public WebElement TeacherClick() {
//		
//		return Teacher;
//	}

    public void TeacherClick() {


        UtilityFunctions.waitForElementAndClickable(Teacher);
        Listeners.addLogs("Clicked on Teacher");

    }


    public void ContinueButtonClick() {

        UtilityFunctions.waitToBeClickableAndClick(ContinueButton);
        Listeners.addLogs("Clicked on Continue Button");

    }

    public void BoardDropdown() {

        UtilityFunctions.waitToBeClickableAndClick(Board);
        Listeners.addLogs("Clicked on BoardDropDown");

    }

    public void BoardValueSelect(String frameworkName) {


        String boardXpath = SunbirdConstants.XPATH_CONTAINS + frameworkName + SunbirdConstants.XPATH_CONAINSCLOSEBRACKET;


        UtilityFunctions.findElementAndClick(boardXpath);
        Listeners.addLogs("Selected Board " + frameworkName);

        //UtilityFunctions.waitToBeClickableAndClick(Cbsc);

    }

    public void MediumDropDown() {

        UtilityFunctions.waitToBeClickableAndClick(Medium);
        Listeners.addLogs("Clicked on MediumDropDown");

    }

    public void MediumValueSelect() {

        UtilityFunctions.waitToBeClickableAndClick(MediumValue);
        Listeners.addLogs("Selected Medium Value");

    }

    public void ClassDropDown() {

        UtilityFunctions.waitToBeClickableAndClick(Classs);
        Listeners.addLogs("Clicked on Class DropDown");

    }

    public void ClassValueSelect() {

        UtilityFunctions.waitToBeClickableAndClick(ClassValue);
        Listeners.addLogs("Selected class value");

    }

    public void BMCSubmit() {

        UtilityFunctions.waitToBeClickableAndClick(BMCSubmit);
        Listeners.addLogs("Clicked on BMC Submit button");

    }


    public void clickStateDropdown() {

        UtilityFunctions.waitToBeClickableAndClick(ClickStateDropDown);
        Listeners.addLogs("Clicked on state dropdown");

    }

    public void selectStateValue() {

        UtilityFunctions.waitToBeClickableAndClick(SelectStateValue);
        Listeners.addLogs("Selected stateValue");

    }

    public void clickDistrictDropDown() {

        UtilityFunctions.waitToBeClickableAndClick(clickDistrictDropdown);
        Listeners.addLogs("clicked on Districtdropdown");

    }

    public void selectDistrictValue() {

        UtilityFunctions.waitToBeClickableAndClick(SelectDistrictvalue);
        Listeners.addLogs("selected district value");

    }

    public void LocationPopupSubmit() {

        UtilityFunctions.waitToBeClickableAndClick(LocationPopupSubmitButton);
        Listeners.addLogs("Clicked on Location Submit button");

    }

    public void explorebutton() {

        UtilityFunctions.waitToBeClickableAndClick(exploreDiksha);
        Listeners.addLogs("Clicked on explore button");

    }

}
