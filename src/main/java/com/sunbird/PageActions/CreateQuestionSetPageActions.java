package com.sunbird.PageActions;

import com.sunbird.GenericLibrary.BaseTestConfig;
import com.sunbird.GenericLibrary.Listeners;
import com.sunbird.GenericLibrary.SunbirdConstants;
import com.sunbird.GenericLibrary.UtilityFunctions;
import com.sunbird.PageObjects.BookPage;
import com.sunbird.PageObjects.CoursePage;
import com.sunbird.PageObjects.CreateQuestionSetPage;
import com.sunbird.PageObjects.GetPage;
import org.openqa.selenium.support.PageFactory;


public class CreateQuestionSetPageActions extends BaseTestConfig {


	public static String fillQuestionSetSection1(String getContentType) throws Exception {
		CreateQuestionSetPage createQuestSetPage = PageFactory.initElements(driver, CreateQuestionSetPage.class);
		CoursePage coursePage = PageFactory.initElements(driver, CoursePage.class);
		BookPage bookPage = PageFactory.initElements(driver, BookPage.class);

		String questionName = UtilityFunctions.generateRandomName("automationCreateQuest");
		createQuestSetPage.enterQuestionSetName(questionName);

		String description = UtilityFunctions.generateRandomName("autoQuesDescription");
		bookPage.enterDesciption(description);

		String keyword = UtilityFunctions.generateRandomName("autoQuestKeyword");
		coursePage.enterCourseKeywords(keyword);

		if (getContentType.equalsIgnoreCase("getContentName")) {
			return questionName;
		}
		if (getContentType.equalsIgnoreCase("getKeyword")) {
			return keyword;
		} else {
			return UtilityFunctions.generate_Do_id();

		}

	}

	public static void selectAudienceType() {
		CreateQuestionSetPage createQuestSetPage = PageFactory.initElements(driver, CreateQuestionSetPage.class);
		createQuestSetPage.audienceDropdown();
		createQuestSetPage.selectValueInAudienceDropdown();
	}

	public static void setMaxTime(String hrs, String mins) {
		CreateQuestionSetPage createQuestSetPage = PageFactory.initElements(driver, CreateQuestionSetPage.class);
		createQuestSetPage.enterHour(hrs);
		createQuestSetPage.enterMinutes(mins);
	}

	public static void fillSectionDetails() {
		CreateQuestionSetPage createQuestSetPage = PageFactory.initElements(driver, CreateQuestionSetPage.class);
		String name = UtilityFunctions.generateRandomName("automationCreateQuest");
		String descr = UtilityFunctions.generateRandomName("automationCreateQuest");
		String ins = UtilityFunctions.generateRandomName("automationCreateQuest");

		createQuestSetPage.enterSectionName(name);
		createQuestSetPage.enterSectionDescriptions(descr);
		createQuestSetPage.enterSectionInstructions(ins);

	}

	public static void sectionName(String sectionName) {
		CreateQuestionSetPage createQuestSetPage = PageFactory.initElements(driver, CreateQuestionSetPage.class);
		createQuestSetPage.enterSectionName(sectionName);
	}

	public static void sectionDescription(String sectionDes) {
		CreateQuestionSetPage createQuestSetPage = PageFactory.initElements(driver, CreateQuestionSetPage.class);
		createQuestSetPage.enterSectionDescriptions(sectionDes);
	}

	public static void sectionInstructions(String sectionInstruction) {
		CreateQuestionSetPage createQuestSetPage = PageFactory.initElements(driver, CreateQuestionSetPage.class);
		createQuestSetPage.enterSectionInstructions(sectionInstruction);
	}

	public static void clickCreateNew() {
		CreateQuestionSetPage createQuestSetPage = PageFactory.initElements(driver, CreateQuestionSetPage.class);
		createQuestSetPage.CreateNew();
	}

	public static void clickMcqTemplate() {
		CreateQuestionSetPage createQuestSetPage = PageFactory.initElements(driver, CreateQuestionSetPage.class);
		createQuestSetPage.mcqTemplate();
	}

	public static void clickSubjectiveTemplate() {
		CreateQuestionSetPage createQuestSetPage = PageFactory.initElements(driver, CreateQuestionSetPage.class);
		createQuestSetPage.subjectiveTemplate();
	}

	public static void clickNextBtn() {
		CreateQuestionSetPage createQuestSetPage = PageFactory.initElements(driver, CreateQuestionSetPage.class);
		createQuestSetPage.nextButton();
	}

	public static void questParagraph() {
		CreateQuestionSetPage createQuestSetPage = PageFactory.initElements(driver, CreateQuestionSetPage.class);
		String randomParagraph = UtilityFunctions.generateRandomName("automationCreateQuestionSetQuesParagaraph");
		createQuestSetPage.questionParagraph(randomParagraph);
	}

	public static void optionParagraph() {
		CreateQuestionSetPage createQuestSetPage = PageFactory.initElements(driver, CreateQuestionSetPage.class);
		String randomParagraph = UtilityFunctions.generateRandomName("automationCreateQuestionSetOption1Paragaraph1");
		createQuestSetPage.optionsParagraph1(randomParagraph);
	}

	public static void optionParagraph2() {
		CreateQuestionSetPage createQuestSetPage = PageFactory.initElements(driver, CreateQuestionSetPage.class);
		String randomParagraph = UtilityFunctions.generateRandomName("automationCreateQuestionSetOption2Paragaraph2");
		createQuestSetPage.optionsParagraph2(randomParagraph);

	}

	public static void clickCorrectAnswers() {
		CreateQuestionSetPage createQuestSetPage = PageFactory.initElements(driver, CreateQuestionSetPage.class);
		createQuestSetPage.chooseCorrectAnswer();
	}

	public static String questionTitle() {
		CreateQuestionSetPage createQuestSetPage = PageFactory.initElements(driver, CreateQuestionSetPage.class);
		String name = UtilityFunctions.generateRandomName("automationQuesTitle");
		createQuestSetPage.enterQuestionDetailsTitleName(name);
		return name;
	}

	public static void questionMarks(String marks) {
		CreateQuestionSetPage createQuestSetPage = PageFactory.initElements(driver, CreateQuestionSetPage.class);
		createQuestSetPage.enterMarks(marks);

	}

	public static void clickSave() {
		CreateQuestionSetPage createQuestSetPage = PageFactory.initElements(driver, CreateQuestionSetPage.class);
		createQuestSetPage.saveButton();
	}

	public static void assertQuestionCreatedToastrMsg() {
		CreateQuestionSetPage createQuestSetPage = PageFactory.initElements(driver, CreateQuestionSetPage.class);
		String actualMsg = createQuestSetPage.assertQuestionCreatedToastr();
		UtilityFunctions.stringValueComparision(actualMsg, SunbirdConstants.questionCreatedToastrMsg, "Failed to create QuestionSet");
		createQuestSetPage.waitQuestionCreatedToastrToDisappear();
	}

	public static void BMCDropdownSelectionSection2() throws InterruptedException {

		CreateQuestionSetPage createQuestSetPage = PageFactory.initElements(driver, CreateQuestionSetPage.class);
		createQuestSetPage.clickBoardDropdown();
		createQuestSetPage.selectBoardValue();
		createQuestSetPage.clickMediumDropdown();
		createQuestSetPage.selectMediumValue();
		Thread.sleep(2000);
		createQuestSetPage.clickClassDropdown();
		Thread.sleep(2000);
		createQuestSetPage.selectClassValue();
		createQuestSetPage.clickSubjectDropdown();
		createQuestSetPage.selectSubjectValue();
	}

	public static void selectSummaryType() throws InterruptedException {
		CreateQuestionSetPage createQuestSetPage = PageFactory.initElements(driver, CreateQuestionSetPage.class);
		createQuestSetPage.summaryDropDown();
	}

	public static void validateDropDownValuesOfDurationSummaryType() {
		CreateQuestionSetPage createQuestSetPage = PageFactory.initElements(driver, CreateQuestionSetPage.class);
		createQuestSetPage.assertDurationSummaryType();
	}

	public static void validateDropDownValuesOfScoreSummaryType() {
		CreateQuestionSetPage createQuestSetPage = PageFactory.initElements(driver, CreateQuestionSetPage.class);
		createQuestSetPage.assertScoreSummaryType();
	}

	public static void validateDropDownValuesOfScoreAndDurationSummaryType() {
		CreateQuestionSetPage createQuestSetPage = PageFactory.initElements(driver, CreateQuestionSetPage.class);
		createQuestSetPage.assertScoreAndDurationSummaryType();
	}

	public static void validateDropDownValuesOfCompleteSummaryType() {
		CreateQuestionSetPage createQuestSetPage = PageFactory.initElements(driver, CreateQuestionSetPage.class);
		createQuestSetPage.assertCompleteSummaryType();

	}

	public static void assertAddChildButtonDisabled() {
		CreateQuestionSetPage createQuestSetPage = PageFactory.initElements(driver, CreateQuestionSetPage.class);
		createQuestSetPage.addChildButtonDisabled();
	}

	public static void addImageToQuestionField() throws InterruptedException {
		CreateQuestionSetPage createQuestSetPage = PageFactory.initElements(driver, CreateQuestionSetPage.class);
		createQuestSetPage.addImageInQuestionField();
	}

	public static void uploadImageInQuestion() throws InterruptedException {
		CreateQuestionSetPage createQuestSetPage = PageFactory.initElements(driver, CreateQuestionSetPage.class);
		createQuestSetPage.clickOnUploadButton();
		String filepath = System.getProperty("user.dir") + sunbird_config.getSunbidConfigPropertyValue("QSImage");
		createQuestSetPage.uploadImageFile(filepath);
		createQuestSetPage.clickOnUploadbutton2();

	}

	public static void addImageToAnswerField() throws InterruptedException {
		CreateQuestionSetPage createQuestSetPage = PageFactory.initElements(driver, CreateQuestionSetPage.class);
		createQuestSetPage.addImageInAnswerField();
	}

	public static void selectVideoTypeInSolutionField() {
		CreateQuestionSetPage createQuestSetPage = PageFactory.initElements(driver, CreateQuestionSetPage.class);
		createQuestSetPage.selectVideoType();

	}


	public static void selectTextAndImageType() {
		CreateQuestionSetPage createQuestSetPage = PageFactory.initElements(driver, CreateQuestionSetPage.class);
		createQuestSetPage.selectTextAndImageType();
	}

	public static void addImageToSolutionField() throws InterruptedException {
		CreateQuestionSetPage createQuestSetPage = PageFactory.initElements(driver, CreateQuestionSetPage.class);
		createQuestSetPage.AddImageInSolutionField();
	}

	public static void clickOnChooseTypeDropDownInSolutionField() {
		CreateQuestionSetPage createQuestSetPage = PageFactory.initElements(driver, CreateQuestionSetPage.class);
		createQuestSetPage.clickOnChooseTypeDropDown();

	}

	public static void addImageToOptionField1() throws InterruptedException {
		CreateQuestionSetPage createQuestSetPage = PageFactory.initElements(driver, CreateQuestionSetPage.class);
		createQuestSetPage.AddImageInOptionField1();
	}

	public static void uploadImageInOptionField1() throws InterruptedException {
		CreateQuestionSetPage createQuestSetPage = PageFactory.initElements(driver, CreateQuestionSetPage.class);
		createQuestSetPage.clickOnUploadButton();
		String filepath = System.getProperty("user.dir") + sunbird_config.getSunbidConfigPropertyValue("QSImage");
		createQuestSetPage.uploadImageFile(filepath);
		createQuestSetPage.clickOnUploadbutton2();
		UtilityFunctions.scrollDownUsingPixelValue();

	}

	public static void addImageToOptionField2() {
		CreateQuestionSetPage createQuestSetPage = PageFactory.initElements(driver, CreateQuestionSetPage.class);
		createQuestSetPage.AddImageInOptionField2();

	}

	public static void uploadImageInOptionField2() throws InterruptedException {
		CreateQuestionSetPage createQuestSetPage = PageFactory.initElements(driver, CreateQuestionSetPage.class);
		createQuestSetPage.clickOnUploadButton();
		String filepath = System.getProperty("user.dir") + sunbird_config.getSunbidConfigPropertyValue("QSImage");
		createQuestSetPage.uploadImageFile(filepath);
		createQuestSetPage.clickOnUploadbutton2();
		UtilityFunctions.scrollDownUsingPixelValue();

	}

	public static void uploadVideoToSolutionField() throws InterruptedException {
		CreateQuestionSetPage createQuestSetPage = PageFactory.initElements(driver, CreateQuestionSetPage.class);
		createQuestSetPage.clickOnUploadButton();
		String filepath = System.getProperty("user.dir") + sunbird_config.getSunbidConfigPropertyValue("MP4");
		createQuestSetPage.uploadImageFile(filepath);
		createQuestSetPage.clickOnUploadbutton2();
		String actualMsg = createQuestSetPage.assertVideoUploadInSolutionToastrMsg();
		UtilityFunctions.stringValueComparision(actualMsg, SunbirdConstants.uploadedVideoInSolutionMsg, "Video is not uploaded in solution field");
		Thread.sleep(3000);
	}

	public static String instructionSection() throws InterruptedException {
		CreateQuestionSetPage createQuestSetPage = PageFactory.initElements(driver, CreateQuestionSetPage.class);
		String automationInstruction = SunbirdConstants.automationInstruction;
		String randomInstruction = UtilityFunctions.generateRandomName("autoInstuction");
		String instruction = automationInstruction + randomInstruction;
		createQuestSetPage.enterInstruction(instruction);
		return instruction;
	}

	public static void clickPreviewButton() {
		CreateQuestionSetPage createQuestSetPage = PageFactory.initElements(driver, CreateQuestionSetPage.class);
		createQuestSetPage.ClickOnPreviewButton();

	}

	public static void clickOnNextButton(int n) throws InterruptedException {
		CreateQuestionSetPage createQuestSetPage = PageFactory.initElements(driver, CreateQuestionSetPage.class);
		for (int i = 0; i < n; i++) {
			createQuestSetPage.clickOnNextIcon();
		}
	}

	public static void clickOnReplyButton() {
		CreateQuestionSetPage createQuestSetPage = PageFactory.initElements(driver, CreateQuestionSetPage.class);
		createQuestSetPage.ClickOnReplyButton();
	}

	public static void assertInstructionText(String expected) {
		CreateQuestionSetPage createQuestSetPage = PageFactory.initElements(driver, CreateQuestionSetPage.class);
		String actualMsg = createQuestSetPage.verifyIntructionText();
		UtilityFunctions.stringValueComparision(actualMsg, expected, "Failed to validate intruction text");
	}

	public static void verifyQuestionSetSectionPage() {
		CreateQuestionSetPage createQuestSetPage = PageFactory.initElements(driver, CreateQuestionSetPage.class);
		createQuestSetPage.assertTitleText();
		createQuestSetPage.assertDiscriptionText();
		createQuestSetPage.assertInstructionText();
		createQuestSetPage.assertCountOfQuestionText();
		createQuestSetPage.assertShuffleQuestionText();
		createQuestSetPage.assertShowQuestionFeedbackText();
		createQuestSetPage.assertShowSolutionText();

	}

	public static void clickOnResetButton() throws InterruptedException {
		CreateQuestionSetPage createQuestSetPage = PageFactory.initElements(driver, CreateQuestionSetPage.class);
		createQuestSetPage.clickOnResetButton();
	}
	public static String selectFirstQuestionFromAddFromlibarary() throws InterruptedException {
		CreateQuestionSetPage createQuestSetPage = PageFactory.initElements(driver, CreateQuestionSetPage.class);
		createQuestSetPage.selectQuestionFromList();
		String questionname=createQuestSetPage.getQuestionName();
		return questionname;
	}
	public static void addQuestionButton() {
		CreateQuestionSetPage createQuestSetPage = PageFactory.initElements(driver, CreateQuestionSetPage.class);
		createQuestSetPage.addQuestionInLibrary();
	}
	public static void assertAddedQuestionNameWebElementAsString(String expectedQuesName) throws InterruptedException {
		CreateQuestionSetPage createQuestSetPage = PageFactory.initElements(driver, CreateQuestionSetPage.class);
		createQuestSetPage.clickOnSection();
		String expectedXpath=createQuestSetPage.fetchQuestionNameXpath(expectedQuesName);
		UtilityFunctions.assertWebElementAsString(expectedXpath);
	}
	public static void getAndAssertQuestionName(String expectedQuesName) {
		CreateQuestionSetPage createQuestSetPage = PageFactory.initElements(driver, CreateQuestionSetPage.class);
		String actualQuestionNam=createQuestSetPage.assertCreatedQuestionsetname();
		UtilityFunctions.stringValueComparision(actualQuestionNam,expectedQuesName, "Failed to validate questionset name");

	}
	public static void selectGridLayout() {
		CreateQuestionSetPage createQuestSetPage = PageFactory.initElements(driver, CreateQuestionSetPage.class);
		createQuestSetPage.selectGridLayout();

	}
	public static void clickOnAddOption(int n) {
		CreateQuestionSetPage createQuestSetPage = PageFactory.initElements(driver, CreateQuestionSetPage.class);
		for (int i = 0; i < n; i++) {
			createQuestSetPage.clickOnAddOption();
		}
	}
	public static void optionParagraph3() {
		CreateQuestionSetPage createQuestSetPage = PageFactory.initElements(driver, CreateQuestionSetPage.class);
		String randomParagraph = UtilityFunctions.generateRandomName("automationCreateQuestionSetOption2Paragaraph3");
		createQuestSetPage.optionsParagraph3(randomParagraph);

	}
	public static void optionParagraph4() {
		CreateQuestionSetPage createQuestSetPage = PageFactory.initElements(driver, CreateQuestionSetPage.class);
		String randomParagraph = UtilityFunctions.generateRandomName("automationCreateQuestionSetOption2Paragaraph4");
		createQuestSetPage.optionsParagraph4(randomParagraph);

	}
	public static void assertGridLayout() {
		CreateQuestionSetPage createQuestSetPage = PageFactory.initElements(driver, CreateQuestionSetPage.class);
		createQuestSetPage.assertGridlayout();
	}
	public static void clickOnEditButton() {
		CreateQuestionSetPage createQuestSetPage = PageFactory.initElements(driver, CreateQuestionSetPage.class);
		createQuestSetPage.clickOnEditButton();

	}
	public static void selectVerticalLayout() {
		CreateQuestionSetPage createQuestSetPage = PageFactory.initElements(driver, CreateQuestionSetPage.class);
		createQuestSetPage.selectVerticalLayout();

	}
	public static void assertVerticalLayout() throws InterruptedException {
		CreateQuestionSetPage createQuestSetPage = PageFactory.initElements(driver, CreateQuestionSetPage.class);
		String actualAttributeValue=createQuestSetPage.getVerticalClassValue();
		UtilityFunctions.stringValueComparision(actualAttributeValue, SunbirdConstants.verticalLayoutattribute, "VerticalLayout failed to display");
		Listeners.addLogs("vertical layout is displayed");
	}
	public static void selectHorizontalLayout() {
		CreateQuestionSetPage createQuestSetPage = PageFactory.initElements(driver, CreateQuestionSetPage.class);
		createQuestSetPage.selectHorizontalLayout();

	}
	public static void assertHorizontalLayout() throws InterruptedException {
		CreateQuestionSetPage createQuestSetPage = PageFactory.initElements(driver, CreateQuestionSetPage.class);
		String actualAttributeValue=createQuestSetPage.getHorizontalClassValue();
		UtilityFunctions.stringValueComparision(actualAttributeValue, SunbirdConstants.horizontalLayoutattribute, "horizontal Layout failed to display");
		Listeners.addLogs("Horizontal layout is displayed");
	}
}
