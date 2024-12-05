package com.co.sanangel.exeptions;

public class TablaNoEncontradaException extends RuntimeException{
    public TablaNoEncontradaException(String message){
        super(message);
    }
}
