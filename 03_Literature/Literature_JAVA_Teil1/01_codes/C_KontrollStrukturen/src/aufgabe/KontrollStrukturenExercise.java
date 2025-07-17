package aufgabe;

public class KontrollStrukturenExercise {
    public static void main(String[] args) {
        // Kontrollstrukturen in Java - Alternative Übungen

        // 1. If-Else Übung: Eintrittspreis berechnen
        int alter = 16;
        int preis;

        if (alter < 12) {
            preis = 5;
        } else if (alter >= 12 && alter <= 18) {
            preis = 8;
        } else {
            preis = 12;
        }
        System.out.println("Eintrittspreis: " + preis + " EUR");

        // 2. Switch Übung: Monatliche Gebühren basierend auf dem Abonnementtyp
        String aboTyp = "Premium";
        int gebuehr;

        switch (aboTyp) {
            case "Standard":
                gebuehr = 10;
                break;
            case "Premium":
                gebuehr = 15;
                break;
            case "VIP":
                gebuehr = 25;
                break;
            default:
                gebuehr = 0; // Unbekannter Abotyp
        }
        System.out.println("Monatliche Gebühr: " + gebuehr + " EUR");

        // 3. For-Schleife Übung: Durchschnittsnote berechnen
        int[] noten = {3, 4, 5, 2, 4};
        int summe = 0;

        for (int note : noten) {
            summe += note;
        }
        double durchschnitt = (double) summe / noten.length;
        System.out.println("Durchschnittsnote: " + durchschnitt);

        // 4. While-Schleife Übung: Zinseszins berechnen
        double betrag = 1000.0;
        double zielBetrag = betrag * 2;
        int jahre = 0;

        while (betrag < zielBetrag) {
            betrag += betrag * 0.05; // 5% Zinsen
            jahre++;
        }
        System.out.println("Anzahl der Jahre bis Verdopplung: " + jahre);

        // 5. Do-While Übung: Passwortüberprüfung
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        String eingabe;

        do {
            System.out.print("Bitte Passwort eingeben: ");
            eingabe = scanner.nextLine();
        } while (!eingabe.equals("geheim"));
        System.out.println("Passwort korrekt!");

        // 6. Break Übung: Primzahl finden
        int erstePrimzahl = 0;

        for (int i = 2; i <= 50; i++) {
            boolean istPrim = true;

            // Überprüfe nur bis i/2, da kein Teiler größer als i/2 existiert
            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    istPrim = false;
                    break;
                }
            }

            if (istPrim) {
                erstePrimzahl = i;
                break;
            }
        }

        System.out.println("Erste Primzahl zwischen 2 und 50: " + erstePrimzahl);


        // 7. Continue Übung: FizzBuzz
        for (int i = 1; i <= 20; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }

        // 8. Verschachtelte Schleifen Übung: Rechteckmuster drucken
        int zeilen = 4;
        int spalten = 6;

        for (int i = 0; i < zeilen; i++) {
            for (int j = 0; j < spalten; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Scanner schließen
        /*
        scanner.close() ist eine gute Praxis, wenn der Scanner nicht mehr benötigt wird und keine weiteren
        Konsoleneingaben geplant sind.
        Es hilft, Systemressourcen freizugeben und Speicherlecks zu vermeiden.
        */
        //scanner.close();
    }
}
