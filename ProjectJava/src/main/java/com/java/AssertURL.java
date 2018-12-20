package com.java;

import org.apache.http.util.Asserts;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssertURL {
    boolean result;
    WebDriver driver;

    public static void main(String[] args)
    {
        WebDriver driver = new ChromeDriver();
        driver.get("http://google.com");
        validateURL(driver, "http://yahoo.com");

    }

    public static boolean validateURL(WebDriver driver, String expURL)
    {
        boolean result = false;
        if(driver.getCurrentUrl().equalsIgnoreCase(expURL))
        {
            result = true;
        }

        return result;
    }


}
