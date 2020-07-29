package com.testinium.odev.gittigidiyor;

import org.junit.Test;
import org.openqa.selenium.By;

import java.util.concurrent.TimeUnit;


public class ProductTest extends BaseTest {

    @Test
    public void getProduct() {

        //Arama sonuclarinda Dell bilgisayar aranmasi
        setById("search_word", "Dell");
        clickById("header-search-find-link");
        driver.manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);


       //Sonuclardan 3.sayfanin acilmasi

        driver.findElement(By.xpath("//*[@id=\"best-match-right\"]/div[5]/ul/li[3]/a")).click();
        driver.manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);
        //Anasayfadan bir urunun cekilmesi
        driver.findElement(By.xpath("//*[@id=\"item-info-block-565690772\"]/div/div[1]/div[2]/div/div[1]/div/div/div[4]/p/span")).click();
        driver.manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);

        //Urunun sepete eklenmesi
        driver.findElement(By.xpath("//*[@id=\"add-to-basket\"]/span")).click();

    }
}
