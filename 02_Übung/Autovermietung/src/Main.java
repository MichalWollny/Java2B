// Hauptklasse zum Demonstrieren der Funktionsweise des Autovermietungssystems

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        // Liste zur Speicherung aller Fahrzeuge
        List<Fahrzeug> fahrzeuge = new ArrayList<>();

        // Fahrzeuge anlegen
        Auto bmw = new Auto("BMW", "3er", 70, 5);
        Transporter sprinter = new Transporter("Mercedes", "Sprinter", 120, 10);

        fahrzeuge.add(bmw);
        fahrzeuge.add(sprinter);

        // Alle Fahrzeuge ausgeben
        System.out.println("Alle Fahrzeuge:");
        fahrzeuge.forEach(System.out::println);

        // Mietpreis berechnen für 3 Tage
        int tage = 3;
        System.out.println("\nMietpreise für " + tage + " Tage:");
        fahrzeuge.forEach(f -> {
            double preis = ((AbstraktesFahrzeug) f).berechneMietpreis(tage);
            System.out.println(f.getMarke() + " " + f.getModell() + ": " + preis + " EUR");
        });

        // Optional: Nur Autos ausgeben (Filterfunktion)
        System.out.println("\nNur Autos:");
        fahrzeuge.stream()
                .filter(f -> f instanceof Auto)
                .forEach(System.out::println);
    }
}