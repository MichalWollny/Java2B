// Unterklasse Sportwagen, erbt von Auto
public class SportWagen extends Auto {
    // Attribute
    private boolean turboModus; // Eigenschaft für den Turbo-Modus
    // Konstruktor
    public SportWagen(String farbe, int maximaleGeschwindigkeit) {
        super(farbe, maximaleGeschwindigkeit); // Konstruktor der Oberklasse wird aufgerufen
        this.turboModus = false;
    }

    // Setter und isTurboModus
    public boolean isTurboModus() {
        return turboModus;
    }

    public void setTurboModus(boolean turboModus) {
        this.turboModus = turboModus;
    }
    // Methode zum Aktivieren des Turbo-Modus
    public void aktiviereTurbo() {
        this.turboModus = true;
        System.out.println("Turbo-Modus aktiviert!");
    }
    // Methode zum Deaktivieren des Turbo-Modus
    public void deaktiviereTurbo() {
        this.turboModus = false;
        System.out.println("Turbo-Modus deaktiviert!");
    }
    // Überschreiben der Methode beschleunigen
    @Override
    public void beschleunigen(int wert) {
        if (turboModus) {
            wert *= 2; // Verdoppelt die Beschleunigung im Turbo-Modus
        }
        super.beschleunigen(wert); // Ruft die beschleunigen-Methode der Oberklasse auf
    }
}
