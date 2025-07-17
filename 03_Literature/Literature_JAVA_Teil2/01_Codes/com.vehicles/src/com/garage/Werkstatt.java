package com.garage;
import com.fahzeug.Auto;
public class Werkstatt extends Auto {
    public Werkstatt(String marke, int baujahr) {
        this.marke = marke;  // Zugriff auf `public` Feld
        this.baujahr = baujahr;  // Zugriff auf `protected` Feld
    }

    public void wartung() {
        reparieren(); // Zugriff auf geschützte Methode
        System.out.println("Wartung für " + marke + " abgeschlossen.");
    }

    public static void main(String[] args) {
        Auto auto = new Auto();
        System.out.println(auto.marke);

    }
}