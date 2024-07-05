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

    @FindBy(how=How.XPATH,using="//div[@data-content='Preview']")
    private WebElement previewIcon;

    @FindBy(how=How.XPATH,using="//img[@class='menu-icon icon']")
    private WebElement assertQuestionInPreview;





    public void enterResourceName(String resourceNamecreation) throws InterruptedException {
        UtilityFunctions.waitToBeClickableAndSendKeys(resourceName, resourceNamecreation);

    }

    public void clkContentTypeDropdown() throws InterruptedException {
        UtilityFunctions.waitForElementAndClickable(clickSelectContentType);

    }

    public void selectExplanationContentType() throws InterruptedException {
        UtilityFunctions.waitForElementAndClickable(selectExplanationContent);

    }
    public void clickStartCreating() throws InterruptedException {
        UtilityFunctions.waitToBeClickableAndClick(startCreating);

    }
    public void addShape() throws InterruptedException {
        UtilityFunctions.waitForElementAndClickable(clkAddShapeDropDown);

    }
    public void selectShape() throws InterruptedException {
        UtilityFunctions.waitForElementAndClickable(selectShape);

    }

    public void addText() throws InterruptedException {
        UtilityFunctions.waitForElementAndClickable(clkAddText);

    }
    public void addNewSlide() throws InterruptedException {
        UtilityFunctions.waitForElementAndClickable(clkAddSlide);

    }
    public void clickSaveIcon() throws InterruptedException {
        UtilityFunctions.waitForElementAndClickable(clkSaveButton);

    }
    public void clickCloseIcon() throws InterruptedException {
        UtilityFunctions.waitForElementAndClickable(clkCloseIcon);

    }
    public void clickSendForReviewButton() throws InterruptedException {
        UtilityFunctions.waitForElementAndClickable(clkSendForReviewBtn);

    }
    public void addImageInSendForReview() throws InterruptedException {
        UtilityFunctions.waitForElementAndClickable(clkAddImageIcon);
     Thread.sleep(2000);
        UtilityFunctions.waitForElementAndClickable(selectFirstImages);
        UtilityFunctions.waitForElementAndClickable(clkSelectInImagePopup);


    }
    public void selectAdditionalCategory() throws InterruptedException {
        UtilityFunctions.scrollInToviewUsingJavaScript(clkAdditionalCategoryDropdown);
        UtilityFunctions.waitForElementAndClickable(clkAdditionalCategoryDropdown);
        UtilityFunctions.scrollInToviewUsingJavaScript(SelectadditionalCategorySelected);
        UtilityFunctions.waitForElementAndClickable(SelectadditionalCategorySelected);

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
        UtilityFunctions.scrollInToviewUsingJavaScript(clickClassDropdown);
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

    public void previewIconButton() throws InterruptedException {
        UtilityFunctions.waitToBeClickableAndClick(previewIcon);
Listeners.addLogs("Clicked on preview Icon");
    }
    public void asssertQuestionInPreviewPlayer() {
        UtilityFunctions.waitForVisibilityOfWebElement(assertQuestionInPreview);
        UtilityFunctions.validatIsElementPresent(assertQuestionInPreview, "assertSearchedQuestionTypeDisplayed  is not Displayed");
        Listeners.addLogs("validated question in Preview Player");

    }

}
