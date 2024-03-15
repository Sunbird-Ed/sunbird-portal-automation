package com.sunbird.PageObjects;

import com.sunbird.GenericLibrary.BaseTestConfig;
import com.sunbird.GenericLibrary.Listeners;
import com.sunbird.GenericLibrary.UtilityFunctions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomeTabPage extends BaseTestConfig {

		@FindBy(how = How.XPATH, using = "//span[contains(text(),'Continue Learning')]")
		private WebElement continueLearningSection;

		@FindBy(how = How.XPATH, using = "//span[contains(text(),'Continue Learning')]//following::h4[1]")
		private WebElement assertContinueLearningContent;

		@FindBy(how = How.XPATH, using = "//div[contains(text(),'Browse by Subjects')]")
		private WebElement browseBySubjectsSection;

		@FindBy(how = How.XPATH, using = "//div[contains(text(),'Browse by Subjects')]//following::label[1]")
			private WebElement clickSubSectionInBrowseBySubjects;

		@FindBy(how = How.XPATH, using = "//div[@class='sb--card__meta']")
		private WebElement assertContent;

		@FindBy(how = How.XPATH, using = "//div[contains(text(),'Browse by Categories')]")
		private WebElement browseByCategories;

		@FindBy(how = How.XPATH, using = "//div[contains(text(),'Browse by Categories')]//following::label[1]")
		private WebElement clickSubSectionInBrowseByCategories;

		@FindBy(how = How.XPATH, using = "//div[contains(text(),' Recently published courses ')]")
		private WebElement recentlyPublishedSection;

		@FindBy(how = How.XPATH, using = "//div[contains(text(),' Recently published courses ')]//following::h4[1]")
		private WebElement assertRecentlyPublishedCourseContent;


	public void validateContinueLearningSection() {
		UtilityFunctions.waitForVisibilityOfWebElement(continueLearningSection);
		UtilityFunctions.validatIsElementPresent(continueLearningSection, "ContinueLearning is not Displayed");
			UtilityFunctions.validatIsElementPresent(assertContinueLearningContent, "ContinueLearningContent  is not Displayed");
		Listeners.addLogs("Validated content in ContinueLearningSection");
		}

	public void clickContentInBrowseBySubjects() {
		UtilityFunctions.scrollInToviewUsingJavaScript(browseBySubjectsSection);
		UtilityFunctions.validatIsElementPresent(browseBySubjectsSection, "browseBySubjectsSection  is not Displayed");
		UtilityFunctions.waitToBeClickableAndClick(clickSubSectionInBrowseBySubjects);
		Listeners.addLogs("Clicked on browseBySubjects");

	}
	public void asserContentIsDisplayed() throws InterruptedException {


//		UtilityFunctions.validatIsElementPresent(assertContent, "content is not Displayed");
//		Listeners.addLogs("validated contents");
//		driver.navigate().back();
//		Listeners.addLogs("clicked on back button");


UtilityFunctions.waitForElementIsVisible(assertContent);
		UtilityFunctions.waitForElementUsingForLoopAndAssert(assertContent,5);
		UtilityFunctions.validatIsElementPresent(assertContent, "content is not Displayed");
		//UtilityFunctions.waitForElementUsingForLoopAndAssert(assertContent,5);
		Listeners.addLogs("validated content");
	driver.navigate().back();
//		Listeners.addLogs("clicked on back button");
	}
	public void clickContentInBrowseByCategories() {
		UtilityFunctions.waitForVisibilityOfWebElement(browseByCategories);
		UtilityFunctions.scrollInToviewUsingJavaScript(browseByCategories);
		UtilityFunctions.validatIsElementPresent(browseByCategories, "browseByCategoriesSection  is not Displayed");
		UtilityFunctions.waitToBeClickableAndClick(clickSubSectionInBrowseByCategories);
		Listeners.addLogs("Clicked on BrowseByCategories");

	}
	public void validateContentInRecentlyPublishedSection() {
		UtilityFunctions.waitForVisibilityOfWebElement(recentlyPublishedSection);
		UtilityFunctions.scrollInToviewUsingJavaScript(recentlyPublishedSection);
		UtilityFunctions.validatIsElementPresent(recentlyPublishedSection, "recentlyPublishedSection  is not Displayed");
		UtilityFunctions.validatIsElementPresent(assertRecentlyPublishedCourseContent, "assertRecentlyPublishedCourseContent  is not Displayed");
		Listeners.addLogs("validated content in RecenltyPublishedSection");

	}

	}
   