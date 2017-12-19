package com.sahabt.test.page;

import com.sahabt.test.util.BasePageUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchPage extends BasePageUtil {
    public SearchPage(WebDriver driver) {
        super(driver);
    }

    public HomePage addToBasket() {

        sendKey(By.id("productSearch"), "BD300723");
        sleep(2);
        submit(By.id("productSearch"));
        //click(By.className("insider-opt-in-notification-button"));
        sleep(2);
        sendURL("http://www.hepsiburada.com/logitech-m185-nano-optik-kablosuz-mouse-mavi-910-002236-p-BD300723");
        sleep(3);
        click(By.xpath("/html//button[@id='addToCart']"));
        sleep(2);
        inrease(By.xpath("/html//form[@id='addToCartForm']//button[@title='Arttır']"),3);
        sleep(2);
        click(By.xpath("//div[@id='short-summary']//button[@class='btn btn-primary full']/span[@class='text']"));
        sleep(2);

        return new HomePage(driver);

    }

    public HomePage completeOrder() {
        sendKey(By.xpath("/html//input[@id='productSearch']"), "HBV000007PV9M");
        sleep(2);
        submit(By.xpath("/html//button[@id='buttonProductSearch']"));
        sleep(2);
        sendURL("http://www.hepsiburada.com/apple-iphone-8-plus-64-gb-apple-turkiye-garantili-p-HBV000007PV9M");
        sleep(2);
        click(By.xpath("/html//button[@id='addToCart']"));
        sleep(2);
       // click(By.cssSelector(".btn-primary .text"));
        sleep(2);
        return new HomePage(driver);

    }

    public HomePage search(){

        sendKey(By.xpath("/html//input[@id='productSearch']"),"ayakkabı");
        sleep(2);
        submit(By.xpath("/html//button[@id='buttonProductSearch']"));
        sleep(2);
        click(By.xpath("/html//div[@id='productResult']//section[@class='page-options']/div[@class='filter-box-container']/div[2]/div//div[@class='items-container']/ul[@class='items']/li[@alt='Erkek']/a[@href='/erkek-giyim-modelleri-c-12087177']"));
        sleep(2);
        click(By.cssSelector("[href=\"\\/ayakkabi-c-60000117\"]"));
        //click(By.cssSelector("[href=\"\\/erkek-gunluk-ayakkabilar-c-60000126\"]"));
        sleep(4);
        click(By.linkText("Erkek Ayakkabı (28649)"));
        sleep(2);
        click(By.cssSelector("[for=\"brand-celalgultekin\"]"));
        sleep(2);
        sendKey(By.xpath("/html//div[@id='productResult']//section[@class='page-options']/div[@class='filter-box-container']/div[3]/div/div[@class='loader']/ol[@class='filters-container']/li[@class='box-container fiyat']//input[@placeholder='En az']"),"250");
        sleep(2);
        sendKey(By.xpath("/html//div[@id='productResult']//section[@class='page-options']/div[@class='filter-box-container']/div[3]/div/div[@class='loader']/ol[@class='filters-container']/li[@class='box-container fiyat']//input[@placeholder='En çok']"),"500");
        sleep(2);
        //click(By.cssSelector("[for=\"attr-fiyat-250-500\"]"));
        click(By.xpath("//div[@id='productResult']//section[@class='page-options']/div[@class='filter-box-container']/div[3]/div//ol[@class='filters-container']/li[@class='box-container color-palette renk']/ol/li[@alt='Kahverengi']/label"));
        sleep(2);
        click(By.cssSelector("[for=\"attr-numara-44\"]"));
        sleep(2);
        return new HomePage(driver);
    }


}
