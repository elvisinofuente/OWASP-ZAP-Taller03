package pages;

import control.Button;
import org.openqa.selenium.By;

public class MainPage {
    public Button loginButton = new Button(By.xpath("(//a[contains(@href, 'todoist.com')])[1]"), " [login] button in main page");
}
