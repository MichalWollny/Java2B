# 📝 Java Functional Interfaces – 30 Übungsaufgaben (ohne Lösungen)

## 💡 Anweisung:
Schreibe für jede Aufgabe jeweils zwei Implementierungen:
- ✅ **Ohne Lambda-Ausdruck** (anonyme Klasse)
- ✅ **Mit Lambda-Ausdruck**

---
### Aufgabe 1:
- Erstelle ein Runnable, das eine Nachricht auf der Konsole ausgibt.
~~~java
// Java  code block (Sebastian Kerler)
// ohne lambda
Runnable runnable = new Runnable()
{
    @Override
    public void run()
    {
        System.out.println("Ausgabe");
    }
};
// mit lambda
Runnable lambdarRunnable = () ->{
    System.out.println("Lambdaausgabe");};


// Lösung mit Lambdac (Sven)
Runnable r = () -> System.out.println("Lösung mit Lambda");
~~~
---
### Aufgabe 2:
- Erstelle einen Supplier, der einen zufälligen String liefert.
~~~ java
// Toni
Supplier<String> supp = new Supplier<String>() {
            @Override
            public String get() {
                Random rnd = new Random();
                int rndZahl = rnd.nextInt(6);
                switch (rndZahl) {
                    case 0:
                        return "It's just a flesh wound.";
                    case 1:
                        return "Nobody expects the Spanish Inquisition!";
                    case 2:
                        return "He's not the Messiah. He's a very naughty boy!";
                    case 3:
                        return "We are the Knights who say... Ni!";
                    case 4:
                        return "What have the Romans ever done for us?";
                    case 5:
                        return "And now for something completely different.";


                }
                return "FATAL ERROR";
            }
        };
        System.out.println(supp.get());

        // Aufgabe 2b - Supplier mit Lambda - Random output
        Supplier<String> supp2 = () -> {
            Random rnd = new Random();
            int rndZahl = rnd.nextInt(6);
            switch (rndZahl) {
                case 0:
                    return "It's just a flesh wound.";
                case 1:
                    return "Nobody expects the Spanish Inquisition!";
                case 2:
                    return "He's not the Messiah. He's a very naughty boy!";
                case 3:
                    return "We are the Knights who say... Ni!";
                case 4:
                    return "What have the Romans ever done for us?";
                case 5:
                    return "And now for something completely different.";
            }
            return "FATAL ERROR";
        };
        System.out.println(supp2.get());
~~~
---
### Aufgabe 3:
- Erstelle einen Consumer, der einen übergebenen String in Großbuchstaben ausgibt.
~~~java
// Sebastian Kerler</b>
// ohne Lambda

import java.util.function.Consumer;

Consumer<String> consumer = new Consumer<String>()
{
    @Override
    public void accept(String s)
    {
        System.out.println(s.toUpperCase());
    }
};

// mit lambda
Consumer<String> lambdaConsumer = (s) -> System.out.println(s.toUpperCase());
~~~
---
### Aufgabe 4:
- Erstelle eine Function, die eine Zahl verdoppelt und als String zurückgibt.

---
### Aufgabe 5:
- Erstelle einen Predicate, der prüft, ob eine Zahl größer als 100 ist.

---
### Aufgabe 6:
- Erstelle einen BiFunction, die zwei Zahlen multipliziert.

---
### Aufgabe 7:
- Erstelle einen BiConsumer, der zwei Strings zusammenfügt und ausgibt.

---
### Aufgabe 8:
- Erstelle einen BiPredicate, der prüft, ob zwei Strings gleich sind.

---
### Aufgabe 9:
- Erstelle einen UnaryOperator, der eine Zahl quadriert.

---
### Aufgabe 10:
- Erstelle einen BinaryOperator, der zwei Zahlen subtrahiert.

---
### Aufgabe 11:
- Erstelle ein Runnable, das eine Nachricht auf der Konsole ausgibt.

---
### Aufgabe 12:
- Erstelle einen Supplier, der einen zufälligen String liefert.

---
### Aufgabe 13:
- Erstelle einen Consumer, der einen übergebenen String in Großbuchstaben ausgibt.

---
### Aufgabe 14:
- Erstelle eine Function, die eine Zahl verdoppelt und als String zurückgibt.

---
### Aufgabe 15:
- Erstelle einen Predicate, der prüft, ob eine Zahl größer als 100 ist.

---
### Aufgabe 16:
- Erstelle einen BiFunction, die zwei Zahlen multipliziert.

---
### Aufgabe 17:
- Erstelle einen BiConsumer, der zwei Strings zusammenfügt und ausgibt.

---
### Aufgabe 18:
- Erstelle einen BiPredicate, der prüft, ob zwei Strings gleich sind.

---
### Aufgabe 19:
- Erstelle einen UnaryOperator, der eine Zahl quadriert.

---
### Aufgabe 20:
- Erstelle einen BinaryOperator, der zwei Zahlen subtrahiert.

---
### Aufgabe 21:
- Erstelle ein Runnable, das eine Nachricht auf der Konsole ausgibt.

---
### Aufgabe 22:
- Erstelle einen Supplier, der einen zufälligen String liefert.

---
### Aufgabe 23:
- Erstelle einen Consumer, der einen übergebenen String in Großbuchstaben ausgibt.

---
### Aufgabe 24:
- Erstelle eine Function, die eine Zahl verdoppelt und als String zurückgibt.

---
### Aufgabe 25:
- Erstelle einen Predicate, der prüft, ob eine Zahl größer als 100 ist.

---
### Aufgabe 26:
- Erstelle einen BiFunction, die zwei Zahlen multipliziert.

---
### Aufgabe 27:
- Erstelle einen BiConsumer, der zwei Strings zusammenfügt und ausgibt.

---
### Aufgabe 28:
- Erstelle einen BiPredicate, der prüft, ob zwei Strings gleich sind.

---
### Aufgabe 29:
- Erstelle einen UnaryOperator, der eine Zahl quadriert.

---
### Aufgabe 30:
- Erstelle einen BinaryOperator, der zwei Zahlen subtrahiert.

---
