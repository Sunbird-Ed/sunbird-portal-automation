package com.sunbird.PageObjects;

import com.sunbird.GenericLibrary.Listeners;
import com.sunbird.GenericLibrary.UtilityFunctions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class CreateQuestionSetPage {

	@FindBy(how=How.XPATH,using="//input[@placeholder='Name']")
	private WebElement questionSetName;

	@FindBy(how=How.XPATH,using="//label[contains(text(),'Board')]//following::select[@id='sb-dropdown']")
	private WebElement clickBoardDropDown;

	@FindBy(how=How.XPATH,using="//label[contains(text(),'Board')]//following::select[@id='sb-dropdown']//following::option[1]")
	private WebElement boardSelected;

	@FindBy(how=How.XPATH,using="//label[@data-title='Medium of Instruction for the Question Set']//following::select[1]")
	private WebElement clickMedium;

	@FindBy(how=How.XPATH,using="//label[@data-title='Medium of Instruction for the Question Set']//following::select[1]//following::option[1]")
	private WebElement mediumSelected;

	@FindBy(how=How.XPATH,using="//label[@data-title='Class of the Question Set']//following::select[1]")
	private WebElement clickClass;

	@FindBy(how=How.XPATH,using="//label[@data-title='Class of the Question Set']//following::select[1]//following::option[1]")
	private WebElement classSelected;

	@FindBy(how=How.XPATH,using="//label[@data-title='Subject of the Question Set']//following::select[1]")
	private WebElement clickSubject;

	@FindBy(how=How.XPATH,using="//label[@data-title='Subject of the Question Set']//following::select[1]//following::option[1]")
	private WebElement subjectSelected;


	@FindBy(how=How.XPATH,using="//label[@data-title='Audience of the Question Set']//following::select[1]")
	private WebElement audienceDropDown;

	@FindBy(how=How.XPATH,using="//label[@data-title='Audience of the Question Set']//following::option[2]")
	private WebElement selectAdminstractorValue;

	@FindBy(how=How.XPATH,using="//input[@name='hour']")
	private WebElement enterHour;
	@FindBy(how=How.XPATH,using="//input[@name='minute']")
	private WebElement enterMinute;
	@FindBy(how=How.XPATH,using="//input[@placeholder='Title']")
	private WebElement enterSectionName;
	@FindBy(how=How.XPATH,using="//textarea[@placeholder='Description']")
	private WebElement enterSectiondescription;
	@FindBy(how=How.XPATH,using="//*[@data-placeholder='Enter Instructions']")
	private WebElement enterSectionInstruction;
	@FindBy(how=How.XPATH,using="//button[contains(text(),'Create New')]")
	private WebElement createNew;
	@FindBy(how=How.XPATH,using="//div[contains(text(),'Multiple Choice Question ')]")
	private WebElement mcqTemplate;

	@FindBy(how=How.XPATH,using="//div[contains(text(),'Subjective Question')]")
	private WebElement subjectiveTemplate;

	@FindBy(how=How.XPATH,using="//button[contains(text(),'Next')]")
	private WebElement nextbutton;

	@FindBy(how=How.XPATH,using="//label[contains(text(),'Question')]//following::div[@role='textbox'][1]")
	private WebElement enterQuestionParagraph;

	@FindBy(how=How.XPATH,using="//label[contains(text(),'Question')]//following::div[@role='textbox'][2]")
	private WebElement enterOptionParagraph1;

	@FindBy(how=How.XPATH,using="//label[contains(text(),'Question')]//following::div[@role='textbox'][3]")
	private WebElement enterOptionParagraph2;

	@FindBy(how=How.XPATH,using="//label[@for='answer_2']")
	private WebElement checkCorrectAnswer;

	@FindBy(how=How.XPATH,using="//input[@placeholder='Title']")
	private WebElement enterQuestionTitle;

	@FindBy(how=How.XPATH,using="//input[@placeholder='Marks']")
	private WebElement enterMarks;

	@FindBy(how=How.XPATH,using="//button[contains(text(),'Save')]")
	private WebElement save;

	@FindBy(how=How.XPATH,using="//strong[contains(text(),'Question is created sucessfully')]")
	private WebElement assertQuestionCreatedToastrMsg;



	public void enterQuestionSetName(String name) {
		UtilityFunctions.waitForVisibilityOfWebElement(questionSetName);
		UtilityFunctions.waitToBeClickableAndSendKeys(questionSetName, name);
		Listeners.addLogs("entered questionSetName");

	}

	public void audienceDropdown() {
		UtilityFunctions.waitToBeClickableAndClick(audienceDropDown);
		Listeners.addLogs("clicked on audienceDropDown");
	}
	public void selectValueInAudienceDropdown() {
		UtilityFunctions.waitToBeClickableAndClick(selectAdminstractorValue);
		Listeners.addLogs("clicked on selectAdminstractorValue");
	}

	public void enterHour(String hrs)
	{
		UtilityFunctions.scrollInToviewUsingJavaScript(enterHour);
		UtilityFunctions.waitToBeClickableAndSendKeys(enterHour, hrs);
		Listeners.addLogs("Enter hours");

	}
	public void enterMinutes(String mins)
	{
		UtilityFunctions.waitForElementIsVisible(enterMinute);
		enterMinute.clear();
		UtilityFunctions.waitToBeClickableAndSendKeys(enterMinute, mins);
		Listeners.addLogs("Enter Mins");

	}
	public void enterSectionName(String name) {
		UtilityFunctions.waitForVisibilityOfWebElement(enterSectionName);
		UtilityFunctions.waitToBeClickableAndSendKeys(enterSectionName, name);
		Listeners.addLogs("entered questionSetName");

	}
	public void enterSectionDescriptions(String descName) {
		UtilityFunctions.waitForVisibilityOfWebElement(enterSectiondescription);
		UtilityFunctions.waitToBeClickableAndSendKeys(enterSectiondescription, descName);
		Listeners.addLogs("entered sectionDescription");

	}
	public void enterSectionInstructions(String instructions) {
		UtilityFunctions.waitForVisibilityOfWebElement(enterSectionInstruction);
		UtilityFunctions.waitToBeClickableAndSendKeys(enterSectionInstruction, instructions);
		Listeners.addLogs(" enterSection Instruction");
	}

	public void CreateNew() {
		UtilityFunctions.waitForVisibilityOfWebElement(createNew);
		UtilityFunctions.waitToBeClickableAndClick(createNew);
		Listeners.addLogs("clicked on createNew");
	}

	public void mcqTemplate() {
		UtilityFunctions.waitForVisibilityOfWebElement(mcqTemplate);
		UtilityFunctions.waitToBeClickableAndClick(mcqTemplate);
		Listeners.addLogs("clicked on mcqTemplate");
	}
	public void subjectiveTemplate() {
		UtilityFunctions.waitForVisibilityOfWebElement(subjectiveTemplate);
		UtilityFunctions.waitToBeClickableAndClick(subjectiveTemplate);
		Listeners.addLogs("clicked on subjectiveTemplate");
	}
	public void nextButton() {
		UtilityFunctions.waitForVisibilityOfWebElement(nextbutton);
		UtilityFunctions.waitToBeClickableAndClick(nextbutton);
		Listeners.addLogs("clicked on nextbutton");
	}

	public void questionParagraph(String paragraph) {
		UtilityFunctions.waitForVisibilityOfWebElement(enterQuestionParagraph);
		UtilityFunctions.waitToBeClickableAndSendKeys(enterQuestionParagraph, paragraph);
		Listeners.addLogs("enterQuestionParagraph");
	}
	public void optionsParagraph1(String paragraph) {
		UtilityFunctions.waitForVisibilityOfWebElement(enterOptionParagraph1);
		UtilityFunctions.waitToBeClickableAndSendKeys(enterOptionParagraph1, paragraph);
		Listeners.addLogs("enterOptionParagraph1");
	}
	public void optionsParagraph2(String paragraph) {
		UtilityFunctions.waitForVisibilityOfWebElement(enterOptionParagraph2);
		UtilityFunctions.waitToBeClickableAndSendKeys(enterOptionParagraph2, paragraph);
		Listeners.addLogs("enterOptionParagraph2");
	}
	public void chooseCorrectAnswer() {
		UtilityFunctions.waitForVisibilityOfWebElement(checkCorrectAnswer);
		UtilityFunctions.waitToBeClickableAndClick(checkCorrectAnswer);
		Listeners.addLogs("checkCorrectAnswer");
	}
	public void enterQuestionDetailsTitleName(String title) {
		UtilityFunctions.waitForVisibilityOfWebElement(enterQuestionTitle);
		UtilityFunctions.waitToBeClickableAndSendKeys(enterQuestionTitle, title);
		Listeners.addLogs("enterQuestionTitle");
	}
	public void enterMarks(String marks) {
		UtilityFunctions.waitForVisibilityOfWebElement(enterMarks);
		UtilityFunctions.waitToBeClickableAndSendKeys(enterMarks, marks);
		Listeners.addLogs("enterMarks");
	}
	public void saveButton() {
		UtilityFunctions.waitForVisibilityOfWebElement(save);
		UtilityFunctions.waitToBeClickableAndClick(save);
		Listeners.addLogs("save");
	}
	public String assertQuestionCreatedToastr() {
		UtilityFunctions.waitForVisibilityOfWebElement(assertQuestionCreatedToastrMsg);
		String getActualText = UtilityFunctions.getTextFromElement(assertQuestionCreatedToastrMsg);
		return getActualText;
	}
	public void waitQuestionCreatedToastrToDisappear() {
		UtilityFunctions.waitForElementToDisappear(assertQuestionCreatedToastrMsg);
	}


	public void clickBoardDropdown() {

		UtilityFunctions.scrollDownUsingPixelValue();
		//  UtilityFunctions.scrollDownUsingPixelValue();

		//  UtilityFunctions.waitForVisibilityOfWebElement(clickBoardDropDown);
		UtilityFunctions.scrollInToviewUsingJavaScript(clickBoardDropDown);
		UtilityFunctions.waitToBeClickableAndClick(clickBoardDropDown);
		Listeners.addLogs("clickBoardDropDown");
	}
	public void selectBoardValue() {
		UtilityFunctions.waitToBeClickableAndClick(boardSelected);
		Listeners.addLogs("boardSelected");
	}

	public void clickMediumDropdown() {
		UtilityFunctions.waitToBeClickableAndClick(clickMedium);
		Listeners.addLogs("clickMedium");
	}
	public void selectMediumValue() {
		UtilityFunctions.waitToBeClickableAndClick(mediumSelected);
		Listeners.addLogs("mediumSelected");
	}

	public void clickClassDropdown() {
		UtilityFunctions.waitToBeClickableAndClick(clickClass);
		Listeners.addLogs("clickClass");
	}
	public void selectClassValue() {
		UtilityFunctions.waitToBeClickableAndClick(classSelected);
		Listeners.addLogs("classSelected");
	}

	public void clickSubjectDropdown() {
		UtilityFunctions.waitToBeClickableAndClick(clickSubject);
		Listeners.addLogs("clickSubject");
	}
	public void selectSubjectValue() {
		UtilityFunctions.waitToBeClickableAndClick(subjectSelected);
		Listeners.addLogs("subjectSelected");
	}

}
