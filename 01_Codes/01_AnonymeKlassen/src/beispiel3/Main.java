package beispiel3;

public class Main {
    public static void main(String[] args) {
        Katze cat = new Katze() {
            @Override
            public void gibLaut() {
                System.out.println("Meow!"); // Ausgabe: Meow!
            }
        };

        cat.gibLaut();
    }
}
