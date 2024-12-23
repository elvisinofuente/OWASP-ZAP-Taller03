package factorybrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

import java.time.Duration;

public class Chrome implements IBrowser {
    @Override
    public WebDriver create() {
        // System.setProperty("webdriver.chrome.driver", "/src/test/resources/driver/chromedriver");
        WebDriverManager.chromedriver().setup();
        WebDriver chromeDriver = new ChromeDriver();
        // ChromeDriver chromeDriver = new ChromeDriver();
        chromeDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        return chromeDriver;
    }
}
