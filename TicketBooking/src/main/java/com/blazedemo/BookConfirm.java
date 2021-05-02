package com.blazedemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BookConfirm {

    public static String goTo(WebDriver driver) {
        return driver.findElement(By.xpath("//td[2]")).getText();
    }
}
