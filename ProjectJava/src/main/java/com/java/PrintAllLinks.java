package com.java;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.*;
import org.openqa.selenium.By;
import java.util.List;

public class PrintAllLinks {

    public static void waitForSomeTime()
    {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args)
    {

        //initializing browser
        WebDriver driver = new ChromeDriver();
        driver.get("http://google.com");
//        driver.get("https://workspace-qa.discoveryeducation.co.uk");
//        driver.get("http://10.0.0.222/master/primary_uk/home/index.html");
//        driver.get("https://central.espresso.co.uk/espresso/central/landing/landing.html");//central espresso

        //******************************************************
        /* This code is to Login to espresso to print all the links

        driver.findElement(By.xpath("//input[@id='username']")).sendKeys("therese_landy@discovery.com");
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Bourne01!");
        driver.findElement(By.xpath("//button[@id='signin']")).click();
        waitForSomeTime();
        driver.findElement(By.xpath("//img[@src='images/btn_espresso.png']")).click();
        waitForSomeTime();
        */

//***********************************************************

        //Declare Webelement to save all the links
        List<WebElement> links = driver.findElements(By.tagName("a"));
//        System.out.println(links.size());


        //use for loop to print all the links
            for (WebElement ele:links)
            System.out.println(ele.getAttribute("href")); //This will print the URL from the attribute "href"
//                System.out.println(ele.getText()); //This will print only the name of the URL called getText
//        for (int i=0; i<links.size(); i++)
//            System.out.println(links.get(i).getText()+ " The Link Name is : " +links.get(i).getAttribute("href"));
    }
}
