// Beispiel für den Einsatz von Lambdas in einer forEach-Schleife

import java.util.Arrays;
import java.util.List;

public class ForEachLambdaExample {
    public static void main(String[] args) {
        List<String> namen = Arrays.asList("Anna", "Bernd", "Clara");

        // forEach mit Lambda-Ausdruck
        namen.forEach(name -> System.out.println("Hallo, " + name + "!"));
    }
}