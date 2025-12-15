package org.example.testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class SignUp_EX {

    public static void main(String[] args){

//        Connect the web application using web drivers
        System.setProperty("webdriver.chrome.driver","C:/Users/ASUS/OneDrive - std.uwu.ac.lk/Documents/.Web Drivers/chromedriver-win64/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://localhost:3000/");

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        slowDown(5400);
        driver.findElement(By.linkText("Explore Shop Products")).click();
        slowDown(2800);
        driver.findElement(By.cssSelector("a[href='/register?type=customer']")).click();
        slowDown(500);

//        (TC_SU_002) Verify that the System does not create an account when the "Full Name" is not entered.
        System.out.println("Verify that the System does not create an account when the \"Full Name\" is not entered.");

        driver.findElement(By.id("email")).sendKeys("test009@gmail.com");
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

//        refresh the page
        slowDown(2400);
        driver.navigate().refresh();

//        (TC_SU_003)  Verify that the System does not create an account when the "Email" is not entered.
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

        slowDown(2400);
        driver.navigate().refresh();

//        (TC_SU_003) Verify that the System does not create an account when the "Password" is not entered.
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

        slowDown(2400);
        driver.navigate().refresh();

//        (TC_SU_010) Verify that the system will not create an account when there is a weak password.
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

        String title = driver.findElement(By.xpath("//div[text()='Registration failed']")).getText();
        String message = driver.findElement(By.xpath("//div[contains(text(),'Password is too weak')]")).getText();

        System.out.println("Error Message: "+title);
        System.out.println(message);

        slowDown(2400);
        driver.navigate().refresh();

//        (TC_SU_011) Verify that the system will not create an account when using the same email address registered before.
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

//        only get the main title of the error
        String title2 = driver.findElement(
                By.xpath("//div[@class='text-sm font-semibold' and text()='Registration failed']")
        ).getText();
        System.out.println("Title: " + title2);

//        get the whole toast error message
        WebElement toast = wait.until(
                ExpectedConditions.visibilityOfElementLocated(
                        By.xpath("//li[contains(@class, 'destructive')]")
                )
        );
        System.out.println("Error Toast: " + toast.getText());


        slowDown(2400);
        driver.navigate().refresh();

//        (TC_SU_001)Verify the user can create an account with valid inputs.
        System.out.println("Verify the user can create an account with valid inputs.");

        driver.findElement(By.id("name")).sendKeys("Test 014");
        slowDown(300);
        driver.findElement(By.id("email")).sendKeys("test014@gmail.com");
        slowDown(300);
        driver.findElement(By.cssSelector("input[placeholder='Create a password']")).sendKeys("TEST@014");
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

//        Capture full toast block
        WebElement toast2 = wait.until(
                ExpectedConditions.visibilityOfElementLocated(
                        By.xpath("//div[text()='Registration successful']/parent::div")
                )
        );

        System.out.println("Toast Message: " + toast2.getText());


//        Sign-up the Shop Page
        driver.findElement(By.id("email")).sendKeys("test014@gmail.com");
        slowDown(300);
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("TEST@014");
        slowDown(300);
        driver.findElement(By.xpath("//button[text()='Sign in']")).click();
        slowDown(500);

    }


    @Test
    public void linktoPage(){
        System.setProperty("webdriver.chrome.driver","C:/Users/ASUS/OneDrive - std.uwu.ac.lk/Documents/.Web Drivers/chromedriver-win64/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://localhost:3000/");

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));


        slowDown(2000);
        driver.findElement(By.linkText("Explore Shop Products")).click();
        slowDown(1800);
        driver.findElement(By.cssSelector("a[href='/register?type=customer']")).click();
        slowDown(500);
    }

    @Test
    public void withoutName(WebDriver driver){

        System.out.println("Verify that the System does not create an account when the \"Full Name\" is not entered.");

        driver.findElement(By.id("email")).sendKeys("test009@gmail.com");
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

    @Test
    public void withoutEmail(WebDriver driver){
        slowDown(2400);
        driver.navigate().refresh();

//        (TC_SU_003)  Verify that the System does not create an account when the "Email" is not entered.
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



    public static void slowDown(int ms) {
        try {
            Thread.sleep(ms);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
