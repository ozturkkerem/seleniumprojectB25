package com.cydeo.tests.practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class UsingUtility {

    private static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.navigate().to("https://www.yahoo.com/");

        Thread.sleep(1000);



        WebElement searchBox =  driver.findElement(By.name("p"));
        searchBox.sendKeys("How is weather today?");
        searchBox.submit();
       // driver.navigate().back();
        searchBox.sendKeys("kahve satin al ");
        searchBox.submit();

        //clickLogin.sendKeys();

    }
}
