interface Druckbar {
    String getInfo();
}

class Kunde implements Druckbar {
    private String name;
    public Kunde(String name) { this.name = name; }
    public String getInfo() { return name; }
}

public class Aufgabe3_Druckbar {
    public static void drucken(Druckbar... druckbar) {
        for (Druckbar d : druckbar) {
            System.out.println(d.getInfo());
        }
    }

    public static void main(String[] args) {
        Kunde k1 = new Kunde("Alice");
        Kunde k2 = new Kunde("Bob");
        Druckbar trennzeichen = new Druckbar() {
            public String getInfo() { return ">"; }
        };
        drucken(k1, trennzeichen, k2);
    }
}