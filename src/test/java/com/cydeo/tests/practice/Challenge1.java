package com.cydeo.tests.practice;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Challenge1 {

    WebDriver driver;



    @BeforeMethod
    public void setupMethod(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://practice.cydeo.com/registration_form");

    }

    @Test
    public void test1(){

        WebElement firstName = driver.findElement(By.xpath("//input[@type='text' and @name='firstname']"));
        firstName.sendKeys("Kerem");
        WebElement lastName = driver.findElement(By.xpath("//input[@name='lastname' and @placeholder='last name']"));
        lastName.sendKeys("Ozturk");
        WebElement userName = driver.findElement(By.xpath("//input[@type='text' and @name='username']"));
        userName.sendKeys("ozturkKerem");
        WebElement emailAddress = driver.findElement(By.xpath("//input[@type='text' and @name='email']"));
        emailAddress.sendKeys("ozturkkerem@asd.com");
        WebElement password = driver.findElement(By.xpath("//input[@type='password' and @name='password']"));
        password.sendKeys("sifreiyidir");
        WebElement phoneNumber = driver.findElement(By.xpath("//input[@type='tel' and @name='phone']"));
        phoneNumber.sendKeys("345-635-6478");
        WebElement maleRadio = driver.findElement(By.xpath("//input[@type='radio' and @value='male']"));
        maleRadio.click();
        WebElement dateOfBirthday = driver.findElement(By.xpath("//input[@type='text' and @name='birthday']"));
        dateOfBirthday.sendKeys("08/09/1983");
        Select select = new Select(driver.findElement(By.xpath("//Select[@name='department']")));
        select.selectByIndex(1);
        Select selectTitle = new Select(driver.findElement(By.xpath("//Select[@name='job_title']")));
        selectTitle.selectByVisibleText("SDET");
        WebElement javaClick= driver.findElement(By.xpath("//input[@type='checkbox']"));
        javaClick.click();

        WebElement signUp = driver.findElement(By.xpath("//button[@type='submit']"));
        signUp.click();


    }

}
