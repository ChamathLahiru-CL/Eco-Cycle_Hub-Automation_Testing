package org.example.testCases;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import org.example.pageMethods.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;
import java.time.Duration;

public class HappyPathTestCase extends BaseTest{

    @Test
    public void oderItem() throws InterruptedException{
//        ExtentTest test = extent.createTest("TestHappyPath");
//        test.log(Status.INFO, "Starting test");
        Thread.sleep(1000);
//        registrationPage.createAccount("Test037","test037@gmail.com","TEST123456","119","Road","Minuwangoda","1234");
//        Thread.sleep(1000);
//        loginPage.correctLogin("test036@gmail.com","TEST123456");
        directLoginPage.directLogin("sisil223@gmail.com","123456");
//        Thread.sleep(300);
        productPage.addProductToCart("Biodegradable Pot");
        Thread.sleep(2000);
        productPage.addProductToCart("Biodegradable Trash bag");
        Thread.sleep(2000);
        productPage.openShoppingCart();
        Thread.sleep(500);
        shoppingCartPage.checkout();
        Thread.sleep(500);

    }

//    @Test
//    public void checkDataDriven() throws IOException, InterruptedException {
//        directLoginPage.directLoginUsingExcel();
//    }

}
