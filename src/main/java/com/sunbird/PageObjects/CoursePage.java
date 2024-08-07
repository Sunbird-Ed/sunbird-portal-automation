package com.sunbird.PageObjects;

import com.sunbird.GenericLibrary.Listeners;
import com.sunbird.GenericLibrary.UtilityFunctions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class CoursePage {

	@FindBy(how=How.XPATH,using="//input[@placeholder='Title']")
	private WebElement enterTitleName;

	@FindBy(how=How.XPATH,using="//input[@aria-label='Enter Keywords']")
	private WebElement keyWords;

	@FindBy(how=How.XPATH,using="//label[contains(text(),'Course Type')]//following::select")
	private WebElement courseTypedropDown;

	@FindBy(how=How.XPATH,using="//label[contains(text(),'Course Type')]//following::option[2]")
	private WebElement selectCourseTypeValue;

	@FindBy(how=How.XPATH,using="//label[contains(text(),'Subjects covered in the course')]//following::select")
	private WebElement subjectCoveredDropdown;

	@FindBy(how=How.XPATH,using="//label[contains(text(),'Subjects covered in the course')]//following::option[2]")
	private WebElement selectSbjectCoveredDropdown;

	@FindBy(how=How.XPATH,using="//label[contains(text(),'Subjects covered in the course')]//following::select[1]")
	private WebElement clickSubjectCoveredDropdown;

	@FindBy(how=How.XPATH,using="//label[contains(text(),'Subjects covered in the course')]//following::select[1]")
	private WebElement selectSubjectCoveredValue;

	@FindBy(how=How.XPATH,using="//label[contains(text(),'Course Type')]//following::option[3]")
	private WebElement selectCourseTypeValueK2;

	public void enterCourseTitleName(String randomCourseName) throws InterruptedException {
		UtilityFunctions.waitToBeClickableAndSendKeys(enterTitleName, randomCourseName);

	}
	public void enterCourseKeywords(String randomKeywordName) throws InterruptedException {
		UtilityFunctions.waitToBeClickableAndSendKeys(keyWords, randomKeywordName);
		UtilityFunctions.pressEnterKeyOnWebElement(keyWords);
	}
	public void clickCourseType() {
		UtilityFunctions.scrollDownUsingPixelValue();
		UtilityFunctions.waitToBeClickableAndClick(courseTypedropDown);
		Listeners.addLogs("courseTypedropDown");
	}
	public void selectCourseTypeValue() {
		UtilityFunctions.waitToBeClickableAndClick(selectCourseTypeValue);
		Listeners.addLogs("selectCourseTypeValue");
	}
	public void clicksubjectCoveredDropdown() throws InterruptedException {
		Thread.sleep(5000);
		UtilityFunctions.scrollDownUsingPixelValue();
		UtilityFunctions.waitToBeClickableAndClick(subjectCoveredDropdown);
		Listeners.addLogs("subjectCoveredDropdown");
	}
	public void selectSubjectCoveredvalue() {
		UtilityFunctions.waitToBeClickableAndClick(selectSbjectCoveredDropdown);
		Listeners.addLogs("selectSbjectCoveredDropdown");
	}

	public void selectCourseK2TypeValue() {
		UtilityFunctions.waitToBeClickableAndClick(selectCourseTypeValueK2);
		Listeners.addLogs("selectCourseTypeValueK2");
	}

}
