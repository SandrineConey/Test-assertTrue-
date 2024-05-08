package Test;

import Page.LoginPage;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static com.codeborne.selenide.Browsers.CHROME;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class BeforeTest {
    private static String login = "technopol47";
    private static String password = "technopolisPassword";

    @BeforeAll
    public static void open(){
        Configuration.browser = CHROME;
        Configuration.baseUrl = "https://ok.ru/";
        Configuration.browserSize = "1920x1080";
        Selenide.open("/");
    }
    public static void authorize() {
        LoginPage loginPage = new LoginPage();
        loginPage.input(login, password);
    }

    public boolean check(){
        return ($(byText("Друзья")).exists());
    }

}
