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





    @FindBy(how=How.XPATH,using="//button[@id='create-question-button']")
    private WebElement createQuestionButton;

    @FindBy(how=How.XPATH,using="(//div[@class='ui small primary button'])[2]")
    private WebElement selectMCQButton;

    @FindBy(how=How.XPATH,using="//body[@class='cke_editable cke_editable_themed cke_contents_ltr cke_show_borders']")
    private WebElement enterTheQuestionTextfield;

    @FindBy(how=How.XPATH,using="(//div[@title='Set Answer'])[1]")
    private WebElement answerNo1Textfield;

    @FindBy(how=How.XPATH,using="(//div[@title='Set Answer'])[2]")
    private WebElement answerNo2Textfield;

    @FindBy(how=How.XPATH,using="//input[@id='0']")
    private WebElement tickCorrectAnswer;

    @FindBy(how=How.XPATH,using="//button[@id='next-button']")
    private WebElement nextButton;


    @FindBy(how=How.XPATH,using="(//button[@id='save-question-button'])[1]")
    private WebElement saveAndCreateButton;

    @FindBy(how=How.XPATH,using="(//button[@id='cancel-button'])")
    private WebElement cancelButton;


    @FindBy(how=How.XPATH,using="//button[@class='ui blue button next-button']")
    private WebElement nextButtonAfterClickingCheckbox;

    @FindBy(how=How.XPATH,using="//button[text()='Edit']")
    private WebElement editQuestionSetButton;

    @FindBy(how=How.XPATH,using="(//div[@class='qb-question-action three wide column'])[51]/child::span[2]")
    private WebElement editQuestionButton;

    //(//div[@class='qb-question-action three wide column'])[1]//child::span
    @FindBy(how=How.XPATH,using="(//i[@class='copy icon'])[1]")
    private WebElement copyQuestionButton;

    @FindBy(how=How.XPATH,using="//button[text()='Add answer ']")
    private WebElement addAnswerButton;

    @FindBy(how=How.XPATH,using="(//div[@title='Set Answer'])[3]")
    private WebElement answerNo3Textfield;

    @FindBy(how=How.XPATH,using="//i[@class='cursor-pointer close link icon']")
    private WebElement crossIcon;

    @FindBy(how=How.XPATH,using="(//button[@id='save-question-button'])[2]")
    private WebElement submitButton;

    @FindBy(how=How.XPATH,using="//input[@id='shuffle0questions']")
    private WebElement shuffleQuestionsButton;


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

    }

}
