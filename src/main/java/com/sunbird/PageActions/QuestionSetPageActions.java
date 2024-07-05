package com.sunbird.PageActions;

import com.sunbird.GenericLibrary.BaseTestConfig;
import com.sunbird.GenericLibrary.Listeners;
import com.sunbird.GenericLibrary.SunbirdConstants;
import com.sunbird.GenericLibrary.UtilityFunctions;
import com.sunbird.PageObjects.BookPage;
import com.sunbird.PageObjects.CreateQuestionSetPage;
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
		Thread.sleep(2000);
	}

	public static void clickShuffleQuestions() throws InterruptedException {
		QuestionSetPage questionSetPage = PageFactory.initElements(driver, QuestionSetPage.class);
		questionSetPage.shuffleQuestions();
		Thread.sleep(4000);
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
	public static void clickAddMoreQuestionButton() throws InterruptedException {
		QuestionSetPage questionSetPage = PageFactory.initElements(driver, QuestionSetPage.class);
		questionSetPage.addMoreQuestions();
	}
	public static void createQuestionbutton() throws InterruptedException {
		QuestionSetPage questionSetPage = PageFactory.initElements(driver, QuestionSetPage.class);
		questionSetPage.createQuestion();
	}
	public static void selectMTF() throws InterruptedException {
		QuestionSetPage questionSetPage = PageFactory.initElements(driver, QuestionSetPage.class);
		questionSetPage.selectMTF();
	}
	public static void switchToRichFrameEditor() throws InterruptedException {
		QuestionSetPage questionSetPage = PageFactory.initElements(driver, QuestionSetPage.class);
		questionSetPage.switchToFrameUsingName();
	}
	public static void enterQuestionInsideTextBox(String questionData) throws InterruptedException {
		QuestionSetPage questionSetPage = PageFactory.initElements(driver, QuestionSetPage.class);
			questionSetPage.enterQuestionInTextBox(questionData);

	}
	public static void enterMCQQuestionInsideTextBox(String questionData) throws InterruptedException {
		QuestionSetPage questionSetPage = PageFactory.initElements(driver, QuestionSetPage.class);
		questionSetPage.enterMCQQuestionInTextBox(questionData);

	}
	public static void switchToParentFrame() throws InterruptedException {
		QuestionSetPage questionSetPage = PageFactory.initElements(driver, QuestionSetPage.class);
		questionSetPage.parentSwitchFrame();
	}

	public static void enterAllQuestionAndAnswerForMTF() throws Exception
	{
		QuestionSetPage questionSetPage = PageFactory.initElements(driver, QuestionSetPage.class);
questionSetPage.enterFirstPairQuestion("Animal");
questionSetPage.enterFirstPairAnswer("Lion");
questionSetPage.enterSecondPairQuestion("Flower");
questionSetPage.enteSecondPairAnswer("Rose");
questionSetPage.enterThirdPairQuestion("Colour");
questionSetPage.enterThirdPairAnswer("Black");
	}
	public static void clickRefreshIcon() throws Exception
	{
		QuestionSetPage questionSetPage = PageFactory.initElements(driver, QuestionSetPage.class);

		questionSetPage.refresh();
		Thread.sleep(8000);
	}
	public static void selectBMCInQuestionCreationPage() throws Exception
	{
		QuestionSetPage questionSetPage = PageFactory.initElements(driver, QuestionSetPage.class);
		questionSetPage.boardDropdownInQuestCreation();
		questionSetPage.selectBoardValueInQuestCreation();
		questionSetPage.mediumDropdownInQuestCreation();
		questionSetPage.selectMediumValueInQuestCreation();
		questionSetPage.classDropdownInQuestCreation();
		questionSetPage.selectClassValueInQuestCreation();
		questionSetPage.subjectDropdownInQuestCreation();
		questionSetPage.selectSubjectValueInQuestCreation();
	}
	public static void selectEasyLevelInQuestionCreationPage() throws Exception
	{
		QuestionSetPage questionSetPage = PageFactory.initElements(driver, QuestionSetPage.class);
	questionSetPage.levelDropDownInQuestionCreation();
		questionSetPage.easylevelDropDownInQuestionCreation();
	}
	public static void saveAndCreateButton() throws Exception
	{
		QuestionSetPage questionSetPage = PageFactory.initElements(driver, QuestionSetPage.class);
		questionSetPage.saveAndCreateBtn();
	}
	public static void selectMCQ() throws InterruptedException {
		QuestionSetPage questionSetPage = PageFactory.initElements(driver, QuestionSetPage.class);
		questionSetPage.selectMCQ();
	}
	public static void selectFTB() throws InterruptedException {
		QuestionSetPage questionSetPage = PageFactory.initElements(driver, QuestionSetPage.class);
		questionSetPage.selectFTB();
	}

	public static void enterAllQuestAndAsnwerInMCQ() throws Exception
	{
		QuestionSetPage questionSetPage = PageFactory.initElements(driver, QuestionSetPage.class);
		questionSetPage.entermcqAns1("America");
		questionSetPage.entermcqAns2("India");
	questionSetPage.mcaMarkAsRigthAnswer();
	}
	public static void nextIconPreview() throws InterruptedException {
		QuestionSetPage questionSetPage = PageFactory.initElements(driver, QuestionSetPage.class);
		questionSetPage.nextIconInPreview();
	}
	public static void nextButtonInPreivewPlayer() throws InterruptedException {
		QuestionSetPage questionSetPage = PageFactory.initElements(driver, QuestionSetPage.class);
		questionSetPage.nextButtonPreview();
	}
	public static void clickCopyButton() {
		QuestionSetPage questionSetPage = PageFactory.initElements(driver, QuestionSetPage.class);
		questionSetPage.clickOnCopyButton();

	}
	public static void assertQuestionsetCopyToastrMsg() {
		QuestionSetPage questionSetPage = PageFactory.initElements(driver, QuestionSetPage.class);
		String actualMsg = questionSetPage.assertQuestionsetCopyToastrMsg();
		UtilityFunctions.stringValueComparision(actualMsg, SunbirdConstants.QuestionsetcopyToastrMsg, "Failed to copy the Questionset");

	}
	public static String selectMaxQuestion() {
		QuestionSetPage questionSetPage = PageFactory.initElements(driver, QuestionSetPage.class);
		String fetchMaxQuestionSelected=questionSetPage.selectMaxQuestion();
		System.out.println(fetchMaxQuestionSelected);
		int maxQuestionCount=UtilityFunctions.extractNumberFromString(fetchMaxQuestionSelected);
		return fetchMaxQuestionSelected;
	}
	public static void assertProgressBariIcon() {
		QuestionSetPage questionSetPage = PageFactory.initElements(driver, QuestionSetPage.class);
		questionSetPage.assertProgressBariIcon();
	}

}
