package org.example.pageMethods;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

public class directLoginPage {

    WebDriver driver;

    public directLoginPage(WebDriver driver){
        this.driver = driver;
    }

    public void directLogin(String email, String password)throws InterruptedException{
        Thread.sleep(1000);
        driver.findElement(By.linkText("Explore Shop Products")).click();
        driver.findElement(By.xpath("/html/body/div[1]/nav/div/div/div[3]/a[2]")).click();
        Thread.sleep(400);
        driver.findElement(By.xpath("//input[@placeholder='example@ecocycle.com']")).sendKeys(email);
        Thread.sleep(400);
        driver.findElement(By.cssSelector("input[type='password']")).sendKeys(password);
        Thread.sleep(400);
        driver.findElement(By.xpath("//button[text()='Sign in']")).click();
//        Thread.sleep(400);
    }

//    directLogin and logout
public void directLoginAndLogout(String email, String password)throws InterruptedException{
    Thread.sleep(1000);
    driver.findElement(By.linkText("Explore Shop Products")).click();
    driver.findElement(By.xpath("/html/body/div[1]/nav/div/div/div[3]/a[2]")).click();
    Thread.sleep(400);
    driver.findElement(By.xpath("//input[@placeholder='example@ecocycle.com']")).sendKeys(email);
    Thread.sleep(400);
    driver.findElement(By.cssSelector("input[type='password']")).sendKeys(password);
    Thread.sleep(400);
    driver.findElement(By.xpath("//button[text()='Sign in']")).click();
    Thread.sleep(1500);
    driver.findElement(By.xpath("//span[contains(@class,'rounded-full') and contains(@class,'h-8')]")).click();
    Thread.sleep(100);
    driver.findElement(By.xpath("//div[contains(text(),'Logout')]")).click();
    Thread.sleep(1000);
}

}
