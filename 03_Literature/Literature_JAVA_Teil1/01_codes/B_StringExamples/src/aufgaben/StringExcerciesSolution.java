package aufgaben;

public class StringExcerciesSolution {
    public static void main(String[] args) {

        /* Übung 1: Länge und Groß-/Kleinschreibung */
        String sentence = "Programmieren macht Spaß!";
        System.out.println("Länge des Strings: " + sentence.length());
        System.out.println("In Großbuchstaben: " + sentence.toUpperCase());
        System.out.println("In Kleinbuchstaben: " + sentence.toLowerCase());

        /* Übung 2: Zeichen abrufen und Teilstring extrahieren */
        String text = "Java ist toll!";
        System.out.println("Zeichen an Position 5: " + text.charAt(5));
        System.out.println("Teilstring von Index 5 bis 8: " + text.substring(5, 8));

        /* Übung 3: Vergleich von Strings */
        String word1 = "Apfel";
        String word2 = "Apfel";
        System.out.println("Sind 'word1' und 'word2' gleich? " + word1.equals(word2));
        String word3 = "apfel";
        System.out.println("Sind 'word1' und 'word3' gleich (ohne Groß-/Kleinschreibung)? " + word1.equalsIgnoreCase(word3));

        /* Übung 4: Enthält und Ersetzen */
        String phrase = "Willkommen in der Java-Welt!";
        System.out.println("Enthält 'phrase' das Wort 'Java'? " + phrase.contains("Java"));
        System.out.println("Nach Ersetzen: " + phrase.replace("Java", "Python"));

        /* Übung 5: Überprüfen auf Präfix und Suffix */
        String title = "Java Programmieren für Anfänger";
        System.out.println("Beginnt 'title' mit 'Java'? " + title.startsWith("Java"));
        System.out.println("Endet 'title' mit 'Anfänger'? " + title.endsWith("Anfänger"));

        /* Übung 6: Leerzeichen entfernen und Wiederholung */
        String messyString = "   Hallo, Java!   ";
        System.out.println("Nach trim(): '" + messyString.trim() + "'");
        String repeatString = "Java ";
        System.out.println("String wiederholen: " + repeatString.repeat(3));

        /* Übung 7: Formatierte Ausgabe und lexikographischer Vergleich */
        String userName = "Max";
        System.out.println("Formatierte Ausgabe: " + String.format("Hallo %s, Sie haben %d neue Nachrichten.", userName, 3));
        String fruit1 = "Apfel";
        String fruit2 = "Banane";
        System.out.println("Lexikographischer Vergleich (Apfel, Banane): " + fruit1.compareTo(fruit2));

        /* Übung 8: Enthält nur Leerzeichen oder ist leer? */
        String emptyStr = "";
        String whiteSpaceStr = "   ";
        System.out.println("Ist emptyStr leer? " + emptyStr.isEmpty());
        System.out.println("Besteht whiteSpaceStr nur aus Leerzeichen? " + whiteSpaceStr.isBlank());
    }
}

