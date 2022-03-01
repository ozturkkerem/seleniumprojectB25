package com.cydeo.tests.adamTask.frameTask;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TC1 {

    WebDriver driver;

    @BeforeMethod
    public void setupMethod() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://the-internet.herokuapp.com");
        //2- Go to https://the-internet.herokuapp.com/
    }

    @Test
    public void test1(){
        //3- Click iFrame
        WebElement framesButton = driver.findElement(By.xpath("//a[@href='/frames']"));
        framesButton.click();
        WebElement iFrameButton = driver.findElement(By.xpath("//a[.='iFrame']"));
        iFrameButton.click();

        //4- Verify the ‘Your content goes here.’ label
        driver.switchTo().frame(0);
        String expectedResult = "Your content goes here.";
        String actualResult = driver.findElement(By.xpath("//p[.='Your content goes here.']")).getText();
        Assert.assertEquals(expectedResult,actualResult);

        //5- Verify the header ‘An iFrame containing the TinyMCE WYSIWYG Editor’
        driver.switchTo().defaultContent();
        WebElement heater = driver.findElement(By.xpath("//h3[.='An iFrame containing the TinyMCE WYSIWYG Editor']"));

        actualResult = heater.getText();
        expectedResult = "TinyMCE WYSIWYG Editor";

        Assert.assertTrue(actualResult.contains(expectedResult));

        //TC 1: As a User I should be able to see ‘Your content goes here.’ And ‘An iFrame
        //containing the TinyMCE WYSIWYG Editor
    }


    @Test
    public void test2BOTTOM(){

        //1- Click Nested Frames

        WebElement nestedFrames = driver.findElement(By.xpath("//a[@href='/nested_frames']"));
        nestedFrames.click();

        //2- Verify the BOTTOM label
        driver.switchTo().frame(driver.findElement(By.xpath("//frame[@name='frame-bottom']")));
        WebElement bottom = driver.findElement(By.xpath("//body"));
        String actualBottom = bottom.getText();

        Assert.assertEquals(actualBottom,"BOTTOM");


    }



    @Test
    public void test3MIDDLE(){

        //1- Click Nested Frames

        WebElement nestedFrames = driver.findElement(By.xpath("//a[@href='/nested_frames']"));
        nestedFrames.click();

        //2- Verify the MIDDLE label
        driver.switchTo().frame(driver.findElement(By.xpath("//frame[@name='frame-top']")));
        driver.switchTo().frame(driver.findElement(By.xpath("//frame[@name='frame-middle']")));
        WebElement right = driver.findElement(By.xpath("//div"));
        String actualRight = right.getText();

        Assert.assertEquals(actualRight,"MIDDLE");


    }

    @Test
    public void test4Middle_Right(){

        //1- Click Nested Frames

        WebElement nestedFrames = driver.findElement(By.xpath("//a[@href='/nested_frames']"));
        nestedFrames.click();

        //2- Verify the MIDDLE label
        driver.switchTo().frame(driver.findElement(By.xpath("//frame[@name='frame-top']")));

        //4- Verify the RİGHT label
        driver.switchTo().frame(driver.findElement(By.xpath("//frame[@name='frame-right']")));

        String actualText= driver.findElement(By.xpath("//body")).getText();
        System.out.println(actualText);
        Assert.assertEquals(actualText,"RIGHT");
        driver.switchTo().defaultContent();

        //5- Verify the LEFT label
        driver.switchTo().frame(driver.findElement(By.xpath("//frame[@name='frame-top']")));
        driver.switchTo().frame(driver.findElement(By.xpath("//frame[@name='frame-left']")));
        actualText= driver.findElement(By.xpath("//body")).getText();
        System.out.println(actualText);
        Assert.assertEquals(actualText,"LEFT");


    }


    @AfterMethod
    public void coolDown(){
        driver.close();

   }

}

/*
TC 1: As a User I should be able to see ‘Your content goes here.’ And ‘An iFrame
containing the TinyMCE WYSIWYG Editor’
1- Open a chrome browser
2- Go to https://the-internet.herokuapp.com/
3- Click iFrame
4- Verify the ‘Your content goes here.’ label
5- Verify the header ‘An iFrame containing the TinyMCE WYSIWYG Editor’
TC 2: As a User I should be able to see BOTTOM label
1- Open a chrome browser
2- Go to https://the-internet.herokuapp.com/
3- Click Nested Frames
4- Verify the BOTTOM label
TC 3: As a User I should be able to see MIDDLE label
1- Open a chrome browser
2- Go to https://the-internet.herokuapp.com/
3- Click Nested Frames
4- Verify the MIDDLE label
TC 4: As a User I should be able to see RİGHT label and LEFT label
1- Open a chrome browser
2- Go to https://the-internet.herokuapp.com/
3- Click Nested Frames
4- Verify the RİGHT label
5- Verify the LEFT label */