package com.sunbird.PageObjects;

import com.sunbird.GenericLibrary.Listeners;
import com.sunbird.GenericLibrary.UtilityFunctions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class CoursePage {
  


    @FindBy(how=How.XPATH,using="//textarea[@placeholder='Description']")
    private WebElement description;

    @FindBy(how=How.XPATH,using="//input[@aria-label='Input the keyword and press enter']")
    private WebElement keyWords;




	@FindBy(how=How.XPATH,using="//label[contains(text(),'Board')]//following::select[@id='sb-dropdown']")
	private WebElement clickBoardDropDown;
	
	@FindBy(how=How.XPATH,using="//label[contains(text(),'Board')]//following::select[@id='sb-dropdown']//following::option")
	private WebElement boardSelected;
	
	@FindBy(how=How.XPATH,using="//li[text()='Select Medium']")
	private WebElement clickMedium;
	
	@FindBy(how=How.XPATH,using="//li[text()='Select Medium']//following::li[2]")
	private WebElement mediumSelected;
	
	@FindBy(how=How.XPATH,using="//li[text()='Select Class']")
	private WebElement clickClass;
	
	@FindBy(how=How.XPATH,using="//li[text()='Select Class']//following::li[3]")
	private WebElement classSelected;
	
	@FindBy(how=How.XPATH,using="//li[text()='Select Subject']")
	private WebElement clickSubject;
	
	@FindBy(how=How.XPATH,using="//li[text()='Select Subject']//following::li[2]")
	private WebElement subjectSelected;
	
	@FindBy(how=How.XPATH,using="//input[@placeholder='Copyright Year']")
	private WebElement copyright;
	
	@FindBy(how=How.XPATH,using="//button[text()=' Save as Draft ']")
	private WebElement SaveAsDraft;
	
	@FindBy(how=How.XPATH,using="//button[text()=' Add Child ']")
	private WebElement AddChild;
	
	
	@FindBy(how=How.XPATH,using="//button[contains(text(),'Add from library')]")
	private WebElement addFromLibraryButton;
	@FindBy(how=How.XPATH,using="//input[@id='searchInputField']")
	private WebElement searchContentFromLibrary;
	
	@FindBy(how=How.XPATH,using="//button[contains(text(),'Select content')]")
	private WebElement selectButton;
	@FindBy(how=How.XPATH,using="//button[@id='addResource']")
	private WebElement addContent;
	
	@FindBy(how=How.XPATH,using="//i[contains(@class,'arrow left icon')]")
	private WebElement contentFromLibrayBackButton;
	
	@FindBy(how=How.XPATH,using="//button[contains(text(),'Send for Review')]")
	private WebElement submitForreviewButton;
	
	@FindBy(how=How.XPATH,using="//span[contains(text(),'I agree that by submitting / publishing this Content,')]")
	private WebElement termsAndConditionCheckbox;
	
	@FindBy(how=How.XPATH,using="//div[contains(text(),'Accepting Terms & Conditions')]//following::button")
	private WebElement submitButtonInSendReview;
	
	@FindBy(how=How.XPATH,using="//strong[contains(text(),'Content is sent for review')]")
	private WebElement assertSendForReviewToastrMsg;
	
		


         


}
