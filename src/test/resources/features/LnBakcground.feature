#language: es

  Característica: Validacion Elementos

    Antecedentes:

      Dado Me encuentro en la pagina de  https://librerianacional.com/

      Esquema del escenario: <Escenario>

        Cuando Seleccionemos uun producto
        Y Validemos la interfaz de "Agregar al carrito"

        Entonces Volvemos a Home y validamos Home

        Ejemplos:
          | Escenario                                         | url                           |
          | Entrar a Liberia Nacional y seleccionamos y libro | https://librerianacional.com/ |