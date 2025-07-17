package com.fahrzeug;

// Abstrakte Klasse als Basis
public abstract class Fahrzeug {
    protected String typ;

    public Fahrzeug(String typ) {
        this.typ = typ;
    }

    public abstract void fahren();
}