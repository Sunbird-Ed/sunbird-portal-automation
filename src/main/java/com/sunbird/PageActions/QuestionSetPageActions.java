package com.sunbird.PageActions;

import com.sunbird.GenericLibrary.BaseTestConfig;
import com.sunbird.GenericLibrary.UtilityFunctions;
import com.sunbird.PageObjects.BookPage;
import com.sunbird.PageObjects.QuestionSetPage;
import com.sunbird.PageObjects.ResourcePage;
import org.apache.poi.ss.formula.functions.T;
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

	public static void assertQuestionDisplayedBasedonText() {
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

	public static String fetchFirstQuestionName() throws Exception {
		QuestionSetPage questionSetPage = PageFactory.initElements(driver, QuestionSetPage.class);
		String questionName = questionSetPage.getFirstQuestionName();
	return questionName;
	}

	public static void clickDeleteIconInQuestion() throws InterruptedException {
		QuestionSetPage questionSetPage = PageFactory.initElements(driver, QuestionSetPage.class);
	questionSetPage.deleteIcon();
			}
	public static void deleteConfimation() throws InterruptedException {
		QuestionSetPage questionSetPage = PageFactory.initElements(driver, QuestionSetPage.class);
		questionSetPage.deleteConfirm();
	}
	public static int getTotalQuestionCount() throws InterruptedException {
		QuestionSetPage questionSetPage = PageFactory.initElements(driver, QuestionSetPage.class);
		Thread.sleep(3000);
		String fetchTotalcount=questionSetPage.getTotalQuestionCount();
	int displayedCount=UtilityFunctions.extractNumberFromString(fetchTotalcount);
return displayedCount;

	}
	public static void assertNoQuestionFoundMsgAfterDeletion() throws InterruptedException {
		QuestionSetPage questionSetPage = PageFactory.initElements(driver, QuestionSetPage.class);
		questionSetPage.assertDidNotFindQuestion();
	}
	public static void clickAdvanceFilter() throws InterruptedException {
		QuestionSetPage questionSetPage = PageFactory.initElements(driver, QuestionSetPage.class);
		questionSetPage.advanceFilter();
		Thread.sleep(4000);
	}
	public static void selectMyQuestionFilter() throws InterruptedException {
		QuestionSetPage questionSetPage = PageFactory.initElements(driver, QuestionSetPage.class);
		questionSetPage.myQuestiontoggle();
	}
	public static void selectDifficultLevel() throws InterruptedException {
		QuestionSetPage questionSetPage = PageFactory.initElements(driver, QuestionSetPage.class);
		questionSetPage.difficlutFilter();
		questionSetPage.selectDifficuluEasy();
	}
	public static void selectQuestionType() throws InterruptedException {
		QuestionSetPage questionSetPage = PageFactory.initElements(driver, QuestionSetPage.class);
		questionSetPage.questType();
		questionSetPage.selectQueMCQType();
	}
	public static void selectBoard() throws InterruptedException {
		QuestionSetPage questionSetPage = PageFactory.initElements(driver, QuestionSetPage.class);
		questionSetPage.boardDropdown();
		questionSetPage.selectBoardValue();
	}
	public static void selectMedium() throws InterruptedException {
		QuestionSetPage questionSetPage = PageFactory.initElements(driver, QuestionSetPage.class);
		questionSetPage.mediumDropdown();
		questionSetPage.selectMediumValue();
	}
	public static void selectClass() throws InterruptedException {
		QuestionSetPage questionSetPage = PageFactory.initElements(driver, QuestionSetPage.class);
		questionSetPage.classDropdown();
		questionSetPage.selectClassValue();
	}
	public static void selectSubject() throws InterruptedException {
		QuestionSetPage questionSetPage = PageFactory.initElements(driver, QuestionSetPage.class);
		questionSetPage.subjectDropdown();
		questionSetPage.selectSubjectValue();
	}
	public static void assertDeleteIcon() throws InterruptedException {
		QuestionSetPage questionSetPage = PageFactory.initElements(driver, QuestionSetPage.class);
		questionSetPage.assertDeleteIcon();
	}
}
