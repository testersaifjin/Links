package com.java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Testing {

    public static void main(String[] args)
    {
        WebDriver driver = new ChromeDriver();
        driver.get("http://google.com");
        driver.manage().window().maximize();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        List<WebElement> links = driver.findElements(By.tagName("a"));
        System.out.println(links.size());


        //simple print method to list out all the links
        for (WebElement print: links)
            System.out.println(print.getAttribute("href"));

        //print and count all the links with the URL name - using getText (fetch the URL name) - using getAttribute (fetch the attribute of the URL using href tag)
//        for (int i=0; i<links.size(); i++)
//            System.out.println(links.get(i).getText()+" The Link Name is : "+links.get(i).getAttribute("href"));

        driver.close();
    }
}
