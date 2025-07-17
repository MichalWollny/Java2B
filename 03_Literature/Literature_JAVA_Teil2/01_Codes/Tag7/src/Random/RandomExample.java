package Random;

// Random-Klasse Beispiele
import java.util.Random;

public class RandomExample {
    public static void main(String[] args) {
        // Random-Objekt erstellen
        Random random1 = new Random();
        // setzte ein seed von 10 ein
        Random random = new Random(10);

        // Zufällige int-Zahlen
        System.out.println("Zufällige int-Zahl: " + random.nextInt());
        System.out.println("Zufällige int-Zahl zwischen 0 und 10: " + random.nextInt(10));

        // Zufällige double-Zahl
        System.out.println("Zufällige double-Zahl: " + random.nextDouble());

        // Zufällige boolean-Werte
        System.out.println("Zufälliger boolean: " + random.nextBoolean());

        // Zufällige long-Zahlen
        System.out.println("Zufällige long-Zahl: " + random.nextLong());

        // Zufällige float-Zahlen
        System.out.println("Zufällige float-Zahl: " + random.nextFloat());
    }
}
