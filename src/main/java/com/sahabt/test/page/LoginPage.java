package com.sahabt.test.page;

import com.sahabt.test.base.BaseTest;
import com.sahabt.test.contains.General_Contains;
import com.sahabt.test.util.BasePageUtil;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


import java.util.List;

public class LoginPage extends BasePageUtil implements General_Contains{


    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public  HomePage login(String email, String password){

        sendURL("https://www.hepsiburada.com/ayagina-gelsin/giris?ReturnUrl=%2f");
        click(By.cssSelector("#form-login .control-group:nth-of-type(1) [type]"));
        sendKey(EMAIL_TEXTBOX, email);
        sleep(2);
        click(By.cssSelector("#password"));
        sendKey(PASSWORD_TEXTBOX,password);
        sleep(2);
        click(By.xpath("//form[@id='form-login']//button[@type='submit']"));
        sleep(2);
        Assert.assertTrue("Login sayfası yüklenemedi.", getTitle().contains("Üye Giriş Sayfası"));
        System.out.println("Login sayfası yüklendi.");
        return new HomePage(driver);
    }

    public HomePage register(){

        sendURL("https://www.hepsiburada.com/ayagina-gelsin/giris?ReturnUrl=%2f");
        List<WebElement> radioButton = driver.findElements(By.cssSelector(".login-selections .control-group:nth-of-type(2) .text"));
        driver.findElement(By.cssSelector(".login-selections .control-group:nth-of-type(2) .text")).click();
        sleep(2);
        sendKey(By.xpath("/html//input[@id='firstname']"),"Neslisah");
        sleep(2);
        sendKey(By.xpath("/html//input[@id='lastname']"),"Hayırlıoglu");
        sleep(2);
        sendKey(By.xpath("/html//input[@id='email-register']"),"neslisahgamze@gmail.com");
        sleep(2);
        sendKey(By.xpath("/html//input[@id='password-register']"),"1234");
        sleep(2);
        sendKey(By.xpath("/html//input[@id='password-repeat']"),"1234");
        sleep(2);
        submit(By.xpath("//form[@id='form-user']//button[@type='submit']"));
        sleep(2);
        return new HomePage(driver);

    }


}
