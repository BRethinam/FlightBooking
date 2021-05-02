package com.blazedemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FromToCity  {

    public void goTo(WebDriver driver, String fromCity, String toCity) {
        chooseCity(driver, "fromPort", fromCity);
        chooseCity(driver, "toPort", toCity);

        WebElement submitField = driver.findElement(By.xpath("//input[@value='Find Flights']"));
        submitField.submit();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private void chooseCity(WebDriver driver, String port, String city) {
        WebElement fromPort = driver.findElement(By.name(port));
        fromPort.findElement(By.xpath("//option[. = '" + city + "']")).click();
    }
}
