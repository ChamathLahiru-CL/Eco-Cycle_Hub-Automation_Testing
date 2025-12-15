package org.example.pageMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class productPage {

    WebDriver driver;

    public productPage(WebDriver driver){
        this.driver =driver;
    }


    public void viewDetails(){
        driver.findElement(By.xpath("//button[contains(text(),'Details')]")).click();
    }

    public void normalAddToCart(){
        driver.findElement(By.xpath("//button[contains(text(),'Add to Cart')]")).click();
    }

    public void viewAddToCart(){
        driver.findElement(By.xpath("//button[contains(text(),'Details')]")).click();
        driver.findElement(By.xpath("//button[contains(text(),'Add to Cart')]")).click();
    }

    public void openShoppingCart() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[@href='/cart']")).click();
    }

    public void checkOrders(){
        driver.findElement(By.xpath("//a[@href='/orders']")).click();
    }

    public void backHome(){
        driver.findElement(By.xpath("//button[text()='Back Home']")).click();
    }

    public void notification(){
        driver.findElement(By.xpath("//a[@href='/shop-notifications']")).click();
    }

    public void user(){
        driver.findElement(By.xpath("//img[@alt='User']")).click();
    }

    public void logOut()throws InterruptedException{
        Thread.sleep(400);
        driver.findElement(By.xpath("//*[@id=\"radix-«rb»\"]/span/img")).click();
        Thread.sleep(100);
        driver.findElement(By.xpath("//div[contains(text(),'Logout')]")).click();
        Thread.sleep(300);
    }

    public void userProfile(){
        driver.findElement(By.xpath("//img[@alt='User']")).click();
        driver.findElement(By.xpath("//a[@href='/customer-profile']")).click();
    }

    public void addProductToCart(String productName)throws InterruptedException{
//        Thread.sleep(1000);
        String xpath = "//div[contains(text(),'"+productName+"')]";
        Thread.sleep(1000);
        driver.findElement(By.xpath(xpath)).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/div[1]/div/main/div/div[4]/div[2]/div[2]/div/button")).click();
    }


}
