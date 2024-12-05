package com.co.sanangel.stepDefinitions;


import com.co.sanangel.exeptions.TablaNoEncontradaException;
import com.co.sanangel.questions.ValidarNombreProducto;
import com.co.sanangel.tasks.AgregarProductosTask;
import com.co.sanangel.tasks.BuscarProductoTask;

import io.cucumber.java.Before;
import io.cucumber.java.es.*;
import io.github.bonigarcia.wdm.WebDriverManager;

import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;


import static com.co.sanangel.userinterfaces.CarritoUI.TABLA_FINAL;
import static net.serenitybdd.screenplay.actors.OnStage.*;

public class AgregarProductoStepDefinitions {

    @Before
    public void setStage() {
        setTheStage(new OnlineCast());
    }


    @Dado("Que me encuentro en la pagina {string}")
    public void queMeEncuentroEnLaPagina(String url) {
        WebDriverManager.chromedriver().setup();
        theActorCalled("robot").wasAbleTo(Open.url(url));

    }



    @Cuando("busco el producto {string}")
    public void buscoElProducto(String producto) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                BuscarProductoTask.conElProducto(producto)

        );

    }
    @Entonces("Agregare el producto en el carrito")
    public void agregareElProductoEnElCarrito() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                new AgregarProductosTask()
        );
    }



    @Entonces("Visualizare {string} en el carrito")
    public void visualizareEnElCarrito(String producto) {
        try {
            OnStage.theActorInTheSpotlight().should(
                    GivenWhenThen.seeThat(ValidarNombreProducto.value(TABLA_FINAL))
            );
        } catch (Exception e) {
            throw new TablaNoEncontradaException("No se encontro la tabla final");
        }




    }


}
