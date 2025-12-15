package org.example.pageMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class loginPage {

    WebDriver driver;

    public loginPage(WebDriver driver){
        this.driver =driver;
    }

    public void correctLogin(String email, String password) throws InterruptedException {
        Thread.sleep(400);
        driver.findElement(By.xpath("//input[@placeholder='example@ecocycle.com']")).sendKeys(email);
        Thread.sleep(400);
        driver.findElement(By.cssSelector("input[type='password']")).sendKeys(password);
        Thread.sleep(400);
        driver.findElement(By.xpath("//button[text()='Sign in']")).click();
        Thread.sleep(400);
    }

    public void forgotPassword(String email, String password){
        driver.findElement(By.xpath("//input[@placeholder='example@ecocycle.com']")).sendKeys(email);
        driver.findElement(By.cssSelector("input[type='password']")).sendKeys(password);
        driver.findElement(By.xpath("//button[text()='Forgot Password?']")).click();
    }

    public void invalidEmail(WebDriver driver, String email, String password){
        driver.findElement(By.xpath("//input[@placeholder='example@ecocycle.com']")).sendKeys(email);
        driver.findElement(By.cssSelector("input[type='password']")).sendKeys(password);
        driver.findElement(By.xpath("//button[text()='Sign in']")).click();
    }

    public void invalidPassword(WebDriver driver, String email, String password){
        driver.findElement(By.xpath("//input[@placeholder='example@ecocycle.com']")).sendKeys(email);
        driver.findElement(By.cssSelector("input[type='password']")).sendKeys(password);
        driver.findElement(By.xpath("//button[text()='Sign in']")).click();
    }

    public void resetPassword(WebDriver driver, String email, String password){
        driver.findElement(By.xpath("//input[@placeholder='example@ecocycle.com']")).sendKeys(email);
        driver.findElement(By.cssSelector("input[type='password']")).sendKeys(password);
        driver.findElement(By.xpath("//button[text()='Sign in']")).click();
        driver.findElement(By.xpath("//button[text()='Reset Password']")).click();
    }

    public void troubleShooting(WebDriver driver, String email, String password){
        driver.findElement(By.xpath("//input[@placeholder='example@ecocycle.com']")).sendKeys(email);
        driver.findElement(By.cssSelector("input[type='password']")).sendKeys(password);
        driver.findElement(By.xpath("//button[text()='Sign in']")).click();
        driver.findElement(By.xpath("//a[text()='Advanced Troubleshooting']")).click();
    }

//    have some problem in the advanced troubleshooting
    public void advancedTroubleShooting(WebDriver driver){
        driver.findElement(By.xpath("//button[text()='Sign in']")).click();
        driver.findElement(By.xpath("//a[text()='Advanced Troubleshooting']")).click();
        driver.findElement(By.xpath("//button[text()='Reset Again']")).click();
        driver.findElement(By.xpath("//a[@href='/login']")).click();
    }

    public void fixLoginIssues(WebDriver driver, String email, String password){
        driver.findElement(By.xpath("//input[@placeholder='example@ecocycle.com']")).sendKeys(email);
        driver.findElement(By.cssSelector("input[type='password']")).sendKeys(password);
        driver.findElement(By.xpath("//button[text()='Sign in']")).click();
        driver.findElement(By.xpath("//button[text()='Fix Login Issues']")).click();
    }

    public void withoutEmail(WebDriver driver, String email, String password) {
        driver.findElement(By.xpath("//input[@placeholder='example@ecocycle.com']")).sendKeys(email);
        driver.findElement(By.cssSelector("input[type='password']")).sendKeys(password);
        driver.findElement(By.xpath("//button[text()='Sign in']")).click();
    }

    public void withoutPassword(WebDriver driver, String email, String password) {
        driver.findElement(By.xpath("//input[@placeholder='example@ecocycle.com']")).sendKeys(email);
        driver.findElement(By.cssSelector("input[type='password']")).sendKeys(password);
        driver.findElement(By.xpath("//button[text()='Sign in']")).click();
    }





}
