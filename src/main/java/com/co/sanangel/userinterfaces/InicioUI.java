package com.co.sanangel.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class InicioUI {

    public static final Target BTN_BUSCAR = Target.the("boton abrir buscador").locatedBy("//div[@class='header_search']");

    public static final Target TXT_BUSCAR = Target.the("espacion escribir buscador").locatedBy(" //div[@class='header_search']//input[@placeholder='¿Qué quieres encontrar?']");


    private InicioUI(){
        throw new UnsupportedOperationException("Utility class");
    }
}
