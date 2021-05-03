package com.blazedemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SendPassengerData {

    public static  void goTo(WebDriver driver, Passenger passenger) {
        driver.findElement(By.xpath("//input[@id='inputName']")).sendKeys(passenger.getInputName());
        driver.findElement(By.xpath("//input[@id='address']")).sendKeys(passenger.getAddress());
        driver.findElement(By.xpath("//input[@id='city']")).sendKeys(passenger.getCity());
        driver.findElement(By.xpath("//input[@id='state']")).sendKeys(passenger.getState());
        driver.findElement(By.xpath("//input[@id='zipCode']")).sendKeys(passenger.getZipCode());
        driver.findElement(By.name("cardType")).findElement(By.xpath("//option[. = '"+ passenger.getCardType() +"']")).click();
        driver.findElement(By.xpath("//input[@id='creditCardNumber']")).sendKeys(passenger.getCreditCardNumber());
        driver.findElement(By.xpath("//input[@id='creditCardYear']")).sendKeys(passenger.getCreditCardYear());
        driver.findElement(By.xpath("//input[@id='nameOnCard']")).sendKeys(passenger.getNameOnCard());
        driver.findElement(By.xpath("//input[@value='Purchase Flight']")).click();
    }

    public WebElement sndPassengerChk(WebDriver driver) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return driver.findElement(By.xpath("//input[@id='inputName']"));
    }
}
