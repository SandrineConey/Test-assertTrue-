package Page;

import org.openqa.selenium.By;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class RibbonPage {
    private By gameButton = By.xpath("//a[@data-l='t,appsShowcaseHD']");

    private By giftsButton = By.xpath("//a[@data-l='t,giftsFront']");

    public void selectGameButton() throws InterruptedException {
        $(gameButton).shouldBe(visible).click();
        Thread.sleep(4000);
    }

    public void selectGiftsButton() throws InterruptedException {
        $(giftsButton).shouldBe(visible).click();
        Thread.sleep(4000);
    }

    public boolean gameCheck() {
        $(byText("Все игры")).shouldBe(visible);
        return true;
    }

    public boolean giftsCheck() {
        $(byText("Поиск подарков")).shouldBe(visible);
        return true;
    }
}
