public class StringExamples {
    public static void main(String[] args) {
        // Abschnitt 1: Grundlagen der String-Deklaration und -Verkettung
        String greeting = "Hallo";
        String name = "Java Programmierer";

        System.out.println("Greeting: " + greeting);
        System.out.println("Name: " + name);

        // Verkettung von strings
        String message = greeting + "," + name + "!" ;
        System.out.println("Verketteter String: " + message);//Hallo,Java Programmierer!

        // Abschnitt 2: String-Methoden
        System.out.println("String-Methoden");
        System.out.println("****************");

        System.out.println("Länge des strings 'message' ist " + message.length());  // Länge des strings 'message' ist 25
        System.out.println("message in Großbuchstaben: " + message.toUpperCase());
        System.out.println("message in Kleinbuchstaben: " + message.toLowerCase());
        System.out.println("Teilstring von 'message' (Index 0 bis 5): " + message.substring(0, 5));//Teilstring von 'message' (Index 0 bis 5): Hallo
        System.out.println("Zeichen an Position 1 in 'greeting': " + greeting.charAt(1));

        // Abschnitt 3: String-Vergleiche
        System.out.println("String-Vergleiche");
        System.out.println("****************");
        String greet = "Hallo";

        System.out.println("Sind 'Hallo' und 'Hallo' gleich? " + greet.equals("Hallo")); // True
        System.out.println("Sind 'Hallo' und 'hallo' gleich? " + greet.equals("hallo")); // False
        System.out.println("Sind 'Hallo' und 'hallo' gleich (ohne Groß-/Kleinschreibung)? " + greet.equalsIgnoreCase("hallo"));// True

        // Abschnitt 4: Überprüfen von Präfixen und Suffixen
        System.out.println("Prüfen von Präfixen und Suffixen");
        System.out.println("********************************");
        // message = Hallo,Java Programmierer!
        System.out.println("Enthält 'message' das Wort 'Java'? " + message.contains("Java"));// True
        System.out.println("Enthält 'message' das Wort 'java'? " + message.contains("java"));// False
        System.out.println("Beginnt 'message' mit 'Hallo'? " + message.startsWith("Hallo"));// True
        System.out.println("Endet 'message' mit 'Programmierer!'? " + message.endsWith("Programmierer!"));// True

        // Abschnitt 5: String-Manipulation (Trimmen, Ersetzen)
        System.out.println("String-Manipulation");
        System.out.println("*******************");
        String stringWithSpace = "   Hallo, Java   ";
        System.out.println("Original mit Leerzeichen: '" + stringWithSpace + "'");
        System.out.println("Nach trim(): '" + stringWithSpace.trim() + "'");
        System.out.println("Ersetzen von 'Java' mit 'Python': " + stringWithSpace.replace("Java", "Python"));

        // Abschnitt 6: Suchen nach Zeichen
        System.out.println("Suchen nach Zeichen");
        System.out.println("*******************");
        // message = Hallo,Java Programmierer!
        System.out.println("Erste Position von 'a' in 'message': " + message.indexOf('a'));//Erste Position von 'a' in 'message': 1
        System.out.println("Letzte Position von 'a' in 'message': " + message.lastIndexOf('a'));

        // Abschnitt 7: Formatierte Strings
        System.out.println("Formatierte Strings");
        System.out.println("*******************");

        String formattedMessage1 = String.format("Hallo %s, Sie haben %d neue Nachrichten.", "Steffi", 5);
        System.out.println("Formatierter String: " + formattedMessage1);

        String firstName = "Jony";
        String formattedMessage2 = String.format("Hallo %s, Sie haben %d neue Nachrichten.", firstName, 10);
        System.out.println("Formatierter String: " + formattedMessage2);

        // Abschnitt 8: Weitere String-Methoden
        System.out.println("Weitere String-Methoden");
        System.out.println("***********************");

        String repeatString = "Java ";
        System.out.println("String wiederholen: " + repeatString.repeat(3));

        String emptyString = "";
        System.out.println("Ist emptyString leer? " + emptyString.isEmpty());// True

        String whitespaceString = "   ";
        System.out.println("Besteht whitespaceString nur aus Leerzeichen? " + whitespaceString.isBlank());// True

        String stringA = "Apfel";
        String stringB = "Banane";
        System.out.println("Lexikographischer Vergleich (Apfel, Banane): " + stringA.compareTo(stringB));//Lexikographischer Vergleich (Apfel, Banane): -1
        System.out.println("Lexikographischer Vergleich (Banane, Apfel): " + stringB.compareTo(stringA));//Lexikographischer Vergleich (Banane, Apfel): 1

        // Abschnitt 9: Demonstration der Unveränderlichkeit von Strings : Strings are immutable
        System.out.println("Demonstration der Unveränderlichkeit von Strings");
        System.out.println("*".repeat(50));
        String original = "Unveränderlich";

        String modified = original.replace("Unveränderlich", "Verändert");
        System.out.println("Original String: " + original);
        System.out.println("Geänderter String: " + modified);

        // Abschnitt 10: StringBuffer (mutable und threadsicher)
        System.out.println("StringBuffer Beipiel: ");

        StringBuffer stringBuffer1 = new StringBuffer("Java");

        System.out.println("StringBuffer_vor_anfügen: " + stringBuffer1); //StringBuffer_vor_anfügen: Java

        stringBuffer1.append(" macht spaß!");
        System.out.println("StringBuffer_nach_anfügen: " + stringBuffer1); //StringBuffer_nach_anfügen: Java macht spaß!

        stringBuffer1.insert(5,"Programmieren ");
        System.out.println("StringBuffer_nach_Einfügen: " + stringBuffer1);// StringBuffer_nach_Einfügen: Java Programmieren macht spaß!

        stringBuffer1.replace(5, 18, "Coding");
        System.out.println("Nach Ersetzen: " + stringBuffer1);// Nach Ersetzen: Java Coding macht spaß!

        stringBuffer1.reverse();
        System.out.println("Umgekehrt: " + stringBuffer1);

        stringBuffer1.reverse();// Zurück zur Originalreihenfolge
        System.out.println("Originalreihenfolge: " + stringBuffer1);

        // Abschnitt 11: StringBuilder (mutable, aber nicht threadsicher)
        System.out.println("StringBuilder Beipiel: ");
        StringBuilder stringBuilder1 = new StringBuilder("Java");

        stringBuilder1.append(" ist mächtig!");
        System.out.println("Nach Anfügen: " + stringBuilder1);//Nach Anfügen: Java ist mächtig!

        stringBuilder1.delete(5, 14);
        System.out.println("Nach Löschen von 'ist mächt': " + stringBuilder1);// Nach Löschen von 'ist': Java ig!

        stringBuilder1.insert(5, "sehr mächtig und flexibel ");
        System.out.println("Nach Einfügen: " + stringBuilder1);//Nach Einfügen: Java sehr mächtig und flexibel ig!

        stringBuilder1.reverse();
        System.out.println("Umgekehrt: " + stringBuilder1);

        stringBuilder1.reverse(); // Zurück zur Originalreihenfolge
        System.out.println("Zurück zur Originalreihenfolge: " + stringBuilder1);
















    }
}
