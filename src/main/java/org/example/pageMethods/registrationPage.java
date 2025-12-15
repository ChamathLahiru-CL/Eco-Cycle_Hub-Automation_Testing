package org.example.pageMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class registrationPage {

    WebDriver driver;

    public registrationPage(WebDriver driver){
        this.driver =driver;
    }

    public void createAccount(String name, String email, String password, String phone, String address, String city, String zipcode) throws InterruptedException{

        driver.findElement(By.linkText("Explore Shop Products")).click();
        driver.findElement(By.cssSelector("a[href='/register?type=customer']")).click();
        driver.findElement(By.cssSelector("#name")).sendKeys(name);
        driver.findElement(By.cssSelector("#email")).sendKeys(email);
        driver.findElement(By.cssSelector("input[placeholder='Create a password']")).sendKeys(password);
        driver.findElement(By.cssSelector("input[placeholder='Enter your phone number']")).sendKeys(phone);
        driver.findElement(By.xpath("//input[@id='address']")).sendKeys(address);
        driver.findElement(By.id("city")).sendKeys(city);
        driver.findElement(By.id("zipCode")).sendKeys(zipcode);
        Thread.sleep(3000);
        driver.findElement(By.xpath("//button[text()='Create account']")).click();

    }

    public void validateName (String name, String email, String password, String phone, String address, String city, String zipcode){

        driver.findElement(By.linkText("Explore Shop Products")).click();
        driver.findElement(By.cssSelector("a[href='/register?type=customer']")).click();
        driver.findElement(By.cssSelector("#name")).sendKeys(name);
        driver.findElement(By.cssSelector("#email")).sendKeys(email);
        driver.findElement(By.cssSelector("input[placeholder='Create a password']")).sendKeys(password);
        driver.findElement(By.cssSelector("input[placeholder='Enter your phone number']")).sendKeys(phone);
        driver.findElement(By.xpath("//input[@id='address']")).sendKeys(address);
        driver.findElement(By.id("city")).sendKeys(city);
        driver.findElement(By.id("zipCode")).sendKeys(zipcode);
        driver.findElement(By.xpath("//button[text()='Create account']")).click();

    }

    public void validateEmail (String name, String email, String password, String phone, String address, String city, String zipcode){

        driver.findElement(By.linkText("Explore Shop Products")).click();
        driver.findElement(By.cssSelector("a[href='/register?type=customer']")).click();
        driver.findElement(By.cssSelector("#name")).sendKeys(name);
        driver.findElement(By.cssSelector("#email")).sendKeys(email);
        driver.findElement(By.cssSelector("input[placeholder='Create a password']")).sendKeys(password);
        driver.findElement(By.cssSelector("input[placeholder='Enter your phone number']")).sendKeys(phone);
        driver.findElement(By.xpath("//input[@id='address']")).sendKeys(address);
        driver.findElement(By.id("city")).sendKeys(city);
        driver.findElement(By.id("zipCode")).sendKeys(zipcode);
        driver.findElement(By.xpath("//button[text()='Create account']")).click();

    }

    public void validatePassword (String name, String email, String password, String phone, String address, String city, String zipcode){

        driver.findElement(By.linkText("Explore Shop Products")).click();
        driver.findElement(By.cssSelector("a[href='/register?type=customer']")).click();
        driver.findElement(By.cssSelector("#name")).sendKeys(name);
        driver.findElement(By.cssSelector("#email")).sendKeys(email);
        driver.findElement(By.cssSelector("input[placeholder='Create a password']")).sendKeys(password);
        driver.findElement(By.cssSelector("input[placeholder='Enter your phone number']")).sendKeys(phone);
        driver.findElement(By.xpath("//input[@id='address']")).sendKeys(address);
        driver.findElement(By.id("city")).sendKeys(city);
        driver.findElement(By.id("zipCode")).sendKeys(zipcode);
        driver.findElement(By.xpath("//button[text()='Create account']")).click();

    }

    public void validateWeekPassword (String name, String email, String password, String phone, String address, String city, String zipcode){

        driver.findElement(By.linkText("Explore Shop Products")).click();
        driver.findElement(By.cssSelector("a[href='/register?type=customer']")).click();
        driver.findElement(By.cssSelector("#name")).sendKeys(name);
        driver.findElement(By.cssSelector("#email")).sendKeys(email);
        driver.findElement(By.cssSelector("input[placeholder='Create a password']")).sendKeys(password);
        driver.findElement(By.cssSelector("input[placeholder='Enter your phone number']")).sendKeys(phone);
        driver.findElement(By.xpath("//input[@id='address']")).sendKeys(address);
        driver.findElement(By.id("city")).sendKeys(city);
        driver.findElement(By.id("zipCode")).sendKeys(zipcode);
        driver.findElement(By.xpath("//button[text()='Create account']")).click();

    }

    public void validateSameEmail (String name, String email, String password, String phone, String address, String city, String zipcode){

        driver.findElement(By.linkText("Explore Shop Products")).click();
        driver.findElement(By.cssSelector("a[href='/register?type=customer']")).click();
        driver.findElement(By.cssSelector("#name")).sendKeys(name);
        driver.findElement(By.cssSelector("#email")).sendKeys(email);
        driver.findElement(By.cssSelector("input[placeholder='Create a password']")).sendKeys(password);
        driver.findElement(By.cssSelector("input[placeholder='Enter your phone number']")).sendKeys(phone);
        driver.findElement(By.xpath("//input[@id='address']")).sendKeys(address);
        driver.findElement(By.id("city")).sendKeys(city);
        driver.findElement(By.id("zipCode")).sendKeys(zipcode);
        driver.findElement(By.xpath("//button[text()='Create account']")).click();

    }
}
