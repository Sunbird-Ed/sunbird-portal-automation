package com.sunbird.PageObjects;

import com.sunbird.GenericLibrary.UtilityFunctions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class DashboardPage {
	@FindBy(how=How.XPATH,using="//span[contains(text(),'English')]//following::div[contains(@class,'avatar-container')]")
//	@FindBy(how=How.XPATH,using="//span[contains(text(),'English')]//following::div[@class='sb-avatar__img']")
	private WebElement userProfileIcon;

	@FindBy(how=How.XPATH,using="//*[contains(text(),'Workspace')]")
	private WebElement workspace;

public void userProfileIcon() {
		
	UtilityFunctions.waitToBeClickableAndClick(userProfileIcon);
	}
public void workspace() {
	
	UtilityFunctions.waitToBeClickableAndClick(workspace);
	
	}
	

}
