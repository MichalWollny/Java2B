package beispiel4;

public class Main {
    public static void main(String[] args) {
        Lebewesen tier = new Lebewesen() {
            @Override
            public void fressen() {
                System.out.println("Fleisch"); // Ausgabe: Fleisch
            }
        };

        tier.fressen();
    }
}
