# 🎓 Java Functional Interfaces – 30 Beispiele zum Üben von Lambda-Ausdrücken

## 💡 Hinweis:
In jeder Aufgabe gibt es zwei Beispiele:
- ✅ **Ohne Lambda** (anonyme Klasse)
- ✅ **Mit Lambda** (Lambda-Ausdruck)

---

### Beispiel 1: Runnable

#### 🟣 Ohne Lambda:
```java
Runnable example1 = new Runnable() {
    @Override
    public run() {
        System.out.println("Runnable läuft");
    }
};
```


#### 🟢 Mit Lambda:
```java
Runnable exampleLambda1 = () -> {
    System.out.println("Runnable läuft");
};
```
---

### Beispiel 2: Supplier<String>

#### 🟣 Ohne Lambda:
```java
Supplier<String> example2 = new Supplier<String>() {
    @Override
    public String get() {
        return "Hallo von Supplier";
    }
};
```

#### 🟢 Mit Lambda:
```java
Supplier<String> exampleLambda2 = () -> {
    return "Hallo von Supplier";
};
```
---

### Beispiel 3: Consumer<String>

#### 🟣 Ohne Lambda:
```java
Consumer<String> example3 = new Consumer<String>() {
    @Override
    public accept(String s) {
        System.out.println("Verbraucht: " + s);
    }
};
```

#### 🟢 Mit Lambda:
```java
Consumer<String> exampleLambda3 = () -> {
    System.out.println("Verbraucht: " + s);
};
```
---

### Beispiel 4: Function<Integer, String>

#### 🟣 Ohne Lambda:
```java
Function<Integer, String> example4 = new Function<Integer, String>() {
    @Override
    public String apply(Integer i) {
        return "Zahl: " + i;
    }
};
```

#### 🟢 Mit Lambda:
```java
Function<Integer, String> exampleLambda4 = () -> {
    return "Zahl: " + i;
};
```
---

### Beispiel 5: Predicate<Integer>

#### 🟣 Ohne Lambda:
```java
Predicate<Integer> example5 = new Predicate<Integer>() {
    @Override
    public boolean test(Integer i) {
        return i > 10;
    }
};
```

#### 🟢 Mit Lambda:
```java
Predicate<Integer> exampleLambda5 = () -> {
    return i > 10;
};
```
---

### Beispiel 6: BiFunction<Integer, Integer, Integer>

#### 🟣 Ohne Lambda:
```java
BiFunction<Integer, Integer, Integer> example6 = new BiFunction<Integer, Integer, Integer>() {
    @Override
    public Integer apply(Integer a, Integer b) {
        return a + b;
    }
};
```

#### 🟢 Mit Lambda:
```java
BiFunction<Integer, Integer, Integer> exampleLambda6 = () -> {
    return a + b;
};
```
---

### Beispiel 7: BiConsumer<String, Integer>

#### 🟣 Ohne Lambda:
```java
BiConsumer<String, Integer> example7 = new BiConsumer<String, Integer>() {
    @Override
    public accept(String s, Integer i) {
        System.out.println(s + ": " + i);
    }
};
```

#### 🟢 Mit Lambda:
```java
BiConsumer<String, Integer> exampleLambda7 = () -> {
    System.out.println(s + ": " + i);
};
```
---

### Beispiel 8: BiPredicate<String, String>

#### 🟣 Ohne Lambda:
```java
BiPredicate<String, String> example8 = new BiPredicate<String, String>() {
    @Override
    public boolean test(String s1, String s2) {
        return s1.equalsIgnoreCase(s2);
    }
};
```

#### 🟢 Mit Lambda:
```java
BiPredicate<String, String> exampleLambda8 = () -> {
    return s1.equalsIgnoreCase(s2);
};
```
---

### Beispiel 9: UnaryOperator<Integer>

#### 🟣 Ohne Lambda:
```java
UnaryOperator<Integer> example9 = new UnaryOperator<Integer>() {
    @Override
    public Integer apply(Integer i) {
        return i * i;
    }
};
```

#### 🟢 Mit Lambda:
```java
UnaryOperator<Integer> exampleLambda9 = () -> {
    return i * i;
};
```
---

### Beispiel 10: BinaryOperator<Integer>

#### 🟣 Ohne Lambda:
```java
BinaryOperator<Integer> example10 = new BinaryOperator<Integer>() {
    @Override
    public Integer apply(Integer a, Integer b) {
        return a * b;
    }
};
```

#### 🟢 Mit Lambda:
```java
BinaryOperator<Integer> exampleLambda10 = () -> {
    return a * b;
};
```
---

### Beispiel 11: Runnable

#### 🟣 Ohne Lambda:
```java
Runnable example11 = new Runnable() {
    @Override
    public run() {
        System.out.println("Runnable läuft");
    }
};
```

#### 🟢 Mit Lambda:
```java
Runnable exampleLambda11 = () -> {
    System.out.println("Runnable läuft");
};
```
---

### Beispiel 12: Supplier<String>

#### 🟣 Ohne Lambda:
```java
Supplier<String> example12 = new Supplier<String>() {
    @Override
    public String get() {
        return "Hallo von Supplier";
    }
};
```

#### 🟢 Mit Lambda:
```java
Supplier<String> exampleLambda12 = () -> {
    return "Hallo von Supplier";
};
```
---

### Beispiel 13: Consumer<String>

#### 🟣 Ohne Lambda:
```java
Consumer<String> example13 = new Consumer<String>() {
    @Override
    public accept(String s) {
        System.out.println("Verbraucht: " + s);
    }
};
```

#### 🟢 Mit Lambda:
```java
Consumer<String> exampleLambda13 = () -> {
    System.out.println("Verbraucht: " + s);
};
```
---

### Beispiel 14: Function<Integer, String>

#### 🟣 Ohne Lambda:
```java
Function<Integer, String> example14 = new Function<Integer, String>() {
    @Override
    public String apply(Integer i) {
        return "Zahl: " + i;
    }
};
```

#### 🟢 Mit Lambda:
```java
Function<Integer, String> exampleLambda14 = () -> {
    return "Zahl: " + i;
};
```
---

### Beispiel 15: Predicate<Integer>

#### 🟣 Ohne Lambda:
```java
Predicate<Integer> example15 = new Predicate<Integer>() {
    @Override
    public boolean test(Integer i) {
        return i > 10;
    }
};
```

#### 🟢 Mit Lambda:
```java
Predicate<Integer> exampleLambda15 = () -> {
    return i > 10;
};
```
---

### Beispiel 16: BiFunction<Integer, Integer, Integer>

#### 🟣 Ohne Lambda:
```java
BiFunction<Integer, Integer, Integer> example16 = new BiFunction<Integer, Integer, Integer>() {
    @Override
    public Integer apply(Integer a, Integer b) {
        return a + b;
    }
};
```

#### 🟢 Mit Lambda:
```java
BiFunction<Integer, Integer, Integer> exampleLambda16 = () -> {
    return a + b;
};
```
---

### Beispiel 17: BiConsumer<String, Integer>

#### 🟣 Ohne Lambda:
```java
BiConsumer<String, Integer> example17 = new BiConsumer<String, Integer>() {
    @Override
    public accept(String s, Integer i) {
        System.out.println(s + ": " + i);
    }
};
```

#### 🟢 Mit Lambda:
```java
BiConsumer<String, Integer> exampleLambda17 = () -> {
    System.out.println(s + ": " + i);
};
```
---

### Beispiel 18: BiPredicate<String, String>

#### 🟣 Ohne Lambda:
```java
BiPredicate<String, String> example18 = new BiPredicate<String, String>() {
    @Override
    public boolean test(String s1, String s2) {
        return s1.equalsIgnoreCase(s2);
    }
};
```

#### 🟢 Mit Lambda:
```java
BiPredicate<String, String> exampleLambda18 = () -> {
    return s1.equalsIgnoreCase(s2);
};
```
---

### Beispiel 19: UnaryOperator<Integer>

#### 🟣 Ohne Lambda:
```java
UnaryOperator<Integer> example19 = new UnaryOperator<Integer>() {
    @Override
    public Integer apply(Integer i) {
        return i * i;
    }
};
```

#### 🟢 Mit Lambda:
```java
UnaryOperator<Integer> exampleLambda19 = () -> {
    return i * i;
};
```
---

### Beispiel 20: BinaryOperator<Integer>

#### 🟣 Ohne Lambda:
```java
BinaryOperator<Integer> example20 = new BinaryOperator<Integer>() {
    @Override
    public Integer apply(Integer a, Integer b) {
        return a * b;
    }
};
```

#### 🟢 Mit Lambda:
```java
BinaryOperator<Integer> exampleLambda20 = () -> {
    return a * b;
};
```
---

### Beispiel 21: Runnable

#### 🟣 Ohne Lambda:
```java
Runnable example21 = new Runnable() {
    @Override
    public run() {
        System.out.println("Runnable läuft");
    }
};
```

#### 🟢 Mit Lambda:
```java
Runnable exampleLambda21 = () -> {
    System.out.println("Runnable läuft");
};
```
---

### Beispiel 22: Supplier<String>

#### 🟣 Ohne Lambda:
```java
Supplier<String> example22 = new Supplier<String>() {
    @Override
    public String get() {
        return "Hallo von Supplier";
    }
};
```

#### 🟢 Mit Lambda:
```java
Supplier<String> exampleLambda22 = () -> {
    return "Hallo von Supplier";
};
```
---

### Beispiel 23: Consumer<String>

#### 🟣 Ohne Lambda:
```java
Consumer<String> example23 = new Consumer<String>() {
    @Override
    public accept(String s) {
        System.out.println("Verbraucht: " + s);
    }
};
```

#### 🟢 Mit Lambda:
```java
Consumer<String> exampleLambda23 = () -> {
    System.out.println("Verbraucht: " + s);
};
```
---

### Beispiel 24: Function<Integer, String>

#### 🟣 Ohne Lambda:
```java
Function<Integer, String> example24 = new Function<Integer, String>() {
    @Override
    public String apply(Integer i) {
        return "Zahl: " + i;
    }
};
```

#### 🟢 Mit Lambda:
```java
Function<Integer, String> exampleLambda24 = () -> {
    return "Zahl: " + i;
};
```
---

### Beispiel 25: Predicate<Integer>

#### 🟣 Ohne Lambda:
```java
Predicate<Integer> example25 = new Predicate<Integer>() {
    @Override
    public boolean test(Integer i) {
        return i > 10;
    }
};
```

#### 🟢 Mit Lambda:
```java
Predicate<Integer> exampleLambda25 = () -> {
    return i > 10;
};
```
---

### Beispiel 26: BiFunction<Integer, Integer, Integer>

#### 🟣 Ohne Lambda:
```java
BiFunction<Integer, Integer, Integer> example26 = new BiFunction<Integer, Integer, Integer>() {
    @Override
    public Integer apply(Integer a, Integer b) {
        return a + b;
    }
};
```

#### 🟢 Mit Lambda:
```java
BiFunction<Integer, Integer, Integer> exampleLambda26 = () -> {
    return a + b;
};
```
---

### Beispiel 27: BiConsumer<String, Integer>

#### 🟣 Ohne Lambda:
```java
BiConsumer<String, Integer> example27 = new BiConsumer<String, Integer>() {
    @Override
    public accept(String s, Integer i) {
        System.out.println(s + ": " + i);
    }
};
```

#### 🟢 Mit Lambda:
```java
BiConsumer<String, Integer> exampleLambda27 = () -> {
    System.out.println(s + ": " + i);
};
```
---

### Beispiel 28: BiPredicate<String, String>

#### 🟣 Ohne Lambda:
```java
BiPredicate<String, String> example28 = new BiPredicate<String, String>() {
    @Override
    public boolean test(String s1, String s2) {
        return s1.equalsIgnoreCase(s2);
    }
};
```

#### 🟢 Mit Lambda:
```java
BiPredicate<String, String> exampleLambda28 = () -> {
    return s1.equalsIgnoreCase(s2);
};
```
---

### Beispiel 29: UnaryOperator<Integer>

#### 🟣 Ohne Lambda:
```java
UnaryOperator<Integer> example29 = new UnaryOperator<Integer>() {
    @Override
    public Integer apply(Integer i) {
        return i * i;
    }
};
```

#### 🟢 Mit Lambda:
```java
UnaryOperator<Integer> exampleLambda29 = () -> {
    return i * i;
};
```
---

### Beispiel 30: BinaryOperator<Integer>

#### 🟣 Ohne Lambda:
```java
BinaryOperator<Integer> example30 = new BinaryOperator<Integer>() {
    @Override
    public Integer apply(Integer a, Integer b) {
        return a * b;
    }
};
```

#### 🟢 Mit Lambda:
```java
BinaryOperator<Integer> exampleLambda30 = () -> {
    return a * b;
};
```
---
