package org.example;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StyleTest {

    @Test
    public void style() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://ok.ru/");
        WebElement element = driver.findElement(By.xpath("//div[@class='login-form-actions']//input[@class='button-pro __wide']"));
        String result = element.getCssValue("color");
        Assert.assertEquals("rgba(255, 255, 255, 1)", result);
    }
}
