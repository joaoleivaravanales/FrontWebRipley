@Prueba4Web
Feature: Comprar y anadir en carrito Ripley
  Scenario Outline: Anadir un producto al carrito de compra y simular compra
    Given Cuando ingreso a la pagina de Ripley
    When Valido que efectivamente me encuentro en la pagina principal de ripley
    And Ingreso el producto que deseo buscar en la barra principal "<productBuscar>"
    And Selecciono el segundo elemento de la lista en la busqueda principal
    And Presiono el boton anadir "Agregar al carro"
    And Presiono el carrito en la parte superior de la pagina
    And Presiono el boton de "Ir al carro"
    Then Valido el boton de "Continuar" en el resumen de la compra

    Examples:
      |productBuscar|
      | auto |