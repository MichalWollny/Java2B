//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // erstelle ein normales auto Instanz (Exemplar)

        Auto normalesAuto = new Auto("Rot", 150);

        // print die Farbe von dem normalesAuto printen

        System.out.println(normalesAuto.getFarbe());

        // Ändere die Farbe des Autos ins Gelb
        normalesAuto.setFarbe("Gelb");
        System.out.println(normalesAuto.getFarbe());

        // Das Auto hat eine Beschleunigung um 50
        normalesAuto.beschleunigen(50);
        System.out.println(normalesAuto.getMomentGeschwindigkeit());

        // erstelle ein SportWagen

        SportWagen sportWagen1 = new SportWagen("Blau",360);
        // print die Farbe von dem sportWagen1
        System.out.println(sportWagen1.getFarbe());

        // Aktiviere den SportModus
        System.out.println(sportWagen1.isTurboModus());
        sportWagen1.aktiviereTurbo();
        System.out.println(sportWagen1.isTurboModus());

        // Beschleunige das sportWagen1 mit aktiviertem Turbomodus
        System.out.println(sportWagen1.getMomentGeschwindigkeit());// 0
        sportWagen1.beschleunigen(50);
        System.out.println(sportWagen1.getMomentGeschwindigkeit());//100

    }
}