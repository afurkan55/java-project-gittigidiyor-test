package com.testinium.odev.gittigidiyor;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;


public class BaseTest {

    WebDriver driver;

    @Before
public void baglantiSagla()
    {
        System.setProperty("webdriver.chrome.driver","src/test/resources/chromedriver.exe");
        driver=new ChromeDriver();
        driver.get("https://www.gittigidiyor.com/");
        driver.manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);
    }

    /*@After
     public void baglantiKes(){
        driver.quit();
     }*/


    public void setById(String id, String value)  {
        driver.findElement(By.id(id)).clear();
        driver.findElement(By.id(id)).sendKeys(value);

    }

    public void getUrl(String URL)
    {
      driver.get(URL);

    }
    public void clickById(String id){

        driver.findElement(By.id(id)).click();
    }

    public void setByXpath(String xpath){
        driver.findElement(By.xpath(xpath));
    }
    public void clickByXpath(String xpath)
    {
        driver.findElement(By.xpath(xpath)).click();
    }


}
