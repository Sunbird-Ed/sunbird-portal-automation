package com.sunbird.PageObjects;

import com.sunbird.GenericLibrary.Listeners;
import com.sunbird.GenericLibrary.UtilityFunctions;
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
}
