package com.sunbird.PageObjects;

import com.sunbird.GenericLibrary.Listeners;
import com.sunbird.GenericLibrary.UtilityFunctions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ResourcePage {

    @FindBy(how=How.XPATH,using="//input[@placeholder='Name']")
    private WebElement resourceName;

    @FindBy(how=How.XPATH,using="//sui-select[@id='primaryCategory']")
    private WebElement clickSelectContentType;

    @FindBy(how=How.XPATH,using="//span[text()='Explanation Content'][1]")
    private WebElement selectExplanationContent;

    @FindBy(how=How.XPATH,using="//button[text()=' Start creating ']")
    private WebElement startCreating;

    @FindBy(how=How.XPATH,using="//i[@class='icon-newstage icon custom-menu-icon']")
    private WebElement clkAddSlide;

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




    public void enterResourceName(String resourceNamecreation) throws InterruptedException {
        UtilityFunctions.waitToBeClickableAndSendKeys(resourceName, resourceNamecreation);

    }

    public void clkContentTypeDropdown() throws InterruptedException {
        UtilityFunctions.waitToBeClickableAndClick(clickSelectContentType);

    }

    public void selectExplanationContentType() throws InterruptedException {
        UtilityFunctions.waitToBeClickableAndClick(selectExplanationContent);

    }
    public void clickStartCreating() throws InterruptedException {
        UtilityFunctions.waitToBeClickableAndClick(startCreating);

    }
    public void addShape() throws InterruptedException {
        UtilityFunctions.waitToBeClickableAndClick(clkAddShapeDropDown);

    }
    public void selectShape() throws InterruptedException {
        UtilityFunctions.waitToBeClickableAndClick(selectShape);

    }

    public void addText() throws InterruptedException {
        UtilityFunctions.waitToBeClickableAndClick(clkAddText);

    }
    public void addNewSlide() throws InterruptedException {
        UtilityFunctions.waitToBeClickableAndClick(clkAddSlide);

    }
    public void clickSaveIcon() throws InterruptedException {
        UtilityFunctions.waitToBeClickableAndClick(clkSaveButton);

    }
    public void clickCloseIcon() throws InterruptedException {
        UtilityFunctions.waitToBeClickableAndClick(clkCloseIcon);

    }
    public void clickSendForReviewButton() throws InterruptedException {
        UtilityFunctions.waitToBeClickableAndClick(clkSendForReviewBtn);

    }
    public void addImageInSendForReview() throws InterruptedException {
        UtilityFunctions.waitToBeClickableAndClick(clkAddImageIcon);
        UtilityFunctions.waitToBeClickableAndClick(selectFirstImages);
        UtilityFunctions.waitToBeClickableAndClick(clkSelectInImagePopup);


    }
    public void selectAdditionalCategory() throws InterruptedException {
        UtilityFunctions.scrollInToviewUsingJavaScript(clkAdditionalCategoryDropdown);
        UtilityFunctions.waitToBeClickableAndClick(SelectadditionalCategorySelected);

    }

    public void selectBoard() throws InterruptedException {
        UtilityFunctions.waitToBeClickableAndClick(clkBoardDropdown);
        UtilityFunctions.waitToBeClickableAndClick(SelectBoradValue);

    }
    public void selectMedium() throws InterruptedException {
        UtilityFunctions.waitToBeClickableAndClick(clkMediumDropdown);
        UtilityFunctions.waitToBeClickableAndClick(selectMedium);

    }

    public void selectClass() throws InterruptedException {
        UtilityFunctions.waitToBeClickableAndClick(clickClassDropdown);
        UtilityFunctions.waitToBeClickableAndClick(selectClassValue);

    }
    public void selectSubject() throws InterruptedException {
        UtilityFunctions.waitToBeClickableAndClick(clickSubject);
        UtilityFunctions.waitToBeClickableAndClick(selectSubjectValue);

    }

    public void enterYearofCreation(String enterYear) throws InterruptedException {
        UtilityFunctions.scrollInToviewUsingJavaScript(enterYearOfCreation);
        UtilityFunctions.waitToBeClickableAndSendKeys(enterYearOfCreation, enterYear);

    }
    public void clickSubmitInReviewPopup() throws InterruptedException {
        UtilityFunctions.waitToBeClickableAndClick(SubmitBtnInSendForReview);

    }
}
