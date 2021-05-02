package com.blazedemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;

import java.io.File;

public class Browser {

    static WebDriver driver;

    public static WebDriver getDriver() {
        return driver;
    }

    public static void setDriver(WebDriver driver) {
        Browser.driver = driver;
    }

    public static void init() {
        System.setProperty("webdriver.gecko.driver","C:\\Users\\varshini\\tools\\geckodriver.exe");

        File pathToBinary = new File("C:\\Users\\varshini\\AppData\\Local\\Mozilla Firefox\\firefox.exe");
        FirefoxBinary firefoxBinary = new FirefoxBinary(pathToBinary);
        FirefoxProfile firefoxProfile = new FirefoxProfile();
        FirefoxOptions firefoxOptions = new FirefoxOptions().setBinary(firefoxBinary).setProfile(firefoxProfile);

        driver = new FirefoxDriver(firefoxOptions);
    }

    public static void goTo(String url){
        init();
        driver.get(url);
    }

    public static String title() {
        return driver.getTitle();
    }

    public static void close() {
        driver.close();
    }
}
