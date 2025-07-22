# Einführung in Markdown: Dokumentation leicht gemacht

## Was ist Markdown
**Markdown** ist eine leichtgewichtige Markup-Sprache, die entwickelt wurde, 
um Klartext in ein formatierbares Dokument umzuwandeln. 
Es ist einfach zu lesen und zu schreiben und wird oft für die Erstellung 
von Dokumentationen, Blogs, und README-Dateien verwendet. 
Markdown-Dateien haben in der Regel die Erweiterung `.md` oder `.markdown`.

---

## Vorteile von Markdown für die Dokumentation

1. **Einfache Syntax**:

    - Markdown ist intuitiv und leicht zu erlernen, auch für Anfänger.
    - Keine komplexen Tools oder Formatierungen nötig.
   
2. **Plattformunabhängigkeit**:
    - Markdown-Dokumente können in vielen Umgebungen angezeigt werden, z. B. GitHub, VSCode, Webbrowser, etc.

3. **Flexibilität**:
    - Markdown unterstützt verschiedene Inhalte wie Text, Tabellen, Bilder, Codeblöcke und Listen.
    - Kann in verschiedene Formate wie HTML, PDF und Word konvertiert werden.

4. **Vielseitigkeit**:
    - Perfekt für technische Dokumentationen, Blogs, Notizen oder Präsentationen.

---
# Handout: Professionelles Markdown-Schreiben
## 1. Textformatierung
### **Fett und Kursiv**
~~~markdown
*kursiv*
**fett**
***kursiv und fett***
~~~
*name*

**name**

***name***
### **Überschriften**
~~~markdown
# Hauptüberschrift (H1)
## Unterüberschrift (H2)
### Kleinere Überschrift (H3)
#### Noch kleinere Überschrift (H4)
~~~
# Hauptüberschrift (H1)
## Unterüberschrift (H2)
### Kleinere Überschrift (H3)
#### Noch kleinere Überschrift (H4)
### Zitate
>Zitat von Nils :-)
### **Listen**
- Ungeordnete Listen:
~~~markdown
- Element 1
- Element 2
  - Unterelement
~~~
- Element 1
- Element 2
    - Unterelement

- Geordnete Listen:
~~~markdown
1. Erster Punkt
2. Zweiter Punkt
3. Dritter Punkt
~~~
1. Erster Punkt
2. Zweiter Punkt
3. Dritter Punkt

---
## 2. Links und Bilder

### **Links**
~~~markdown
[Linktext](https://example.com)
~~~

### **Bilder**
~~~markdown
![Alternativtext](https://example.com/bild.jpg)
~~~
![image 1](Ernaehrungsberatung.jpg)
---
## 3. Tabellen
~~~markdown
| Spalte 1 | Spalte 2 | Spalte 3 |
|----------|----------|----------|
| Wert 1   | Wert 2   | Wert 3   |
| Wert A   | Wert B   | Wert C   |
~~~
| Name | alter | ort     |
|------|-------|---------|
| thom | 20    | Berlin  |
| tani | 32    | Hamburg |

---
## 4. Codeblöcke und Inline-Code

### **Codeblöcke**:
~~~java
public static void main(String[] args) {
    
}

~~~
~~~java
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hallo Welt!");
    }
}

~~~
~~~python
print("Hallo Welt"")
~~~





























     

