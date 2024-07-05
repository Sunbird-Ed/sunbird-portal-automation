
package com.sunbird.GenericLibrary;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.sunbird.ReportLibrary.ExtendReportGenerator;

public class Listeners extends BaseTestConfig implements ITestListener {
    ExtentTest test;
    ExtentReports extent = ExtendReportGenerator.getReport();
    public static ThreadLocal<ExtentTest> extenttest = new ThreadLocal<ExtentTest>();
    public static String expectedResult1;


    public void onTestStart(ITestResult result) {

        Library.test = extent.createTest("" + result.getMethod().getMethodName());
        extenttest.set(Library.test);


    }

    public void onTestSuccess(ITestResult result) {

        //	extenttest.get().addScreenCaptureFromBase64String(getScreenshots());

    }

    public void onTestFailure(ITestResult result) {

        Throwable throwable = result.getThrowable();
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        throwable.printStackTrace(printWriter);
        String exceptionStackTrace = stringWriter.toString();


        String linkCode = "<a class=\"button\" href=\"exception_details.html?exception=" + encodeURLParameter(exceptionStackTrace) + "\" target=\"_blank\">ERROR</a>";
        extenttest.get().log(Status.FAIL, expectedResult1);
        extenttest.get().addScreenCaptureFromBase64String(getScreenshots());

        extenttest.get().log(Status.FAIL, result.getThrowable());


    }

    private String encodeURLParameter(String parameter) {
        try {
            return URLEncoder.encode(parameter, StandardCharsets.UTF_8.toString()).replaceAll("\\+", "%20")
                    .replaceAll("\\%21", "!").replaceAll("\\%27", "'").replaceAll("\\%28", "(").replaceAll("\\%29", ")")
                    .replaceAll("\\%7E", "~");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            return "";
        }
    }

    public void onFinish(ITestContext context) {
        extent.flush();
    }

    public static String getScreenshots() {

        TakesScreenshot ts = (TakesScreenshot) driver;
        return ts.getScreenshotAs(OutputType.BASE64);

    }

    public static void addLogs(String logsMsg) {
        extenttest.get().log(Status.INFO, logsMsg);

    }
}
