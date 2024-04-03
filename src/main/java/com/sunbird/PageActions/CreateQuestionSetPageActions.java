package com.sunbird.PageActions;

import com.sunbird.GenericLibrary.BaseTestConfig;
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
	public static void clickCorrectAnswers()
	{
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
	public static void clickSave()
	{
		CreateQuestionSetPage createQuestSetPage = PageFactory.initElements(driver, CreateQuestionSetPage.class);
		createQuestSetPage.saveButton();
	}
	public static void assertQuestionCreatedToastrMsg()
	{
		CreateQuestionSetPage createQuestSetPage = PageFactory.initElements(driver, CreateQuestionSetPage.class);
		String actualMsg=createQuestSetPage.assertQuestionCreatedToastr();
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


}