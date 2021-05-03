package com.blazedemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ChooseFlight {

    public void goTo(WebDriver driver) {
        //driver.findElement(By.xpath("(//input[@value='Choose This Flight'])[1]")).click();
        chooseFlight(driver).click();
    }

    public WebElement chooseFlight(WebDriver driver) {
        return driver.findElement(By.xpath("(//input[@value='Choose This Flight'])[1]"));
    }
}
