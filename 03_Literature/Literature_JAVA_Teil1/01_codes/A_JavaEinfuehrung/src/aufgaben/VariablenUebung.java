package aufgaben;
/*
Übungen mit verschiedenen Variablentypen
1. Übung 1: Deklariere eine int-Variable namens year und setze sie auf das aktuelle Jahr. Gib den Wert
der Variable aus.
2. Übung 2: Deklariere eine double-Variable namens temperature und setze sie auf einen Wert mit einer
Dezimalstelle. Gib die Temperatur aus.
3. Übung 3: Erstelle eine String-Variable namens city und setze sie auf den Namen deiner Heimatstadt.
Zeige den Stadtnamen an.
4. Übung 4: Definiere eine boolean-Variable namens isAvailable und setze sie auf false. Gib den
Verfügbarkeitsstatus aus.
5. Übung 5: Deklariere eine char-Variable namens grade und setze sie auf einen Buchstaben zwischen 'A'
und 'F'. Gib die Note aus.
*/
public class VariablenUebung {
    public static void main(String[] args) {
        // Übung 1: int-Variable für aktuelles Jahr
        int year = 2024;
        System.out.println("Aktuelles Jahr: " + year);

        // Übung 2: double-Variable für Temperatur
        double temperature = 23.5;
        System.out.println("Temperatur: " + temperature + " °C");

        // Übung 3: String-Variable für Heimatstadt
        String city = "Berlin";
        System.out.println("Meine Heimatstadt ist: " + city);

        // Übung 4: boolean-Variable für Verfügbarkeit
        boolean isAvailable = false;
        System.out.println("Verfügbar: " + isAvailable);

        // Übung 5: char-Variable für Note
        char grade = 'B';
        System.out.println("Note: " + grade);
    }
}
