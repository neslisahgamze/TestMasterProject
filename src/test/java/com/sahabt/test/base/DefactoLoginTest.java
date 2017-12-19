package com.sahabt.test.base;

import com.sahabt.test.defacto.page.DefactoHomePage;
import com.sahabt.test.defacto.page.DefactoLoginPage;
import com.sahabt.test.defacto.page.DefactoSearchPage;
import org.junit.Test;

public class DefactoLoginTest extends BaseTestDefacto{

    @Test
    public void successLogin(){
        new DefactoHomePage(driver).call().login("neslisahgamze@gmail.com","1234");
    }

    @Test
    public  void registerTest(){
       new DefactoHomePage(driver).call().register();
    }

    @Test
    public void searchTest(){
        new DefactoHomePage(driver).callLogin().search();
    }
}
