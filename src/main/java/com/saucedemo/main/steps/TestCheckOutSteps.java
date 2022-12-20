package com.saucedemo.main.steps;


import com.saucedemo.main.pages.CheckoutPage;
import org.fluentlenium.core.annotation.Page;
import org.hamcrest.MatcherAssert;
public class TestCheckOutSteps {



    @Page
    CheckoutPage checkoutPage;

    public void validarCheckout(String value){
        MatcherAssert.assertThat("se esta en datos de compra",value.contains(checkoutPage.spanCheckout.getText()));
    }
    public void ingresarDatosCompra(String firstname, String lastname,String zipcode) {
        checkoutPage.ingresarCredencialesPay(firstname, lastname, zipcode);
    }

    public void darClickBtnContinue() {
        checkoutPage.darClickBtnContinue();
    }

    public void validarCheckoutOverview(String value) {
        MatcherAssert.assertThat("se realizo correctamente el login",value.contains(checkoutPage.spanCheckout.getText()));
    }

    public void darClickBtnFinish(){
        checkoutPage.darClickBtnFinish();
    }
}
