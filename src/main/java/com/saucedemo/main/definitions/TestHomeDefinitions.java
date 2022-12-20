package com.saucedemo.main.definitions;

import com.saucedemo.main.steps.TestHomeSteps;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
public class TestHomeDefinitions {

    @Steps
    TestHomeSteps testHomeSteps;


    @Given("que el usuario este en la pagina de compras {string}")
    public void queElUsuarioAgregeElPrimerProducto(String value) {
        testHomeSteps.validarHome(value);
    }
    @When("el usuario agrege los productos al carro")
    public void elUsuarioAgregeLosDemasProductos() {
        testHomeSteps.agregarProductos();
    }
    @When("dar click en el boton del carro")
    public void darClickEnElBotonDelCarro() {
        testHomeSteps.darClickBtnCarro();
    }

    @Then("validamos que estemos en la pagina del carro {string}")
    public void validamosQueEstemosEnLaPaginaDelCarro(String value) {
       testHomeSteps.validarCompra(value);
    }


}
