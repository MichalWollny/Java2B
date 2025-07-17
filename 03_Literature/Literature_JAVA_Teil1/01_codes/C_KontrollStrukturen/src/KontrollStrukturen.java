public class KontrollStrukturen {
    public static void main(String[] args) {
        // 1. Bedingte Anweisungen

        // if und else-Anweisung
        int age = 5;
        if (age >= 18) {
            System.out.println("Du bist volljährig.");
        } else {
            System.out.println("Du bist minderjährig.");
        }

        // else if-Anweisung
        int score = 85;
        if (score >= 90) {
            System.out.println("Note: A");
        } else if (score >= 80) {
            System.out.println("Note: B");
        } else if (score >= 70) {
            System.out.println("Note: C");
        } else {
            System.out.println("Nicht bestanden");
        }
        // switch-Anweisung
        int day = 3;
        String dayName;
        switch (day) {
            case 1:
                dayName = "Montag";
                break;
            case 2:
                dayName = "Dienstag";
                break;
            case 3:
                dayName = "Mittwoch";
                break;
            case 4:
                dayName = "Donnerstag";
                break;
            case 5:
                dayName = "Freitag";
                break;
            case 6:
                dayName = "Samstag";
                break;
            case 7:
                dayName = "Sonntag";
                break;
            default:
                dayName = "Ungültiger Tag";
                break;
        }
        System.out.println("Heute ist " + dayName);


        // 2. Schleifen

        // for-Schleife
        for (int i = 0; i < 5 ; i++) {
            System.out.println("Durchlauf Nummer: " + i);
        }

        // while-Schleife
        int count = 0;
        while (count < 5) {
            System.out.println("Durchlauf Nummer: " + count);
            count++;
        }


        // do-while-Schleife
        count = 10; // reset count
        do{
            System.out.println("Durchlauf Nummer: " + count);
            count++;
        }while (count < 5);

        // Erweiterte Kontrollstrukturen

        // break-Anweisung
        for (int i = 0; i < 10 ; i++) {
            if (i == 5){
                break;
            }
            System.out.println("Durchlauf Nummer: " + i);
        }

        // continue-Anweisung
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                continue; // Gerade Zahlen werden übersprungen
            }
            System.out.println("Ungerade Zahl: " + i);
        }

        // Verschachtelte Schleifen
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                System.out.print(i * j + " ");
            }
            System.out.println(); // Zeilenumbruch nach jeder inneren Schleife
        }




















    }
}
