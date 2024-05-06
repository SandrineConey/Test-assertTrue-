package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage {
    static WebDriver driver = new ChromeDriver();
    private By inputLogin = By.xpath("//div[@class='it_w']//input[@name='st.email']");
    private By inputPassword = By.xpath("//div[@class='it_w']//input[@name='st.password']");
    private By button = By.xpath("//div[@class='login-form-actions']//input[@class='button-pro __wide']");


    public void input(String login, String password){
        driver.findElement(inputLogin).sendKeys(login);
        driver.findElement(inputPassword).sendKeys(password);
        driver.findElement(button).click();
    }
}
