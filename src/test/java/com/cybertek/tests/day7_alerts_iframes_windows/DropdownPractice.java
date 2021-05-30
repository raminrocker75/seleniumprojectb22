package com.cybertek.tests.day7_alerts_iframes_windows;

import com.cybertek.utilites.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class DropdownPractice {
        WebDriver driver;
        String str1 = "something";
    @BeforeClass
    public void setupClass(){
        driver = WebDriverFactory.getDriver("Chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get("http://practice.cybertekschool.com/dropdown");
        str1 = "something";
    }

    @Test
    public void tc1_simpleDropdown_test(){
        //str1.substring(1,5);
        Select simpleDropdown = new Select(driver.findElement(By.xpath("//select[@id='dropdown']")));

        simpleDropdown.getFirstSelectedOption(); // this will be returning me the default value of the dropdown menue

        WebElement currentlySelectedOption = simpleDropdown.getFirstSelectedOption();

        String actualTextOfCurrentOption = currentlySelectedOption.getText();
        String expectedText = "Please select an option";
        //Assert.assertTrue(actualTextOfCurrentOption.equals(expectedText));
        Assert.assertEquals(actualTextOfCurrentOption,expectedText);
        //Doing everything in one line: get currently selected option, get the text and compare against expectedText;
       // Assert.assertEquals(simpleDropdown.getFirstSelectedOption().getText(),"Please select an option");

        Select stateDropDown = new Select(driver.findElement(By.xpath("//select[@id='state']")));
        //Select stateDropDown = new Select(driver.findElement(By.id("state")));

        String actualStateDropDown = stateDropDown.getFirstSelectedOption().getText();
        String expectedStatedDropdown = "Select a State";

        Assert.assertEquals(actualStateDropDown,expectedStatedDropdown);
    }

    @AfterClass
    public void tearDownClass(){
        driver.close();
    }
}
