package com.sunbird.PageObjects;

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








    @FindBy(how=How.XPATH,using="//i[@id='org.ekstep.text']")
    private WebElement clkAddText;

    @FindBy(how=How.XPATH,using="//i[@id='shape']")
    private WebElement clkAddShapeDropDown;

    @FindBy(how=How.XPATH,using="//i[@id='shape']//following::span[contains(text(),'Triangle')]")
    private WebElement selectShape;

    @FindBy(how=How.XPATH,using="//div[@id='saveButton']")
    private WebElement clkSaveButton;

    @FindBy(how=How.XPATH,using="//button[@class='ui orange button']")
    private WebElement clkCloseIcon;

    @FindBy(how=How.XPATH,using="//i[@class='send icon']")
    private WebElement clkSendForReviewBtn;

    @FindBy(how=How.XPATH,using="//div[@class='addImageText']")
    private WebElement clkAddImageIcon;

    @FindBy(how=How.XPATH,using="//*[@id='allImagesTab']")
    private WebElement clkAllImagesTab;

    @FindBy(how=How.XPATH,using="//div[@class='ui image']")
    private WebElement selectFirstImages;

    @FindBy(how=How.XPATH,using="//button[contains(text(),'Select')]")
    private WebElement clkSelectInImagePopup;

    @FindBy(how=How.XPATH,using="//div[text()='Select Additional Category']")
    private WebElement clkAdditionalCategoryDropdown;

    @FindBy(how=How.XPATH,using="//div[text()='TV Lesson']")
    private WebElement SelectadditionalCategorySelected;

    @FindBy(how=How.XPATH,using="//div[text()='Select Board/Syllabus']")
    private WebElement clkBoardDropdown;
    @FindBy(how=How.XPATH,using="//div[text()='Select Board/Syllabus']//following::div[2]")
    private WebElement SelectBoradValue;

    @FindBy(how=How.XPATH,using="//div[text()='Select Medium']")
    private WebElement clkMediumDropdown;
    @FindBy(how=How.XPATH,using="//div[text()='Select Medium']//following::div[2]")
    private WebElement selectMedium;

    @FindBy(how=How.XPATH,using="//div[text()='Select Class']")
    private WebElement clickClassDropdown;
    @FindBy(how=How.XPATH,using="//div[text()='Select Class']//following::div[2]")
    private WebElement selectClassValue;

    @FindBy(how=How.XPATH,using="//div[text()='Select Subject']")
    private WebElement clickSubject;
    @FindBy(how=How.XPATH,using="//div[text()='Select Subject']//following::div[2]")
    private WebElement selectSubjectValue;

    @FindBy(how=How.XPATH,using="//input[@id='copyrightYear']")
    private WebElement enterYearOfCreation;

    @FindBy(how=How.XPATH,using="//button[contains(text(),'Save')]")
    private WebElement SubmitBtnInSendForReview;




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
        UtilityFunctions.waitForElementAndClickable(addQuestionSet);

    }

    public void selectFirstQuestionInList() throws InterruptedException {
        UtilityFunctions.waitForElementAndClickable(selectFirstQuestion);

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


}
