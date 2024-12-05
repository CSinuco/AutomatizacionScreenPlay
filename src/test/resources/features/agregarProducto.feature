#language: es

Característica:  Automatizar Floristeria MundoFlor

  @AgregarCarrito

  Esquema del escenario: Agregar Producto Al Carrito

    Dado  Que me encuentro en la pagina '<url>'
    Cuando  busco el producto '<producto>'
    Entonces Agregare el producto en el carrito
    Entonces Visualizare '<producto>' en el carrito

    Ejemplos:
      | url | producto |
##@externaldata@parametros/Datos.xlsx@AgregarProducto
   |https://sanangel.com.co/   |versalles|
   |https://sanangel.com.co/   |Évora 24 rosas|
   |https://sanangel.com.co/   |baldado de amor|
   |   ||


