# 🎓 Java Functional Interfaces – Runnable, Consumer, Supplier

In diesem Dokument findest du ausführliche Erklärungen und Beispiele zu den drei häufigsten Functional Interfaces in Java.

---

## 🟣 Runnable

### ✅ Was ist Runnable?
- `Runnable` ist ein Functional Interface mit genau einer Methode: `void run()`.
- Es benötigt keine Eingabeparameter und gibt keinen Wert zurück.
- Wird häufig bei Threads verwendet.

### 🧩 Syntax:
```java
@FunctionalInterface
public interface Runnable {
    void run();
}
```

### 💡 Beispiel ohne Lambda (anonyme Klasse):
```java
Runnable runnable = new Runnable() {
    @Override
    public void run() {
        System.out.println("Runnable läuft ohne Lambda!");
    }
};
runnable.run();
```

### 💡 Beispiel mit Lambda:
```java
Runnable runnableLambda = () -> System.out.println("Runnable läuft mit Lambda!");
runnableLambda.run();
```

---

## 🟢 Consumer

### ✅ Was ist Consumer?
- `Consumer<T>` ist ein Functional Interface mit einer Methode: `void accept(T t)`.
- Es nimmt einen Eingabewert entgegen und gibt nichts zurück.
- Wird häufig zum Verarbeiten von Daten verwendet (z.B. in Streams).

### 🧩 Syntax:
```java
@FunctionalInterface
public interface Consumer<T> {
    void accept(T t);
}
```

### 💡 Beispiel ohne Lambda (anonyme Klasse):
```java
Consumer<String> consumer = new Consumer<String>() {
    @Override
    public void accept(String s) {
        System.out.println("Verbraucht: " + s);
    }
};
consumer.accept("Hallo Welt");
```

### 💡 Beispiel mit Lambda:
```java
Consumer<String> consumerLambda = s -> System.out.println("Verbraucht (Lambda): " + s);
consumerLambda.accept("Hallo Lambda");
```

---

## 🟡 Supplier

### ✅ Was ist Supplier?
- `Supplier<T>` ist ein Functional Interface mit einer Methode: `T get()`.
- Es benötigt keine Eingabewerte und liefert einen Rückgabewert.
- Wird verwendet, um Daten zu „liefern“ oder zu „produzieren“.

### 🧩 Syntax:
```java
@FunctionalInterface
public interface Supplier<T> {
    T get();
}
```

### 💡 Beispiel ohne Lambda (anonyme Klasse):
```java
Supplier<String> supplier = new Supplier<String>() {
    @Override
    public String get() {
        return "Hallo vom Supplier ohne Lambda";
    }
};
System.out.println(supplier.get());
```

### 💡 Beispiel mit Lambda:
```java
Supplier<String> supplierLambda = () -> "Hallo vom Supplier mit Lambda";
System.out.println(supplierLambda.get());
```

---

## 📌 Zusammenfassung

| Interface  | Eingabe      | Rückgabewert       | Anwendungsfall                     |
|-------------|----------------|-----------------------|----------------------------------------|
| Runnable    | ❌ keine        | ❌ void                 | Codeblock ausführen (z.B. Thread)       |
| Consumer    | ✅ 1 Eingabe    | ❌ void                 | Daten „verbrauchen“ (z.B. Streams)      |
| Supplier    | ❌ keine        | ✅ 1 Rückgabewert       | Daten „liefern“ oder generieren         |

---

✅ **Übungstipp**: Versuche bei jedem Beispiel zuerst eine anonyme Klasse zu schreiben und diese dann in eine Lambda-Ausdruck umzuwandeln.

