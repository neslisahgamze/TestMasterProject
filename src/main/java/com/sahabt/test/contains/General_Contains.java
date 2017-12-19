package com.sahabt.test.contains;

import org.openqa.selenium.By;

public interface General_Contains {
    By EMAIL_TEXTBOX= By.cssSelector("#form-login .control-group:nth-of-type(1) [type]");
    By PASSWORD_TEXTBOX = By.cssSelector("#password");

    By DefactoEMAIL_TEXTBOX= By.id("LoginModel_Email");
    By DefactoPASSWORD_TEXTBOX = By.id("LoginModel_Password");

    By PAGE_NUMBER = By.cssSelector("//div[@id='pagination']/ul//a[@href='http://www.hepsiburada.com/ara?q=mouse&sayfa=7']");

}
