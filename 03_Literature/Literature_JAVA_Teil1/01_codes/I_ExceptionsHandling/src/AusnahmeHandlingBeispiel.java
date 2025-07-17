public class AusnahmeHandlingBeispiel {

    public static void main(String[] args) {
        // Beipiele ohne try catch Blöcke
/*
        int ergebnis1 = 10 / 0;// Exception in thread "main" java.lang.ArithmeticException: / by zero
        System.out.println("Ergebnis der Division: " + ergebnis1);

        String text = null; // null-Wert Leer
        System.out.println("Länge des Textes: " + text.length());
 */


        // Beispiel 1: Umgang mit einer möglichen Division durch Null
        try {
            int ergebnis = division(10, 0); // Dies wird eine Ausnahme auslösen
            System.out.println("Ergebnis der Division: " + ergebnis);
        } catch (ArithmeticException e) {
            // Ausnahme wird hier abgefangen und behandelt
            System.out.println("Fehler: Division durch null ist nicht erlaubt.");
        }

        // Beispiel 2: Arbeiten mit einem null-Wert
        try {
            String text1 = null; // null-Wert
            System.out.println("Länge des Textes: " + text1.length()); // Löst NullPointerException aus
        } catch (NullPointerException e) {
            // Behandlung der NullPointerException
            System.out.println("Fehler: Versucht, auf ein null-Objekt zuzugreifen.");
        }

        // Beispiel 3: Eigene Ausnahme auslösen
        try {
            überprüfeAlter(-5); // Ungültiges Alter führt zur Ausnahme
        } catch (IllegalArgumentException e) {
            System.out.println("Fehler: " + e.getMessage());
        }

        // Beispiel 4: Arbeiten mit finally-Block
        try {
            System.out.println("Versuche, eine Datei zu lesen...");
            leseDatei(); // Diese Methode löst eine simulierte Ausnahme aus
        } catch (Exception e) {
            System.out.println("Fehler: Datei konnte nicht gelesen werden.");
        } finally {
            // Der finally-Block wird immer ausgeführt
            System.out.println("Aufräumarbeiten abgeschlossen.");
        }
    }

    // Methode für eine Division mit möglicher Division durch Null
    public static int division(int a, int b) {
        return a / b; // Kann ArithmeticException auslösen
    }

    // Methode, die eine Ausnahme auslöst, wenn das Alter ungültig ist
    public static void überprüfeAlter(int alter) {
        if (alter < 0) {
            // Löst eine IllegalArgumentException aus
            throw new IllegalArgumentException("Alter darf nicht negativ sein.");
        }
        System.out.println("Das eingegebene Alter ist gültig: " + alter);
    }

    // Methode, die eine simulierte Ausnahme wirft
    public static void leseDatei() throws Exception {
        // Simuliert einen Fehler beim Lesen der Datei
        throw new Exception("Datei nicht gefunden.");
    }
}
