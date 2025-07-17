# 🎓 Java Functional Interfaces – Lösungen mit selbst definierten Interfaces

---

## 💡 Anweisung:

Für jede Aufgabe jeweils zwei Implementierungen:

- ✅ **Ohne Lambda-Ausdruck** (anonyme Klasse)
- ✅ **Mit Lambda-Ausdruck**
- ❗ Ohne Nutzung von `java.util.function`, sondern mit eigenen Interfaces

---

## ✅ Beispiel Interface-Definitionen

```java
interface MeinRunnable {
    void ausführen();
}

interface MeinSupplier<T> {
    T get();
}

interface MeinConsumer<T> {
    void akzeptieren(T t);
}

interface MeineFunction<T, R> {
    R anwenden(T t);
}

interface MeinPredicate<T> {
    boolean prüfen(T t);
}

interface MeineBiFunction<T, U, R> {
    R anwenden(T t, U u);
}

interface MeinBiConsumer<T, U> {
    void akzeptieren(T t, U u);
}

interface MeinBiPredicate<T, U> {
    boolean prüfen(T t, U u);
}

interface MeinUnaryOperator<T> {
    T anwenden(T t);
}

interface MeinBinaryOperator<T> {
    T anwenden(T t, T u);
}
```

---

## ✅ Aufgabe 1: MeinRunnable

```java
MeinRunnable r1 = new MeinRunnable() {
    @Override
    public void ausführen() {
        System.out.println("Aufgabe 1 ohne Lambda");
    }
};
MeinRunnable r2 = () -> System.out.println("Aufgabe 1 mit Lambda");
```

## ✅ Aufgabe 2: MeinSupplier

```java
MeinSupplier<String> supplier1 = new MeinSupplier<String>() {
    @Override
    public String get() {
        return "Aufgabe 2 ohne Lambda";
    }
};
MeinSupplier<String> supplier2 = () -> "Aufgabe 2 mit Lambda";
```

## ✅ Aufgabe 3: MeinConsumer

```java
MeinConsumer<String> consumer1 = new MeinConsumer<String>() {
    @Override
    public void akzeptieren(String s) {
        System.out.println(s.toUpperCase());
    }
};
MeinConsumer<String> consumer2 = s -> System.out.println(s.toUpperCase());
```

## ✅ Aufgabe 4: MeineFunction

```java
MeineFunction<Integer, String> function1 = new MeineFunction<Integer, String>() {
    @Override
    public String anwenden(Integer t) {
        return "Aufgabe 4 Ergebnis: " + (t * 2);
    }
};
MeineFunction<Integer, String> function2 = t -> "Aufgabe 4 Ergebnis: " + (t * 2);
```

## ✅ Aufgabe 5: MeinPredicate

```java
MeinPredicate<Integer> predicate1 = new MeinPredicate<Integer>() {
    @Override
    public boolean prüfen(Integer t) {
        return t > 100;
    }
};
MeinPredicate<Integer> predicate2 = t -> t > 100;
```

## ✅ Aufgabe 6: MeineBiFunction

```java
MeineBiFunction<Integer, Integer, Integer> biFunction1 = new MeineBiFunction<Integer, Integer, Integer>() {
    @Override
    public Integer anwenden(Integer t, Integer u) {
        return t * u;
    }
};
MeineBiFunction<Integer, Integer, Integer> biFunction2 = (t, u) -> t * u;
```

## ✅ Aufgabe 7: MeinBiConsumer

```java
MeinBiConsumer<String, String> biConsumer1 = new MeinBiConsumer<String, String>() {
    @Override
    public void akzeptieren(String t, String u) {
        System.out.println(t + u);
    }
};
MeinBiConsumer<String, String> biConsumer2 = (t, u) -> System.out.println(t + u);
```

## ✅ Aufgabe 8: MeinBiPredicate

```java
MeinBiPredicate<String, String> biPredicate1 = new MeinBiPredicate<String, String>() {
    @Override
    public boolean prüfen(String t, String u) {
        return t.equals(u);
    }
};
MeinBiPredicate<String, String> biPredicate2 = (t, u) -> t.equals(u);
```

## ✅ Aufgabe 9: MeinUnaryOperator

```java
MeinUnaryOperator<Integer> unaryOperator1 = new MeinUnaryOperator<Integer>() {
    @Override
    public Integer anwenden(Integer t) {
        return t * t;
    }
};
MeinUnaryOperator<Integer> unaryOperator2 = t -> t * t;
```

## ✅ Aufgabe 10: MeinBinaryOperator

```java
MeinBinaryOperator<Integer> binaryOperator1 = new MeinBinaryOperator<Integer>() {
    @Override
    public Integer anwenden(Integer t, Integer u) {
        return t - u;
    }
};
MeinBinaryOperator<Integer> binaryOperator2 = (t, u) -> t - u;
```

## ✅ Aufgaben 11 bis 30:



