package com.sunbird.PageObjects;

import com.sunbird.GenericLibrary.Listeners;
import com.sunbird.GenericLibrary.UtilityFunctions;
import com.sunbird.PageActions.Agriculture.AgricultureOnBoardingActions;
import com.sunbird.PageActions.BMC.BmcOnBoardingActions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.slf4j.helpers.Util;

import java.util.List;

public class DashboardFilterPage {

    @FindBy(how = How.XPATH, using = "//label[@for='board']//following::span[1]")
    private WebElement boardFilterDropdown;

    @FindBy(how = How.XPATH, using = "//label[@for='medium']//following::span[1]")
    private WebElement mediumFilterDropdown;

    @FindBy(how = How.XPATH, using = "//label[@for='gradeLevel']//following::span[1]")
    private WebElement gradeFilterDropdown;
    @FindBy(how = How.XPATH, using = "//label[@for='subject']//following::span[1]")
    private WebElement subjectFilterDropdown;

    @FindBy(how = How.XPATH, using = "//label[@for='audience']//following::span[1]")
    private WebElement publishedUserTypeFilterDropdown;

    @FindBy(how = How.XPATH, using = "//label[@for='board']//following::label[@for='medium']//following::span[1]")
    private WebElement assertMediumOrder;

    @FindBy(how = How.XPATH, using = "//label[@for='medium']//following::label[@for='gradeLevel']//following::span[1]")
    private WebElement assertClassOrder;

    @FindBy(how = How.XPATH, using = "//label[@for='gradeLevel']//following::label[@for='subject']//following::span[1]")
    private WebElement assertsubjectOrder;

    @FindBy(how = How.XPATH, using = "//button[contains(text(),'Reset ')]")
    private WebElement resetButton;

    @FindBy(how = How.XPATH, using = "//mat-option[@aria-label='other']")
    private WebElement selectOtherPublishedType;

    @FindBy(how = How.XPATH, using = "//mat-option[@aria-label='student']")
    private WebElement selectStudentPublishedType;

    @FindBy(how = How.XPATH, using = "//mat-option[@aria-label='teacher']")
    private WebElement selectTeacherPublishedType;

    @FindBy(how = How.XPATH, using = "//div[@class='sb--card__info']")
    private WebElement assertContent;

    public void assertAllTheFilters() {
        UtilityFunctions.waitForElementUsingForLoopAndAssert(boardFilterDropdown, 4);
        UtilityFunctions.waitForElementIsVisible(boardFilterDropdown);
        UtilityFunctions.validatIsElementPresent(boardFilterDropdown, "boardFilterDropdown not displayed");
        Listeners.addLogs("boardFilterDropdown is displayed ");

        UtilityFunctions.waitForElementIsVisible(mediumFilterDropdown);
        UtilityFunctions.validatIsElementPresent(mediumFilterDropdown, "mediumFilterDropdown not displayed");
        Listeners.addLogs("mediumFilterDropdown is displayed ");

        UtilityFunctions.waitForElementIsVisible(gradeFilterDropdown);
        UtilityFunctions.validatIsElementPresent(gradeFilterDropdown, "gradeFilterDropdown not displayed");
        Listeners.addLogs("gradeFilterDropdown is displayed ");

        UtilityFunctions.waitForElementIsVisible(subjectFilterDropdown);
        UtilityFunctions.validatIsElementPresent(subjectFilterDropdown, "subjectFilterDropdown not displayed");
        Listeners.addLogs("subjectFilterDropdown is displayed ");
    }

    public void assertOrderofFiltres() {
        UtilityFunctions.waitForElementUsingForLoopAndAssert(assertMediumOrder, 4);
        UtilityFunctions.validatIsElementPresent(assertMediumOrder, "assertMediumOrder not displayed");
        Listeners.addLogs("assertMediumOrder is displayed ");
        UtilityFunctions.waitForElementIsVisible(assertClassOrder);
        UtilityFunctions.validatIsElementPresent(assertClassOrder, "assertClassOrder not displayed");
        Listeners.addLogs("assertClassOrder is displayed ");
        UtilityFunctions.scrollInToviewUsingJavaScript(assertsubjectOrder);
        UtilityFunctions.waitForElementIsVisible(assertClassOrder);
        UtilityFunctions.validatIsElementPresent(assertsubjectOrder, "assertsubjectOrder not displayed");
        Listeners.addLogs("assertsubjectOrder is displayed ");
    }

    public void clickPublishedUserType() {
     //   UtilityFunctions.scrollInToviewUsingJavaScript(publishedUserTypeFilterDropdown);
        UtilityFunctions.scrollDownUsingPixelValue();
        UtilityFunctions.waitForElementAndClickable(publishedUserTypeFilterDropdown);
        Listeners.addLogs("clicked on publishedUserType");

    }

    public void resetBtn() {
        UtilityFunctions.scrollUpUsingPixelValue();
        UtilityFunctions.waitForElementAndClickable(resetButton);
        Listeners.addLogs("clicked on resetButton");

    }

    public void selectPublishedType(String publishedType) {
        switch (publishedType) {
            case "Teacher":
                UtilityFunctions.waitForElementAndClickable(selectTeacherPublishedType);
                Listeners.addLogs("Selected Teacher");
                break;
            case "Student":
                UtilityFunctions.waitForElementAndClickable(selectStudentPublishedType);
                Listeners.addLogs("Selected Student");

                break;
            case "Other":
                UtilityFunctions.waitForElementAndClickable(selectOtherPublishedType);
                Listeners.addLogs("Selected Other");

                break;
        }

    }

    public void assertContentDisplayed() {
        UtilityFunctions.waitForElementUsingForLoopAndAssert(assertContent, 4);
        UtilityFunctions.validatIsElementPresent(assertContent, "assertContent not displayed");
        Listeners.addLogs("assertContent is displayed ");
    }
}
