package com.cydeo.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tc1 {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.get("https://practice.cydeo.com");

        String currentURL= driver.getCurrentUrl();

        if (currentURL.contains("cydeo")){
            System.out.println("url contain cydeo");
        }else System.out.println("url does not contain cydeo");



        if (driver.getTitle().equals("Practice")){
            System.out.println("Title is as Expected");
        }else System.out.println("Title is not true!!!!!");


    }

}



/*
TC #1: Cydeo practice tool verifications
1. Open Chrome browser
2. Go to https://practice.cydeo.com
3. Verify URL contains
Expected: cydeo
4. Verify title:
       Expected: Practice
 */
