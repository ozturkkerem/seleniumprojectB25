package com.cydeo.tests.practice.Adam;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TC2 {
    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("https://vytrack.com/");

        //WebElement aboutUsButton= driver.findElement(By.cssSelector([]));
        WebElement aboutUsButton = driver.findElement(By.xpath("//a[.='About us']"));

        String aboutText = aboutUsButton.getText();

        System.out.println(aboutText);



    }
}


/*
//1-open a chrome browser
 //2-goto https://vytrack.com/
 //3-verify About us is displayed
 */
