//package org.example.testCases;
//
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.annotations.BeforeTest;
//import org.testng.annotations.Test;
//
//import java.time.Duration;
//
//import static java.lang.System.getProperty;
//
//public class practiseTest {
//
//    WebDriver driver;
//
//    @BeforeTest
//    public void beforeTest(){
//        System.setProperty("webdriver.chrome.driver","C:/Users/ASUS/OneDrive - std.uwu.ac.lk/Documents/.Web Drivers/chromedriver-win64/chromedriver.exe");
//        driver = new ChromeDriver();
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//        driver.manage().window().maximize();
//        driver.get("http://localhost:3000/");
//        String path = getProperty("user.dir")+"\\reprots\index.html";
//        ExtentSparkReporter reporter = new ExtentSparkReporter(path);
//
//    }
//
//    @Test
//    public void test01()throws InterruptedException{
//        Thread.sleep(2000);
//        System.out.println(driver.getTitle());
//
//    }
//}
