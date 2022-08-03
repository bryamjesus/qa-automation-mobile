@testPrincipal
Feature: Prueba de Login en la aplicacion Swag Lab
  Como ususario
  Quiero realizar un login
  Para asi poder mis compras correctamente


  @test
  Scenario: Login exitoso en la aplicacion Swag Lab
    Given introduzco el usario "standard_user" y el password "secret_sauce"
    When le damos a login
    Then Me debe mostrar el Titulo "PRODUCTS"
    And Que exista al menos un item

  @test1
  Scenario: Usuario bloqueado
    Given introduzcimos el usario "locked_out_user" y el password "secret_sauce"
    When le damos al boton login
    Then debe mostrar un error con el mensaje "Sorry, this user has been locked out."


