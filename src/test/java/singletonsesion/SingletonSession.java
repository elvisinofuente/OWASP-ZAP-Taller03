package singletonsesion;

import factorybrowser.FactoryBrowser;
import org.openqa.selenium.WebDriver;

public class SingletonSession {

    private static SingletonSession singletonSession = null;
    private WebDriver browser;

    private SingletonSession() {
        // TODO: crear un archivo de propiedades
        this.browser = FactoryBrowser.make("proxy").create();
    }

    public static SingletonSession getSesion() {
        if (singletonSession == null) {
            singletonSession = new SingletonSession();
        }
        return singletonSession;

    }

    public WebDriver getBrowser() {
        return browser;
    }

    public void closeSession() {
        browser.quit();
        singletonSession = null;
    }
}
