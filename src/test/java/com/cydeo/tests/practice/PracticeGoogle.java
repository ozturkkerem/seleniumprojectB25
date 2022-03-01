package com.cydeo.tests.practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeGoogle {

  //  private static WebDriver driver;

    public static void main(String[] args) {

    //    chromeBrowser( "https://www.google.com/");

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com/");




        WebElement searchButton = driver.findElement(By.name("q"));

        searchButton.sendKeys("Google bugun cok guzelsin");
        searchButton.submit();

    }

}
