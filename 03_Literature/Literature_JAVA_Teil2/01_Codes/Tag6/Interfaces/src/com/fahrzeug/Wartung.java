package com.fahrzeug;

// Interface mit einer default-Methode
public interface Wartung {
    default void status() {
        System.out.println("Wartung: Alles in Ordnung.");
    }
}
