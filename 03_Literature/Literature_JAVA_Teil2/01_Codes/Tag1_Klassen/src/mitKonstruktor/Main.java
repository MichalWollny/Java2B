package mitKonstruktor;

public class Main {
    public static void main(String[] args) {
        // Erstellen von 5 Instanzen
        // 1. Rotes Auto
        Auto rotesAuto = new Auto("Rot",120);
        System.out.println(rotesAuto.momentGeschwindigkeit);

        // 2. Gelbes Auto
        Auto gelbesAuto = new Auto("Gelb",110);

        // 3. Blaues Auto
        Auto blauesAuto = new Auto("Rot",120);
        System.out.println(rotesAuto.momentGeschwindigkeit);

        // 4. lila Auto
        Auto lilaAuto = new Auto("Gelb",90);

        // 5. Grünes Auto
        Auto gruenesAuto = new Auto("Grün",100);
        System.out.println(rotesAuto.momentGeschwindigkeit);

        // Demonstration: Aufrufen von Methoden
        rotesAuto.beschleunigen(50);
        System.out.println("Rotes Auto: Geschwindigkeit = " + rotesAuto.momentGeschwindigkeit);

        gelbesAuto.beschleunigen(50);
        System.out.println("Gelbes Auto: Geschwindigkeit nach Beschleunigung = " + gelbesAuto.momentGeschwindigkeit);

        gelbesAuto.bremsen(20);
        System.out.println("Gelbes Auto: Geschwindigkeit nach Bremsung = " + gelbesAuto.momentGeschwindigkeit);



    }
}
