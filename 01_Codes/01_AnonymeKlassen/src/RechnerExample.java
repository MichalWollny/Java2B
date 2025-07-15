// Beispiel für ein funktionales Interface und Lambdas

// Definition eines funktionalen Interfaces mit einer einzigen abstrakten Methode
@FunctionalInterface
interface Rechner {
    int berechne(int a, int b);
}

public class RechnerExample {
    public static void main(String[] args) {
        // Anonyme Klasse - längere, traditionelle Schreibweise
        Rechner addiererAlt = new Rechner() {
            @Override
            public int berechne(int a, int b) {
                return a + b;
            }
        };
        System.out.println("Anonyme Klasse: 5 + 3 = " + addiererAlt.berechne(5, 3));

        // Lambda-Ausdruck - moderne, kurze Schreibweise
        Rechner addierer = (a, b) -> a + b;
        Rechner multiplizierer = (a, b) -> a * b;

        System.out.println("Lambda Addierer: 5 + 3 = " + addierer.berechne(5, 3));
        System.out.println("Lambda Multiplizierer: 5 * 3 = " + multiplizierer.berechne(5, 3));

        // Übergabe von Lambda als Parameter
        System.out.println("Berechnung über Methode: 10 - 4 = " +
                berechneMitLambda(10, 4, (x, y) -> x - y));
    }

    // Methode, die ein funktionales Interface als Parameter erwartet
    public static int berechneMitLambda(int a, int b, Rechner rechner) {
        return rechner.berechne(a, b);
    }
}