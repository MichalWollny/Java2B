# 📖 Java – Vordefinierte Functional Interfaces erklärt (mit & ohne Lambda)

## ✅ Was sind Functional Interfaces?

Functional Interfaces sind spezielle Interfaces in Java, die **nur eine einzige abstrakte Methode** besitzen. Sie werden besonders oft mit **Lambda-Ausdrücken** verwendet.

Das Paket `java.util.function` stellt viele solcher Interfaces bereit.

---

## ✅ Übersicht der wichtigsten Functional Interfaces

| Interface               | Signatur                        | Erklärung                                            |
|--------------------------|----------------------------------|------------------------------------------------------|
| `Runnable`               | `void run()`                    | Führt Code aus, ohne Eingabe oder Rückgabe           |
| `Supplier<T>`            | `T get()`                       | Gibt einen Wert vom Typ `T` zurück                   |
| `Consumer<T>`            | `void accept(T t)`              | Verbraucht `T`, gibt nichts zurück                   |
| `Function<T, R>`         | `R apply(T t)`                  | Wandelt `T` in `R` um                                |
| `Predicate<T>`           | `boolean test(T t)`             | Prüft Bedingung für `T`, liefert true oder false    |
| `BiFunction<T,U,R>`      | `R apply(T t, U u)`             | Zwei Eingaben → Ergebnis                             |
| `BiConsumer<T,U>`        | `void accept(T t, U u)`         | Verbraucht zwei Werte, gibt nichts zurück            |
| `BiPredicate<T,U>`       | `boolean test(T t, U u)`        | Prüft eine Bedingung mit zwei Eingaben               |
| `UnaryOperator<T>`       | `T apply(T t)`                  | Spezialfall von Function: T → T                      |
| `BinaryOperator<T>`      | `T apply(T t, T u)`             | Spezialfall von BiFunction: (T, T) → T               |

---

## ✅ Beispiele mit und ohne Lambda

### 🎁 Beispiel 1: Function<Integer, String>

```java
import java.util.function.Function;

// Ohne Lambda (anonyme Klasse)
Function<Integer, String> ohneLambda = new Function<Integer, String>() {
    @Override
    public String apply(Integer i) {
        return "Ergebnis: " + (i * 2);
    }
};

// Mit Lambda
Function<Integer, String> mitLambda = i -> "Ergebnis: " + (i * 2);
```

### 🎁 Beispiel 2: Predicate<Integer>

```java
import java.util.function.Predicate;

// Ohne Lambda
Predicate<Integer> ohneLambda = new Predicate<Integer>() {
    @Override
    public boolean test(Integer i) {
        return i > 0;
    }
};

// Mit Lambda
Predicate<Integer> mitLambda = i -> i > 0;
```

### 🎁 Beispiel 3: Supplier<Double>

```java
import java.util.function.Supplier;

// Ohne Lambda
Supplier<Double> ohneLambda = new Supplier<Double>() {
    @Override
    public Double get() {
        return Math.random();
    }
};

// Mit Lambda
Supplier<Double> mitLambda = () -> Math.random();
```

### 🎁 Beispiel 4: Consumer<String>

```java
import java.util.function.Consumer;

// Ohne Lambda
Consumer<String> ohneLambda = new Consumer<String>() {
    @Override
    public void accept(String s) {
        System.out.println(s.toUpperCase());
    }
};

// Mit Lambda
Consumer<String> mitLambda = s -> System.out.println(s.toUpperCase());
```

### 🎁 Beispiel 5: BinaryOperator<Integer>

```java
import java.util.function.BinaryOperator;

// Ohne Lambda
BinaryOperator<Integer> ohneLambda = new BinaryOperator<Integer>() {
    @Override
    public Integer apply(Integer a, Integer b) {
        return a + b;
    }
};

// Mit Lambda
BinaryOperator<Integer> mitLambda = (a, b) -> a + b;
```

---

## ✅ Warum Functional Interfaces nutzen?
- ✅ Kompaktere Syntax mit Lambda

- ✅ Typensicherheit durch Generics

- ✅ Schnellere Lesbarkeit bei kurzen Operationen


---

## 🎁 Merksatz:
„Functional Interfaces helfen dir, mit weniger Code mehr Funktionalität zu erreichen.“ ✅