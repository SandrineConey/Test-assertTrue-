package Test;

import Page.LoginPage;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class BeforeTest {
    private static String login = "technopol47";
    private static String password = "technopolisPassword";
    static String url = "https://ok.ru/";

    static WebDriver driver = new ChromeDriver();

    @BeforeAll
    public static void open(){
        driver.get(url);
        driver.manage().window().maximize();
    }
    public static void authorize() {
        LoginPage loginPage = new LoginPage();
        loginPage.input(login, password);
    }

    public boolean check(){
        return ($(byText("Друзья")).exists());
    }

}
