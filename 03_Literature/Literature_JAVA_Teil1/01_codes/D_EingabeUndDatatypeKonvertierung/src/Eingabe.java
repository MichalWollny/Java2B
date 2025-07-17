import java.util.Scanner;
public class Eingabe{

    public static void main(String[] args) {

        // Eingabe verschiedener Datentypen
        // Ganzzahl (int)

        Scanner scanner = new Scanner(System.in);

        System.out.print("Geben Sie eine ganze Zahl ein: ");

        int intWert = scanner.nextInt();

        System.out.println("Eingegebener Integer: " + intWert);

        // Kommazahl (double)

        System.out.print("Geben Sie eine Kommazahl ein Bsp. : 1,2: ");

        double doubleWert = scanner.nextDouble();

        System.out.println("Eingegebener Double: " + doubleWert);

        // Wort (one single String bis zum ersten leer Zeichen)
        System.out.print("Geben Sie ein Wort ein: ");
        String wort = scanner.next();
        System.out.println("Eingegebener Text: " + wort);

        // text (Stringskette)
        /*
        Das Hauptproblem bei scanner.nextLine() tritt auf, weil andere Scanner-Methoden (nextInt, nextDouble, etc.)
        das Zeilenendezeichen nicht entfernen. Ein zusätzlicher nextLine()-Aufruf nach der ersten Eingabe
        oder das Verwenden von nextLine() für alle Eingaben hilft, dieses Problem zu vermeiden.
        */
        scanner.nextLine();// Puffer leeren
        System.out.print("Geben Sie ein Satz ein: ");
        String text = scanner.nextLine();
        System.out.println("Eingegebener Satz: " + text);

        // Einzelnes Zeichen (char)
        System.out.print("Geben Sie einen Buchstaben ein: ");
        char charWert = scanner.next().charAt(0);
        System.out.println("Eingegebener Char: " + charWert);

        // Wahrheitswert (boolean)
        System.out.print("Geben Sie true oder false ein: ");
        boolean boolWert = scanner.nextBoolean();
        System.out.println("Eingegebener Boolean: " + boolWert);

    }
}
