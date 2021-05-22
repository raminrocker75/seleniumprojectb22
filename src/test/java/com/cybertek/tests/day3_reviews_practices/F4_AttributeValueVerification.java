package com.cybertek.tests.day3_reviews_practices;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class F4_AttributeValueVerification {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://Facebook.com");

        WebElement createAPage = driver.findElement(By.linkText("Create a Page"));

        String expectedInHref = "registration_form";
        String actualHrefValue = createAPage.getAttribute("href");

        System.out.println("actualHrefValue = " + actualHrefValue);

        if(actualHrefValue.contains(expectedInHref)){
            System.out.println("Href value verification Passed!");
        }else {
            System.out.println("Href value verification Failed!");
        }
    }
}
