package com.telran;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class GoToGoogle {

    WebDriver wd;
    @Test
    public void gotToGoogle()  {
        wd = new ChromeDriver();
        wd.get("https://www.google.fi/");
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        wd.quit();

    }
}
