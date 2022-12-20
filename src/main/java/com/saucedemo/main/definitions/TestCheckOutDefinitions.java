package com.saucedemo.main.definitions;

import com.saucedemo.main.steps.TestCarSteps;
import com.saucedemo.main.steps.TestCheckOutSteps;
import com.saucedemo.main.steps.TestHomeSteps;
import com.saucedemo.main.util.Constantes;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
public class TestCheckOutDefinitions {

    @Steps
    TestCheckOutSteps testCheckOutSteps;
    @Given("que el usuario este en la pagina de informacion de checkout {string}")
    public void queElUsuarioEsteEnLaPaginaDeInformacionDeCheckout(String string) {
        testCheckOutSteps.validarCheckout(string);
    }
    @When("el usuario ingrese sus datos de compra")
    public void elUsuarioIngreseSusDatosDeCompra() {
        testCheckOutSteps.ingresarDatosCompra(Constantes.FIRST_NAME, Constantes.LAST_NAME,Constantes.ZIP_CODE);
    }
    @When("dar click en el boton de continue")
    public void darClickEnElBotonDeContinue() {
        testCheckOutSteps.darClickBtnContinue();
    }
    @Then("validamos que estemos en la pagina de overview {string}")
    public void validamosQueEstemosEnLaPaginaDeOverview(String string) {
        testCheckOutSteps.validarCheckoutOverview(string);
    }
    @Then("dar click en el boton de finish")
    public void darClickEnElBotonDeFinish() {
        testCheckOutSteps.darClickBtnFinish();
    }
}
