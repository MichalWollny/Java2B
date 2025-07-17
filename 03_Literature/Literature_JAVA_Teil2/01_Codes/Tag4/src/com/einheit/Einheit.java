package com.einheit;
public abstract class Einheit {
    public String name;

    public Einheit() {
        this.name = "Abstrakte Einheit";
    }
}

class UnterEinheit extends Einheit {
    public UnterEinheit() {
        super();
        this.name = "UnterEinheit";
    }

    public static void main(String[] args) {
        // Fehler Einheit: 'Einheit' is abstract; cannot be instantiated
         // Einheit e1 = new Einheit();

        // Instanziierung der Unterklasse
        UnterEinheit u1 = new UnterEinheit();
        System.out.println("Name der UnterEinheit: " + u1.name);
    }
}
