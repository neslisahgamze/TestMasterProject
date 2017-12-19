package com.sahabt.test.util;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

import static com.sahabt.test.contains.General_Contains.PAGE_NUMBER;

public class BasePageUtil {
    public WebDriver driver;
   // Actions action = new Actions(driver);

    public BasePageUtil(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement find(By by){
        WebElement x=driver.findElement(by);
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", x);
        return x;
    }
    public WebElement popUp(By by){
        WebElement x = driver.findElement(by);
        (( JavascriptExecutor )driver).executeScript( "window.onbeforeunload = function(e){};",x);
        return x;
    }

    public void click(By by) {

        //find(by).click();
        driver.findElement(by).click();
    }

    public void clickElement(By by){
        find(by).click();
    }

    public List<WebElement> getPage(){
        List<WebElement> elements = driver.findElements(PAGE_NUMBER);
        System.out.println(elements.toArray());
        return elements;
    }

    public void mouseOver(By by){
        Actions action = new Actions(driver);
        WebElement element = driver.findElement(by);
        action.moveToElement(element).build().perform();
        action.click();

    }

    public void mouseOverClick(By by){
        Actions action = new Actions(driver);
        WebElement element = driver.findElement(by);
        action.moveToElement(element).click();

    }

    public void sendKey(By by,String value){
        driver.findElement(by).sendKeys(value);
    }

    public void sendURL(String url){
        driver.navigate().to(url);
    }

    public void submit(By by){
        driver.findElement(by).submit();
    }

    public void inrease(By by,int value){
        for (int i=1; i<value; i++){
            click(by);
        }
    }

    public String getTitle() {
        return driver.getTitle();
    }

    public void sleep(int time) {
        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}

