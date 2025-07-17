public class Auto {
    // Private Attributes des Autos (Kapselung)
    private String farbe;
    private int maximaleGeschwindigkeit;
    private int momentGeschwindigkeit;
    String lenkradAusrichtung; //(Z. B- "links". "rechts"

    // Erstelle ein Konstruktor zur Initialisierung von Instanzen
    public Auto(String farbe, int maximaleGeschwindigkeit){
        this.farbe = farbe;
        this.maximaleGeschwindigkeit = maximaleGeschwindigkeit;
        this.momentGeschwindigkeit = 0;
        this.lenkradAusrichtung = " geradeaus";}

    // Getter und Setter für private attribute

    public void setFarbe(String farbe){
        this.farbe = farbe;
    }

    public String getFarbe(){
        return  farbe;
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
        if (momentGeschwindigkeit <= maximaleGeschwindigkeit && momentGeschwindigkeit >= 0) {
            this.momentGeschwindigkeit = momentGeschwindigkeit;
        } else {
            System.out.println("Ungültige Geschwindigkeit!");
        }
    }

    // Methoden
        // beschleunigen(): erhöht die momentane Geschwindigkeit um den angegebenen Wert
        void  beschleunigen(int geschwindigkeit){
            momentGeschwindigkeit += geschwindigkeit;
            if(momentGeschwindigkeit > maximaleGeschwindigkeit) {
                momentGeschwindigkeit = maximaleGeschwindigkeit; // begrenze die Geschwindigkeit



        }}


        // bremsen(): verringert die momentane Geschwindigkeit um den angegebenen Wert
        void  bremsen(int geschwindigkeit){
            momentGeschwindigkeit -= geschwindigkeit;
            if(momentGeschwindigkeit < 0) {
                momentGeschwindigkeit = 0; // verhindert, dass die Geschwindigkeit negativ wird

            }

        }

        // Methode zum Lenken des Autos
        void  lenken(String richtung){
            lenkradAusrichtung = richtung; // ändert die Richtung des Lenkrads
        }


    }


