package com.sahabt.test.defacto.page;

import com.sahabt.test.base.BaseTestDefacto;
import com.sahabt.test.util.BasePageUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DefactoHomePage extends BasePageUtil{
    public DefactoHomePage(WebDriver driver) {
        super(driver);
    }

    public DefactoLoginPage call(){
        sleep(3);
        click(By.className("insider-opt-in-notification-button"));
        sleep(2);
        return new DefactoLoginPage(driver);
    }

    public DefactoSearchPage callLogin(){
        sleep(3);
        click(By.className("insider-opt-in-notification-button"));
        sleep(2);
        return new DefactoSearchPage(driver);
    }
}
