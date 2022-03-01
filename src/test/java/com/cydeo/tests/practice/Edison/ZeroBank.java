package com.cydeo.tests.practice.Edison;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;

public class ZeroBank {
    public static void main(String[] args) {
//        //1. Open Chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        //2. Go to http://zero.webappsecurity.com/login.html
        driver.get("http://zero.webappsecurity.com/login.html");
        String expectedTitle = "Zero - Log in" ;
     //   WebElement titleCheck = driver.findElement(By.xpath("//title[.='Zero - Log in']"));
        String actualTitle = driver.getTitle();


       // System.out.println("actualTitle = " + titleCheck.getText());
        System.out.println("expectedTitle = " + expectedTitle);;

        if (actualTitle.equals(expectedTitle))
            System.out.println("Title test PASS");
        else System.out.println("did not PASSED");


    }
}


/*
TC #1: Zero Bank title verification
1. Open Chrome browser
2. Go to http://zero.webappsecurity.com/login.html
3. Verify title
Expected: “Zero - Log in”
 */