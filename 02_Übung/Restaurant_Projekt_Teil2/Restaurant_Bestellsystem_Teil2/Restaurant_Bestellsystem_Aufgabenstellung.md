# 📚 Aufgabenstellung: Java Restaurant Bestellsystem

## 🧩 Projektthema:
Entwicklung eines Konsolen-basierten Bestellsystems für ein Restaurant mit anschließender Erweiterung zu einer grafischen Benutzeroberfläche (GUI).

---

## 🎯 Ziel des Projekts:
Sie erstellen zunächst eine **Konsolenanwendung** zur Bestellabwicklung. Danach wird das Projekt schrittweise um eine **grafische Oberfläche** erweitert – z. B. mit **Java Swing** in **IntelliJ IDEA**.

---

## ✅ Anforderungen und Funktionen (Konsolen-Version):

### 1. 📌 Menü (Speisekarte):
- Mindestens 5 Gerichte (Name, ID, Preis)
- Menü wird beim Start angezeigt

### 2. 📌 Kundenerfassung:
- Name des Kunden wird erfasst

### 3. 📌 Bestellvorgang:
- Auswahl von Gerichten per ID
- Mehrfachauswahl möglich mit Abfrage ("ja/nein")

### 4. 📌 Preisberechnung:
- Automatische Berechnung der Gesamtsumme

### 5. 📌 Quittung:
- Ausgabe der vollständigen Quittung auf Konsole

### 6. 📌 Klassenstruktur:
- `MenuItem.java` (Gerichte)
- `Order.java` (Bestellung)
- `RestaurantApp.java` (Main)
- Nutzung von **Listen**, **Scanner**, **Methoden** etc.

---

## 💻 Erweiterung: GUI in IntelliJ IDEA mit Java Swing

Nach der Fertigstellung der Konsolenversion wird das Projekt in IntelliJ IDEA mit einer **grafischen Benutzeroberfläche (GUI)** auf Basis von Java Swing erweitert.

### ✅ GUI-Funktionen (Swing):
- Anzeige einer übersichtlichen **Speisekarte** (z. B. über `JList` oder `JTable`)
- Eingabefeld (`JTextField`) für den **Kundennamen**
- **Buttons** (`JButton`) zum Hinzufügen von Bestellungen
- Dynamische **Quittungsanzeige** in einem Textbereich (`JTextArea`)
- **Live-Gesamtpreis-Berechnung** mit Anzeige des aktuellen Bestellwertes

---

## 🛠 Technologievorgabe:
- Java **Swing** wird für die GUI verwendet
- ❌ Keine Verwendung von JavaFX oder externen GUI-Buildern
- Oberfläche wird **direkt in IntelliJ IDEA** mit Swing-Komponenten entworfen

---

## 🧪 IntelliJ IDEA Einrichtung (Schritt-für-Schritt):

1. Neues **Java Project** in IntelliJ IDEA erstellen (`File → New Project → Java → Java`)
2. ❗ Keine `module-info.java` notwendig (klassisches Java-Projekt ohne Module)
3. Neues **Package `gui`** anlegen
4. GUI-Komponenten in einer eigenen Klasse erstellen (z. B. `MainWindow.java`)
5. Die bestehende **Logik der Konsolenanwendung** (z. B. `MenuItem`, `Order`) sinnvoll in die GUI integrieren
6. **GUI-Komponenten direkt mit den Java-Klassen verknüpfen**:
   - Events (z. B. Klick auf Button) mit `ActionListener` verarbeiten
   - Ergebnisse (z. B. Quittung) über Swing-Komponenten anzeigen

---

## 🏁 Ergebnis
Ein funktionsfähiges Bestellsystem, das sowohl in der **Konsole** als auch mit einer **Swing-GUI** funktioniert und die Benutzerfreundlichkeit verbessert.