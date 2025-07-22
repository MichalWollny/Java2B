# 🎓 Übungsaufgaben: Umwandeln in Lambda-Ausdrücke mit Lösungen

## Aufgabe 1: Comparator umwandeln

### Ausgangscode (ohne Lambda):
~~~java
Comparator<String> comparator = new Comparator<String>() {
    @Override
    public int compare(String s1, String s2) {
        return s1.length() - s2.length();
    }
};
~~~

### Lösung (mit Lambda):
~~~java
Comparator<String> comparator = (s1, s2) -> s1.length() - s2.length();
~~~

---

## Aufgabe 2: Runnable umwandeln

### Ausgangscode:
~~~java
Runnable r = new Runnable() {
    @Override
    public void run() {
        System.out.println("Thread läuft!");
    }
};
~~~

### Lösung mit Lambda:
~~~java
Runnable r = () -> System.out.println("Thread läuft!");
~~~

---

## Aufgabe 3: ActionListener umwandeln

### Ausgangscode:
~~~java
button.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Button gedrückt");
    }
});
~~~

### Lösung mit Lambda:
~~~java
button.addActionListener(e -> System.out.println("Button gedrückt"));
~~~

---

## Aufgabe 4: List sortieren

### Ausgangscode:
~~~java
List<String> liste = Arrays.asList("Banane", "Apfel", "Orange");
Collections.sort(liste, new Comparator<String>() {
    @Override
    public int compare(String o1, String o2) {
        return o1.compareTo(o2);
    }
});
~~~

### Lösung mit Lambda:
~~~java
List<String> liste = Arrays.asList("Banane", "Apfel", "Orange");
Collections.sort(liste, (o1, o2) -> o1.compareTo(o2));
~~~

Oder noch kürzer mit Method Reference:
~~~java
Collections.sort(liste, String::compareTo);
~~~

---

## Aufgabe 5: forEach umwandeln

### Ausgangscode:
~~~java
List<String> namen = Arrays.asList("Anna", "Bob", "Chris");
for (String name : namen) {
    System.out.println("Hallo " + name);
}
~~~

### Lösung mit Lambda:
~~~java
namen.forEach(name -> System.out.println("Hallo " + name));
~~~

Oder Method Reference:
~~~java
namen.forEach(System.out::println);
~~~

---

## Aufgabe 6: Stream filter mit Predicate

### Ausgangscode:
~~~java
List<String> namen = Arrays.asList("Anna", "Bob", "Chris");
List<String> result = new ArrayList<>();
for (String name : namen) {
    if (name.startsWith("A")) {
        result.add(name);
    }
}
~~~

### Lösung mit Lambda und Stream:
~~~java
List<String> result = namen.stream()
    .filter(name -> name.startsWith("A"))
    .collect(Collectors.toList());
~~~

---

## Aufgabe 7: Function Interface

### Ausgangscode:
~~~java
Function<String, Integer> function = new Function<String, Integer>() {
    @Override
    public Integer apply(String s) {
        return s.length();
    }
};
~~~

### Lösung mit Lambda:
~~~java
Function<String, Integer> function = s -> s.length();
~~~