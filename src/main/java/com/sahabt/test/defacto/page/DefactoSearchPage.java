package com.sahabt.test.defacto.page;

import com.sahabt.test.util.BasePageUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class DefactoSearchPage extends BasePageUtil {
    public DefactoSearchPage(WebDriver driver) {
        super(driver);
    }

    public void search(){
        sleep(2);
        driver.findElement(By.cssSelector("._mCS_9 li:nth-of-type(1) gt")).click();
        sleep(2);
        driver.findElement(By.cssSelector("._mCS_17 li:nth-of-type(8) gt")).click();
        sleep(2);
        driver.findElement(By.cssSelector("#facetAccordion .panel-default:nth-of-type(5) [data-toggle]")).click();
        sleep(2);
        driver.findElement(By.xpath("//div[@id='fx_c']/div/div/div/div[@class='mCSB_container']/div[@id='boutique-category']/ul[@class='navbar-default']//gt[.='Mavi']")).click();
        sleep(2);
        driver.findElement(By.xpath("//div[@id='fx_c']/div/div/div/div[@class='mCSB_container']/div[@id='boutique-category']/ul[@class='navbar-default']//gt[.='Çivit Mavisi']")).click();
        sleep(2);
        driver.findElement(By.xpath("/html//section[@id='fixed']//a[@href='/cift-cepli-dar-kalip-gomlek-780010']/figure//h2[.='Çift Cepli Dar Kalıp Gömlek']")).click();
        sleep(2);
        driver.findElement(By.xpath("/html//section[@id='fixed']/div[5]/div/div//ul[@class='productSizes productWidthHeight top15']/li[4]/a[@href='javascript:;']/span[.='L']")).click();
        sleep(2);
        sendKey(By.id("Quantity"),"2");
        sleep(3);
        driver.findElement(By.id("addToCart")).click();
        sleep(2);
        driver.findElement(By.id("popupBasket_ComplateShopping")).click();
        sleep(2);
        driver.findElement(By.id("ComplateShoppingDown")).click();
        sleep(2);
    }

    public void findNoOfDisplayeImages() throws InterruptedException
    {
        Integer counter=0;
        driver.get("https://www.defacto.com.tr/erkek/giyim-gomlek-civit-mavisi?fx_c1=1&fx_c2=1413&fx_c3=70&fx_s=4&fx_c=9609-9607");
        sleep(2);
        List<WebElement> listImages=driver.findElements(By.tagName("img"));
        System.out.println("No. of Images: "+listImages.size());
        for(WebElement image:listImages)
        {
            if(image.isDisplayed())
            {
                counter++;
                System.out.println(image.getAttribute("alt"));
            }
        }
        System.out.println("No. of total displable images: "+counter);
        driver.close();

    }
}
