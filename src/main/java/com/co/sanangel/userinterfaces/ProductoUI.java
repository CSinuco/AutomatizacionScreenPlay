package com.co.sanangel.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class ProductoUI {


    public static final Target BTN_AGG_CHOCOLATE = Target.the("boton anadir chocolate").locatedBy("//a[@href='?add-to-cart=6053']");

    public static final Target BTN_AGG_CARRITO = Target.the("Boton agregar al carrito").locatedBy(" //button[@class='single_add_to_cart_button button alt']");

    private ProductoUI(){

        throw new UnsupportedOperationException("Utility class");
    }
}
