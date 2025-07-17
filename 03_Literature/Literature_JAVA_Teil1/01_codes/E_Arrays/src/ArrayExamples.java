import java.util.Arrays;
public class ArrayExamples {
    public static void main(String[] args) {

        System.out.println("Arrays in Java");


        // 1. Deklaration und Initialisierung von Arrays
        // Deklariert ein Array für 10 Integer-Elemente
        int[] intArray = new  int[10];

        // Sofortige Initialisierung eines Arrays mit festen Werten
        int[] intArray2 = {1, 2, 3, 4, 5};

        System.out.println("Inhalt von intArray2: " + Arrays.toString(intArray2));

        // 2. Zugriff und Modifikation von Array-Elementen
        intArray[0] = 22;
        intArray[1] = 23;
        intArray[2] = 24;
        //....
        intArray[9]= 29;

        System.out.println("Inhalt von intArray für Index [0]: " + intArray[0]);

        // 3. Array-Befüllung mit Schleifen
        System.out.println("Befüllen des Arrays intArray mit aufeinanderfolgenden Werten:");

        for (int i = 0; i < intArray.length; i++){
            intArray[i] = i + 1;
        }
        System.out.println("Inhalt von intArray nach Befüllung: " + Arrays.toString(intArray));

        // Alternative Befüllung mit Arrays.fill()

        Arrays.fill(intArray, 0, 5, 42);
        System.out.println("Inhalt von intArray nach Befüllung: " + Arrays.toString(intArray));






    }
}
