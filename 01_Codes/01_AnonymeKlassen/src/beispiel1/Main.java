package beispiel1;

public class Main {
    public static void main(String[] args) {
        // Anonyme Klasse erweitert Tier
        Tier tier = new Tier() {
            @Override
            public void macheGeräusch() {
                System.out.println("Ein Löwe brüllt!"); // Ausgabe: Ein Löwe brüllt!
            }
        };

        tier.macheGeräusch();
    }
}
