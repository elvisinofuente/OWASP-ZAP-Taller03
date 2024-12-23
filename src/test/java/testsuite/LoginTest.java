package testsuite;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Issue;
import io.qameta.allure.Link;
import io.qameta.allure.Owner;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;
import pages.LoginSection;
import pages.MainPage;
import pages.MenuSection;
import singletonsesion.SingletonSession;

// @Owner("JBGroup")
// @Epic("Login")
// @Feature("Seguridad")
// @Story("Login")
public class LoginTest {
    MainPage mainPage = new MainPage();
    LoginSection loginSection = new LoginSection();
    MenuSection menuSection = new MenuSection();

    @BeforeEach
    public void openPage(){
        SingletonSession.getSesion().getBrowser().get("https://todoist.com/");
    }

    @AfterEach
    public void closePage(){
        SingletonSession.getSesion().closeSession();
    }

    @Test
    @Order(1)
    @DisplayName("Verificar que el login sea satisfactorio")
    @Description("Este prueba automatica es para poder iniciar sesion")
    @Owner("JBGroup")
    @Epic("Login")
    @Feature("Seguridad")
    @Story("Login")
    @Link(name = "Test Case Manual", url =" jira.com/123123123")
    @Issue("DEF12345")
    @Severity(SeverityLevel.CRITICAL)
    public void login(){
        mainPage.loginButton.click();
        loginSection.email.setText("cilab39971@pokeline.com");
        loginSection.password.setText("Aa123456");
        loginSection.login.click();
        Assertions.assertTrue(menuSection.btnCalendarEvents.isControlDisplayed(),
                "ERROR no se pudo iniciar session");
    }

}
