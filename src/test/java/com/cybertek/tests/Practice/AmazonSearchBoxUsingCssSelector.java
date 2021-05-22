package com.cybertek.tests.Practice;

import com.cybertek.utilites.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AmazonSearchBoxUsingCssSelector {
    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("http://Amazon.com");
        WebElement searchBar = driver.findElement(By.cssSelector("input[aria-label='Search']"));
        System.out.println("searchBar.isDisplayed() = " + searchBar.isDisplayed());




    }
}
