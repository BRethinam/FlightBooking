package com.blazedemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ChooseFlight {

    public void goTo(WebDriver driver) {
        driver.findElement(By.xpath("(//input[@value='Choose This Flight'])[1]")).click();
    }
}
