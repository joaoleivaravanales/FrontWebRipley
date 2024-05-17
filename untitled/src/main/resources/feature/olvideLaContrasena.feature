@Prueba2Web
Feature: Olvide la Contrasena Home Ripley
  Scenario Outline: Olvide la password Home Ripley
    Given Cuando ingreso a la pagina de Ripley
    When Valido que efectivamente me encuentro en el menu de ripley
    And Ingreso correo "<correo>" contrasena en el campo "<password>" en la pagina login
    And presiono el boton de "Iniciar Sesion" posicionado en la pantalla de login
    And Presiono el boton de "Olvidaste Contrasena" en la pantalla del login
    And Valido que me encuentro en la pantalla de "Recuperar cuenta"
    And Ingreso el "<rutCliente>" en la pantalla de recuperar cuenta


    Examples:
      |correo| password |rutCliente|
      | prueba@prueba.cl | 123456 |187822653|
