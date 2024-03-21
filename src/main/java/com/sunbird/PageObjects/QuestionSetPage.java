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

    @FindBy(how=How.XPATH,using="//button[@id='add-more-ques-button']//following::button[@class='ui blue button']")
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

    @FindBy(how=How.XPATH,using="//input[@name='myQuestions']//following::label[1]")
    private WebElement myQuestionTogglebtn;


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
        UtilityFunctions.waitForElementAndClickable(addBtnInQuestionSeTitlePage);

    }
    public void immediateFeedback() throws InterruptedException {
        UtilityFunctions.waitForElementAndClickable(showImmediateFeedback);
        Listeners.addLogs("clicked on showImmediate feedback");
    }
    public void shuffleQuestions() throws InterruptedException {
        UtilityFunctions.waitForElementAndClickable(shuffleQuestions);
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
        UtilityFunctions.pressEnterKeyOnWebElement(myQuestionTogglebtn);
        // UtilityFunctions.waitForElementAndClickable(myQuestionTogglebtn);
        Listeners.addLogs("clicked on myQuestionTogglebtn");
    }
    public String getTotalQuestionCount()
    {
        UtilityFunctions.waitForVisibilityOfWebElement(totalQuestionFound);
        String quescount= UtilityFunctions.getTextFromElement(totalQuestionFound);
        return quescount;
    }
}

