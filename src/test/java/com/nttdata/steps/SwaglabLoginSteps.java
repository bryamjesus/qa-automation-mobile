package com.nttdata.steps;

import com.nttdata.screens.LoginScreen;
import com.nttdata.screens.LoginSuccessful;
import net.thucydides.core.annotations.Step;

import java.util.concurrent.TimeUnit;

public class SwaglabLoginSteps {
    LoginScreen loginScreen;
    LoginSuccessful loginSuccessful;

    @Step("Ingresando el usuario {0} y el password {1}")
    public void datosUser(String userName, String passwordUser){
        //getDriver().manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
       loginScreen.enterUserInput(userName);
       loginScreen.enterPassInput(passwordUser);
    }

    @Step("Dando a login")
    public void login(){
        loginScreen.login();
    }

    @Step()
    public String getTitleText(){
        return loginSuccessful.getTitleText();
    }

    @Step()
    public boolean getProducto(){
        return (loginSuccessful.oneProducto() != null);
    }

    @Step()
    public String getMessageBlockUsser(){
        return loginScreen.messaggeBlockUser();
    }



}
