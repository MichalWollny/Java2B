package test.mitDefaultMethods;

// Interface mit abstrakten und default-Methoden
interface Fahrzeug {
    void starten(); // Abstrakte Methode
    void stoppen(); // Abstrakte Methode

    // Default-Methode
    default void wartungStatus() {
        System.out.println("Wartungsstatus: Keine Probleme gefunden.");
    }

    // Default-Methode mit Logik
    default void beschleunigen() {
        System.out.println("Das Fahrzeug beschleunigt auf eine moderate Geschwindigkeit.");
    }
}

// Implementierung des Interfaces in Benzinauto
class Benzinauto implements Fahrzeug {
    @Override
    public void starten() {
        System.out.println("Das Benzinauto startet den Motor.");
    }

    @Override
    public void stoppen() {
        System.out.println("Das Benzinauto stoppt den Motor.");
    }

    // Überschreiben einer Default-Methode
    @Override
    public void beschleunigen() {
        System.out.println("Das Benzinauto beschleunigt mit einem lauten Motorgeräusch.");
    }
}

// Implementierung des Interfaces in Elektroauto
class Elektroauto implements Fahrzeug {
    @Override
    public void starten() {
        System.out.println("Das Elektroauto startet geräuschlos.");
    }

    @Override
    public void stoppen() {
        System.out.println("Das Elektroauto stoppt reibungslos.");
    }

    // Elektroauto verwendet die Default-Methode wartungStatus unverändert
}

// Hauptklasse zur Demonstration
public class test {
    public static void main(String[] args) {
        /*
        * Erklärung der linken Seite:
            Fahrzeug ist der Referenztyp (das Interface).
            Eine Referenzvariable des Typs Fahrzeug kann auf jedes Objekt zeigen,
            das das Interface Fahrzeug implementiert.

        * Erklärung der rechten Seite:

            new Benzinauto() erstellt ein neues Objekt der Klasse Benzinauto.
            Benzinauto ist eine konkrete Klasse, die das Interface Fahrzeug implementiert.
            Sie definiert die Methoden starten und stoppen sowie eventuell andere Methoden.

     */
        Fahrzeug benzinauto = new Benzinauto();
        Fahrzeug elektroauto = new Elektroauto();

        // Aktionen mit Benzinauto
        System.out.println("Benzinauto:");
        benzinauto.starten();
        benzinauto.beschleunigen();
        benzinauto.wartungStatus();
        benzinauto.stoppen();

        System.out.println();

        // Aktionen mit Elektroauto
        System.out.println("Elektroauto:");
        elektroauto.starten();
        elektroauto.beschleunigen(); // Verwendet die Default-Implementierung
        elektroauto.wartungStatus(); // Verwendet die Default-Implementierung
        elektroauto.stoppen();
    }
}
