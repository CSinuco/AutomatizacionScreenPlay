package com.co.sanangel.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static com.co.sanangel.userinterfaces.ProductoUI.*;


public class AgregarProductosTask implements Task {
    public AgregarProductosTask  () {

    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BTN_AGG_CHOCOLATE),
                Click.on(BTN_AGG_CARRITO)
        );
        //if(!BTN_AGG_CHOCOLATE.isVisibleFor(actor)){
         //   throw new ProductoNoEncontradoException("No se encontro el producto adicional");
        //}
    }

}
