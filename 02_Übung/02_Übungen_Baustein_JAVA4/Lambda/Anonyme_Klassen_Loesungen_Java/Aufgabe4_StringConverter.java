import java.util.*;

abstract class StringConverter<T> {
    abstract String toString(T obj);
    abstract T fromString(String str);
}

class Mitarbeiter {
    private String name;
    private int nummer;
    public static List<Mitarbeiter> liste = new ArrayList<>();

    public Mitarbeiter(String name, int nummer) {
        this.name = name;
        this.nummer = nummer;
    }

    public String getName() { return name; }
    public int getNummer() { return nummer; }

    public static StringConverter<Mitarbeiter> converter = new StringConverter<Mitarbeiter>() {
        public String toString(Mitarbeiter obj) {
            return String.valueOf(obj.getNummer());
        }
        public Mitarbeiter fromString(String str) {
            int num = Integer.parseInt(str);
            for (Mitarbeiter m : liste) {
                if (m.getNummer() == num) return m;
            }
            return null;
        }
    };
}

public class Aufgabe4_StringConverter {
    public static void main(String[] args) {
        Mitarbeiter m1 = new Mitarbeiter("Max", 1);
        Mitarbeiter m2 = new Mitarbeiter("Anna", 2);
        Mitarbeiter m3 = new Mitarbeiter("Tim", 3);
        Mitarbeiter m4 = new Mitarbeiter("Lena", 4);

        Mitarbeiter.liste.addAll(Arrays.asList(m1, m2, m3, m4));

        for (Mitarbeiter m : Mitarbeiter.liste) {
            System.out.println("Nummer: " + Mitarbeiter.converter.toString(m));
        }

        String input = "3";
        Mitarbeiter gefunden = Mitarbeiter.converter.fromString(input);
        if (gefunden != null) {
            System.out.println("Gefunden: " + gefunden.getName());
        } else {
            System.out.println("Mitarbeiter nicht gefunden.");
        }
    }
}