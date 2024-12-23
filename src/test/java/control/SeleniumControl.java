package control;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.qameta.allure.Step;
import singletonsesion.SingletonSession;

public class SeleniumControl {
    private By locator;
    protected WebElement control;
    protected String nameControl;
    
    public SeleniumControl(By locator, String nameControl) {
        this.locator = locator;
        this.nameControl = nameControl;
    }

    // metodo para configurar los steps en allure
    @Step("{0}")
    public void stepAllure(String action){}

    public void findControl(){
        control = SingletonSession.getSesion().getBrowser().findElement(locator);
        this.stepAllure("click "+ nameControl);
    }

    //acciones genericas
    public void click() {
        this.findControl();
        control.click();
        this.stepAllure("click "+ nameControl);
    }

    public String getText(){
        this.findControl();
        this.stepAllure("get test "+ control.getText());
        return control.getText();
    }
    public boolean isControlDisplayed(){
        try{
            this.findControl();
            this.stepAllure("the "+ control.getText()+" is displayed");
            return control.isDisplayed();
        }catch (Exception e){
            this.stepAllure("the "+ control.getText()+" is not displayed");
            return false;
        }
    }
}
