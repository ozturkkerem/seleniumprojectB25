package com.cydeo.tests.practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice1 {

    private static WebDriver driver;

    public static void main(String[] args) {



        forUrl("https://www.selenium.dev/");

        titleVerification("Selenium");

    }

    private static void titleVerification(String x ) {
        String actual = driver.getTitle();
        if (actual.contains(x))
            System.out.println("PASSED");
    else
            System.out.println("FAILED");
}




    public static void forUrl(String url) {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(url);

    }
}


/*
//Setup the "browser driver"

        //Go to "https://www.selenium.dev/"

        //Verify the title contains "Selenium"

   WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

 */