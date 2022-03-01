package com.cydeo.tests.practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice3 {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://practice.cydeo.com");

        //WebElement firstObject = driver.findElement(By.linkText("A/B Testing"));
        WebElement firstObject = driver.findElement(By.linkText("A/B Testing"));
        firstObject.click();

        Thread.sleep(1000);

        WebElement secondObject =driver.findElement(By.tagName("p"));
        String text = secondObject.getText();
        System.out.println(text);


    }

}
