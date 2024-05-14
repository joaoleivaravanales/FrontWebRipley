@Prueba1Web
Feature: Ingreso a la pagina Ripley
  Scenario Outline: Login Pagina Ripley WEB
    Given Cuando ingreso a la pagina de Ripley
    When Valido que efectivamente me encuentro en el menu de ripley
    And Selecciono la opcion de "Inicia sesion" en la parte superior de la Pagina
    Then Verifico que efectivamente me encuentre en el login
    And Ingreso texto el nombre de usuario "<IngresoBuscardor>"

    Examples:
    |IngresoBuscardor|
    | Primer example |
