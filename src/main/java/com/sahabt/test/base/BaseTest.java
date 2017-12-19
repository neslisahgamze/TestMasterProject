package com.sahabt.test.base;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class BaseTest {

    WebDriver driver;

    public String driverName = "webdriver.chrome.driver";
    public String driverPath = "driver/chromedriver";
    public String url = "http://hepsiburada.com";

    @Before
    public void setup() {
        System.setProperty(driverName, driverPath);
        driver = new ChromeDriver();
        driver.manage().window().fullscreen();
        driver.navigate().to(url);
    }
    /*
    @After
    public void close(){
        driver.quit();
    }
    */
}

