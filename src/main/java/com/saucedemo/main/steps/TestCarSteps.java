package com.saucedemo.main.steps;

import com.saucedemo.main.pages.CartPage;
import com.saucedemo.main.pages.CheckoutPage;
import org.fluentlenium.core.annotation.Page;
import org.hamcrest.MatcherAssert;
public class TestCarSteps {
    @Page
    CartPage cartPage;
    @Page
    CheckoutPage checkoutPage;

    public void validarCart(String value){
        MatcherAssert.assertThat("si se esta en home",value.contains(cartPage.spanCart.getText()));
    }


    public void removerPrimerProducto() {
        cartPage.darClickBtnRemove();
    }

    public void darClickBtnCheckout() {
        cartPage.darClickBtnCheckout();
    }

    public void validarCheckout(String value) {
        MatcherAssert.assertThat("si se esta en checkout",value.contains(checkoutPage.spanCheckout.getText()));
    }
}
