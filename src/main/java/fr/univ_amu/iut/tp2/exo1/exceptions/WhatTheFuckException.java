package fr.univ_amu.iut.tp2.exo1.exceptions;

public class WhatTheFuckException extends RuntimeException {

    private final String MESSAGE = "WHAT THE FUCK ????";

    @Override
    public String toString() {
        return MESSAGE;
    }

    @Override
    public void printStackTrace() {
        System.out.println(toString());
    }

    @Override
    public String getMessage() {
        return toString();
    }
}
