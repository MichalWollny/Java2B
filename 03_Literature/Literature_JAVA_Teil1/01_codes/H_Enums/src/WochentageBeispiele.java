public class WochentageBeispiele {
    // Enum für die sieben Wochentage

    public  enum  Tag {
        MONTAG, DIENSTAG, MITTWOCH ,DONNERSTAG, FREITAG, SAMSTAG, SONNTAG
    }

    public static void main(String[] args) {
        // 1. Ein Enum Wert wird einer Variable zugewiesen

        Tag heute = Tag.MONTAG;

        // 2. Ausgabe des aktuellen Tages
        System.out.println("Heute ist: " + heute);

        // 3. Einfache Bedingung: Was passiert am Montag?

        if(heute == Tag.MONTAG){
            System.out.println("Zurück an die Arbeit!");
        }

        // 4. Iteration durch alle Werte des Enums
        System.out.println("Alle Wochentage:");

        for(Tag tag : Tag.values()) {
            System.out.println(tag);

        }

        // 5. Verwendung in eienr Methode
        beschreibeTag(Tag.SAMSTAG);


    }
    // Erstelle Methode für die Beschreibung der Wochentage
    public static void beschreibeTag(Tag tag){
        switch (tag){
            case MONTAG:
                System.out.println("Montag: Der start in die Woche.");
                break;
            case FREITAG:
                System.out.println("Freitag: Das Wochenende ist in sicht :-).");
                break;

            case SAMSTAG:
                System.out.println(tag+ ": Zeit für Entspannen");
                break;

            case SONNTAG:
                System.out.println(tag+ ": Zeit für Entspannen");
                break;
            default:
                System.out.println(tag + ": Ein ganz normaler Arbeitstag!");

        }

    }
}
