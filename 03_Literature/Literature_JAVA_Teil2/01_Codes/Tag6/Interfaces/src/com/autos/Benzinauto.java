package com.autos;

import com.fahrzeug.Fahrbar;
import com.fahrzeug.Fahrzeug;

public class Benzinauto extends Fahrzeug implements Fahrbar {
    public Benzinauto() {
        super("Benzinauto");
    }

    @Override
    public void fahren() {
        System.out.println("Das Benzinauto fährt mit Benzin.");
    }

    @Override
    public void starten() {
        System.out.println("Das Benzinauto startet den Motor.");
    }

    @Override
    public void stoppen() {
        System.out.println("Das Benzinauto stoppt.");
    }
}
