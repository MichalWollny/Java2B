package beispiel2;

public class Main {
    public static void main(String[] args) {
        Laufbar jogger = new Laufbar() {
            @Override
            public void laufen() {
                System.out.println("Ich laufe los!"); // Ausgabe: Ich laufe los!
            }
        };

        jogger.laufen();
    }
}
