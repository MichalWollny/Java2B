# Java Swing ActionListener Methoden – Überblick und Beispiele

Java Swing verwendet **ActionListener**, um Benutzerinteraktionen wie Button-Klicks, Menüauswahlen oder andere Aktionen zu verarbeiten.

---

## 📌 Wichtigste Methode

~~~java
import javax.swing.*;
import java.awt.event.*;

public class ActionListenerBeispiel {
    public static void main(String[] args) {
        JFrame frame = new JFrame("ActionListener Beispiel");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);

        JButton button = new JButton("Klick mich");

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Button wurde geklickt!");
            }
        });

        frame.add(button);
        frame.setVisible(true);
    }
}
~~~
~~~java
import javax.swing.*;

public class LambdaBeispiel {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Lambda ActionListener");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);

        JButton button = new JButton("Lambda Klick");
        button.addActionListener(e -> System.out.println("Lambda Klick erfolgt!"));

        frame.add(button);
        frame.setVisible(true);
    }
}

~~~
