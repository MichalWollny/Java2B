package com.einheit;

public final class Einheit_Final {
    public String name;

    // Constructor
    public Einheit_Final() {
        this.name = "Finale Einheit";
    }

    public void anzeigen() {
        System.out.println("Name der Einheit: " + this.name);
    }

    public static void main(String[] args) {
        // Instanziierung der finalen Klasse
        Einheit_Final e1 = new Einheit_Final();
        e1.name = "Spezielle Finale Einheit";
        e1.anzeigen();
    }

    // Fehler: Die Klasse 'Einheit' ist final und kann nicht erweitert werden
    class UnterEinheit extends Einheit_Final {
        public UnterEinheit() {
            super();
        }
    }
}

