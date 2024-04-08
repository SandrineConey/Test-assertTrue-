package org.example;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NegativeAuthorizationTest {
    WebDriver driver = new ChromeDriver();
    NegativeData getNegativeData = new NegativeData();

    private By inputLogin = By.xpath("//div[@class='it_w']//input[@name='st.email']");
    private By inputPassword = By.xpath("//div[@class='it_w']//input[@name='st.password']");
    private By button = By.xpath("//div[@class='login-form-actions']//input[@class='button-pro __wide']");
    private By invalideAutorization = By.xpath("//div[@class='form_i form_i__error']//div[@class='input-e login_error']");


    @Test
    public void autorization() {
        driver.get(getNegativeData.url);
        driver.manage().window().maximize();
        driver.findElement(inputLogin).sendKeys(getNegativeData.login);
        driver.findElement(inputPassword).sendKeys(getNegativeData.password);
        driver.findElement(button).click();
        String getError = driver.findElement(invalideAutorization).getText();
        Assert.assertEquals("Неправильно указан логин и/или пароль", getError);


    }
}
