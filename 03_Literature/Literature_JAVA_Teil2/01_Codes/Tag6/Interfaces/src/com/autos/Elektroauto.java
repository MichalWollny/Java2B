package com.autos;

import com.fahrzeug.Fahrbar;
import com.fahrzeug.Fahrzeug;
import com.fahrzeug.Wartung;

public class Elektroauto extends Fahrzeug implements Fahrbar, Wartung {
    public Elektroauto() {
        super("Elektroauto");
    }

    @Override
    public void fahren() {
        System.out.println("Das Elektroauto fährt elektrisch.");
    }

    @Override
    public void starten() {
        System.out.println("Das Elektroauto startet geräuschlos.");
    }

    @Override
    public void stoppen() {
        System.out.println("Das Elektroauto stoppt.");
    }
}
