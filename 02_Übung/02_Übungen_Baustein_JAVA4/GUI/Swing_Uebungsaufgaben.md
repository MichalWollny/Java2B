# 📝 Java Swing Übungsaufgaben

## ✅ 1. Button & Frame
Erstelle ein `JFrame` mit einem Button.  
Wenn man den Button klickt, soll ein `JOptionPane` Dialog „Hallo, du hast geklickt“ anzeigen.

## ✅ 2. Zwei Panels mit verschiedenen Layouts
Erstelle ein Fenster mit zwei Panels:  
- Oben (`NORTH`): ein `FlowLayout` mit drei Buttons.  
- Mitte (`CENTER`): ein `GridLayout` mit 2x2 Feldern (Buttons oder Labels).  

## ✅ 3. Checkbox Auswahl
Erstelle ein Fenster mit zwei `JCheckBox`en („Pizza“, „Burger“).  
Beim Klick auf einen Button soll eine Nachricht im Terminal erscheinen: „Du hast ausgewählt: …“  

## ✅ 4. RadioButton + ButtonGroup
Erstelle zwei `JRadioButton`en „Weiblich“ und „Männlich“ mit einer `ButtonGroup`.  
Nach Klick auf einen Button soll im Terminal erscheinen, welches Geschlecht gewählt wurde.

## ✅ 5. ActionListener für mehrere Buttons
Erstelle drei Buttons: „Start“, „Stop“, „Reset“.  
Bei Klick auf jeden Button soll im Terminal ein entsprechender Text ausgegeben werden.

## ✅ 6. Farbiges Panel
Erstelle ein Panel mit `BorderLayout`.  
Füge Buttons „Rot“, „Grün“, „Blau“ hinzu.  
Wenn man einen Button klickt, soll sich der Hintergrund des Panels in die entsprechende Farbe ändern.

## ✅ 7. CardLayout Navigation
Erstelle ein `CardLayout` mit drei Panels: „Seite 1“, „Seite 2“, „Seite 3“.  
Füge „Weiter“ und „Zurück“-Buttons hinzu, um zwischen den Seiten zu wechseln.

## ✅ Zusatzaufgabe: Einfaches Formular
Erstelle ein kleines Formular mit:
- Textfeld (Name eingeben),
- Checkbox (Newsletter abonnieren),
- Radiobuttons (Geschlecht),
- Button (Abschicken),
- Nach dem Klick auf „Abschicken“ wird eine Zusammenfassung mit `JOptionPane.showMessageDialog()` angezeigt.
