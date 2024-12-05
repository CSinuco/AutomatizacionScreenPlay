package com.co.sanangel.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class CarritoUI {

    public static final Target TABLA_FINAL = Target.the("Tabla de productos").locatedBy("//table[@class='shop_table woocommerce-checkout-review-order-table']");

    private CarritoUI(){

        throw new UnsupportedOperationException("Utility class");
    }
}
