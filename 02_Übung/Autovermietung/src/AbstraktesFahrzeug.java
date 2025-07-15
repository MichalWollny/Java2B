// Abstrakte Basisklasse, die das Interface implementiert und gemeinsame Eigenschaften definiert
public abstract class AbstraktesFahrzeug implements Fahrzeug {
    protected String marke;
    protected String modell;
    protected double tagespreis;

    // Konstruktor zum Initialisieren gemeinsamer Felder
    public AbstraktesFahrzeug(String marke, String modell, double tagespreis) {
        this.marke = marke;
        this.modell = modell;
        this.tagespreis = tagespreis;
    }

    @Override
    public String getMarke() {
        return marke;
    }

    @Override
    public String getModell() {
        return modell;
    }

    @Override
    public double getTagespreis() {
        return tagespreis;
    }

    // Gemeinsame Methode zur Berechnung des Mietpreises
    public double berechneMietpreis(int tage) {
        return tage * tagespreis;
    }
}