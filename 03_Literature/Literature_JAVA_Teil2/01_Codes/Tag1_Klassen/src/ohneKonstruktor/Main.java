package  ohneKonstruktor;
public class Main {
    public static void main(String[] args) {
        // Erstellen von 5 Instanzen
        // 1. Rotes Auto
        Auto rotesAuto = new Auto();

        rotesAuto.farbe = "Rot";
        rotesAuto.maximaleGeschwindigkeit = 120;
        rotesAuto.momentGeschwindigkeit = 0; // Initiale Geschwindigkeit
        rotesAuto.lenkradAusrichtung = "geradeaus"; // Anfangsrichtung

        // 2. Gelbes Auto
        Auto gelbesAuto = new Auto();

        gelbesAuto.farbe = "Gelb";
        gelbesAuto.maximaleGeschwindigkeit = 110;
        gelbesAuto.momentGeschwindigkeit = 0; // Initiale Geschwindigkeit
        gelbesAuto.lenkradAusrichtung = "geradeaus"; // Anfangsrichtung


        // Demonstration: Aufrufen von Methoden
        rotesAuto.beschleunigen(50);
        System.out.println("Rotes Auto: Geschwindigkeit = " + rotesAuto.momentGeschwindigkeit);

        gelbesAuto.beschleunigen(50);
        System.out.println("Gelbes Auto: Geschwindigkeit nach Beschleunigung = " + gelbesAuto.momentGeschwindigkeit);

        gelbesAuto.bremsen(20);
        System.out.println("Gelbes Auto: Geschwindigkeit nach Bremsung = " + gelbesAuto.momentGeschwindigkeit);

    }
}