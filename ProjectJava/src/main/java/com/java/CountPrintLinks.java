package com.java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.util.List;

public class CountPrintLinks {

    public static void main(String[] args)
    {
//        WebDriver driver = new ChromeDriver();
        WebDriver driver = new InternetExplorerDriver();
        driver.get("http://newtours.demoaut.com");

        List<WebElement> allLinks = driver.findElements(By.tagName("a"));
        System.out.println(allLinks.size());

        for (int i=0; i<=allLinks.size(); i++)
            System.out.println(allLinks.get(i).getText() + " Link Name is :" +allLinks.get(i).getAttribute("href"));
    }
}
