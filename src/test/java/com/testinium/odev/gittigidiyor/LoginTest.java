package com.testinium.odev.gittigidiyor;

import org.junit.Test;
import org.openqa.selenium.By;

import java.util.concurrent.TimeUnit;

public class LoginTest extends BaseTest {

    @Test
    public void loginTest()
    {
        getUrl("https://www.gittigidiyor.com/uye-girisi");
        setById("L-UserNameField", "seleniumtrendyol@gmail.com");
        setById("L-PasswordField", "A.555555");
        clickById("gg-login-enter");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        getUrl("https://www.gittigidiyor.com/uye-girisi");
        setById("L-UserNameField", "seleniumtrendyol@gmail.com");
        setById("L-PasswordField", "A.123456789");
        clickById("gg-login-enter");

    }



}
