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


    public void assertAllTheFilters()
    {
        UtilityFunctions.waitForElementUsingForLoopAndAssert(boardFilterDropdown,4);
        UtilityFunctions.waitForElementIsVisible(boardFilterDropdown);
        UtilityFunctions.validatIsElementPresent(boardFilterDropdown,"boardFilterDropdown not displayed");
        Listeners.addLogs("boardFilterDropdown is displayed ");

        UtilityFunctions.waitForElementIsVisible(mediumFilterDropdown);
        UtilityFunctions.validatIsElementPresent(mediumFilterDropdown,"mediumFilterDropdown not displayed");
        Listeners.addLogs("mediumFilterDropdown is displayed ");

        UtilityFunctions.waitForElementIsVisible(gradeFilterDropdown);
        UtilityFunctions.validatIsElementPresent(gradeFilterDropdown,"gradeFilterDropdown not displayed");
        Listeners.addLogs("gradeFilterDropdown is displayed ");

        UtilityFunctions.waitForElementIsVisible(subjectFilterDropdown);
        UtilityFunctions.validatIsElementPresent(subjectFilterDropdown,"subjectFilterDropdown not displayed");
        Listeners.addLogs("subjectFilterDropdown is displayed ");
    }

}

