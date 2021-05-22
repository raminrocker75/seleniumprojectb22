package com.cybertek.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicNavigations {
    public static void main(String[] args) throws InterruptedException {

        //1- setup the browser driver
        WebDriverManager.chromedriver().setup();

        //2- create instance of selenium web driver
        WebDriver driver = new ChromeDriver();

        //3- get the page for tesla.com
        driver.get("https://www.tesla.com");
        System.out.println("Current title = "+driver.getTitle());

        //returns String that is current url on browser
        String currentUrls = driver.getCurrentUrl();
        System.out.println("current url = " + currentUrls);

        //  putting 3 seconds of wait/ stops the code for 3 seconds
        Thread.sleep(3000);
        //Going back using navigations
        driver.navigate().back();

        //putting 3 seconds of wait/ stops the code for 3 seconds
        Thread.sleep(3000);

        //Going forward using navigations
        driver.navigate().forward();

        //putting 3 seconds of wait/ stops the code for 3 seconds
        Thread.sleep(3000);

        // Refreshing the page using refresh method
        driver.navigate().refresh();

        //going to another url using to.() method
        driver.navigate().to("https://www.google.com");

        // to get the title in the console we use .getTitle Method
        System.out.println("Current title = "+driver.getTitle());
        currentUrls = driver.getCurrentUrl();
        System.out.println("current url = " + currentUrls);


        // this method will maximize the browser size
        driver.manage().window().maximize();

        //this method will make the screen complete filling up the whole Screen
        driver.manage().window().fullscreen();

        //this method will close the currently opened browser
        // it will only close 1 browser or 1 tab
        driver.close();
//        driver.quit();








    }
}
