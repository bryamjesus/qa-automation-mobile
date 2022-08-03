package com.nttdata.screens;

import io.appium.java_client.pagefactory.AndroidFindBy;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class LoginScreen extends PageObject {
    //@AndroidFindBy(id = "test-Username")
    @AndroidFindBy(xpath = "//android.widget.EditText[@content-desc=\"test-Username\"]")
    private WebElement inputUser;

    //@AndroidFindBy(id = "test-Password")
    @AndroidFindBy(xpath = "//android.widget.EditText[@content-desc=\"test-Password\"]")
    private WebElement inputPassword;

    @AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc=\"test-LOGIN\"]")
    private WebElement btnLogin;

    @AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc=\"test-Error message\"]/android.widget.TextView")
    private WebElement blockUserMessagge;

    public void enterUserInput(String userName) {
        getDriver().manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
        inputUser.sendKeys(userName);
    }

    public void enterPassInput(String pass) {
        getDriver().manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
        inputPassword.sendKeys(pass);
    }

    public void login(){
        btnLogin.click();
    }

    public String messaggeBlockUser(){
        return blockUserMessagge.getText();
    }


}
