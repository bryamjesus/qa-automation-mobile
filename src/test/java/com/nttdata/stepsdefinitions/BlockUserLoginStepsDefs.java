package com.nttdata.stepsdefinitions;

import com.nttdata.steps.SwaglabLoginSteps;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;

public class BlockUserLoginStepsDefs {

    @Steps
    SwaglabLoginSteps swaglabLoginSteps;

    @Given("introduzcimos el usario {string} y el password {string}")
    public void datosBlockUser(String userName, String passwordUser){
        swaglabLoginSteps.datosUser(userName,passwordUser);
    }

    @When("le damos al boton login")
    public void login(){
        swaglabLoginSteps.login();
    }

    @Then("debe mostrar un error con el mensaje {string}")
    public void messageEerror(String message){
        Assert.assertEquals(swaglabLoginSteps.getMessageBlockUsser(),message);
    }

}
