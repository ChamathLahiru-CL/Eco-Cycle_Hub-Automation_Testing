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
        registrationPage.createAccount("Test040","test040@gmail.com","TEST123456","119","Road","Minuwangoda","1234");
        Thread.sleep(1000);
        loginPage.correctLogin("test040@gmail.com","TEST123456");
//        directLoginPage.directLogin("sisil223@gmail.com","123456");
        Thread.sleep(3000);
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
