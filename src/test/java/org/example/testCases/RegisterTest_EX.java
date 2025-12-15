package org.example.testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class RegisterTest_EX extends BaseTest {

    @Test
    public void linktoPage(){
        driver.get("http://localhost:3000/");
        slowDown(2000);
        driver.findElement(By.linkText("Explore Shop Products")).click();
        slowDown(1800);
        driver.findElement(By.cssSelector("a[href='/register?type=customer']")).click();
        slowDown(500);
    }

//    (TC_SU_002) Verify that the System does not create an account when the "Full Name" is not entered.
    @Test
    public void withoutName(){
        linktoPage();
        System.out.println("Verify that the system does not create an account when the \"Full Name\" is not entered.");
        driver.findElement(By.id("email")).sendKeys("test009@gmail.com");
        slowDown(300);
        driver.findElement(By.cssSelector("input[placeholder='Create a password']")).sendKeys("123456");
        slowDown(300);
        driver.findElement(By.cssSelector("input[placeholder='Enter your phone number']")).sendKeys("119");
        slowDown(300);
        driver.findElement(By.id("address")).sendKeys("Kalawana Road");
        slowDown(300);
        driver.findElement(By.id("city")).sendKeys("Rathnapura");
        slowDown(300);
        driver.findElement(By.id("zipCode")).sendKeys("8800");
        slowDown(300);
        driver.findElement(By.xpath("//button[text()='Create account']")).click();
    }

//    (TC_SU_003)  Verify that the System does not create an account when the "Email" is not entered.
    @Test
    public void withoutEmail(){
        linktoPage();
        System.out.println("Verify that the System does not create an account when the \"Email\" is not entered.");
        driver.findElement(By.id("name")).sendKeys("Test 009");
        slowDown(300);
        driver.findElement(By.cssSelector("input[placeholder='Create a password']")).sendKeys("123456");
        slowDown(300);
        driver.findElement(By.cssSelector("input[placeholder='Enter your phone number']")).sendKeys("119");
        slowDown(300);
        driver.findElement(By.xpath("//input[@id='address']")).sendKeys("Kalawana Road");
        slowDown(300);
        driver.findElement(By.id("city")).sendKeys("Rathnapure");
        slowDown(300);
        driver.findElement(By.id("zipCode")).sendKeys("8800");
        slowDown(300);
        driver.findElement(By.xpath("//button[text()='Create account']")).click();
    }

//    (TC_SU_003) Verify that the System does not create an account when the "Password" is not entered.
    @Test
    public void withoutPassword(){
        linktoPage();
        System.out.println("Verify that the System does not create an account when the \"Password\" is not entered.");
        driver.findElement(By.id("name")).sendKeys("Test 009");
        slowDown(300);
        driver.findElement(By.id("email")).sendKeys("test009@gmail.com");
        slowDown(300);
        driver.findElement(By.cssSelector("input[placeholder='Enter your phone number']")).sendKeys("119");
        slowDown(300);
        driver.findElement(By.xpath("//input[@id='address']")).sendKeys("Kalawana Road");
        slowDown(300);
        driver.findElement(By.id("city")).sendKeys("Rathnapure");
        slowDown(300);
        driver.findElement(By.id("zipCode")).sendKeys("8800");
        slowDown(300);
        driver.findElement(By.xpath("//button[text()='Create account']")).click();
    }

//    (TC_SU_010) Verify that the system will not create an account when there is a weak password.
    @Test
    public void weakPassword(){
        linktoPage();
        System.out.println("Verify that the system will not create an account when there is a weak password.");
        driver.findElement(By.id("name")).sendKeys("Test 009");
        slowDown(300);
        driver.findElement(By.id("email")).sendKeys("test009@gmail.com");
        slowDown(300);
        driver.findElement(By.cssSelector("input[placeholder='Create a password']")).sendKeys("123");
        slowDown(300);
        driver.findElement(By.cssSelector("input[placeholder='Enter your phone number']")).sendKeys("119");
        slowDown(300);
        driver.findElement(By.xpath("//input[@id='address']")).sendKeys("Kalawana Road");
        slowDown(300);
        driver.findElement(By.id("city")).sendKeys("Rathnapure");
        slowDown(300);
        driver.findElement(By.id("zipCode")).sendKeys("8800");
        slowDown(300);
        driver.findElement(By.xpath("//button[text()='Create account']")).click();
        slowDown(3000);
        String title = driver.findElement(By.xpath("//div[text()='Registration failed']")).getText();
        String message = driver.findElement(By.xpath("//div[contains(text(),'Password is too weak')]")).getText();
        System.out.println("Error Message: "+title);
        System.out.println(message);
    }

//    (TC_SU_011) Verify that the system will not create an account when using the same email address registered before.
    @Test
    public void sameEmail(){
        linktoPage();
        System.out.println("Verify that the system will not create an account when using the same email address registered before.");
        driver.findElement(By.id("name")).sendKeys("Test 009");
        slowDown(300);
        driver.findElement(By.id("email")).sendKeys("nipu@gmail.com");
        slowDown(300);
        driver.findElement(By.cssSelector("input[placeholder='Create a password']")).sendKeys("123456");
        slowDown(300);
        driver.findElement(By.cssSelector("input[placeholder='Enter your phone number']")).sendKeys("119");
        slowDown(300);
        driver.findElement(By.xpath("//input[@id='address']")).sendKeys("Kalawana Road");
        slowDown(300);
        driver.findElement(By.id("city")).sendKeys("Rathnapure");
        slowDown(300);
        driver.findElement(By.id("zipCode")).sendKeys("8800");
        slowDown(300);
        driver.findElement(By.xpath("//button[text()='Create account']")).click();
        slowDown(3000);
        String title = driver.findElement(By.xpath("//div[@class='text-sm font-semibold' and text()='Registration failed']")).getText();
        String message = driver.findElement(By.xpath("//li[contains(@class, 'destructive')]")).getText();
        System.out.println("Error Message: "+title);
        System.out.println(message);
    }

//    (TC_SU_001)Verify the user can create an account with valid inputs.
    @Test
    public void createAccount(){
        linktoPage();
        System.out.println("Verify the user can create an account with valid inputs.");
        driver.findElement(By.id("name")).sendKeys("Test 018");
        slowDown(300);
        driver.findElement(By.id("email")).sendKeys("test018@gmail.com");
        slowDown(300);
        driver.findElement(By.cssSelector("input[placeholder='Create a password']")).sendKeys("TEST@018");
        slowDown(300);
        driver.findElement(By.cssSelector("input[placeholder='Enter your phone number']")).sendKeys("119");
        slowDown(300);
        driver.findElement(By.xpath("//input[@id='address']")).sendKeys("Kalawana Road");
        slowDown(300);
        driver.findElement(By.id("city")).sendKeys("Rathnapure");
        slowDown(300);
        driver.findElement(By.id("zipCode")).sendKeys("8800");
        slowDown(300);
        driver.findElement(By.xpath("//button[text()='Create account']")).click();
        slowDown(300);
    }




    public static void slowDown(int ms) {
        try {
            Thread.sleep(ms);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
