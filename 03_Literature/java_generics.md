# 📖 Java Generics – Kurze Erklärung mit Code-Beispielen

## ✅ Was sind Generics?

Generics ermöglichen es, **Klassen**, **Interfaces** und **Methoden** so zu schreiben, dass sie mit **beliebigen Datentypen** arbeiten können.

🎁 Merksatz: **„Generics = Typ-Platzhalter“**

---

## ✅ Vorteile von Generics
- ✅ **Typsicherheit**: Compiler prüft Typen zur Compile-Zeit
- ✅ **Weniger Castings**: kein unnötiges Umwandeln
- ✅ **Wiederverwendbarkeit**: eine Klasse für viele Datentypen

---

## ✅ Beispiel 1: Generische Klasse

```java
class Box<T> {
    private T inhalt;

    public void setInhalt(T inhalt) {
        this.inhalt = inhalt;
    }

    public T getInhalt() {
        return inhalt;
    }
}

// Verwendung:
Box<String> box = new Box<>();
box.setInhalt("Hallo Generics!");
System.out.println(box.getInhalt());  // Ausgabe: Hallo Generics!
```

---

## ✅ Beispiel 2: Generische Methode

```java
public static <T> void druckeElement(T element) {
    System.out.println("Element: " + element);
}

druckeElement(123);           // Integer
druckeElement("Hallo Welt");  // String
```

---

## ✅ Wichtige Platzhalter-Namen

| Symbol | Bedeutung                 |
|--------|---------------------------|
| `T`    | Typ (z.B. String, Integer) |
| `E`    | Element (z.B. in Listen)   |
| `K, V` | Key, Value (z.B. Maps)     |
| `R`    | Return-Typ (bei Function)  |

---

## 🎁 Merktipp:
„Mit Generics schreibst du flexiblen, sicheren und wiederverwendbaren Code! ✅“