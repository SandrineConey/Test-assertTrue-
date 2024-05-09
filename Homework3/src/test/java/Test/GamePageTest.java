package Test;

import Page.RibbonPage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class GamePageTest extends ActionsBefore {

    @BeforeAll
    public static void setup() {
        authorize();
    }

    @Test
    public void transitionToTheGame() throws InterruptedException {
        RibbonPage ribbonPage = new RibbonPage();
        ribbonPage.selectGameButton();
        Assertions.assertTrue(ribbonPage.gameCheck());
        ActionsAfter.logOut();
    }
}
