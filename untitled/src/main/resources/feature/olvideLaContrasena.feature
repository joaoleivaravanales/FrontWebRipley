@Prueba2Web
Feature: Olvide la Contrasena Home Ripley
  Scenario Outline: Olvide la password Home Ripley cliente inexistente
    Given Cuando ingreso a la pagina de Ripley
    When Valido que efectivamente me encuentro en el menu de ripley
    And Ingreso correo "<correo>" contrasena en el campo "<password>" en la pagina login
    And presiono el boton de "Iniciar Sesion" posicionado en la pantalla de login
    And Presiono el boton de "Olvidaste Contrasena" en la pantalla del login
    And Valido que me encuentro en la pantalla de "Recuperar cuenta"
    And Ingreso el "<rutCliente>" en la pantalla de recuperar cuenta
    And presiono el boton de "Buscar Cuenta" en la pantalla de recuperar cuenta
    Then Valido que el cliente efectivamente no exista y se despliega el siguiente mensaje
    """
    No se ha podido enviar el correo
    """

    Examples:
      |correo| password |rutCliente|
      | prueba@prueba.cl | 123456 |187822653|

  @Prueba3Web
  Scenario Outline: Olvide la password Home Ripley cliente existente
    Given Cuando ingreso a la pagina de Ripley
    When Valido que efectivamente me encuentro en el menu de ripley
    And Ingreso correo "<correo>" contrasena en el campo "<password>" en la pagina login
    And presiono el boton de "Iniciar Sesion" posicionado en la pantalla de login
    And Presiono el boton de "Olvidaste Contrasena" en la pantalla del login
    And Valido que me encuentro en la pantalla de "Recuperar cuenta"
    And Ingreso el "<rutCliente>" en la pantalla de recuperar cuenta
    And presiono el boton de "Buscar Cuenta" en la pantalla de recuperar cuenta
    Then Valido que el cliente efectivamente exista y se despliega el siguiente mensaje
    """
    Enviamos un enlace para que puedas recuperar tu cuenta a
    """

    Examples:
      |correo| password |rutCliente|
      | prueba2@prueba.cl | aaaaaaa |111111111|
