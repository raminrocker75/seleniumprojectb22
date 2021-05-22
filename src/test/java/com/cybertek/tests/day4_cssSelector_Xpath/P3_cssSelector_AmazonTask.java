package com.cybertek.tests.day4_cssSelector_Xpath;

import com.cybertek.utilites.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class P3_cssSelector_AmazonTask {
    public static void main(String[] args) throws InterruptedException {
        //1.open chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        //2. Go to amazon.com
        driver.get("http://Amazon.com");
        //3 . enter search term (use cssSelector)
        WebElement amazonSearchBar = driver.findElement(By.cssSelector("input[id='twotabsearchtextbox']"));
        amazonSearchBar.sendKeys("hacker"+ Keys.ENTER);

        String expectedTitle = "Amazon.com : Java programming";
        String actualTitle = driver.getTitle();

        if(actualTitle.equals(expectedTitle)){
            System.out.println("Title verification Passed!");
        }else {
            System.out.println("Title verification Failed!");
        }

        Thread.sleep(5000);
        driver.close();

    }
}
