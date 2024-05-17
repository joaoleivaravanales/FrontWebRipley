@Prueba1Web
Feature: Ingreso a la pagina Ripley
  Scenario Outline: Login Pagina Ripley WEB
    Given Cuando ingreso a la pagina de Ripley
    When Valido que efectivamente me encuentro en el menu de ripley
    And Ingreso correo "<correo>" contrasena en el campo "<password>" en la pagina login
    And presiono el boton de "Iniciar Sesion" posicionado en la pantalla de login
    Then Verifico el siguiente texto de error en el login
    """
    El usuario ingresado no está registrado en Ripley.
    """

    Examples:
    |correo| password |
    | prueba@prueba.cl | 123456 |
