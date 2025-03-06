package com.telran.qa46;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class FindElementTest {
    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        driver.get("https://ilcarro.web.app/search");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }

    @Test
    public void findElementByTagName(){
//        find element by tag name
        WebElement h1 = driver.findElement(By.tagName("h1"));
        System.out.println(h1.getText());

        WebElement a = driver.findElement(By.tagName("a"));
        System.out.println(a.getText());

//        Find list of elements
        List<WebElement> a1 = driver.findElements(By.tagName("a"));
        System.out.println(a1.size());
    }

    @Test
    public void findElementBySimpleLocators(){
//        By.id
        driver.findElement(By.id("city"));

//        By.class name
        driver.findElement(By.className("footer-container"));

//        By.linkText
        WebElement a2 = driver.findElement(By.linkText("Let the car work"));
        System.out.println(a2.getText());

//        By.partialLinkText
        driver.findElement(By.partialLinkText("car"));


    }
    @Test
    public void findElementsSelector(){
//        tag name => css
//          WebElement h1 = driver.findElement(By.tagName("h1"));
        WebElement h1 = driver.findElement(By.cssSelector("h1"));

//        id => css(#)
//         driver.findElement(By.id("city"));
        driver.findElement(By.cssSelector("#city"));

//        class name => css(.)
//        driver.findElement(By.className("footer-container"));
        driver.findElement(By.cssSelector(".footer-container"));

//        [attr='value']
        driver.findElement(By.cssSelector("[href='/registration?url=%2Fsearch']"));

//        contains => attr*='value'
        driver.findElement(By.cssSelector("[href*='login']"));

//        start => ^  [attr^='value']
        driver.findElement(By.cssSelector("[href^='/log']"));

//        end on => $ [attr$='value']
        driver.findElement(By.cssSelector("[href$='%2Fsearch']"));



    }

}
