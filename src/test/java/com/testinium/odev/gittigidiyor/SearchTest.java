package com.testinium.odev.gittigidiyor;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;


public class SearchTest extends BaseTest {



    @Test
    public void searchTest() {
        setById("search_word", "Dell");
        clickById("header-search-find-link");
        driver.manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);
        setById("search_word", "Macbook");
        clickById("header-search-find-link");


        

       // List<WebElement> results=driver.findElements(By.className("gg-ui-button gg-ui-btn-primary"));
        //results.get(0);

    }

}
