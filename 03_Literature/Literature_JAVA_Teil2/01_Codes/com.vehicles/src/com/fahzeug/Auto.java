package com.fahzeug;
public class Auto {
    private String motorTyp = "V8";   // Nur innerhalb der Klasse zugänglich
    protected int baujahr;           // Zugänglich in Unterklassen und im gleichen Package
    public String marke;             // Von überall zugänglich
    String message ="Hallo";

    // Getter und Setter für die private Variable
    public String getMotorTyp() {
        return motorTyp;
    }

    public void setMotorTyp(String motorTyp) {
        this.motorTyp = motorTyp;
    }

    protected void reparieren() {
        System.out.println("Das Auto wird repariert.");
    }

    public void starten() {
        System.out.println(marke + " startet.");
    }
}

