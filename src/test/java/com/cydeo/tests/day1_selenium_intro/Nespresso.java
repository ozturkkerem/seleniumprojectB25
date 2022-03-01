package com.cydeo.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Nespresso {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.lavazza.us/en_US/utils/registration/login.html");
        WebElement inboxBox = driver.findElement(By.id("gigya-loginform-email"));
        inboxBox.sendKeys("Keremozturk");
        WebElement inboxBoxPassword = driver.findElement(By.id("gigya-loginform-password"));
        inboxBoxPassword.sendKeys("123456");

        String currentUrl = driver.getCurrentUrl();
        String currentTitle =driver.getTitle();

        System.out.println(currentTitle);
        System.out.println(currentUrl);

     //   driver.close();
    //driver.quit();


    }

}
