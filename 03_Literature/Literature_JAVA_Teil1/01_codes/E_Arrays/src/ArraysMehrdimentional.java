import  java.util.Arrays;
public class ArraysMehrdimentional {
    public static void main(String[] args) {
        // =====================================
        // 1. Einführung: 1-Dimensionales Array
        // =====================================
        // Wir starten mit einem einfachen 1-dimensionalen Array und erweitern dieses später zu mehrdimensionalen Arrays.
        int[] schulnoten2018 = new int[] {4, 3, 2, 1}; // Beispiel: Schulnoten für das Jahr 2018
        System.out.println("Die 3. Note im Jahr 2018 war: " + schulnoten2018[2]); // Ausgabe der 3. Note (Index 2)

        // =====================================
        // 2. Einführung: 2-Dimensionales Array
        // =====================================
        // Hier erweitern wir unser Array um eine zweite Dimension, um Noten aus mehreren Jahren zu speichern.

        int[][] schulKariere = new int[][]{
                {3, 4, 5, 6}, // Jahr 1 (Index 0)
                {2, 1, 5, 4}, // Jahr 2 (Index 1)
                {4, 3, 2, 1 }
        };
        System.out.println("2. Note im Jahr 1 war: " + schulKariere[0][1]); // Ausgabe: Note im 1. Jahr, 2. Prüfung

        // =====================================
        // 3. Einführung: 3-Dimensionales Array
        // =====================================
        // Erweiterung um eine dritte Dimension, z.B. für Noten mehrerer Schüler über mehrere Jahre.
        int[][][] schulStatistik = new int[][][]{
                // Schüler1

                {
                        {3, 4, 5, 6}, // Schüler1,Jahr 1 (Index 0)
                        {2, 1, 5, 4}, // Schüler1,Jahr 2 (Index 1)
                        {4, 3, 2, 1}  //Schüler1, Jahr 3
                },

                // Schüler2

                {
                        {2, 1, 2, 6}, // Jahr 1 (Index 0)
                        {4, 1, 5, 4}, // Jahr 2 (Index 1)
                        {6, 3, 2, 1}, // Jahr 3 (Index 1)
                }
        };

        System.out.println("Schüler 1 / Jahr 3 / Prüfung 4: " + schulStatistik[0][2][3]); // Zugriff auf spezifische Note

        // =====================================
        // 4. Nutzung von Arrays.deepToString()
        // =====================================
        // Diese Methoden helfen, die Inhalte von Arrays direkt auszugeben.
        System.out.println(Arrays.deepToString(schulStatistik)); // Ausgabe des kompletten 3D-Arrays


        // =====================================
        // 5. Größe von mehrdimensionalen Arrays
        // =====================================
        // Länge jeder Dimension des Arrays ausgeben.
        System.out.println("Anzahl der Schüler: " + schulStatistik.length);        // -> 2 (Schüler)

        System.out.println("Anzahl der Jahre der Schüler 1: " + schulStatistik[0].length);       // -> 3 (Jahre)

        System.out.println("Anzahl der Prüfungen der Schüler 1 in ersten Jahr: " + schulStatistik[0][0].length); // -> 4 (Prüfungen pro Jahr)

        // =====================================
        // 6. Ausgabe eines 3D-Arrays mit for-Schleife
        // =====================================
        // Strukturierte Ausgabe des Arrays, um alle Noten für jeden Schüler und jedes Jahr zu sehen.
        System.out.println("Schulstatistik:");

        for (int schuelerIdx = 0; schuelerIdx < schulStatistik.length; schuelerIdx++){
            System.out.println("Schüler " + (schuelerIdx+1) + ":");

            for (int jahrIdx = 0; jahrIdx < schulStatistik[schuelerIdx].length; jahrIdx++){
                System.out.print(" Jahr " + (jahrIdx+1) + ": \n");

                for (int noteIdx = 0 ; noteIdx < schulStatistik[schuelerIdx][jahrIdx].length; noteIdx++ ){
                    System.out.println(schulStatistik[schuelerIdx][jahrIdx][noteIdx] + "");
                }
                System.out.println();

            }

            System.out.println();


        };
        //     // =====================================
        //     // 7. Nachträgliche Initialisierung eines 2D-Arrays
        //     // =====================================
        //     // Erstellen eines 2D-Arrays mit 3 Klassen a verschiedenen Größen für jede Klasse.
        String[][] schuelerArray = new String[3][]; // 3 Klassen
        schuelerArray[0] = new String[20];// Klasse 1 mit 20 Schülern
        schuelerArray[1] = new String[15];// Klasse 2 mit 15 Schülern
        schuelerArray[2] = new String[25];// Klasse 3 mit 25 Schülern

        // =====================================
        // 8. Füllen und Ausgabe eines 2D-Arrays mit verschachtelten Schleifen
        // =====================================

        for (int klasse = 0; klasse < schuelerArray.length; klasse++) {


            for (int schueler = 0; schueler < schuelerArray[klasse].length; schueler++) {
                schuelerArray[klasse][schueler] = "Schüler " + (schueler + 1) + " in Klasse " + (klasse + 1);
            }

        }
        System.out.println("Schüler-Array:");
        System.out.println(Arrays.deepToString(schuelerArray));

        // =====================================
        // 9. Beispiel eines 3D-Arrays: Schule, Klassen und Schüler
        // =====================================

        String[][][] schulenArray = {
                // 1.st Schule
                {     // Klasse 1 á 10 Schueler*innen, Klasse 2 á 20 Schueler*innen, Klasse 3 á 12 Schueler*innen,
                        new String[10], new String[20], new String[12]
                },

                // 2.nd Schule
                {
                        new String[11], new String[21], new String[13], new String[23]
                }
        };

        for (int schule = 0; schule < schulenArray.length; schule++) {
            for (int klasse = 0; klasse < schulenArray[schule].length; klasse++) {
                for (int schueler = 0; schueler < schulenArray[schule][klasse].length; schueler++) {
                    schulenArray[schule][klasse][schueler] = "Schüler " + (schueler + 1) + " von Klasse " + (klasse + 1) + " in Schule " + (schule + 1);
                }
            }
        }
        // Ausgabe aller Schülernamen aus schulenArray
        System.out.println("Schulen-Array:");
        for (String[][] schule : schulenArray) {
            for (String[] klasse : schule) {
                for (String schueler : klasse) {
                    System.out.println(schueler);
                }
            }
        }

        // Beispielausgabe eines spezifischen Schülers
        System.out.println("Beispiel eines bestimmten Schülers: " + schulenArray[0][2][7]); // Schule 1, Klasse 3, Schüler 8













    }
}
