package com.sunbird.PageObjects;

import com.sunbird.GenericLibrary.Listeners;
import com.sunbird.GenericLibrary.SunbirdConstants;
import com.sunbird.GenericLibrary.UtilityFunctions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class CreateQuestionSetPage {

	@FindBy(how = How.XPATH, using = "//input[@placeholder='Name']")
	private WebElement questionSetName;

	@FindBy(how = How.XPATH, using = "//label[contains(text(),'Board')]//following::select[@id='sb-dropdown']")
	private WebElement clickBoardDropDown;

	@FindBy(how = How.XPATH, using = "//label[contains(text(),'Board')]//following::select[@id='sb-dropdown']//following::option[1]")
	private WebElement boardSelected;

	@FindBy(how = How.XPATH, using = "//label[@data-title='Medium of Instruction for the Question Set']//following::select[1]")
	private WebElement clickMedium;

	@FindBy(how = How.XPATH, using = "//label[@data-title='Medium of Instruction for the Question Set']//following::select[1]//following::option[1]")
	private WebElement mediumSelected;

	@FindBy(how = How.XPATH, using = "//label[@data-title='Class of the Question Set']//following::select[1]")
	private WebElement clickClass;

	@FindBy(how = How.XPATH, using = "//label[@data-title='Class of the Question Set']//following::select[1]//following::option[1]")
	private WebElement classSelected;

	@FindBy(how = How.XPATH, using = "//label[@data-title='Subject of the Question Set']//following::select[1]")
	private WebElement clickSubject;

	@FindBy(how = How.XPATH, using = "//label[@data-title='Subject of the Question Set']//following::select[1]//following::option[1]")
	private WebElement subjectSelected;


	@FindBy(how = How.XPATH, using = "//label[@data-title='Audience of the Question Set']//following::select[1]")
	private WebElement audienceDropDown;

	@FindBy(how = How.XPATH, using = "//label[@data-title='Audience of the Question Set']//following::option[2]")
	private WebElement selectAdminstractorValue;

	@FindBy(how = How.XPATH, using = "//input[@name='hour']")
	private WebElement enterHour;
	@FindBy(how = How.XPATH, using = "//input[@name='minute']")
	private WebElement enterMinute;
	@FindBy(how = How.XPATH, using = "//input[@placeholder='Title']")
	private WebElement enterSectionName;
	@FindBy(how = How.XPATH, using = "//textarea[@placeholder='Description']")
	private WebElement enterSectiondescription;
	@FindBy(how = How.XPATH, using = "//*[@data-placeholder='Enter Instructions']")
	private WebElement enterSectionInstruction;
	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Create New')]")
	private WebElement createNew;
	@FindBy(how = How.XPATH, using = "//div[contains(text(),'Multiple Choice Question ')]")
	private WebElement mcqTemplate;

	@FindBy(how = How.XPATH, using = "//div[contains(text(),'Subjective Question')]")
	private WebElement subjectiveTemplate;

	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Next')]")
	private WebElement nextbutton;

	@FindBy(how = How.XPATH, using = "//label[contains(text(),'Question')]//following::div[@role='textbox'][1]")
	private WebElement enterQuestionParagraph;

	@FindBy(how = How.XPATH, using = "//label[contains(text(),'Question')]//following::div[@role='textbox'][2]")
	private WebElement enterOptionParagraph1;

	@FindBy(how = How.XPATH, using = "//label[contains(text(),'Question')]//following::div[@role='textbox'][3]")
	private WebElement enterOptionParagraph2;

	@FindBy(how = How.XPATH, using = "//label[@for='answer_2']")
	private WebElement checkCorrectAnswer;

	@FindBy(how = How.XPATH, using = "//input[@placeholder='Title']")
	private WebElement enterQuestionTitle;

	@FindBy(how = How.XPATH, using = "//input[@placeholder='Marks']")
	private WebElement enterMarks;

	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Save')]")
	private WebElement save;

	@FindBy(how = How.XPATH, using = "//strong[contains(text(),'Question is created sucessfully')]")
	private WebElement assertQuestionCreatedToastrMsg;

	@FindBy(how = How.XPATH, using = "//label[@data-title='summaryType']//following::select[1]")
	private WebElement summaryDropDown;

	@FindBy(how = How.XPATH, using = "(//option[contains(text(),'Duration')])[1]")
	private WebElement durationSummaryType;

	@FindBy(how = How.XPATH, using = "(//option[contains(text(),'Score')])[1]")
	private WebElement ScoreSummaryType;

	@FindBy(how = How.XPATH, using = "//option[contains(text(),'Score & Duration')]")
	private WebElement ScoreAndDurationSummaryType;

	@FindBy(how=How.XPATH,using="//option[contains(text(),'Complete')]")
	private WebElement completeSummaryType;

	@FindBy(how=How.XPATH,using="//button[contains(@class,'disabled')][contains(text(),' Add Sibling ')]//following::button[1]")
	private WebElement addChildButtonDisabled;

	@FindBy(how=How.XPATH,using="//label[contains(text(),'Question')]//following::button[1]")
	private WebElement clickOnQuestionImageIcon;

	@FindBy(how=How.XPATH,using="//button[contains(text(),'Upload and Use')]")
	private WebElement uploadAndUseButton;

	@FindBy(how=How.XPATH,using="//input[@type='file']")
	private WebElement uploadFromComputerButton;

	@FindBy(how=How.XPATH,using="//button[contains(text(),'Cancel')]//following::button[contains(text(),' Upload and Use ')]")
	private WebElement uploadAndUseButton2;

	@FindBy(how=How.XPATH,using="//label[contains(text(),'Answers')]//following::i[2]")
	private WebElement clickOnAnswerImageIcon;

	@FindBy(how=How.XPATH,using="//span[contains(text(),'Solution')]//following::div[5]")
	private WebElement selectVideoType;

	@FindBy(how=How.XPATH,using="//div[contains(text(),' Text+Image ')]")
	private WebElement ClickOnTextAndImageOption;

	@FindBy(how=How.XPATH,using="//span[contains(text(),'Solution')]//following::i[2]")
	private WebElement ClickOnSolutionImageIcon;

	@FindBy(how=How.XPATH,using="//div[contains(text(),'Choose type')]")
	private WebElement ClickOnChooseDropDown;

	@FindBy(how=How.XPATH,using="//label[contains(text(),'Options')]//following::button[@data-tooltip='Add image'][1]")
	private WebElement ClickOnOptionImageIcon1;

	@FindBy(how=How.XPATH,using="//label[contains(text(),'Options')]//following::button[@data-tooltip='Add image'][2]")
	private WebElement ClickOnOptionImageIcon2;

	@FindBy(how=How.XPATH,using="//strong[contains(text(),'Asset Successfully Uploaded...')]")
	private WebElement assertUploadVideoToastrMsg;

	@FindBy(how=How.XPATH,using="//p[@data-placeholder='Enter Instructions']")
	private WebElement instructionField;

	@FindBy(how=How.XPATH,using="//button[contains(text(),' Preview ')]")
	private WebElement previewButton;

	@FindBy(how=How.XPATH,using="//div[@title='next slide']")
	private WebElement clickOnnextButton;

	@FindBy(how=How.XPATH,using="//div[@class='replay-section']")
	private WebElement clickOnReplyButton;

	@FindBy(how=How.XPATH,using="(//p[contains(text(),'A group of words containing a subject and a verb')])[2]")
	private WebElement instructionText;

	@FindBy(how=How.XPATH,using="//label[contains(text(),'Title')]")
	private WebElement Titletext;

	@FindBy(how=How.XPATH,using="//label[contains(text(),'Title')]//following::input[1]")
	private WebElement Titlefield;

	@FindBy(how=How.XPATH,using="//label[contains(text(),'Description')]")
	private WebElement Descriptiontext;

	@FindBy(how=How.XPATH,using="//label[contains(text(),'Description')]//following::textarea[1]")
	private WebElement DescriptionField;

	@FindBy(how=How.XPATH,using="//label[contains(text(),'Instructions')]")
	private WebElement Instructiontext;

	@FindBy(how=How.XPATH,using="//label[contains(text(),'Instructions')]//following::p[1]")
	private WebElement InstructionField;

	@FindBy(how=How.XPATH,using="//label[contains(text(),'Count of questions to be displayed in this section  ')]")
	private WebElement Countofquestiontext;

	@FindBy(how=How.XPATH,using="//label[contains(text(),'Count of questions to be displayed in this section ')]//following::select")
	private WebElement CountofquestionField;

	@FindBy(how=How.XPATH,using="//label[contains(text(),'Shuffle Questions ')]")
	private WebElement ShuffleQuestiontext;

	@FindBy(how=How.XPATH,using="//label[contains(text(),'Count of questions to be displayed in this section  ')]//following::input[1]")
	private WebElement ShuffleQuestiontField;

	@FindBy(how=How.XPATH,using="//label[contains(text(),'Show Question Feedback ')]")
	private WebElement showquestionfeedbacktext;

	@FindBy(how=How.XPATH,using="//input[@id='show-feedback']")
	private WebElement showquestionfeedbackField;

	@FindBy(how=How.XPATH,using="//label[contains(text(),'Show Solution ')]")
	private WebElement showsolutiontext;
	@FindBy(how=How.XPATH,using="//input[@id='show-solution']")
	private WebElement showsolutionField;

	@FindBy(how=How.XPATH,using="//button[contains(text(),'Reset')]")
	private WebElement clickOnResetButton;

	@FindBy(how=How.XPATH,using="//div[contains(text(),'most relevant question')]//following::input[2]")
	private WebElement selectQuestionFromList;

	@FindBy(how=How.XPATH,using="//a[contains(text(),'Change filters')]//following::div[3]")
	private WebElement nameOfTheQuestion;

	@FindBy(how=How.XPATH,using="//button[contains(text(),' Add question ')]")
	private WebElement addQuestionButton;

	@FindBy(how=How.XPATH,using="(//span[@role='button'])[2]")
	private WebElement clickOnSection;

	@FindBy(how=How.XPATH,using="//div[@class='UpReviewHeader']")
	private WebElement questionsetName;

	@FindBy(how=How.XPATH,using="//button[contains(text(),'Grid')]")
	private WebElement gridLayout;

	@FindBy(how=How.XPATH,using="//span[contains(text(),'Add option')]")
	private WebElement addOption;

	@FindBy(how=How.XPATH,using="//label[contains(text(),'Question')]//following::div[@role='textbox'][4]")
	private WebElement enterOptionParagraph3;

	@FindBy(how=How.XPATH,using="//label[contains(text(),'Question')]//following::div[@role='textbox'][5]")
	private WebElement enterOptionParagraph4;

	@FindBy(how=How.XPATH,using="//div[contains(@class,'layoutImageQAGridMCQ')]")
	private WebElement assertGridLayout;

	@FindBy(how=How.XPATH,using="//button[contains(text(),'Edit')]")
	private WebElement editButton;

	@FindBy(how=How.XPATH,using="//button[contains(text(),'Vertical')]")
	private WebElement verticalLayout;

	@FindBy(how=How.XPATH,using="//button[contains(text(),'Horizontal')]")
	private WebElement horizontalLayout;

	@FindBy(how=How.XPATH,using="//div[@class='mcq-horizontal']")
	private WebElement assertHorizontalLayout;

	@FindBy(how=How.XPATH,using="//div[@class='mcq-vertical']")
	private WebElement assertVerticalLayout;

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

	public void enterHour(String hrs) {
		UtilityFunctions.scrollInToviewUsingJavaScript(enterHour);
		UtilityFunctions.waitToBeClickableAndSendKeys(enterHour, hrs);
		Listeners.addLogs("Enter hours");

	}

	public void enterMinutes(String mins) {
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

	public void summaryDropDown() {
		UtilityFunctions.clickUsingJavaScriptExecutor(summaryDropDown);
		Listeners.addLogs("clicked on summaryDropDown");
	}

	public void assertDurationSummaryType() {
		UtilityFunctions.waitForElementIsVisible(durationSummaryType);
		UtilityFunctions.validatIsElementPresent(durationSummaryType, "durationSummaryType is not displayed");
		Listeners.addLogs("durationSummaryType is displayed");

	}

	public void assertScoreSummaryType() {
		UtilityFunctions.waitForElementIsVisible(ScoreSummaryType);
		UtilityFunctions.validatIsElementPresent(ScoreSummaryType, "ScoreSummaryType is not displayed");
		Listeners.addLogs("ScoreSummaryType is displayed");

	}

	public void assertScoreAndDurationSummaryType() {
		UtilityFunctions.waitForElementIsVisible(ScoreAndDurationSummaryType);
		UtilityFunctions.validatIsElementPresent(ScoreAndDurationSummaryType, "ScoreAndDurationSummaryType is not displayed");
	}

	public void assertCompleteSummaryType() {
		UtilityFunctions.waitForElementIsVisible(completeSummaryType);
		UtilityFunctions.validatIsElementPresent(completeSummaryType, "completeSummaryType is not displayed");
		Listeners.addLogs("completeSummaryType is displayed");

	}
	public void addChildButtonDisabled() {
		UtilityFunctions.validatIsElementNotPresent(addChildButtonDisabled);
		Listeners.addLogs("Add child button is disabled");

	}
	public void addImageInQuestionField() {
		UtilityFunctions.waitToBeClickableAndClick(clickOnQuestionImageIcon);
		Listeners.addLogs("Add image to question field ");
	}
	public void clickOnUploadButton() {
		UtilityFunctions.clickUsingJavaScriptExecutor(uploadAndUseButton);
		Listeners.addLogs("Click on UploadButton");
	}
	public void uploadImageFile(String filepath) throws InterruptedException {
		UtilityFunctions.uploadSendKeys(uploadFromComputerButton, filepath);
		Listeners.addLogs("uploaded file");
	}
	public void clickOnUploadbutton2() {
		UtilityFunctions.clickUsingJavaScriptExecutor(uploadAndUseButton2);
		Listeners.addLogs("Click on upload button");

	}
	public void addImageInAnswerField() {
		UtilityFunctions.waitForElementUsingForLoop(clickOnAnswerImageIcon, 4);
		UtilityFunctions.waitToBeClickableAndClick(clickOnAnswerImageIcon);
		Listeners.addLogs("Add image to Answer field");

	}
	public void selectVideoType() {
		UtilityFunctions.waitToBeClickableAndClick(selectVideoType);
		Listeners.addLogs("Click on video Type");

	}
	public void selectTextAndImageType() {
		UtilityFunctions.waitToBeClickableAndClick(ClickOnTextAndImageOption);
		Listeners.addLogs("Click on text and image option");

	}
	public void AddImageInSolutionField() {
		UtilityFunctions.waitToBeClickableAndClick(ClickOnSolutionImageIcon);
		Listeners.addLogs("Add image to solution field");

	}
	public void clickOnChooseTypeDropDown() {
		UtilityFunctions.waitToBeClickableAndClick(ClickOnChooseDropDown);
		Listeners.addLogs("Click on Choose drop Down");

	}
	public void AddImageInOptionField1() throws InterruptedException {
		UtilityFunctions.waitForElementAndClickable(ClickOnOptionImageIcon1);
		Listeners.addLogs("Add image to option field 1");
	}
	public void AddImageInOptionField2() {
		UtilityFunctions.waitForElementAndClickable(ClickOnOptionImageIcon2);
		Listeners.addLogs("Add image to option field 2");
	}
	public String assertVideoUploadInSolutionToastrMsg() {
		UtilityFunctions.waitForVisibilityOfWebElement(assertUploadVideoToastrMsg);
		String actualText=UtilityFunctions.getTextFromElement(assertUploadVideoToastrMsg);
		Listeners.addLogs("assertUploadVideoToastrMsg validated");
		return actualText;
	}
	public void enterInstruction(String contentName) {
		UtilityFunctions.waitForVisibilityOfWebElement(instructionField);
		UtilityFunctions.waitToBeClickableAndSendKeys(instructionField,contentName);
		Listeners.addLogs("Enter text in instruction");

	}
	public void ClickOnPreviewButton() {
		UtilityFunctions.waitToBeClickableAndClick(previewButton);
		Listeners.addLogs("Click on Preview button");

	}
	public void clickOnNextIcon() {
		UtilityFunctions.waitToBeClickableAndClick(clickOnnextButton);
		Listeners.addLogs("Click on Next button");

	}
	public void ClickOnReplyButton() {
		UtilityFunctions.waitToBeClickableAndClick(clickOnReplyButton);
		Listeners.addLogs("Click on Replay button");

	}
	public String verifyIntructionText() {
		UtilityFunctions.waitForVisibilityOfWebElement(instructionText);
		String actualText=UtilityFunctions.getTextFromElement(instructionText);
		Listeners.addLogs("validated entered text in intruction");
		return actualText;
	}
	public void assertTitleText() {
		UtilityFunctions.waitForElementIsVisible(Titletext);
		UtilityFunctions.validatIsElementPresent(Titletext,"Title text is not displayed");
		Listeners.addLogs("Title text is displayed");
		UtilityFunctions.waitForElementIsVisible(Titlefield);
		UtilityFunctions.validatIsElementPresent(Titlefield,"Title Field is not displayed");
		Listeners.addLogs("Title field is displayed");
	}
	public void assertDiscriptionText() {
		UtilityFunctions.waitForElementIsVisible(Descriptiontext);
		UtilityFunctions.validatIsElementPresent(Descriptiontext,"Description text is not displayed");
		Listeners.addLogs("Description text is displayed");
		UtilityFunctions.waitForElementIsVisible(DescriptionField);
		UtilityFunctions.validatIsElementPresent(DescriptionField,"Description field is not displayed");
		Listeners.addLogs("Description field is displayed");

	}
	public void assertInstructionText() {
		UtilityFunctions.waitForElementIsVisible(Instructiontext);
		UtilityFunctions.validatIsElementPresent(Instructiontext,"Instruction text is not displayed");
		Listeners.addLogs("Instruction text is displayed");
		UtilityFunctions.waitForElementIsVisible(InstructionField);
		UtilityFunctions.validatIsElementPresent(InstructionField,"Instruction Field is not displayed");
		Listeners.addLogs("Instruction field is displayed");
	}
	public void assertCountOfQuestionText() {
		UtilityFunctions.waitForElementIsVisible(Countofquestiontext);
		UtilityFunctions.validatIsElementPresent(Countofquestiontext,"Countofquestion text is not displayed");
		Listeners.addLogs("Countofquestion text is displayed");
		UtilityFunctions.waitForElementIsVisible(CountofquestionField);
		UtilityFunctions.validatIsElementPresent(CountofquestionField,"Countofquestion Field is not displayed");
		Listeners.addLogs("Countofquestion field is displayed");

	}
	public void assertShuffleQuestionText() {
		UtilityFunctions.waitForElementIsVisible(ShuffleQuestiontext);
		UtilityFunctions.validatIsElementPresent(ShuffleQuestiontext,"ShuffleQuestion text is not displayed");
		Listeners.addLogs("ShuffleQuestion text is displayed");
		UtilityFunctions.waitForElementIsVisible(ShuffleQuestiontField);
		UtilityFunctions.waitForElementAndClickable(ShuffleQuestiontField);
		Listeners.addLogs("ShuffleQuestion field is displayed");

	}
	public void assertShowQuestionFeedbackText() {
		UtilityFunctions.waitForElementIsVisible(showquestionfeedbacktext);
		UtilityFunctions.validatIsElementPresent(showquestionfeedbacktext,"showquestionfeedback text is not displayed");
		Listeners.addLogs("showquestionfeedback text is displayed");
		UtilityFunctions.waitForElementIsVisible(showquestionfeedbackField);
		UtilityFunctions.waitForElementAndClickable(showquestionfeedbackField);
		Listeners.addLogs("showquestionfeedback field is displayed");

	}
	public void assertShowSolutionText() {
		UtilityFunctions.waitForElementIsVisible(showsolutiontext);
		UtilityFunctions.validatIsElementPresent(showsolutiontext,"showsolution text is not displayed");
		Listeners.addLogs("showsolution text is displayed");
		UtilityFunctions.waitForElementIsVisible(showsolutionField);
		UtilityFunctions.waitForElementAndClickable(showsolutionField);
		Listeners.addLogs("showsolution field is displayed");

	}

	public void clickOnResetButton() throws InterruptedException {
		UtilityFunctions.waitToBeClickableAndClick(clickOnResetButton);
		Listeners.addLogs("resetButton");
	}
	public void selectQuestionFromList() {
		UtilityFunctions.clickUsingJavaScriptExecutor(selectQuestionFromList);
		Listeners.addLogs("selectQuestionFromList");
	}
	public String getQuestionName() {
		String questionname=UtilityFunctions.getTextFromElement(nameOfTheQuestion);
		return questionname;
	}
	public void addQuestionInLibrary() {
		UtilityFunctions.waitToBeClickableAndClick(addQuestionButton);
		Listeners.addLogs("addQuestion");
	}
	public void clickOnSection() {
		UtilityFunctions.waitToBeClickableAndClick(clickOnSection);
		Listeners.addLogs("Click on section");

	}
	public String fetchQuestionNameXpath(String expectedQuestionName) {

		String questionXpath=SunbirdConstants.XPATH_CONTAINS+expectedQuestionName+ SunbirdConstants.XPATH_CONAINSCLOSEBRACKET;
		return questionXpath;
	}
	public String assertCreatedQuestionsetname() {
		UtilityFunctions.waitForVisibilityOfWebElement(questionsetName);
		String actualText=UtilityFunctions.getTextFromElement(questionsetName);
		Listeners.addLogs("validated questionset name ");
		return actualText;
	}
	public void selectGridLayout() {
		UtilityFunctions.waitToBeClickableAndClick(gridLayout);
		Listeners.addLogs("Click on Grid layout");

	}
	public void clickOnAddOption() {
		UtilityFunctions.waitToBeClickableAndClick(addOption);
		Listeners.addLogs("Click on Add option button");

	}
	public void optionsParagraph3(String paragraph) {
		UtilityFunctions.waitForVisibilityOfWebElement(enterOptionParagraph3);
		UtilityFunctions.waitToBeClickableAndSendKeys(enterOptionParagraph3, paragraph);
		Listeners.addLogs("enterOptionParagraph3");
	}
	public void optionsParagraph4(String paragraph) {
		UtilityFunctions.waitForVisibilityOfWebElement(enterOptionParagraph4);
		UtilityFunctions.waitToBeClickableAndSendKeys(enterOptionParagraph4, paragraph);
		Listeners.addLogs("enterOptionParagraph4");

	}
	public void assertGridlayout() {
		UtilityFunctions.waitForElementIsVisible(assertGridLayout);
		UtilityFunctions.validatIsElementPresent(assertGridLayout, "Grid layout is not displayed");
		Listeners.addLogs("Grid layout is displayed");


	}
	public void clickOnEditButton() {
		UtilityFunctions.waitToBeClickableAndClick(editButton);
		Listeners.addLogs("Click on edit button");

	}
	public void selectVerticalLayout() {
		UtilityFunctions.waitToBeClickableAndClick(verticalLayout);
		Listeners.addLogs("Click on vertical button");

	}
	public String getVerticalClassValue() {
		String attributeValue=UtilityFunctions.getAttributeValue(assertVerticalLayout, "class");
		return attributeValue;
	}
	public void selectHorizontalLayout() {
		UtilityFunctions.waitToBeClickableAndClick(horizontalLayout);
		Listeners.addLogs("Click on horizontal button");

	}
	public String getHorizontalClassValue() {
		String attributeValue=UtilityFunctions.getAttributeValue(assertHorizontalLayout, "class");
		return attributeValue;
	}
}
