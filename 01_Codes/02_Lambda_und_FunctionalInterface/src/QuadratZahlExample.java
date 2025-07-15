// Beispiel für komplexeren Lambda-Ausdruck mit mehreren Anweisungen

@FunctionalInterface
interface QuadratZahl {
    int berechneQuadrat(int zahl);
}

public class QuadratZahlExample {
    public static void main(String[] args) {
        // Lambda-Ausdruck mit Block und mehreren Anweisungen
        QuadratZahl quadrat = (int zahl) -> {
            System.out.println("Berechne Quadrat von: " + zahl);
            return zahl * zahl;
        };

        int zahl = 7;
        int ergebnis = quadrat.berechneQuadrat(zahl);
        System.out.println("Quadrat von " + zahl + " ist: " + ergebnis);
    }
}