package com.cybertek.tests.day6_testing_intro_dropdowns;

import com.cybertek.utilites.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class P03_Apple_Task {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = WebDriverFactory.getDriver("Chrome");
        driver.manage().window().maximize();
        driver.get("https://www.apple.com/");
        // Storing 9 Web elements including "apple logo" , and search box
        List<WebElement> headerLinks = driver.findElements(By.xpath("//ul[@class='ac-gn-list']//li/a"));
        for (int eachLink = 1; eachLink < headerLinks.size()-1; eachLink++) {

            headerLinks.get(eachLink).click();
            Thread.sleep(1000);
            headerLinks = driver.findElements(By.xpath("//ul[@class='ac-gn-list']//li/a"));

//            print out the titles of the each page
            System.out.println("Current title in the page = " + driver.getTitle());

//            print out total number of links in each page
            List<WebElement> allLinks = driver.findElements(By.xpath("//body//a"));

            System.out.println("Total number of links in current page " + allLinks.size());

            int linkWithNoText = 0;
            int linkWithText = 0;

            for (WebElement allLink : allLinks) {
                if(allLink.getText().isEmpty()){
                    linkWithNoText++;
                }else {
                    linkWithText++;
                }
            }

            //Print out how many links is missing text total
            System.out.println("--> Current page links with no text: " + linkWithNoText);

            // print out how many links has text total
            System.out.println("--> Current page links with text = " + linkWithText);



        }



    }
}
