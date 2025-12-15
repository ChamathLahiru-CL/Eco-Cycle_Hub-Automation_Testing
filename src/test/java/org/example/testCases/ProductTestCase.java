package org.example.testCases;


import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import org.example.pageMethods.productPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class ProductTestCase extends BaseTest {

    @Test
    public void viewProductDetails(){
        ExtentTest test = extent.createTest("viewProductDetailsTest");
        test.log(Status.PASS, "Step description");
        test.log(Status.FAIL, "Step description");
        productPage.viewDetails();
    }

    @Test
    public void addToCart(){
        ExtentTest test = extent.createTest("addToCartTest");
        test.log(Status.PASS, "Step description");
        test.log(Status.FAIL, "Step description");
        productPage.normalAddToCart();
    }

    @Test
    public void addToCartInDetails(){
        ExtentTest test = extent.createTest("addToCartInDetailsTest");
        test.log(Status.PASS, "Step description");
        test.log(Status.FAIL, "Step description");
        productPage.viewAddToCart();
    }

    @Test
    public void openShoppingCart() throws InterruptedException {
        ExtentTest test = extent.createTest("openShoppingCartTest");
        test.log(Status.PASS, "Step description");
        test.log(Status.FAIL, "Step description");
        productPage.openShoppingCart();
    }

    @Test
    public void oder(){
        ExtentTest test = extent.createTest("oderTest");
        test.log(Status.PASS, "Step description");
        test.log(Status.FAIL, "Step description");
        productPage.checkOrders();
    }

    @Test
    public void backHome(){
        ExtentTest test = extent.createTest("backHomeTest");
        test.log(Status.PASS, "Step description");
        test.log(Status.FAIL, "Step description");
        productPage.backHome();
    }

    @Test
    public void notification(){
        ExtentTest test = extent.createTest("notificationTest");
        test.log(Status.PASS, "Step description");
        test.log(Status.FAIL, "Step description");
        productPage.notification();
    }

    @Test
    public void user(){
        ExtentTest test = extent.createTest("userTest");
        test.log(Status.PASS, "Step description");
        test.log(Status.FAIL, "Step description");
        productPage.user();
    }

    @Test
    public void logout() throws InterruptedException {
        ExtentTest test = extent.createTest("logoutTest");
        test.log(Status.PASS, "Step description");
        test.log(Status.FAIL, "Step description");
        productPage.logOut();
    }

    @Test
    public void viewProfile(){
        ExtentTest test = extent.createTest("viewProfileTest");
        test.log(Status.PASS, "Step description");
        test.log(Status.FAIL, "Step description");
        productPage.userProfile();
    }

}
