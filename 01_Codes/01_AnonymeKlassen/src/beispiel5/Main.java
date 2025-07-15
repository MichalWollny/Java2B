package beispiel5;

public class Main {
    public static void main(String[] args) {
        Fahrbar auto = new Fahrbar() {
            @Override
            public void fahren() {
                System.out.println("Pkw fährt"); // Ausgabe: Pkw fährt
            }
        };

        auto.fahren();
    }
}
