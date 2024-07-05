package com.sunbird.PageObjects;

import com.sunbird.GenericLibrary.Listeners;
import com.sunbird.GenericLibrary.SunbirdConstants;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.sunbird.GenericLibrary.BaseTestConfig;
import com.sunbird.GenericLibrary.UtilityFunctions;

import java.util.List;

public class OnBoarding extends BaseTestConfig {

    @FindBy(how = How.XPATH, using = "//a[@data-translate='btnExploreDiksha']")
    private WebElement exploreDiksha;

    @FindBy(how = How.XPATH, using = "//mat-form-field[@id='board']")
    private WebElement Board;

    @FindBy(how = How.XPATH, using = "//*[contains(text(),'CBSE')]")
    private WebElement Cbsc;

//    @FindBy(how = How.XPATH, using = "//div[@id='mat-select-value-39']")
//@FindBy(how=How.XPATH,using="//div[@id='mat-select-value-9']")
@FindBy(how=How.XPATH,using="//div[@class='title']//following::div[contains(@id,'mat-select-value')][2]")
    private WebElement Medium;

    @FindBy(how=How.XPATH,using="//div[@class='title']//following::div[contains(@id,'mat-select-value')][2]//following::span[@class='mat-option-text']")
    //@FindBy(how=How.XPATH,using="//div[@id='mat-select-value-9']//following::span[@class='mat-option-text']")
   // @FindBy(how = How.XPATH, using = "//div[@id='mat-select-value-39']//following::span[@class='mat-option-text']")

    private WebElement MediumValue;

  //  @FindBy(how = How.XPATH, using = "//div[@id='mat-select-value-43']")
    //@FindBy(how=How.XPATH,using="//div[@id='mat-select-value-13']")
    @FindBy(how=How.XPATH,using="//div[@class='title']//following::div[contains(@id,'mat-select-value')][3]")

    private WebElement Classs;

    @FindBy(how=How.XPATH,using="//div[@class='title']//following::div[contains(@id,'mat-select-value')][3]//following::span[@class='mat-option-text']")
  //  @FindBy(how=How.XPATH,using="//div[@id='mat-select-value-13']//following::span[@class='mat-option-text'][2]")
    //@FindBy(how = How.XPATH, using = "//div[@id='mat-select-value-43']//following::span[@class='mat-option-text']")
    private WebElement ClassValue;

    @FindBy(how = How.XPATH, using = "//button[@class='sb-btn sb-btn-normal sb-btn-primary']")
    private WebElement BMCSubmit;

    @FindBy(how = How.XPATH, using = "//img[@alt='Teacher']")
    private WebElement Teacher;

    @FindBy(how = How.XPATH, using = "//img[@alt='Student']")
    private WebElement Student;

    @FindBy(how = How.XPATH, using = "//img[@alt='Parent']")
    private WebElement Parent;

    @FindBy(how = How.XPATH, using = "//img[@alt='School head OR Officials']")
    private WebElement SchoolHeadOrOfficials;

    @FindBy(how = How.XPATH, using = "//img[@alt='Other']")
    private WebElement OtherRole;

    @FindBy(how = How.XPATH, using = "//button[@type='submit']")
    private WebElement ContinueButton;


    @FindBy(how = How.XPATH, using = "//span[contains(text(),'State')]//following::div[3]")
    private WebElement ClickStateDropDown;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'State')]//following::span[3]//following::span[@class='mat-option-text'][2]")
    private WebElement SelectStateValue;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'District')]//following::li[1]")
    //@FindBy(how = How.XPATH, using = "//span[contains(text(),'District')]//following::span[2]")
    private WebElement clickDistrictDropdown;

    //@FindBy(how = How.XPATH, using = "//span[contains(text(),'District')]//following::mat-option[3]")
    @FindBy(how = How.XPATH, using = "//span[contains(text(),'District')]//following::li[1]//following::span[2]")
    private WebElement SelectDistrictvalue;

    @FindBy(how = How.XPATH, using = "(//button[@type='submit'])[2]")
    private WebElement LocationPopupSubmitButton;

    @FindBy(how = How.XPATH, using = "//strong[contains(text(),'User preference updated successfully')]")
    private WebElement locationPopupToastrMsg;

    @FindBy(how = How.XPATH, using = "//*[@id='mat-select-value-21']")
    private WebElement farmingTypeDropDown;
    @FindBy(how = How.XPATH, using = "//*[@id='mat-select-value-21']//following::span[@class='mat-option-text']")
    private WebElement farmingTypeValue;

    @FindBy(how = How.XPATH, using = "//*[@id='mat-select-30']")
    private WebElement cropCategoryDropdown;
    @FindBy(how = How.XPATH, using = "//*[@id='mat-select-value-31']//following::span[@class='mat-option-text']")
    private WebElement cropCategoryValue;

    @FindBy(how = How.XPATH, using = "//*[@id='mat-select-38']")
    private WebElement cropTypeDropdown;
    @FindBy(how = How.XPATH, using = "//*[@id='mat-select-38']//following::span[@class='mat-option-text']")
    private WebElement cropTypeValue;

    @FindBy(how = How.XPATH, using = "//*[@id='mat-select-value-45']")
    private WebElement cropNameDropdown;
    @FindBy(how = How.XPATH, using = "//*[@id='mat-select-value-45']//following::span[@class='mat-option-text']")
    private WebElement cropNameValue;

    @FindBy(how = How.XPATH, using = "//*[@med='English']")
    private WebElement mediumValue;

    @FindBy(how = How.XPATH, using = "//*[@med='English']")
    private WebElement mediumDropDown;

    @FindBy(how = How.XPATH, using = "//label[@for='block']/following::li[1]")
    private WebElement clickBlockDropdown;

    @FindBy(how = How.XPATH, using = "//label[@for='block']//following::span[1]")
    private WebElement selectBlockDropdown;

    @FindBy(how = How.XPATH, using = "//label[@for='school']//following::li[1]")
    private WebElement clickSchoolDropdown;

    @FindBy(how = How.XPATH, using = "//label[@for='school']//following::span[1]")
    private WebElement selectSchoolDropdown;

    @FindBy(how = How.XPATH, using = "//*[contains(text(),'To discover relevant content update the following details:')]//following::mat-select")
    private List<WebElement> ckBoard;

    @FindBy(how = How.XPATH, using = "//mat-option")
    private WebElement matOption;

    @FindBy(how = How.XPATH, using = "//select")
    private List<WebElement> selectOption;

    @FindBy(how = How.XPATH, using = "(//lib-meta-form)//following::ul")
    private List<WebElement> UlTagnameForEditor;

//	public WebElement TeacherClick() {
//		
//		return Teacher;
//	}

    public void TeacherClick() {


        UtilityFunctions.waitForElementAndClickable(Teacher);
        Listeners.addLogs("Clicked on Teacher");

    }

    public void StudentClick() {

        UtilityFunctions.waitForElementAndClickable(Student);
        Listeners.addLogs("Clicked on Student role");

    }
    public void ContinueButtonClick() {

        UtilityFunctions.waitToBeClickableAndClick(ContinueButton);
        Listeners.addLogs("Clicked on Continue Button");

    }

    public void BoardDropdown() {

        UtilityFunctions.waitToBeClickableAndClick(Board);
        Listeners.addLogs("Clicked on BoardDropDown");

    }

    public void BoardValueSelect(String frameworkName) throws InterruptedException {


        String boardXpath = SunbirdConstants.XPATH_CONTAINS + frameworkName + SunbirdConstants.XPATH_CONAINSCLOSEBRACKET;
        UtilityFunctions.findElementAndClick(boardXpath);
        Listeners.addLogs("Selected Board " + frameworkName);

        //UtilityFunctions.waitToBeClickableAndClick(Cbsc);

    }

    public void MediumDropDown() {
        UtilityFunctions.waitForElementUsingForLoopCondition(Medium,8);
        UtilityFunctions.waitForElementAndClickable(Medium);
        Listeners.addLogs("Clicked on MediumDropDown");

    }

    public void MediumValueSelect() {
        UtilityFunctions.waitForElementUsingForLoopCondition(MediumValue,8);
        UtilityFunctions.waitForElementAndClickable(MediumValue);
        Listeners.addLogs("Selected Medium Value");

    }

    public void ClassDropDown() {
UtilityFunctions.waitForElementUsingForLoopCondition(Classs,8);
        UtilityFunctions.waitForElementAndClickable(Classs);
        Listeners.addLogs("Clicked on Class DropDown");

    }

    public void ClassValueSelect() {
        UtilityFunctions.waitForElementUsingForLoopCondition(ClassValue,8);
        UtilityFunctions.waitForElementAndClickable(ClassValue);
        Listeners.addLogs("Selected class value");

    }

    public void BMCSubmit() {

        UtilityFunctions.waitToBeClickableAndClick(BMCSubmit);
        Listeners.addLogs("Clicked on BMC Submit button");

    }


    public void clickStateDropdown() {
UtilityFunctions.waitForElementIsVisible(ClickStateDropDown);
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

    public void selectFarmingType()
    {
        UtilityFunctions.waitForElementAndClickable(farmingTypeDropDown);
        UtilityFunctions.waitForElementAndClickable(farmingTypeValue);

    }
    public void selectCropCategory()
    {
        UtilityFunctions.waitForElementAndClickable(cropCategoryDropdown);
        UtilityFunctions.waitForElementAndClickable(cropCategoryValue);

    }
    public void selectCropType()
    {
        UtilityFunctions.waitForElementAndClickable(cropTypeDropdown);
        UtilityFunctions.waitForElementAndClickable(cropTypeValue);

    }
    public void selectCropName()
    {
        UtilityFunctions.waitForElementAndClickable(cropNameDropdown);
        UtilityFunctions.waitForElementAndClickable(cropNameValue);

    }

    public void clickBlockDropdown() {

        UtilityFunctions.waitToBeClickableAndClick(clickBlockDropdown);
        Listeners.addLogs("clickBlockDropdown");

    }
    public void selectBlockDropdown() {

        UtilityFunctions.waitToBeClickableAndClick(selectBlockDropdown);
        Listeners.addLogs("selectBlockDropdown");

    }
    public void clickSchoolDropdown() {

        UtilityFunctions.waitToBeClickableAndClick(clickSchoolDropdown);
        Listeners.addLogs("clickSchoolDropdown");

    }
    public void schoolDropdown() {

        UtilityFunctions.waitToBeClickableAndClick(selectSchoolDropdown);
        Listeners.addLogs("selectSchoolDropdown");

    }
    public void ckDropdown(int i) {
UtilityFunctions.waitForElementUsingForLoopAndAssert(ckBoard.get(i),5);
        UtilityFunctions.waitForElementAndClickable(ckBoard.get(i));
//ckBoard.get(i).click();
    }
    public List<WebElement>  ckDropdownmain() {
        return ckBoard;
    }
    public WebElement  matOp() {
        return matOption;
    }
    public List<WebElement>  selectDropdowns() {
        return selectOption;
    }
    public List<WebElement>  UlTagnameElements() {
        return UlTagnameForEditor;
    }

    public void clkSelectDropdown(int i) {
        UtilityFunctions.waitForElementUsingForLoopAndAssert(selectOption.get(i),5);
      UtilityFunctions.scrollInToviewUsingJavaScript(selectOption.get(i));
        UtilityFunctions.waitForElementAndClickable(selectOption.get(i));
//ckBoard.get(i).click();
    }

    public void clkUlTagnameDropdown(int i) {
        UtilityFunctions.waitForElementUsingForLoopAndAssert(UlTagnameForEditor.get(i),5);
      UtilityFunctions.scrollUpUsingPixelValue();
     //   UtilityFunctions.scrollInToviewUsingJavaScript(UlTagnameForEditor.get(i));
        UtilityFunctions.waitForElementAndClickable(UlTagnameForEditor.get(i));
//ckBoard.get(i).click();
    }

    public void assertStudentRole() {
        UtilityFunctions.waitForElementIsVisible(Student);
        UtilityFunctions.validatIsElementPresent(Student, "Student role not displayed");
        Listeners.addLogs("Student role is displayed ");
    }
    public void assertParent() {

        UtilityFunctions.validatIsElementPresent(Parent, "Parent role not displayed");
        Listeners.addLogs("Parent role is displayed ");
    }
    public void assertSchoolHeadOrOfficials() {

        UtilityFunctions.validatIsElementPresent(SchoolHeadOrOfficials, "SchoolHeadOrOfficials role not displayed");
        Listeners.addLogs("SchoolHeadOrOfficials role is displayed ");
    }
    public void assertOtherRole() {

        UtilityFunctions.validatIsElementPresent(OtherRole, "Other role not displayed");
        Listeners.addLogs("Other role is displayed ");
    }
    public void assertTeacherRole() {

        UtilityFunctions.validatIsElementPresent(Teacher, "Teacher role not displayed");
        Listeners.addLogs("Teacher role is displayed ");
    }

    public void waitContentIsSavedToastrToDisappear() {
        UtilityFunctions.waitForElementToDisappear(locationPopupToastrMsg);

    }

    public void updateBoardValueSelect(String frameworkName) throws InterruptedException {

        String boardXpath = SunbirdConstants.XPATH_CONTAINS + frameworkName + SunbirdConstants.XPATH_CONAINSCLOSEBRACKET;

        UtilityFunctions.findElementAndClick(boardXpath);
        Listeners.addLogs("Selected Board " + frameworkName);

    }

}
