package com.cybertek.tests.day5_findElemnts_checkBoxes;

import com.cybertek.utilites.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class P0_FindElements_Practice {
    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver("Chrome");
        driver.manage().window().maximize();

        // if a web element is not found, this will wait UP to giveb seconds
        // If web Element is located before 15 seconds, it will move on
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

        driver.get("http://practice.cybertekschool.com/forgot_password");

        // we need to create a locator that returns us all the links on the page
        //body//a----> this locator will return all of the links on the page

        // we are storing all of the links that are returned by findElements method
        List<WebElement> listOfLinks = driver.findElements(By.xpath("//body//a"));


        //print out the texts of all links
        for (WebElement each : listOfLinks) {
            System.out.println(each.getText());
            System.out.println(each.getAttribute("href"));
        }

        //print out how many total links
        System.out.println(listOfLinks.size());


    }
}
