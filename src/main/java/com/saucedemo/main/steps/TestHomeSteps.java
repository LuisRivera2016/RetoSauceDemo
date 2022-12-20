package com.saucedemo.main.steps;

import com.saucedemo.main.pages.CartPage;
import com.saucedemo.main.pages.HomePage;
import org.fluentlenium.core.annotation.Page;
import org.hamcrest.MatcherAssert;
public class TestHomeSteps {
    @Page
    HomePage homePage;

    @Page
    CartPage cartPage;
    public void validarHome(String value){
        MatcherAssert.assertThat("si se esta en home",value.contains(homePage.spanHome.getText()));
    }


    public void agregarProductos() {
        homePage.agregarProductos();
    }

    public void darClickBtnCarro() {
        homePage.clickBtnCarro();
    }

    public void validarCompra(String value) {
        MatcherAssert.assertThat("si se esta en carro",value.contains(cartPage.spanCart.getText()));
    }
}
