package com.saucedemo.main.steps;

import com.saucedemo.main.pages.HomePage;
import com.saucedemo.main.pages.TestLoginPage;
import org.fluentlenium.core.annotation.Page;
import org.hamcrest.MatcherAssert;

public class TestLoginSteps {



    @Page
    TestLoginPage testLoginPage;

    @Page
    HomePage homePage;
    public void openWeb(){
        testLoginPage.open();

    }


    public void ingresarCredenciales(String username, String password) {
        testLoginPage.ingresarCredencialesLogin(username, password);
    }

    public void darClickBtnLogin() {
        testLoginPage.clickBtnLogin();
    }

    public void validarLogin(String value) {
        MatcherAssert.assertThat("se realizo correctamente el login",value.contains(homePage.spanHome.getText()));
    }
}
