package com.co.sanangel.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;

import static com.co.sanangel.userinterfaces.InicioUI.*;


public class BuscarProductoTask implements Task {

    private String producto;
    public BuscarProductoTask(String producto){
        this.producto = producto;
    }



    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BTN_BUSCAR),
                Click.on(TXT_BUSCAR),
                Enter.keyValues(producto).into(TXT_BUSCAR).thenHit(Keys.ENTER)
        );


    }



    public static BuscarProductoTask conElProducto(String producto){
        return new BuscarProductoTask(producto);
    }
}
