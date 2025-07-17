//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Erstellen von one Instanzen
        // 1. Rotes Auto
        Auto rotesAuto = new Auto("Rot",120);

        rotesAuto.lenkradAusrichtung = " Rechts";// Direkter Zugriff da lenkradAusrichtung ist Public

        // Ändere die Farbe des Rotesautos zu Gelb
        rotesAuto.setFarbe("Gelb");
        System.out.println(rotesAuto.getFarbe());

        // Ändere die MaximaleGeschwindigkeit des Rotesautos
        rotesAuto.setMaximaleGeschwindigkeit(110);
        System.out.println(rotesAuto.getMaximaleGeschwindigkeit());

        // beschleunige die Geschwindigkeit von dem auto um 20 Kmh
        rotesAuto.beschleunigen(20);
        System.out.println(rotesAuto.getMomentGeschwindigkeit());


    }

}