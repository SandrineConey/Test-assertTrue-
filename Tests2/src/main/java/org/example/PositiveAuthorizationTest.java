package org.example;


import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class PositiveAuthorizationTest {

    WebDriver driver = new ChromeDriver();
    PositiveData getPositiveData = new PositiveData();

    private By inputLogin = By.xpath("//div[@class='it_w']//input[@name='st.email']");
    private By inputPassword = By.xpath("//div[@class='it_w']//input[@name='st.password']");
    private By button = By.xpath("//div[@class='login-form-actions']//input[@class='button-pro __wide']");
    private By passed = By.xpath("//div[@class='tico ellip']");


    @Test
    public void autorization() {
        driver.get(getPositiveData.url);
        driver.manage().window().maximize();
        driver.findElement(inputLogin).sendKeys(getPositiveData.login);
        driver.findElement(inputPassword).sendKeys(getPositiveData.password);
        driver.findElement(button).click();
        String getPassed = driver.findElement(passed).getText();
        Assert.assertEquals("technopol47 technopol47", getPassed);

    }
}
