package pages;

import control.Button;
import control.Label;
import org.openqa.selenium.By;

public class MenuSection {

    public Button btnCalendarEvents = new Button(By.xpath("//span[contains(text(), 'Eventos de calendario')]"), " [logout] button in menu section");
}
