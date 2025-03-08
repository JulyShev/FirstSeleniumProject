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

public class Homework2_FindElements {
    WebDriver driver;

    @BeforeMethod
    public void SetUp(){
        driver = new ChromeDriver();
        driver.get("https://automationintesting.online/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }
    @AfterMethod
    public void tearDown(){driver.quit();
    }
    @Test
    public void findElementBySimpleSelect(){
        WebElement h1 = driver.findElement(By.tagName("h1"));
        System.out.println("Element by simple select:");
        System.out.println(h1.getText());
        List<WebElement> tagA = driver.findElements(By.tagName("a"));
        System.out.println(tagA.size());
        driver.findElement(By.id("root"));
        driver.findElement(By.id("collapseBanner"));
        driver.findElement(By.className("row"));
        driver.findElement(By.className("col-sm-3"));
        driver.findElement(By.linkText("home page"));
        driver.findElement(By.linkText("feel free to raise it here"));
        driver.findElement(By.partialLinkText("to raise it here"));
        driver.findElement(By.partialLinkText("restful-booker"));
    }
    @Test
    public void findElementCSS(){
        WebElement h2 = driver.findElement(By.cssSelector("h1"));
        System.out.println("Element by Css:");
        System.out.println(h2.getText());
        driver.findElement(By.cssSelector("#root"));
        driver.findElement(By.cssSelector("#collapseBanner"));
        driver.findElement(By.cssSelector("#footer"));

        driver.findElement(By.cssSelector(".container-fluid"));
        driver.findElement(By.cssSelector(".row"));
        driver.findElement(By.cssSelector(".col-sm-7"));

        driver.findElement(By.cssSelector("[href='https://github.com/mwinteringham/restful-booker-platform/issues']"));
        driver.findElement(By.cssSelector("[href='https://github.com/mwinteringham/restful-booker-platform/issues']"));


        driver.findElement(By.cssSelector("[href*='automationintesting']"));
        driver.findElement(By.cssSelector("[href*='winteringham/restful-booker-platform']"));

        driver.findElement(By.cssSelector("[href^='https://gith']"));
        WebElement v1 = driver.findElement(By.cssSelector("[href^='https://circleci']"));
        System.out.println("Element by css #1:");
        System.out.println(v1.getText());

        driver.findElement(By.cssSelector("[href$='booker-platform']"));
        WebElement v2 = driver.findElement(By.cssSelector("[href$='projects/1']"));
        System.out.println("Element by css #2:");
        System.out.println(v2.getText());
    }


}

