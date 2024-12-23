package factorybrowser;

import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ChromeProxy implements IBrowser{
    @Override
    public WebDriver create() {
        //System.setProperty("webdriver.chrome.driver", "/src/test/resources/driver/chromedriver");
        WebDriverManager.chromedriver().setup();
        //WebDriver chromeDriver = new ChromeDriver();
        Proxy proxy = new Proxy();
        proxy.setHttpProxy("localhost:9091"); // ip y puerto del owzap
        proxy.setSslProxy("localhost:9091");
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.setProxy(proxy);
        chromeOptions.addArguments("--ignore-certificate-errors");
        return new ChromeDriver(chromeOptions);
    }
}
