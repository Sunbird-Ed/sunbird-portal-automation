package com.sunbird.PageObjects;

import com.sunbird.GenericLibrary.Listeners;
import com.sunbird.GenericLibrary.UtilityFunctions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class QuestionSetPage {

    @FindBy(how=How.XPATH,using="//*[@data-content='Add Question Set']")
    private WebElement addQuestionSet;

    @FindBy(how=How.XPATH,using="//input[@class='question-select']")
    private WebElement selectFirstQuestion;

    @FindBy(how=How.XPATH,using="//button[@class='ui blue button next-button']")
    private WebElement NextbtnInSelectQuestionPage;

    @FindBy(how=How.XPATH,using="//input[@placeholder='Question Set Title']")
    private WebElement questionSetTitleTextBox;

   // @FindBy(how=How.XPATH,using="//button[@id='add-more-ques-button']//following::button[@class='ui blue button']")
   @FindBy(how=How.XPATH,using="//button[@id='add-to-stage']")
   private WebElement addBtnInQuestionSeTitlePage;



    @FindBy(how=How.XPATH,using="//input[@id='show-feedback']")
    private WebElement showImmediateFeedback;

    @FindBy(how=How.XPATH,using="//input[@id='shuffle0questions']")
    private WebElement shuffleQuestions;

    @FindBy(how=How.XPATH,using="//input[@id='searchText']")
    private WebElement searchTextBox;

    @FindBy(how=How.XPATH,using="//i[@id='qb-search-button']")
    private WebElement searchIcon;

    @FindBy(how=How.XPATH,using="//*[contains(text(),'mcq')]")
    private WebElement assertSearchedQuestionTypeDisplayed;

    @FindBy(how=How.XPATH,using="//span[@data-tooltip='copy question']")
    private WebElement copyButtonInQuestionPage;

    @FindBy(how=How.XPATH,using="//button[@id='save-question-button'][contains(text(),'Submit')]")
    private WebElement SubmitInQuestioPage;

    @FindBy(how=How.XPATH,using="//button[@id='next-button']")
    private WebElement nextBtnInQuestionPage;

    @FindBy(how=How.XPATH,using="//span[@data-tooltip='edit question']")
    private WebElement editQuestion;

    @FindBy(how=How.XPATH,using="//input[@name='name']")
    private WebElement titleQuestionName;


    @FindBy(how=How.XPATH,using="//div[@class='header ng-binding']")
    private WebElement getFirstQuestion;

    @FindBy(how=How.XPATH,using="//span[@data-tooltip='delete question']")
    private WebElement deleteQuestion;

    @FindBy(how=How.XPATH,using="//button[@id='deleteQuestionButton']")
    private WebElement deleteConfirmBtn;

    @FindBy(how=How.XPATH,using="//*[contains(text(),'Didn’t find what you were looking for? Try search for something more specific.')]")
    private WebElement assertDidNotFindQuestionMsg;

    @FindBy(how=How.XPATH,using="//span[@class='ui label ng-binding']")
    private WebElement totalQuestionFound;

    @FindBy(how=How.XPATH,using="//div[@class='advanceFilterDiv']")
    private WebElement advanceFilter;

    @FindBy(how=How.XPATH,using="//input[@id='myQuestions']")
    private WebElement myQuestionTogglebtn;

    @FindBy(how=How.XPATH,using="//div[contains(text(),'Select Level')]")
    private WebElement difficultyLevelDropdown;
    @FindBy(how=How.XPATH,using="//div[@data-value='EASY']")
    private WebElement selectDifficultLevelEasy;

    @FindBy(how=How.XPATH,using="//div[contains(text(),'Question Type')]")
    private WebElement questionTypeDropdown;
    @FindBy(how=How.XPATH,using="//div[@data-value='Multiple Choice Questions']")
    private WebElement selectQuestionTypeMCQ;

    @FindBy(how=How.XPATH,using="//div[contains(text(),'Select Board/Syllabus')]")
    private WebElement boardDropDown;
    @FindBy(how=How.XPATH,using="//div[contains(text(),'Select Board/Syllabus')]//following::div[2]")
    private WebElement selectBoardDropdown;

    @FindBy(how=How.XPATH,using="//div[contains(text(),'Select Medium')]")
    private WebElement mediumDropDown;
    @FindBy(how=How.XPATH,using="//div[contains(text(),'Select Medium')]//following::div[2]")
    private WebElement selectMediumDropdown;

    @FindBy(how=How.XPATH,using="//div[contains(text(),'Select Class')]")
    private WebElement classDropDown;
    @FindBy(how=How.XPATH,using="//div[contains(text(),'Select Class')]//following::div[2]")
    private WebElement selectClassValue;

    @FindBy(how=How.XPATH,using="//div[contains(text(),'Select Subject')]")
    private WebElement subjectDropDown;
    @FindBy(how=How.XPATH,using="//div[contains(text(),'Select Subject')]//following::div[2]")
    private WebElement selectSubjectValue;

    @FindBy(how=How.XPATH,using="//button[@id='add-more-ques-button']")
    private WebElement addMoreQuestionButton;
    @FindBy(how=How.XPATH,using="//button[@id='create-question-button']")
    private WebElement createQuestion;

    @FindBy(how=How.XPATH,using="//*[contains(text(),'Match The Following')]//following::div[contains(text(),'Select')][1]")
    private WebElement mTF;
    @FindBy(how=How.XPATH,using="//iframe[contains(@title,'Rich Text Editor')]")
    private WebElement frameRichTextEditorSwitch;

    @FindBy(how=How.XPATH,using="//iframe[@class='iziModal-iframe']")
    private WebElement frameParentSwitch;

    @FindBy(how=How.XPATH,using="//body[@contenteditable='true']")
    private WebElement enterQuestionTextBox;
    @FindBy(how=How.XPATH,using="//body[@spellcheck='false']")
    private WebElement enterMCQQuestionTextBox;

    @FindBy(how=How.ID,id="cke_mtfoptionsLHS_0")
    private WebElement enterQuestion1;
    @FindBy(how=How.ID,id="cke_mtfoptionsRHS_0")
    private WebElement enterAnswer1;

    @FindBy(how=How.ID,id="cke_mtfoptionsLHS_1")
    private WebElement enterQuestion2;
    @FindBy(how=How.ID,id="cke_mtfoptionsRHS_1")
    private WebElement enterAnswer2;

    @FindBy(how=How.ID,id="cke_mtfoptionsLHS_2")
    private WebElement enterQuestion3;
    @FindBy(how=How.ID,id="cke_mtfoptionsRHS_2")
    private WebElement enterAnswer3;

    @FindBy(how=How.XPATH,using="//button[.='Refresh']")
    private WebElement refreshBtn;

    @FindBy(how=How.XPATH,using="//label[contains(text(),'BOARD/SYLLABUS')]//following::div[contains(text(),'Select Board/Syllabus')]")
    private WebElement clickBoardDropDownInQuestCreation;

    @FindBy(how=How.XPATH,using="//label[contains(text(),'BOARD/SYLLABUS')]//following::div[contains(text(),'Select Board/Syllabus')]//following::div[2]")
    private WebElement boardSelectedInQuestCreation;

    @FindBy(how=How.XPATH,using="//label[contains(text(),'MEDIUM')]//following::div[contains(text(),'Select Medium')]")
    private WebElement clickMediumInQuestCreation;

    @FindBy(how=How.XPATH,using="//label[contains(text(),'MEDIUM')]//following::div[contains(text(),'Select Medium')]//following::div[2]")
    private WebElement mediumSelectedInQuestCreation;

    @FindBy(how=How.XPATH,using="//label[contains(text(),'GRADE LEVEL')]//following::div[contains(text(),'Select Grade')]")
    private WebElement clickClassInQuestCreation;

    @FindBy(how=How.XPATH,using="//label[contains(text(),'GRADE LEVEL')]//following::div[contains(text(),'Select Grade')]//following::div[2]")
    private WebElement classSelectedInQuestCreation;

    @FindBy(how=How.XPATH,using="//label[contains(text(),'SUBJECT')]//following::div[contains(text(),'Select Subject')]")
    private WebElement clickSubjectInQuestCreation;

    @FindBy(how=How.XPATH,using="//label[contains(text(),'SUBJECT')]//following::div[contains(text(),'Select Subject')]//following::div[2]")
    private WebElement subjectSelectedInQuestCreation;

    @FindBy(how=How.XPATH,using="//label[contains(text(),'LEVEL')]//following::div[contains(text(),'Select Level')]")
    private WebElement levelInQuestCreation;

    @FindBy(how=How.XPATH,using="//label[contains(text(),'LEVEL')]//following::div[contains(text(),'Select Level')]//following::div[2]")
    private WebElement selectEasyLevelInQuestCreation;

    @FindBy(how=How.XPATH,using="//button[@id='save-question-button'][contains(text(),'Save and Create')]")
    private WebElement saveAndCreate;

    @FindBy(how=How.ID,id="mcqoptions_0")
    private WebElement mcqAnswer1;
    @FindBy(how=How.ID,id="mcqoptions_1")
    private WebElement mcqAnswer2;

    @FindBy(how=How.XPATH,using="//input[@id='1']")
    private WebElement mcqCorrectAnswer;
    @FindBy(how=How.XPATH,using="//img[@alt='Navigate to Next']")
    private WebElement nextIconInPreview;

    @FindBy(how=How.XPATH,using="//div[@aria-label='Next']")
    private WebElement nextBtnInPreview;

    @FindBy(how=How.XPATH,using="//button[contains(text(),'Copy')]")
    private WebElement clickOnCopyButton;

    @FindBy(how=How.XPATH,using="//strong[contains(text(),'Question set successfully copied')]")
    private WebElement assertQuestionsetCopyToastrMsg;

    @FindBy(how=How.XPATH,using="//option[contains(text(),'Input count of questions to be displayed ')]//following::option[2]")
    private WebElement selectMaxquestion;

    @FindBy(how=How.XPATH,using="//li[contains(text(),'i')]")
    private WebElement progressBarIcon;

    @FindBy(how=How.XPATH,using="//*[contains(text(),'Match The Following')]//following::div[contains(text(),'Select')][2]")
    private WebElement mCQ;

    @FindBy(how=How.XPATH,using="//*[contains(text(),'Match The Following')]//following::div[contains(text(),'Select')][3]")
    private WebElement fTB;

    @FindBy(how=How.XPATH,using="//*[contains(text(),'Match The Following')]//following::div[contains(text(),'Select')][4]")
    private WebElement reOrderingWords;

    @FindBy(how=How.XPATH,using="//*[contains(text(),'Match The Following')]//following::div[contains(text(),'Select')][5]")
    private WebElement ArrangeInSequence;

    public void clkAddQuestionSetIcon() throws InterruptedException {
      //  UtilityFunctions.waitForElementIsVisible(addQuestionSet);
        UtilityFunctions.waitForElementAndClickable(addQuestionSet);

    }

    public void selectFirstQuestionInList() throws InterruptedException {
       // UtilityFunctions.waitForElementIsVisible(selectFirstQuestion);
Thread.sleep(5000);
        selectFirstQuestion.click();
      //  UtilityFunctions.waitForElementAndClickable(selectFirstQuestion);

    }
    public void clickNextBtnInQuestionListPage() throws InterruptedException {
        UtilityFunctions.waitForElementAndClickable(NextbtnInSelectQuestionPage);

    }

    public void enterQuestionSetTitle(String questionsetTitle) throws InterruptedException {

        UtilityFunctions.waitToBeClickableAndSendKeys(questionSetTitleTextBox, questionsetTitle);
    }
    public void clickAddButtonInQuestionTitlePage() throws InterruptedException {
      //  UtilityFunctions.waitForElementUsingForLoopAndAssert(addBtnInQuestionSeTitlePage,4);
     UtilityFunctions.waitForElementAndClickable(addBtnInQuestionSeTitlePage);
      //  addBtnInQuestionSeTitlePage.click();
    }
    public void immediateFeedback() throws InterruptedException {
        showImmediateFeedback.click();
       // UtilityFunctions.waitForElementAndClickable(showImmediateFeedback);
        Listeners.addLogs("clicked on showImmediate feedback");
    }
    public void shuffleQuestions() throws InterruptedException {
       shuffleQuestions.click();
      // UtilityFunctions.waitForElementAndClickable(shuffleQuestions);
        Listeners.addLogs("clicked on shuffleQuestions");
    }


    public void searchTextBoxInQuestionSet(String questionType) throws InterruptedException {
        UtilityFunctions.waitForElementIsVisible(searchTextBox);
        UtilityFunctions.waitToBeClickableAndSendKeys(searchTextBox, questionType);
        Listeners.addLogs("Entered question in  searchTextBox");
    }

    public void clickSearchIcon() throws InterruptedException {
        UtilityFunctions.waitForElementAndClickable(searchIcon);
        Listeners.addLogs("clicked on searchIcon button");
    }
    public void assertQuestionDisplayedBasedOnSearch() {
        UtilityFunctions.waitForElementIsVisible(assertSearchedQuestionTypeDisplayed);
        UtilityFunctions.validatIsElementPresent(assertSearchedQuestionTypeDisplayed, "assertSearchedQuestionTypeDisplayed  is not Displayed");
        Listeners.addLogs("validated questionSet after question search");

    }  public void copyQuestionIcon() throws InterruptedException {
        UtilityFunctions.waitForVisibilityOfWebElement(copyButtonInQuestionPage);
        UtilityFunctions.waitForElementAndClickable(copyButtonInQuestionPage);
        Listeners.addLogs("clicked on copy button");
    }
    public void nextBtnInQuestion() throws InterruptedException {
        UtilityFunctions.waitForElementAndClickable(nextBtnInQuestionPage);
        Listeners.addLogs("clicked on nextBtnInQuestionPage");
    }
    public void submitInQuestionPage() throws InterruptedException {
        UtilityFunctions.waitForElementAndClickable(SubmitInQuestioPage);
        Listeners.addLogs("clicked on SubmitInQuestioPage");
    }
    public void titleName(String titleName) throws InterruptedException {
        UtilityFunctions.waitForElementIsVisible(titleQuestionName);
        titleQuestionName.clear();
        UtilityFunctions.waitToBeClickableAndSendKeys(titleQuestionName, titleName);
        Listeners.addLogs("Entered titleName");

    }
    public void editIcon() throws InterruptedException {
        UtilityFunctions.waitForVisibilityOfWebElement(editQuestion);
        UtilityFunctions.waitForElementAndClickable(editQuestion);
        Listeners.addLogs("clicked on editQuestion");
    }

    public void deleteIcon() throws InterruptedException {
        UtilityFunctions.waitForElementAndClickable(deleteQuestion);
        Listeners.addLogs("clicked on deleteQuestion");
    }
    public void deleteConfirm() throws InterruptedException {
        UtilityFunctions.waitForElementAndClickable(deleteConfirmBtn);
        Listeners.addLogs("clicked on deleteQuestion");
    }

    public void assertDidNotFindQuestion() {
        UtilityFunctions.waitForVisibilityOfWebElement(assertDidNotFindQuestionMsg);
        UtilityFunctions.validatIsElementPresent(assertDidNotFindQuestionMsg, "Didn't delete the question");
        Listeners.addLogs("validated Question got deleted in questionSet");
     }
     public String getFirstQuestionName()
     {
         UtilityFunctions.waitForVisibilityOfWebElement(getFirstQuestion);
         String quesName= UtilityFunctions.getTextFromElement(getFirstQuestion);
      return quesName;
     }

    public void advanceFilter() throws InterruptedException {
        UtilityFunctions.waitForElementAndClickable(advanceFilter);
        Listeners.addLogs("clicked on advanceFilter");
    }

    public void myQuestiontoggle() throws InterruptedException {
        //UtilityFunctions.pressEnterKeyOnWebElement(myQuestionTogglebtn);
       myQuestionTogglebtn.click();
    //    UtilityFunctions.waitForElementAndClickable(myQuestionTogglebtn);
        Listeners.addLogs("clicked on myQuestionTogglebtn");
    }
    public String getTotalQuestionCount()
    {
        UtilityFunctions.waitForVisibilityOfWebElement(totalQuestionFound);
        String quescount= UtilityFunctions.getTextFromElement(totalQuestionFound);
        return quescount;
    }

    public void difficlutFilter() throws InterruptedException {
        UtilityFunctions.waitForElementAndClickable(difficultyLevelDropdown);
        Listeners.addLogs("clicked on difficultyLevelDropdown");
    }
    public void selectDifficuluEasy() throws InterruptedException {
        UtilityFunctions.waitForElementAndClickable(selectDifficultLevelEasy);
        Listeners.addLogs("clicked on selectDifficultLevelEasy");
    }

    public void questType() throws InterruptedException {
        UtilityFunctions.waitForElementAndClickable(questionTypeDropdown);
        Listeners.addLogs("clicked on questionTypeDropdown");
    }
    public void selectQueMCQType() throws InterruptedException {
        UtilityFunctions.waitForElementAndClickable(selectQuestionTypeMCQ);
        Listeners.addLogs("clicked on selectQuestionTypeMCQ");
    }
    public void boardDropdown() throws InterruptedException {
        UtilityFunctions.waitForElementAndClickable(boardDropDown);
        Listeners.addLogs("clicked on boardDropDown");
    }
    public void selectBoardValue() throws InterruptedException {
        UtilityFunctions.waitForElementAndClickable(selectBoardDropdown);
        Listeners.addLogs("clicked on selectBoardDropdown");
    }

    public void mediumDropdown() throws InterruptedException {
        UtilityFunctions.waitForElementAndClickable(mediumDropDown);
        Listeners.addLogs("clicked on mediumDropDown");
    }
    public void selectMediumValue() throws InterruptedException {
        UtilityFunctions.waitForElementAndClickable(selectMediumDropdown);
        Listeners.addLogs("clicked on selectMediumDropdown");
    }

    public void classDropdown() throws InterruptedException {
        UtilityFunctions.waitForElementAndClickable(classDropDown);
        Listeners.addLogs("clicked on classDropDown");
    }
    public void selectClassValue() throws InterruptedException {
        UtilityFunctions.waitForElementAndClickable(selectClassValue);
        Listeners.addLogs("clicked on selectClassValue");
    }
    public void subjectDropdown() throws InterruptedException {
        UtilityFunctions.waitForElementAndClickable(subjectDropDown);
        Listeners.addLogs("clicked on subjectDropDown");
    }
    public void selectSubjectValue() throws InterruptedException {
        UtilityFunctions.waitForElementAndClickable(selectSubjectValue);
        Listeners.addLogs("clicked on selectSubjectValue");
    }

    public void assertDeleteIcon() throws InterruptedException {
        UtilityFunctions.waitForElementIsVisible(deleteQuestion);
        UtilityFunctions.validatIsElementPresent(deleteQuestion,"Delete icon not displayed");
        Listeners.addLogs("Delete Icon displayed");
    }
    public void addMoreQuestions() throws InterruptedException {
        UtilityFunctions.waitForElementAndClickable(addMoreQuestionButton);
        Listeners.addLogs("Clicked on AddMoreQuestion button");

    }

    public void createQuestion() throws InterruptedException {
        UtilityFunctions.waitForElementAndClickable(createQuestion);
        Listeners.addLogs("Clicked on createQuestion button");

    }
    public void switchToFrameUsingName() throws InterruptedException {
        UtilityFunctions.waitForFrameToBeAvailable(frameRichTextEditorSwitch);
//UtilityFunctions.switchToFrameUsingXpath(frameRichTextEditorSwitch);
       Listeners.addLogs("Switched Frame");

    }
    public void selectMTF() throws InterruptedException {
        UtilityFunctions.waitForElementAndClickable(mTF);
        Listeners.addLogs("Clicked on mTF Template");

    }
    public void selectMCQ() throws InterruptedException {
        UtilityFunctions.waitForElementAndClickable(mCQ);
        Listeners.addLogs("Clicked on mCQ Template");

    }
    public void selectFTB() throws InterruptedException {
        UtilityFunctions.waitForElementAndClickable(fTB);
        Listeners.addLogs("Clicked on fTB");

    }
    public void enterQuestionInTextBox(String questionData) throws InterruptedException {
       // UtilityFunctions.waitForElementUsingForLoop(enterQuestionTextBox,50);
       // UtilityFunctions.waitForElementIsVisible(enterQuestionTextBox);

//        try {
//            UtilityFunctions.waitToBeClickableAndSendKeys(enterQuestionTextBox, questionData);
//        }
//        catch(org.openqa.selenium.StaleElementReferenceException ex)
//        {
//            UtilityFunctions.waitToBeClickableAndSendKeys(enterQuestionTextBox, questionData);
//
//        }

      UtilityFunctions.waitToBeClickableAndSendKeys(enterQuestionTextBox, questionData);
      Listeners.addLogs("Entered titleName");
    }

    public void enterMCQQuestionInTextBox(String questionData) throws InterruptedException {

            UtilityFunctions.waitToBeClickableAndSendKeys(enterMCQQuestionTextBox, questionData);
   Listeners.addLogs("Entered MCQ titlename");
    }
    public void parentSwitchFrame() throws InterruptedException {
        UtilityFunctions.waitForFrameToBeAvailable(frameParentSwitch);
       // UtilityFunctions.switchToFrameUsingXpath(frameParentSwitch);
        Listeners.addLogs(" frameParentSwitch");

    }
    public void enterFirstPairQuestion(String quest1) throws InterruptedException {
        UtilityFunctions.waitForElementIsVisible(enterQuestion1);
        UtilityFunctions.waitToBeClickableAndSendKeys(enterQuestion1,quest1);
        Listeners.addLogs("EnterQuestion1");
    }
    public void enterFirstPairAnswer(String answer1) throws InterruptedException {
        UtilityFunctions.waitForElementIsVisible(enterAnswer1);
        UtilityFunctions.waitToBeClickableAndSendKeys(enterAnswer1,answer1);
        Listeners.addLogs("EnterAnswer1");
    }

    public void enterSecondPairQuestion(String quest2) throws InterruptedException {
        UtilityFunctions.waitForElementIsVisible(enterQuestion2);
        UtilityFunctions.waitToBeClickableAndSendKeys(enterQuestion2,quest2);
        Listeners.addLogs("EnterQuestion2");
    }
    public void enteSecondPairAnswer(String answer2) throws InterruptedException {
        UtilityFunctions.waitForElementIsVisible(enterAnswer2);
        UtilityFunctions.waitToBeClickableAndSendKeys(enterAnswer2,answer2);
        Listeners.addLogs("EnterAnswer2");
    }
    public void enterThirdPairQuestion(String quest3) throws InterruptedException {
        UtilityFunctions.waitForElementIsVisible(enterQuestion3);
        UtilityFunctions.waitToBeClickableAndSendKeys(enterQuestion3,quest3);
        Listeners.addLogs("EnterQuestion3");
    }
    public void enterThirdPairAnswer(String answer3) throws InterruptedException {
        UtilityFunctions.waitForElementIsVisible(enterAnswer3);
        UtilityFunctions.waitToBeClickableAndSendKeys(enterAnswer3,answer3);
        Listeners.addLogs("EnterAnswer3");
    }
    public void refresh() throws InterruptedException {
        UtilityFunctions.waitForElementAndClickable(refreshBtn);
        Listeners.addLogs("Clicked on refreshBtn");

    }

    public void boardDropdownInQuestCreation() throws InterruptedException {
        UtilityFunctions.waitForElementAndClickable(clickBoardDropDownInQuestCreation);
        Listeners.addLogs("clicked on boardDropDown");
    }
    public void selectBoardValueInQuestCreation() throws InterruptedException {
        UtilityFunctions.waitForElementAndClickable(boardSelectedInQuestCreation);
        Listeners.addLogs("clicked on selectBoardDropdown");
    }

    public void mediumDropdownInQuestCreation() throws InterruptedException {
        UtilityFunctions.waitForElementAndClickable(clickMediumInQuestCreation);
        Listeners.addLogs("clicked on mediumDropDown");
    }
    public void selectMediumValueInQuestCreation() throws InterruptedException {
        UtilityFunctions.waitForElementAndClickable(mediumSelectedInQuestCreation);
        Listeners.addLogs("clicked on selectMediumDropdown");
    }

    public void classDropdownInQuestCreation() throws InterruptedException {
        UtilityFunctions.waitForElementAndClickable(clickClassInQuestCreation);
        Listeners.addLogs("clicked on classDropDown");
    }
    public void selectClassValueInQuestCreation() throws InterruptedException {
        UtilityFunctions.waitForElementAndClickable(classSelectedInQuestCreation);
        Listeners.addLogs("clicked on selectClassValue");
    }
    public void subjectDropdownInQuestCreation() throws InterruptedException {
        UtilityFunctions.waitForElementAndClickable(clickSubjectInQuestCreation);
        Listeners.addLogs("clicked on subjectDropDown");
    }
    public void selectSubjectValueInQuestCreation() throws InterruptedException {
        UtilityFunctions.waitForElementAndClickable(subjectSelectedInQuestCreation);
        Listeners.addLogs("clicked on selectSubjectValue");
    }
    public void levelDropDownInQuestionCreation() throws InterruptedException {
        UtilityFunctions.scrollInToviewUsingJavaScript(levelInQuestCreation);
        UtilityFunctions.waitForElementAndClickable(levelInQuestCreation);
        Listeners.addLogs("clicked on levelInQuestCreation");
    }
    public void easylevelDropDownInQuestionCreation() throws InterruptedException {
        UtilityFunctions.waitForElementAndClickable(selectEasyLevelInQuestCreation);
        Listeners.addLogs("selectEasyLevelInQuestCreation");
    }
    public void saveAndCreateBtn() throws InterruptedException {
        UtilityFunctions.waitForElementAndClickable(saveAndCreate);
        Listeners.addLogs("saveAndCreate");
    }

    public void entermcqAns1(String answer1) throws InterruptedException {
        UtilityFunctions.scrollInToviewUsingJavaScript(mcqAnswer1);
        UtilityFunctions.waitForElementIsVisible(mcqAnswer1);
        UtilityFunctions.waitToBeClickableAndSendKeys(mcqAnswer1,answer1);
        Listeners.addLogs("entered mcqAnswer1");
    }
    public void entermcqAns2(String answer2) throws InterruptedException {
        UtilityFunctions.waitForElementIsVisible(mcqAnswer2);
        UtilityFunctions.waitToBeClickableAndSendKeys(mcqAnswer2,answer2);
        Listeners.addLogs("entered MCQ answer2");
    }
    public void mcaMarkAsRigthAnswer() throws InterruptedException {
        UtilityFunctions.waitForElementAndClickable(mcqCorrectAnswer);
        Listeners.addLogs("clicked on mcqCorrectAnswer");
    }

    public void nextIconInPreview() throws InterruptedException {
        UtilityFunctions.waitToBeClickableAndClick(nextIconInPreview);
        Listeners.addLogs("Clicked on nextIconInPreview");
    }
    public void nextButtonPreview() throws InterruptedException {
        UtilityFunctions.waitToBeClickableAndClick(nextBtnInPreview);
        Listeners.addLogs("Clicked on nextBtnInPreview");
    }
    public void clickOnCopyButton() {
        UtilityFunctions.waitToBeClickableAndClick(clickOnCopyButton);
        Listeners.addLogs("Click on copy button");

    }
    public String assertQuestionsetCopyToastrMsg() {
        UtilityFunctions.waitForVisibilityOfWebElement(assertQuestionsetCopyToastrMsg);
        String getActualText = UtilityFunctions.getTextFromElement(assertQuestionsetCopyToastrMsg);
        return getActualText;
    }
    public String selectMaxQuestion() {
        String maxvalue = UtilityFunctions.getTextFromElement(selectMaxquestion);
        Listeners.addLogs("Select max question");
        return maxvalue;
    }

    public void assertProgressBariIcon() {
        UtilityFunctions.waitForElementIsVisible(progressBarIcon);
        UtilityFunctions.validatIsElementPresent(progressBarIcon,"I icon not displayed");
        Listeners.addLogs("I Icon is displayed in root node of the intruction page");

    }

}

