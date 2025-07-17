package com.main;

import com.fahzeug.Auto;

    public class Main {
        public static void main(String[] args) {
            Auto auto = new Auto();

            auto.setMotorTyp("Elektro"); // Setter verwenden
            System.out.println("Motor-Typ: " + auto.getMotorTyp()); // Getter verwenden

            auto.marke = "Tesla"; // Direkter Zugriff auf `public`
            auto.starten(); // Aufruf einer öffentlichen Methode
        }
    }
