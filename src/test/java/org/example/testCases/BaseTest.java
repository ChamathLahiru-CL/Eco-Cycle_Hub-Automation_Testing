package org.example.testCases;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.apache.commons.io.FileUtils;
import org.example.pageMethods.*;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import java.io.File;
import java.time.Duration;

import static java.lang.System.getProperty;

public class BaseTest {

    ExtentReports extent;
    WebDriver driver;
    registrationPage registrationPage;
    loginPage loginPage;
    productPage productPage;
    shoppingCartPage shoppingCartPage;
    directLoginPage directLoginPage;
    notificationPage notificationPage;
    datadrivenpage datadrivenpage;



    @BeforeTest
    public void beforeTest(){

        System.setProperty("webdriver.chrome.driver","C:/Users/ASUS/OneDrive - std.uwu.ac.lk/Documents/.Web Drivers/chromedriver-win64/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().window().maximize();
        driver.get("http://localhost:3000/");

        String path = System.getProperty("user.dir")+"//src/reports/index.html";
        ExtentSparkReporter reporter = new ExtentSparkReporter(path);
        reporter.config().setReportName("Web Automation Results of EcoCycle Hub");
        reporter.config().setDocumentTitle("Test Results");

        extent = new ExtentReports();
        extent.attachReporter(reporter);
        extent.setSystemInfo("Tester","Lahiru Jayasuriya");

        registrationPage = new registrationPage(driver);
        loginPage = new loginPage(driver);
        productPage = new productPage(driver);
        directLoginPage = new directLoginPage(driver);
        shoppingCartPage = new shoppingCartPage(driver);
        datadrivenpage = new datadrivenpage();

    }

//    @AfterMethod
//    public void getTestResult(ITestResult result) {
//        ExtentTest test = extent.createTest(result.getName());
//
//        if(result.getStatus() == ITestResult.FAILURE){
//            test.fail(result.getThrowable());
//        }
//        else if(result.getStatus() == ITestResult.SUCCESS){
//            test.pass("Test Passed");
//        }
//        else if(result.getStatus() == ITestResult.SKIP){
//            test.skip("Test Skipped");
//        }
//    }

    @AfterMethod
    public void captureResult(ITestResult result) {

        ExtentTest test = extent.createTest(result.getName());

        if (result.getStatus() == ITestResult.FAILURE) {
            test.log(Status.FAIL, "Test Failed");
            test.fail(result.getThrowable());  // Log error

            // Get screenshot
            String screenshotPath = takeScreenshot(result.getName());

            if (screenshotPath != null) {
                test.addScreenCaptureFromPath(screenshotPath);
            }
        }
        else if (result.getStatus() == ITestResult.SUCCESS) {
            test.log(Status.PASS, "Test Passed");
        }
        else if (result.getStatus() == ITestResult.SKIP) {
            test.log(Status.SKIP, "Test Skipped");
        }
    }


    public String takeScreenshot(String testName) {
        try {
            TakesScreenshot ts = (TakesScreenshot) driver;
            File source = ts.getScreenshotAs(OutputType.FILE);

            // Create folder if not exist
            String folder = System.getProperty("user.dir") + "/src/reports/screenshots/";
            new File(folder).mkdirs();

            // Save screenshot file
            String fullPath = folder + testName + ".png";
            File destination = new File(fullPath);
            FileUtils.copyFile(source, destination);

            // Return RELATIVE path for Extent Report
            return "screenshots/" + testName + ".png";

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }


    @AfterTest
    public void tearDown(){
        extent.flush();
//        driver.quit();
    }

}
