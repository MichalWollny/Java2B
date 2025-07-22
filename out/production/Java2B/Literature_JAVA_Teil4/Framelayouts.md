# 📚 Java Swing Frame Layouts – Übersicht mit Code-Beispielen

---

## ✅ Was sind LayoutManager?

In Java Swing steuert der **LayoutManager**, wie Komponenten im Fenster (`JFrame` oder `JPanel`) angeordnet werden.

---

## 📌 Übersicht der wichtigsten LayoutManager

| Layout | Beschreibung |
|---------|---------------------------|
| **FlowLayout** | Komponenten werden von links nach rechts in einer Zeile hinzugefügt. Standard für `JPanel`. |
| **BorderLayout** | Anordnung in 5 Bereiche: `NORTH`, `SOUTH`, `EAST`, `WEST`, `CENTER`. Standard für `JFrame`. |
| **GridLayout** | Gitter (Tabelle), gleiche Größe für alle Zellen. |
| **GridBagLayout** | Flexibles, anpassbares Gitterlayout. Komplex, aber sehr mächtig. |
| **BoxLayout** | Komponenten werden vertikal oder horizontal angeordnet. |
| **CardLayout** | Wechselt zwischen "Karten" (Panel-Ansichten), wie Registerkarten. |

---

## ✅ FlowLayout Beispiel
~~~java
import javax.swing.*;
import java.awt.*;

public class FlowLayoutBeispiel {
    public static void main(String[] args) {
        JFrame frame = new JFrame("FlowLayout");
        frame.setLayout(new FlowLayout());
        frame.setSize(300, 200);

        frame.add(new JButton("Button 1"));
        frame.add(new JButton("Button 2"));
        frame.add(new JButton("Button 3"));

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
~~~

---

## ✅ BorderLayout Beispiel
~~~java
import javax.swing.*;
import java.awt.*;

public class BorderLayoutBeispiel {
    public static void main(String[] args) {
        JFrame frame = new JFrame("BorderLayout");
        frame.setLayout(new BorderLayout());
        frame.setSize(400, 300);

        frame.add(new JButton("NORTH"), BorderLayout.NORTH);
        frame.add(new JButton("SOUTH"), BorderLayout.SOUTH);
        frame.add(new JButton("EAST"), BorderLayout.EAST);
        frame.add(new JButton("WEST"), BorderLayout.WEST);
        frame.add(new JButton("CENTER"), BorderLayout.CENTER);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
~~~

---

## ✅ GridLayout Beispiel
~~~java
import javax.swing.*;
import java.awt.*;

public class GridLayoutBeispiel {
    public static void main(String[] args) {
        JFrame frame = new JFrame("GridLayout");
        frame.setLayout(new GridLayout(2, 2)); // 2 Zeilen, 2 Spalten
        frame.setSize(300, 200);

        frame.add(new JButton("1"));
        frame.add(new JButton("2"));
        frame.add(new JButton("3"));
        frame.add(new JButton("4"));

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
~~~

---

## ✅ BoxLayout Beispiel (vertikal)
~~~java
import javax.swing.*;
import java.awt.*;

public class BoxLayoutBeispiel {
    public static void main(String[] args) {
        JFrame frame = new JFrame("BoxLayout Y_AXIS");
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        panel.add(new JButton("Oben"));
        panel.add(new JButton("Mitte"));
        panel.add(new JButton("Unten"));

        frame.add(panel);
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
~~~

---

## ✅ CardLayout Beispiel (Wechselbare Panels)
~~~java
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CardLayoutBeispiel {
    public static void main(String[] args) {
        JFrame frame = new JFrame("CardLayout");
        JPanel cards = new JPanel(new CardLayout());

        JPanel card1 = new JPanel();
        card1.add(new JLabel("Karte 1"));
        JPanel card2 = new JPanel();
        card2.add(new JLabel("Karte 2"));

        cards.add(card1, "Karte1");
        cards.add(card2, "Karte2");

        JButton button = new JButton("Wechsel Karte");
        button.addActionListener(e -> {
            CardLayout cl = (CardLayout)(cards.getLayout());
            cl.next(cards);
        });

        frame.setLayout(new BorderLayout());
        frame.add(cards, BorderLayout.CENTER);
        frame.add(button, BorderLayout.SOUTH);
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
~~~

---

## 📝 Zusammengefasst:

| Layout | Wann sinnvoll? |
|---------|-------------------------|
| **FlowLayout** | Kleine Tools, Buttons nebeneinander |
| **BorderLayout** | Hauptstrukturierung eines Frames |
| **GridLayout** | Gitter-Formulare, Schachbrett-Layout |
| **BoxLayout** | Vertikale/horizontale Listen |
| **CardLayout** | Panels wechseln (z.B. Tabs) |
| **GridBagLayout** | Komplexe Anordnung mit Flexibilität |

---

✅ **Merksatz**:
> **Ein LayoutManager hilft dir, GUIs ordentlich aufzubauen. Panels können Layouts kombinieren!**

---

