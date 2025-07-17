import java.util.Scanner;
public class Konvertierung {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Konvertierung von String zu int
        System.out.print("Geben Sie eine Ganze Zahl als Text ein: ");
        String intAlsText = scanner.nextLine();

        int konvertierterInt = Integer.parseInt(intAlsText);
        System.out.println("Konvertierter Integer: " + konvertierterInt);

        // Konvertierung von String zu double

        System.out.print("Geben Sie eine Kommazahl als Text ein Zum Bsp. 2.8: ");
        String doubleAlsText = scanner.nextLine();
        double konvertierterDouble = Double.parseDouble(doubleAlsText);
        System.out.println("Konvertierter Double: " + konvertierterDouble);

        // Konvertierung von int zu String
        System.out.print("Geben Sie eine Zahl ein: ");
        int zahl = scanner.nextInt();
        String zahlAlsText = Integer.toString(zahl);
        System.out.println("Konvertierte Zahl als Text: " + zahlAlsText);

        // Konvertierung von double zu String
        System.out.print("Geben Sie eine Kommazahl ein zumBsp. 2,8: ");
        double kommazahl = scanner.nextDouble();
        String kommazahlAlsText = Double.toString(kommazahl);
        System.out.println("Konvertierte Kommazahl als Text: " + kommazahlAlsText);

        // Konvertierung von String zu boolean
        System.out.print("Geben Sie true / True oder false/ False als Text ein: ");
        String boolAlsText = scanner.next();
        boolean konvertierterBoolean = Boolean.parseBoolean(boolAlsText);
        System.out.println("Konvertierter Boolean: " + konvertierterBoolean);

    }
}
