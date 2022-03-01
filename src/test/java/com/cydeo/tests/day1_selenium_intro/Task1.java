package com.cydeo.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.yahoo.com");

        String currentTitle = driver.getTitle();

        String expectedTitle = "Yahoo | Mail, Weather, Search, Politics, News, Finance, Sports & Videos";

        System.out.println(currentTitle);

        if (currentTitle.equals(expectedTitle)){
            System.out.println("title is as expected. Verification Passed!");
        }
        else{
            System.out.println("fail");
        }

    }
}
