public class Variables {
    public static void main(String[] args) {
        // Deklaration und Initialisierung

        // 1. byte - 8 bit -> Ganzzahl
        byte myByte; // Deklaration
        myByte = 127; // Initialisierung
        System.out.println("Byte-Wert: " + myByte);

        // 2. short
        short myShort = 32000; // Deklaration und Initialisierung
        System.out.println("Short-Wert: " + myShort);


        // 3. int
        int myInt = 100000;
        System.out.println("Int-Wert: "+ myInt);

        // 4.long
        long myLong = 1000000000L; // Deklaration und Initialisierung
        System.out.println("Long-Wert: " + myLong);

        //5.float
        float myFloat = 5.75f; // Deklaration und Initialisierung
        System.out.println("Float-Wert: " + myFloat);

        // 6. double
        double myDouble = 19.99; // Deklaration und Initialisierung
        System.out.println("Double-Wert: " + myDouble);

        // 7. char - 16-bit Unicode-Zeichen
        // Speicherbedarf: 2 Byte (16 Bit)
        char myChar = 'A'; // Deklaration und Initialisierung
        System.out.println("Char-Wert: " + myChar);

        // 8. boolean - Wahrheitswert
        // Speicherbedarf: 1 Bit (implizit; in der Praxis kann es mehr Speicher benötigen)
        boolean myBoolean = true; // Deklaration und Initialisierung
        System.out.println("Boolean-Wert: " + myBoolean);

        // 9. String - Zeichenkette (nicht primitiver Typ, sondern ein Objekt)
        // Speicherbedarf: Abhängig von der Länge der Zeichenkette
        String myString = "Hallo, Welt!"; // Deklaration und Initialisierung
        System.out.println("String-Wert: " + myString);
    }
}
