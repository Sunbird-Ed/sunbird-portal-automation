package com.sunbird.PageActions;

import com.sunbird.GenericLibrary.BaseTestConfig;
import com.sunbird.GenericLibrary.UtilityFunctions;
import com.sunbird.PageObjects.BookPage;
import com.sunbird.PageObjects.QuestionSetPage;
import com.sunbird.PageObjects.ResourcePage;
import org.openqa.selenium.support.PageFactory;


public class QuestionSetPageActions extends BaseTestConfig {



	/* click on AddQuestionSetIcon in Resource Editor */
	public static void clickAddQuestionSetIcon() throws InterruptedException {
		QuestionSetPage questionSetPage = PageFactory.initElements(driver, QuestionSetPage.class);
		questionSetPage.clkAddQuestionSetIcon();
	}

	public static void selectFirstQuestionInList() throws InterruptedException {
		QuestionSetPage questionSetPage = PageFactory.initElements(driver, QuestionSetPage.class);
		questionSetPage.selectFirstQuestionInList();
	}
	public static void clkNextButtonInQuestionPage() throws InterruptedException {
		QuestionSetPage questionSetPage = PageFactory.initElements(driver, QuestionSetPage.class);
		questionSetPage.clickNextBtnInQuestionListPage();
	}

	public static String enterQuestionSetTitle() throws Exception {
		QuestionSetPage questionSetPage = PageFactory.initElements(driver, QuestionSetPage.class);
		String titleName = UtilityFunctions.generateRandomName("automationQuestionSet");
		questionSetPage.enterQuestionSetTitle(titleName);
		return titleName;
	}
	public static void clkAddButtonInQuestionTitlePage() throws InterruptedException {
		QuestionSetPage questionSetPage = PageFactory.initElements(driver, QuestionSetPage.class);
		questionSetPage.clickAddButtonInQuestionTitlePage();
	}

	public static void clickImmediateFeedback() throws InterruptedException {
		QuestionSetPage questionSetPage = PageFactory.initElements(driver, QuestionSetPage.class);
		questionSetPage.immediateFeedback();
	}
	public static void clickShuffleQuestions() throws InterruptedException {
		QuestionSetPage questionSetPage = PageFactory.initElements(driver, QuestionSetPage.class);
		questionSetPage.shuffleQuestions();
	}

	public static void searchByQuestionTitle(String questionType) throws Exception {
		QuestionSetPage questionSetPage = PageFactory.initElements(driver, QuestionSetPage.class);
		questionSetPage.searchTextBoxInQuestionSet(questionType);
		questionSetPage.clickSearchIcon();
	}
public static void assertQuestionDisplayedBasedonText()
{
	QuestionSetPage questionSetPage = PageFactory.initElements(driver, QuestionSetPage.class);
questionSetPage.assertQuestionDisplayedBasedOnSearch();
}

	public static void clickCopyQuestionIcon() throws InterruptedException {
		QuestionSetPage questionSetPage = PageFactory.initElements(driver, QuestionSetPage.class);
		questionSetPage.copyQuestionIcon();
	}
	public static void clickNextBtnInQuestionPage() throws InterruptedException {
		QuestionSetPage questionSetPage = PageFactory.initElements(driver, QuestionSetPage.class);
		questionSetPage.nextBtnInQuestion();
	}
	public static void clickSubmitInQuestionPage() throws InterruptedException {
		QuestionSetPage questionSetPage = PageFactory.initElements(driver, QuestionSetPage.class);
		questionSetPage.submitInQuestionPage();
	}

	public static void clickEditIconInQuestion() throws InterruptedException {
		QuestionSetPage questionSetPage = PageFactory.initElements(driver, QuestionSetPage.class);
		questionSetPage.editIcon();
	}
	public static String enterTitleName() throws Exception {
		QuestionSetPage questionSetPage = PageFactory.initElements(driver, QuestionSetPage.class);
		String titleNameQues = UtilityFunctions.generateRandomName("automationTitleQueSet");
		questionSetPage.titleName(titleNameQues);
		return titleNameQues;
	}
	}

