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
import org.testng.Assert;


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

	/* This method will just wait untill the given webElement is visible */
	public static void waitForVisibilityOfWebElement(WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOf(element));
			}

			/* FluentWait method will wait for the given webElement with provided max time with pollingEvery given second */
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
	
	/* This is fluentWait approach method which accepts WebElement as parameter and call the fluent method*/
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

/* This method will take Xpath as string and perform findElement operation and click */
	public static void findElementAndClick(String xpathValue)
	{

		driver.findElement(By.xpath(xpathValue)).click();
	}

	/* Method will get the current url and do the substring and returning the with extracted do_Id */
	  	public static String generate_Do_id() {
		String currentUrl = driver.getCurrentUrl();
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

	/* Method will accept WebElement as parameter and get text from the WebElement and return the fetched Text as String */
	public static String getTextFromElement(WebElement elementName)
	{
          String fetchedText=elementName.getText();
        return fetchedText;
    }

	public static void waitForFrameToLoad(int frameValue) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(frameValue));
	}

	/* This method will accept index value as parameter and switchToFrame to that provided Index value */
	public static void switchFrameOnIndex(int indexValue) throws InterruptedException {
Thread.sleep(5000);
	//	waitForFrameToLoad(indexValue);
		driver.switchTo().frame(indexValue);
	}

	/* This method will accept WebElement as paramter and uploadFile Path as String and it will upload
	using sendKeys approach using the provided String upload file path */

	public static void uploadSendKeys(WebElement element,String Value) {
			element.sendKeys(Value);
	}

	public static String getExactFilePath(String fileName)
	{
		String filepath = System.getProperty("user.dir")+ sunbird_config.getSunbidConfigPropertyValue("fileName");

		return filepath;
	}

	/* Method will accept Actual result and Expected Result as parameter value and Msg parameter is taken only if Assertion gets fail */
	public  static void stringValueComparision(String actual, String expected,String Msg)
	{
		Assert.assertEquals(actual,expected,Msg);

	}


}
