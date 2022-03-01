package com.cydeo.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Yahoo {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.yahoo.com/");
        WebElement inputBox = driver.findElement(By.id("ybar-sbq"));
        inputBox.sendKeys("Hello");

        WebElement searchBtn = driver.findElement(By.id("ybar-search"));
        searchBtn.click();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        String pageTitle = driver.getTitle();

        System.out.println(pageTitle);

    }
}
