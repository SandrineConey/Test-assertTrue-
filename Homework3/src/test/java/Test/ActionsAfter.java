package Test;

import org.openqa.selenium.By;
import static com.codeborne.selenide.Condition.enabled;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class ActionsAfter {
    private static By userToolbar = By.xpath("//button[@aria-label='Настройки профиля']");
    private static By exitButton = By.xpath("//a[@data-l='t,logout']");
    private static By сonfirmationExitButton = By.xpath("//input[@data-l='t,logout']");

    public static void logOut() {
        $(userToolbar).shouldBe(visible).click();
        $(exitButton).shouldBe(visible).click();
        $(сonfirmationExitButton).shouldBe(enabled).click();
    }
}
