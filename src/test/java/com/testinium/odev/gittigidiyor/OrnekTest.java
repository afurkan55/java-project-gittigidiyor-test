package com.testinium.odev.gittigidiyor;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrnekTest {

    WebDriver driver;
    @Before
    public void baglantiSagla()
    {
        System.setProperty("webdriver.chrome.driver","src/test/resources/chromedriver.exe");
        driver=new ChromeDriver();
        driver.get("https://www.gittigidiyor.com/");
    }

    @Test
    public void loginTest()
    {


        driver.get("https://www.gittigidiyor.com/uye-girisi");
        driver.findElement(By.id("L-UserNameField")).sendKeys("melih");
        driver.findElement(By.id("L-PasswordField")).sendKeys("A.123456789");
        driver.findElement(By.id("gg-login-enter")).click();


    }
    @Test
    public void sepetEkleme()
    {
        driver.findElement(By.id("search_word")).sendKeys("Dell");
        driver.findElement(By.id("header-search-find-link")).click();


    }



    @After
    public void baglantiKes()
    {
    driver.quit();
    }

}