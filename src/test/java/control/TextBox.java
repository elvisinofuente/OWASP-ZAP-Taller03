package control;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import java.security.Key;

public class TextBox extends SeleniumControl{
    public TextBox(By locator, String nameControl) {
        super(locator, nameControl);
    }

    public void setText(String value){
        this.findControl();
        control.sendKeys(value);
        this.stepAllure("fill "+ nameControl+" with: "+value);
    }

    public void clearSetText(String value){
        this.findControl();
        control.clear();
        control.sendKeys(value);
    }
    public void SetTextAndEnter(String value){
        this.findControl();

        control.sendKeys(value + Keys.ENTER);
    }
}
