package org.example.testCases;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import org.example.pageMethods.directLoginPage;
import org.example.pageMethods.loginPage;
import org.example.pageMethods.registrationPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class LoginTestCase extends BaseTest{

    @Test
    public void testSignIn() throws InterruptedException {
        ExtentTest test = extent.createTest("TestSignIn");
        test.log(Status.PASS, "Step description");
        test.log(Status.FAIL, "Step description");
        Thread.sleep(1000);
        registrationPage.createAccount("Sisil Jayasuriya","sisil223@gmail.com","123456","0761549723","Road","Minuwangoda","123456");
        Thread.sleep(300);
        loginPage.correctLogin("sisil223@gmail.com","123456");
    }

    @Test
    public void testDirect()throws InterruptedException{
        ExtentTest test = extent.createTest("TestDirect");
        test.log(Status.PASS, "Step description");
        test.log(Status.FAIL, "Step description");
        Thread.sleep(1000);
        directLoginPage.directLogin("sisil223@gmail.com","123456");
    }

}
