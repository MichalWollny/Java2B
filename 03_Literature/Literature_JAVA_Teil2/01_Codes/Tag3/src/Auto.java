// Oberklasse Auto mit Kapselung
public class Auto {
    // Private Felder (Kapselung)
    private String farbe;
    private int maximaleGeschwindigkeit;
    private int momentGeschwindigkeit;
    // Konstruktor
    public Auto(String farbe, int maximaleGeschwindigkeit) {
        this.farbe = farbe;
        this.maximaleGeschwindigkeit = maximaleGeschwindigkeit;
        this.momentGeschwindigkeit = 0;
    }
    // Getter und Setter (Kapselung)
    public String getFarbe() {
        return farbe;
    }
    public void setFarbe(String farbe) {
        this.farbe = farbe;
    }
    public int getMaximaleGeschwindigkeit() {
        return maximaleGeschwindigkeit;
    }
    public void setMaximaleGeschwindigkeit(int maximaleGeschwindigkeit) {
        this.maximaleGeschwindigkeit = maximaleGeschwindigkeit;
    }
    public int getMomentGeschwindigkeit() {
        return momentGeschwindigkeit;
    }
    public void setMomentGeschwindigkeit(int momentGeschwindigkeit) {
        if (momentGeschwindigkeit <= maximaleGeschwindigkeit &&
                momentGeschwindigkeit >= 0) {
            this.momentGeschwindigkeit = momentGeschwindigkeit;
        } else {
            System.out.println("Ungültige Geschwindigkeit!");
        }
    }
    // Methode zum Beschleunigen
    public void beschleunigen(int wert) {
        setMomentGeschwindigkeit(this.momentGeschwindigkeit + wert);
    }
    // Methode zum Bremsen
    public void bremsen(int wert) {
        setMomentGeschwindigkeit(this.momentGeschwindigkeit - wert);
    }
}