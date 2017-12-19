package com.sahabt.test.defacto.page;

import com.sahabt.test.contains.General_Contains;
import com.sahabt.test.page.SearchPage;
import com.sahabt.test.util.BasePageUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DefactoLoginPage extends BasePageUtil implements General_Contains {

    public DefactoLoginPage(WebDriver driver) {
        super(driver);
    }

    public DefactoHomePage login(String email, String password){
        sleep(5);
        click(By.className("sp-fancybox-skin"));
        sleep(2);
        click(By.xpath("/html/body//section[@class='nav-group']/nav[@role='navigation']//div[@role='toolbar']/div[4]/a[@href='/Login']"));
        sleep(2);
        click(By.id("LoginModel_Email"));
        sendKey(DefactoEMAIL_TEXTBOX,email);
        click(By.id("LoginModel_Password"));
        sendKey(DefactoPASSWORD_TEXTBOX,password);
        click(By.id("LoginBtn"));

        return new DefactoHomePage(driver);
    }

    public DefactoHomePage register(){
        sleep(5);
        click(By.className("sp-fancybox-skin"));
        click(By.xpath("/html/body//section[@class='nav-group']/nav[@role='navigation']//div[@role='toolbar']//a[@href='/Login/Register']"));
        sleep(2);
        sendKey(By.id("RegisterModel_CustomerFirstName"),"neslisah");
        sleep(2);
        sendKey(By.id("RegisterModel_CustomerLastName"),"Hayırlıoglu");
        sleep(2);
        sendKey(By.id("RegisterModel_CustomerEmail"),"neslisahgamze@gmail.com");
        sleep(2);
        sendKey(By.id("RegisterModel_CustomerMobilePhone"),"5342342131");
        sleep(2);
        sendKey(By.id("RegisterModel_CustomerBirthDateDay"),"29");
        sleep(2);
        sendKey(By.id("RegisterModel_CustomerBirthDateMonth"),"12");
        sleep(2);
        sendKey(By.id("RegisterModel_CustomerBirthDateYear"),"1994");
        sleep(2);
        //sendKey(By.id("RegisterModel.Gender"),"Kadın");
        //sleep(2);
        sendKey(By.id("RegisterModel_CustomerPassword"),"1234567");
        sleep(2);
        sendKey(By.id("RegisterModel_CustomerPasswordConfirm"),"1234567");
        sleep(2);
        click(By.id("RegisterModel_CustomerIsApprovedContract"));
        sleep(2);
        click(By.id("RegisterBtn"));

        return new DefactoHomePage(driver);

    }




}
