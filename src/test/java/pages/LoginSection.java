package pages;

import control.Button;
import control.TextBox;
import org.openqa.selenium.By;

public class LoginSection {

    public TextBox email = new TextBox(By.cssSelector("input[placeholder='Introduce tu email...']"), " [email] textbox in login page ");
    public TextBox password = new TextBox(By.cssSelector("input[placeholder='Introduce tu contraseña...']")," [password] textbox in login page ");
    public Button login = new Button(By.xpath("//button[@type='submit']"), " [login] button in login page ");
}
