package math;
// Math-Klasse Beispiele
public class MathExample {
    public static void main(String[] args) {
        // Absolutwert
        System.out.println("Absolutwert von -5: " + Math.abs(-5));

        // Maximum und Minimum
        System.out.println("Maximum von 5 und 10: " + Math.max(5, 10));
        System.out.println("Minimum von 5 und 10: " + Math.min(5, 10));

        // Potenz und Quadratwurzel
        System.out.println("2 hoch 3: " + Math.pow(2, 3));
        System.out.println("Quadratwurzel von 16: " + Math.sqrt(16));

        // Runden, Decke und Boden
        System.out.println("Runden von 4.7: " + Math.round(4.7));
        System.out.println("Ceil von 4.2: " + Math.ceil(4.2));
        System.out.println("Floor von 4.7: " + Math.floor(4.7));

        // Zufallszahl zwischen 0 und 1
        System.out.println("Zufallszahl: " + Math.random());

        // Trigonometrie
        System.out.println("Sinus von π/2: " + Math.sin(Math.PI / 2));
        System.out.println("Kosinus von 0: " + Math.cos(0));

        // Logarithmus
        System.out.println("Natürlicher Logarithmus von 10: " + Math.log(10));
    }
}
