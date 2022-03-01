package com.cydeo.tests.practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homework1 {

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.etsy.com");

        WebElement searchBox = driver.findElement(By.id("global-enhancements-search-query"));
       // searchBox.sendKeys("wooden spoon" + Keys.ENTER);
        searchBox.sendKeys("Turkish Flag");

         searchBox.submit();

        String currentTitle = driver.getTitle();
        String expectedTitle = "Wooden spoon | Etsyfnkldsfnlsd";

        if (currentTitle.equals(expectedTitle))
            System.out.println("The title test is PASSED");
        else System.out.println(" The test is FAILED");



    }

}

/*
TC #1: Etsy Title Verification
1. Open Chrome browser
2. Go to https://www.etsy.com
3. Search for “wooden spoon”
4. Verify title:
Expected: “Wooden spoon | Etsy”
 */