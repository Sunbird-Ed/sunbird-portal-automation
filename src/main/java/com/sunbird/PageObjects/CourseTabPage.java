package com.sunbird.PageObjects;

import com.sunbird.GenericLibrary.BaseTestConfig;
import com.sunbird.GenericLibrary.Listeners;
import com.sunbird.GenericLibrary.UtilityFunctions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class CourseTabPage extends BaseTestConfig {

		@FindBy(how = How.XPATH, using = "//button[contains(text(),' View all ')]")
		private WebElement viewAll;

		@FindBy(how = How.XPATH, using = "//button[contains(text(),'Close')]")
		private WebElement closeButton;

		@FindBy(how = How.XPATH, using = "//div[@class='img-container']")
		private WebElement assertImageInCard;

		@FindBy(how = How.XPATH, using = "//*[contains(@class,'sb--card__title')]")
			private WebElement assertTitleInCard;

		@FindBy(how = How.XPATH, using = "//*[contains(@class,'sb--card__type')]")
		private WebElement assertCategoryInCard;

		@FindBy(how = How.XPATH, using = "//*[contains(@class,'sb--card__type')]//following::span[1]")
		private WebElement assertCategory2InCard;

		@FindBy(how = How.XPATH, using = "//*[contains(@class,'sb--card__type')]//following::span[contains(text(),'Subject:')]")
		private WebElement assertSubjectInCard;

		@FindBy(how = How.XPATH, using = "//*[contains(@class,'sb--card__type')]//following::span[contains(text(),'Publisher:')]")
		private WebElement assertPublisherInCard;


	public void viewAllbtn() {
		UtilityFunctions.waitForElementAndClickable(viewAll);
		Listeners.addLogs("clicked on viewAll");
	}
	public void closeBtn() {
		UtilityFunctions.waitForElementAndClickable(closeButton);
		Listeners.addLogs("clicked on closeButton");
	}
	public void validateAllDetailsInCourseCard() {
		UtilityFunctions.waitForVisibilityOfWebElement(assertImageInCard);
		UtilityFunctions.validatIsElementPresent(assertImageInCard, "assertImageInCard is not Displayed");
			UtilityFunctions.validatIsElementPresent(assertTitleInCard, "assertTitleInCard  is not Displayed");
		UtilityFunctions.validatIsElementPresent(assertCategoryInCard, "assertCategoryInCard  is not Displayed");
		UtilityFunctions.validatIsElementPresent(assertCategory2InCard, "assertCategory2InCard  is not Displayed");
		UtilityFunctions.validatIsElementPresent(assertSubjectInCard, "assertSubjectInCard  is not Displayed");
		UtilityFunctions.validatIsElementPresent(assertPublisherInCard, "assertPublisherInCard  is not Displayed");
		Listeners.addLogs("Validated all the details displayed in coursecard");
		}



	}
   