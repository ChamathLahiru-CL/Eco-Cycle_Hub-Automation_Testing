package org.example.pageMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class shoppingCartPage {

    WebDriver driver;

    public shoppingCartPage(WebDriver driver){
        this.driver =driver;
    }

    public void continueShopping(){
        driver.findElement(By.xpath("//a[contains(text(),'Continue Shopping')]")).click();
    }

    public void checkout(){
        driver.findElement(By.xpath("//button[contains(text(),'Proceed to Stripe Checkout')]")).click();
    }

    public void backToProducts(){
        driver.findElement(By.xpath("//a[span[text()='Back to Products']]")).click();
    }

    public void incrementProduct(){
        driver.findElement(By.xpath("//button[.//*[name()='svg' and contains(@class,'lucide-plus')]]")).click();
    }

    public void decrementProduct(){
        driver.findElement(By.xpath("//button[.//*[name()='svg' and contains(@class,'lucide-minus')]]")).click();
    }

    public void deleteProduct(){
        driver.findElement(By.xpath("//button[.//*[name()='svg' and contains(@class,'lucide-trash2')]]")).click();
    }

}
