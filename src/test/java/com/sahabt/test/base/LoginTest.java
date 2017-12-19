package com.sahabt.test.base;

import com.sahabt.test.page.HomePage;
import com.sahabt.test.page.LoginPage;
import com.sahabt.test.page.SearchPage;
import org.junit.Test;

public class LoginTest extends BaseTest{

    @Test
    public void successLogin(){
        new HomePage(driver).call().login("neslisahgamze@gmail.com","1234");
    }

    @Test
    public void registerTest(){
        new HomePage(driver).call().register();
    }

    @Test
    public  void addToBasketTest(){
        new HomePage(driver).callLoginPage().addToBasket();
    }

    @Test
    public void orderCompleteTest(){
        new HomePage(driver).callLoginPage().completeOrder();
    }

    @Test
    public void searchTest(){
       new HomePage(driver).callLoginPage().search();

    }

}
