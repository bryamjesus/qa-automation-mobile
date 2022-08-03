package com.nttdata.stepsdefinitions;

import com.nttdata.steps.SwaglabLoginSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;

public class SwagLabLoginStepsDef {
    @Steps
    SwaglabLoginSteps swaglabLoginSteps;

    @Given("introduzco el usario {string} y el password {string}")
    public void datosUser(String userName, String passwordUser){
        swaglabLoginSteps.datosUser(userName,passwordUser);
    }

    @When("le damos a login")
    public void login(){
        swaglabLoginSteps.login();
    }

    @Then("Me debe mostrar el Titulo {string}")
    public void muestraTitulo(String titulo){
        Assert.assertEquals(swaglabLoginSteps.getTitleText(), titulo);
    }

    @And("Que exista al menos un item")
    public void oneProduct(){
        Assert.assertTrue(swaglabLoginSteps.getProducto());
    }


}
