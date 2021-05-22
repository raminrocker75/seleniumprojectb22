package com.cybertek.tests.day4_cssSelector_Xpath;

import com.cybertek.utilites.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class p1_cssSelector_CyberTek {
    public static void main(String[] args) {
        //      TC #1: PracticeCybertek.com_ForgotPassword WebElement verification
        //1. Open Chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");

        driver.manage().window().maximize();

        //2. Go to http://practice.cybertekschool.com/forgot_password
        driver.get("http://practice.cybertekschool.com/forgot_password");

        //3. Locate all the WebElements on the page using XPATH and/or CSS locator only (total of 6)
        //a. “Home” link
        WebElement homeLink = driver.findElement(By.cssSelector("a.nav-link")); //or we could use this a[class='nav-link'] they are both exact same thing

        //b. “Forgot password” header
        WebElement headerForgotPassword = driver.findElement(By.tagName("h2"));
        //c. “E-mail” text

        //d. E-mail input box
        WebElement  emailLabel = driver.findElement(By.cssSelector("label[for='email']"));

        //e. “Retrieve password” button
        WebElement passwordButton = driver.findElement(By.cssSelector("i[class='icon-2x icon-signin']"));

        //f. “Powered by Cybertek School” text
        WebElement poweredByCybertekSchoolText = driver.findElement(By.cssSelector("div[style='text-align: center;']"));

        //4. Verify all WebElements are displayed.

        System.out.println("homeLink.isDisplayed() = " + homeLink.isDisplayed());
        System.out.println("headerForgotPassword.isDisplayed() = " + headerForgotPassword.isDisplayed());
        System.out.println("emailLabel.isDisplayed() = " + emailLabel.isDisplayed());
        System.out.println("passwordButton.isDisplayed() = " + passwordButton.isDisplayed());
        System.out.println("poweredByCybertekSchoolText.isDisplayed() = " + poweredByCybertekSchoolText.isDisplayed());

    }
}
