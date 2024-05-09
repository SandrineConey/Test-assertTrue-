package Test;

import Page.LoginPage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class LoginPageTest extends ActionsBefore {

    @Test
    public void positiveInputTest() {
        LoginPage loginPage = new LoginPage();
        loginPage.input("technopol47", "technopolisPassword");
        Assertions.assertTrue(loginPage.check());
        ActionsAfter.logOut();
    }
}
