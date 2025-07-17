abstract class Künstler {
    abstract void kunstErstellen();
}

public class Aufgabe1_Kuenstler {
    public static void main(String[] args) {
        Künstler maler = new Künstler() {
            @Override
            void kunstErstellen() {
                System.out.println("Ich male ein Bild");
            }
        };

        Künstler sänger = new Künstler() {
            @Override
            void kunstErstellen() {
                System.out.println("Ich singe einen Song");
            }
        };

        maler.kunstErstellen();
        sänger.kunstErstellen();
    }
}