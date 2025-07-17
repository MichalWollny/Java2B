package com.app;

import com.autos.Benzinauto;
import com.autos.Elektroauto;
import com.autos.SportWagen;

public class Main {
    public static void main(String[] args) {
        // Benzinauto Beispiel
        Benzinauto benzinauto = new Benzinauto();
        benzinauto.starten();
        benzinauto.fahren();
        benzinauto.stoppen();

        // Elektroauto Beispiel
        Elektroauto elektroauto = new Elektroauto();
        elektroauto.starten();
        elektroauto.fahren();
        elektroauto.status(); // Default-Methode aus Wartung
        elektroauto.stoppen();

        // Sportwagen Beispiel
        SportWagen sportwagen = new SportWagen();
        sportwagen.starten();
        sportwagen.fahren();
        sportwagen.stoppen();
    }
}
