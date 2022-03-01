package com.cydeo.tests.practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice2 {

    private static WebDriver driver;

    public static void main(String[] args) {

        urlOfGoogle("https://www.google.com");

        titleVerification("Google");

        changeUrl("https://www.etsy.com/");

        titleVerification("Etsy");


    }

    private static void changeUrl(String newUrl) {
    driver.get(newUrl);
    String newTitle = driver.getTitle();
    String oldTitle = "google";
    if (newTitle.equals(oldTitle)){
        System.out.println(" It is on google page");
    }else System.out.println("It is not on google page");

    }

    private static void titleVerification(String expectedTitle) {
        String actualTitle = driver.getTitle();
        if (actualTitle.contains(expectedTitle))
            System.out.println("PASSSSEEEDDD");
        else System.out.println("FAILEEEDDDDDD");

    }

    private static void urlOfGoogle(String url) {

        WebDriverManager.chromedriver().setup();
        driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(url);
    }


}


/*
//Setup the "browser driver"

        //Go to "https://www.google.com/"

        //Verify the title contains "Google"

        //Navigate to "https://www.etsy.com/"

        //Verify not in google page

        //Verify the title  contains "Etsy"
 */