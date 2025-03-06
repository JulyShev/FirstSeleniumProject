package com.telran.qa46;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class FirstSeleniumTest {
    WebDriver driver;
//    before method -setUp
    @BeforeMethod
    public void setUp(){
        driver = new ChromeDriver();
//        driver.get("https://www.google.com"); //- without history

//        maximasze browser to window
        driver.manage().window().maximize();

        driver.navigate().to("https://ilcarro.web.app/search"); //- with history

//        wait for all elements on the to load before starting test
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.navigate().to("https://www.google.com");
        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().refresh();

    }

//    test
    @Test
    public void openGoogleTest(){
        System.out.println("Google opened");
    }

//    after method -tearDown (this method closes the windows)
    @AfterMethod (enabled = false)
    public void tearDown(){
//        driver.quit(); // - all and browser
        driver.close(); // - close only one last tab
    }
}
