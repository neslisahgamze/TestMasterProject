package com.sahabt.test.page;

import com.sahabt.test.util.BasePageUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePageUtil{
    public HomePage(WebDriver driver) {
        super(driver);
    }

    public LoginPage call(){
        sleep(3);
        click(By.className("insider-opt-in-notification-button"));
        sleep(2);
        return new LoginPage(driver);
    }

    public SearchPage callLoginPage(){
        sleep(3);
        click(By.className("insider-opt-in-notification-button"));
        sleep(2);
        return new SearchPage(driver);
    }
}
