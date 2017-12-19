package com.sahabt.test.base;

import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTestDefacto {

    WebDriver driver;

    public String driverName = "webdriver.chrome.driver";
    public String driverPath = "driver/chromedriver";
    public String url = "https://www.defacto.com.tr";

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
