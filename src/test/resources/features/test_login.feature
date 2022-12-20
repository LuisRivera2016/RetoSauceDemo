Feature: iniciar sesion en la aplicacion de saucedemo
  @login
  Scenario: ingresar a la aplicion con credenciales
    Given que el usuario ingrese a la pagina web
    When el usuario ingrese las credenciales
    And dar click en el boton de login
    Then validamos que estemos en la pagina principal "PRODUCTS"

  @AgregarCompras
  Scenario: agregar objetos al carro de compras
    Given que el usuario este en la pagina de compras "PRODUCTS"
    When el usuario agrege los productos al carro
    And dar click en el boton del carro
    Then validamos que estemos en la pagina del carro "YOUR CART"

  @RemoverCheckout
  Scenario: remover un articulo del carro e ir a checkout
    Given que el usuario este en la pagina de carro "YOUR CART"
    When el usuario remueva el primer articulo
    And dar click en el boton de checkout
    Then validamos que estemos en la pagina de checkout "CHECKOUT: YOUR INFORMATION"

  @IngresarInformacionCompra
  Scenario: ingresar informacion de pago y continuar
    Given que el usuario este en la pagina de informacion de checkout "CHECKOUT: YOUR INFORMATION"
    When el usuario ingrese sus datos de compra
    And dar click en el boton de continue
    Then validamos que estemos en la pagina de overview "CHECKOUT: OVERVIEW"
    And dar click en el boton de finish

  @Logout
  Scenario: salir de la aplicacion saucedemo
    Given que el usuario este en en la pagina "CHECKOUT: COMPLETE!"
    When el usuario da click a la barra lateral
    And dar click en el boton de logout
    Then validamos que estemos en la pagina de login "Login"


