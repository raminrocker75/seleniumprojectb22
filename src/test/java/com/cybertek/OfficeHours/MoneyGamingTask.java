package com.cybertek.OfficeHours;

import com.cybertek.utilites.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MoneyGamingTask {

    @Test
    public void task1(){
        /*
        REAL JOB INTERVIEW TASK
        1. Navigate to: https://moneygaming.qa.gameaccount.com/
        2. Click the JOIN NOW button to open the registration page
        3. Select a title value from the dropdown
        4. Enter your first name and surname in the form
        5. Check the tickbox with text 'I accept the Terms and Conditions and certify that I am over the age of 18.'
        6. Submit the form by clicking the JOIN NOW button
        7. Validate that a validation message with text ‘ This field is required’ appears under the date of
        birth box
         */
        WebDriver driver= WebDriverFactory.getDriver("Chrome");
        driver.manage().window().maximize();
        driver.get("https://moneygaming.qa.gameaccount.com/");
       // driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        WebElement joinButton = driver.findElement(By.cssSelector("a[href='/sign-up.shtml']")); ////a[@class='newUser green'] xpath way of doing this
        joinButton.click();

        WebElement title = driver.findElement(By.xpath("//select[@name='map(title)']"));
        Select titleDropDown = new Select(title);

        titleDropDown.selectByVisibleText("Mr");

        String expectedTitle = "Mr";
        String actualTitle = titleDropDown.getFirstSelectedOption().getText();
        Assert.assertEquals(actualTitle,expectedTitle,"verify the title");


    }
}
