package com.sunbird.PageObjects;

import com.sunbird.GenericLibrary.Listeners;
import com.sunbird.GenericLibrary.UtilityFunctions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class WorkspaceDashboardPage {

    @FindBy(how = How.XPATH, using = "//a[contains(text(),'Drafts')]")
    private WebElement drafts;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Book')]")
    private WebElement book;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Course')]")
    private WebElement course;

    @FindBy(how = How.XPATH, using = "//span[text()='Resource']")
    private WebElement resource;

    @FindBy(how = How.XPATH, using = "//span[text()='Collection']")
    private WebElement collection;

    @FindBy(how = How.XPATH, using = "//*[contains(text(),' All My Content ')]")
    private WebElement allMyContent;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'QuestionSet')]")
    private WebElement questionSet;

    @FindBy(how = How.XPATH, using = "//*[contains(text(),' Published')]")
    private WebElement published;

    @FindBy(how = How.XPATH, using = "//*[contains(text(),' All Textbooks ')]")
    private WebElement allTextbooks;

    @FindBy(how = How.XPATH, using = "//a[contains(text(),'Create')]")
    private WebElement create;

    @FindBy(how = How.XPATH, using = "//a[contains(text(),'Submitted for review ')]")
    private WebElement submitForReview;

    @FindBy(how = How.XPATH, using = "//a[contains(text(),'Course Batches')]")
    private WebElement coursebatches;

    @FindBy(how = How.XPATH, using = "//a[contains(text(),'Created by me')]")
    private WebElement createdbyme;

    @FindBy(how = How.XPATH, using = "//a[contains(text(),'Assigned to me')]")
    private WebElement assignedtome;

    @FindBy(how = How.XPATH, using = "//a[contains(text(),'Shared')]")
    private WebElement sharedvialink;

    @FindBy(how = How.XPATH, using = "//a[contains(text(),'Collaborations')]")
    private WebElement collaborations;

    @FindBy(how = How.XPATH, using = "//a[contains(text(),'All Uploads')]")
    private WebElement alluploads;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Lesson Plan')]")
    private WebElement lessonPlanOption;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Upload Content')]")
    private WebElement uploadContentOption;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Upload Large Videos')]")
    private WebElement uploadLargeContentOption;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Course Assessment')]")
    private WebElement courseAssessmentOption;

    public void assertDrafts() throws InterruptedException {

        UtilityFunctions.waitToBeClickableAndClick(drafts);
        UtilityFunctions.validatIsElementPresent(drafts, "Draft Section not displayed");

    }

    public void clickDrafts() {

        UtilityFunctions.waitToBeClickableAndClick(drafts);
        Listeners.addLogs("Clicked on drafts ");

    }

    public void clickBook() {

        UtilityFunctions.waitToBeClickableAndClick(book);
        Listeners.addLogs("Clicked on book ");

    }

    public void clickCourse() {

        UtilityFunctions.waitToBeClickableAndClick(course);
        Listeners.addLogs("Clicked on course ");

    }

    public void clickResource() {

        UtilityFunctions.waitToBeClickableAndClick(resource);
        Listeners.addLogs("Clicked on resource ");

    }

    public void clickCollection() {

        UtilityFunctions.waitToBeClickableAndClick(collection);
        Listeners.addLogs("Clicked on collection ");

    }

    public void allMyContent() {

        UtilityFunctions.waitToBeClickableAndClick(allMyContent);
        Listeners.addLogs("Clicked on allMyContent ");

    }

    public void questionSet() {

        UtilityFunctions.waitToBeClickableAndClick(questionSet);
        Listeners.addLogs("Clicked on QuestionSet ");

    }

    public void published() {

        UtilityFunctions.waitToBeClickableAndClick(published);
        Listeners.addLogs("Clicked on published ");

    }

    public void allTextBook() {

        UtilityFunctions.waitToBeClickableAndClick(allTextbooks);
        Listeners.addLogs("Clicked on allTextbooks ");

    }

    public void assertCreateButton() throws InterruptedException {

        UtilityFunctions.waitToBeClickableAndClick(create);
        UtilityFunctions.validatIsElementPresent(create, "Create button is not displayed");

    }

    public void assertsubmittedForReview() {

        UtilityFunctions.waitToBeClickableAndClick(submitForReview);
        UtilityFunctions.validatIsElementPresent(submitForReview, "Submit for Review button is not displayed");
    }

    public void assertCourseBatchesbutton() throws InterruptedException {

        UtilityFunctions.waitToBeClickableAndClick(coursebatches);
        UtilityFunctions.validatIsElementPresent(coursebatches, "Course Batches button is not displayed");

    }

    public void assertCreatedByMe() throws InterruptedException {

        UtilityFunctions.waitToBeClickableAndClick(createdbyme);
        UtilityFunctions.validatIsElementPresent(createdbyme, "Created By Me button is not displayed");

    }

    public void assertAssignedToMe() throws InterruptedException {

        UtilityFunctions.waitToBeClickableAndClick(assignedtome);
        UtilityFunctions.validatIsElementPresent(assignedtome, "Assigned to Me button is not displayed");

    }

    public void assertSharedViaLink() throws InterruptedException {

        UtilityFunctions.waitToBeClickableAndClick(sharedvialink);
        UtilityFunctions.validatIsElementPresent(sharedvialink, "Shared Via link button is not displayed");

    }

    public void assertCollaborations() throws InterruptedException {

        UtilityFunctions.waitToBeClickableAndClick(collaborations);
        UtilityFunctions.validatIsElementPresent(collaborations, "Collaborations button is not displayed");

    }

    public void clickAllUploads() throws InterruptedException {

        UtilityFunctions.waitToBeClickableAndClick(alluploads);

    }
    public void assertAllUpload() {

        UtilityFunctions.waitToBeClickableAndClick(alluploads);
        UtilityFunctions.validatIsElementPresent(alluploads, "All Uploads Section not displayed");
    }

    public void assertBookOPtion() throws InterruptedException {
        UtilityFunctions.waitForVisibilityOfWebElement(book);
        UtilityFunctions.validatIsElementPresent(book, "Book option is not displayed");

    }

    public void assertCourseOption() throws InterruptedException {

        UtilityFunctions.validatIsElementPresent(course, "Course option is not displayed");

    }

    public void assertResourceOption() throws InterruptedException {

        UtilityFunctions.validatIsElementPresent(resource, "Resource option is not displayed");

    }

    public void assertCollectionOption() throws InterruptedException {

        UtilityFunctions.validatIsElementPresent(collection, "Collection is not displayed");

    }

    public void assertLessonPlanOption() throws InterruptedException {

        UtilityFunctions.validatIsElementPresent(lessonPlanOption, "Lesson Plan is not displayed");

    }

    public void assertUploadContentOption() throws InterruptedException {

        UtilityFunctions.validatIsElementPresent(uploadContentOption, "Upload Content option is not displayed");

    }

    public void assertUploadLargeContentOption() throws InterruptedException {

        UtilityFunctions.validatIsElementPresent(uploadLargeContentOption, "Upload Latge video option is not displayed");

    }

    public void assertCourseAssessmentOption() throws InterruptedException {

        UtilityFunctions.validatIsElementPresent(courseAssessmentOption, "Course Assessment option is not displayed");

    }

    public void assertQuestionSetOption() throws InterruptedException {

        UtilityFunctions.validatIsElementPresent(questionSet, "Question set option is not displayed");

    }
}