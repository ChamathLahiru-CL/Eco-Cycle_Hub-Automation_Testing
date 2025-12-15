package org.example.testCases;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import org.example.pageMethods.registrationPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

public class RegisterTestCase extends BaseTest{

    @Test
    public void testAccount() throws InterruptedException{
        ExtentTest test = extent.createTest("testAccountTest");
        test.log(Status.PASS, "Step description");
        test.log(Status.FAIL, "Step description");
        Thread.sleep(1000);
        registrationPage.createAccount("Sisil Jayasuriya","sisil223@gmail.com","123456","0761549723","Road","Minuwangoda","123456");
    }

    @Test
    public void testName() throws InterruptedException{
        ExtentTest test = extent.createTest("testNameTest");
        test.log(Status.PASS, "Step description");
        test.log(Status.FAIL, "Step description");
        Thread.sleep(1000);
        registrationPage.validateName("","test028@gmail.com","123456","0761549723","Road","Minuwangoda","123456");
        Thread.sleep(3000);
    }

    @Test
    public void testPassword() throws InterruptedException{
        ExtentTest test = extent.createTest("testPasswordTest");
        test.log(Status.PASS, "Step description");
        test.log(Status.FAIL, "Step description");
        Thread.sleep(1000);
        registrationPage.validatePassword("Test028","test028@gmail.com","","0761549723","Road","Minuwangoda","123456");
        Thread.sleep(3000);
    }
    @Test
    public void testEmail() throws InterruptedException{
        ExtentTest test = extent.createTest("testEmailTest");
        test.log(Status.PASS, "Step description");
        test.log(Status.FAIL, "Step description");
        Thread.sleep(1000);
        registrationPage.validateEmail("Test028","","123456","0761549723","Road","Minuwangoda","123456");
        Thread.sleep(3000);
    }

    @Test
    public void testWeakPassword() throws InterruptedException{
        ExtentTest test = extent.createTest("testWeakPasswordTest");
        test.log(Status.PASS, "Step description");
        test.log(Status.FAIL, "Step description");
        Thread.sleep(1000);
        registrationPage.validateWeekPassword("Test028","Test028@gmail.com","123","0761549723","Road","Minuwangoda","123456");
        Thread.sleep(3000);
    }

    @Test
    public void testSameEmail() throws InterruptedException{
        ExtentTest test = extent.createTest("testSameEmailTest");
        test.log(Status.PASS, "Step description");
        test.log(Status.FAIL, "Step description");
        Thread.sleep(1000);
        registrationPage.validateSameEmail("Test 029","sisil223@gmail.com","123456","0761549723","Road","Minuwangoda","123456");
        Thread.sleep(3000);
    }
}
