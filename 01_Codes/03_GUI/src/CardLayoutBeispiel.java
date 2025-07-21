import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CardLayoutBeispiel {
    public static void main(String[] args) {
        // Erstelle das Hauptfenster (Frame)
        JFrame frame = new JFrame("CardLayout Beispiel");

        // Erstelle ein JPanel mit CardLayout, um mehrere Karten (Panels) übereinander zu legen
        JPanel cards = new JPanel(new CardLayout());

        // Erste Karte mit Label "Karte 1"
        JPanel card1 = new JPanel();
        card1.add(new JLabel("Karte 1"));

        // Zweite Karte mit Label "Karte 2"
        JPanel card2 = new JPanel();
        card2.add(new JLabel("Karte 2"));

        // Karten zum CardLayout-Panel hinzufügen
        cards.add(card1, "Karte1");  // Name der Karte: "Karte1"
        cards.add(card2, "Karte2");  // Name der Karte: "Karte2"

        // Button, um zwischen den Karten zu wechseln
        JButton button = new JButton("Wechsel Karte");

        // ActionListener für den Button: bei Klick wird zur nächsten Karte gewechselt
        button.addActionListener(e -> {
            // CardLayout holen und zur nächsten Karte springen
            CardLayout cl = (CardLayout) (cards.getLayout());
            cl.next(cards);
        });

        // Layout des Frames auf BorderLayout setzen
        frame.setLayout(new BorderLayout());
        // Karten in die Mitte (CENTER), Button nach unten (SOUTH)
        frame.add(cards, BorderLayout.CENTER);
        frame.add(button, BorderLayout.SOUTH);

        // Frame-Größe, Schließen-Operation und Sichtbarkeit setzen
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
