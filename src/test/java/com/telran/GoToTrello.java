package com.telran;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoToTrello {
    String address = "https://trello.com/";
    WebDriver wd;

    @Test
    public void logInTest() {
        wd.findElement(By.cssSelector("[href=\"/login\"]")).click();
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        //WebElement element = wd.findElement(By.cssSelector("[href=\"/login\"]"));
       // element.click();


    }

    @BeforeMethod
    public void setUp() {

        wd = new ChromeDriver();
        wd.get(address);
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @AfterMethod
    public void tearDown() {
        wd.quit();
    }

}
