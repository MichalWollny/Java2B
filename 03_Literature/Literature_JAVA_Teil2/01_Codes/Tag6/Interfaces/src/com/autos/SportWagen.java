package com.autos;
import com.fahrzeug.Fahrzeug;
import com.fahrzeug.Fahrbar;


public class SportWagen extends Fahrzeug implements Fahrbar {
    public SportWagen() {
        super("SportWagen");
    }

    @Override
    public void fahren() {
        System.out.println("Der Sportwagen fährt mit hoher Geschwindigkeit.");
    }

    @Override
    public void starten() {
        System.out.println("Der Sportwagen startet den Turbo.");
    }

    @Override
    public void stoppen() {
        System.out.println("Der Sportwagen stoppt mit ABS.");
    }
}
