package com.saucedemo.main.pages;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.support.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class HomePage extends PageObject{

    @FindBy(xpath = "//span[@class='title']")
    public WebElementFacade spanHome;

    @FindBy(xpath = "//button[@id=\"add-to-cart-sauce-labs-backpack\"]")
    public WebElementFacade addBackpackButton;

    @FindBy(xpath = "//button[@id=\"add-to-cart-sauce-labs-bike-light\"]")
    public WebElementFacade addBikeLightButton;

    @FindBy(xpath = "//button[@id=\"add-to-cart-sauce-labs-bolt-t-shirt\"]")
    public WebElementFacade addTShirtButton;

    @FindBy(xpath = "//button[@id=\"add-to-cart-sauce-labs-fleece-jacket\"]")
    public WebElementFacade addFleeceJacketButton;

    @FindBy(xpath = "//button[@id=\"add-to-cart-sauce-labs-onesie\"]")
    public WebElementFacade addOnesieButton;

    @FindBy(xpath = "//a[@class=\"shopping_cart_link\"]")
    public WebElementFacade shoppingCartLink;

    @FindBy(xpath = "//button[@id=\"react-burger-menu-btn\"]")
    public WebElementFacade menuButton;

    @FindBy(xpath = "//a[@id=\"logout_sidebar_link\"]")
    public WebElementFacade logoutButton;

    public void agregarProductos() {
        addBackpackButton.click();
        addBikeLightButton.click();
        addTShirtButton.click();
        addFleeceJacketButton.click();
        addOnesieButton.click();

    }

    public void clickBtnCarro() {
        shoppingCartLink.click();
    }

    public void clickBtnMenu() {
        menuButton.click();
    }

    public void clickBtnLogout() {
        logoutButton.click();
    }

}
