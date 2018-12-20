package com.java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class PrintLinksWithName {


    public static void main(String[] args)
    {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");

        List<WebElement> links = driver.findElements(By.tagName("a"));

        for (WebElement alue : links)
        {
            System.out.println(alue.getAttribute("href"));
        }
    }
}
