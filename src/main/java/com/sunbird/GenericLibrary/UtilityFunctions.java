package com.sunbird.GenericLibrary;

import java.time.Duration;

import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;


public class UtilityFunctions extends BaseTestConfig {
	
	
	
	/* This method will wait untill expected conditions and then it will perform click event on the given webElement */
	public static void waitToBeClickableAndClick(WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(element));
		element.click();
	}
	
	/* This method will wait untill expected conditions and then it will perform click event on the given webElement and 
	 then is passes the testdata to the given textbox */
	public static void waitToBeClickableAndSendKeys(WebElement element,String Value) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(element));
		element.click();
		element.sendKeys(Value);
	}
	
	

	public static boolean fluenWait(WebElement element,int waitTime) {
	    boolean conditionFulfilled = true;
	    Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
	            .withTimeout(Duration.ofSeconds(waitTime))
	            .pollingEvery(Duration.ofSeconds(1))
	            .ignoring(NoSuchElementException.class);

	    try {
	        wait.until(ExpectedConditions.elementToBeClickable(element));
	    } catch (Exception e ){
	         conditionFulfilled = false;
	       
	    }
	    return conditionFulfilled;
	}
	
	
	public static void waitForElementAndClickable(WebElement element){
		int waitTime = 30;
		fluenWait(element,waitTime);
	    element.click();
	}

	
	/* This method will click on the UI screen using given dimension value */
	public static void MoveByOffSet(int a,int b)
	{
		
	Actions act = new Actions(driver);
	act.moveByOffset(a, b).click().build().perform();
	}


	public static void findElementAndClick(String xpathValue)
	{
		driver.findElement(By.xpath(xpathValue)).click();
	}

	/* Method will get the current url and do the substring and returning the with extracted do_Id */
	  	public static String generate_Do_id() {
	//	String currentUrl = driver.getCurrentUrl();
		String currentUrl="https://diksha.gov.in/workspace/edit/Course/do_31396703106942566414248/draft/Draft?lockKey=2bd4f204-c4b9-4648-a3e5-2a48714cc167&expiresAt=2024-01-11T08:57:27.591Z&expiresIn=60";
		String do_id = "do_";
		int startIndex = currentUrl.indexOf(do_id);
		String parsedString = currentUrl.substring(startIndex);
		String end_id = "/";
		int endIndex = parsedString.indexOf(end_id);
		endIndex = startIndex + endIndex;
		String DO_ID = currentUrl.substring(startIndex, endIndex);
		return DO_ID;
	}

	/* will give the RandomName by accepting the preFixName as parameter Ex: CourseJohn*/
	public static String generateRandomName(String preFixName) {
		Faker faker = new Faker();

	String name = faker.name().firstName();
	String randamtestdata=preFixName+name;
		return randamtestdata;
	}

	public static String getTextFromElement(WebElement elementName)
	{
          String fetchedText=elementName.getText();
        return fetchedText;
    }

	public static void switchFrameOnIndex(int indexValue) throws InterruptedException {
		Thread.sleep(3000);
		driver.switchTo().frame(indexValue);
	}

	public static void uploadSendKeys(WebElement element,String Value) {
			element.sendKeys(Value);
	}

	public static String getExactFilePath(String fileName)
	{
		String filepath = System.getProperty("user.dir")+ sunbird_config.getSunbidConfigPropertyValue("fileName");

		return filepath;
	}



}
