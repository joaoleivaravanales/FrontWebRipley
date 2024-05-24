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

  @Prueba5Web
  Scenario Outline: Anadir tres productos al carrito de compra y eliminar uno
    Given Cuando ingreso a la pagina de Ripley
    When Valido que efectivamente me encuentro en la pagina principal de ripley
    And Ingreso el producto que deseo buscar en la barra principal "<Producto1>"
    And Selecciono el segundo elemento de la lista en la busqueda principal
    And Presiono el boton anadir "Agregar al carro"
    And Ingreso el producto que deseo buscar en la barra principal "<Producto2>"
    And Selecciono el primer elemento de la lista en la busqueda del producto
    And Selecciono "Talla unica" en la polera seleccionada
    And Presiono el boton anadir "Agregar al carro"
    And Ingreso el producto que deseo buscar en la barra principal "<Producto3>"
    And Selecciono el perfume versace de la lista en la busqueda del producto
    And Presiono el boton anadir "Agregar al carro"
    And Presiono el carrito en la parte superior de la pagina
    And Presiono el boton de "Ir al carro"
    Then Valido el boton de "Continuar" en el resumen de la compra

    Examples:
      |Producto1| Producto2 | Producto3 |
      | auto    |  Polera   |  Perfume   |
