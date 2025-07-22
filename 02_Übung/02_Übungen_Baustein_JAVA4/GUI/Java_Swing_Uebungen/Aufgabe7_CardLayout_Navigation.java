// 📝 Aufgabe 7: CardLayout Navigation zwischen drei Seiten

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Aufgabe7_CardLayout_Navigation {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Aufgabe 7");
        JPanel cards = new JPanel(new CardLayout());

        JPanel seite1 = new JPanel(); seite1.add(new JLabel("Seite 1"));
        JPanel seite2 = new JPanel(); seite2.add(new JLabel("Seite 2"));
        JPanel seite3 = new JPanel(); seite3.add(new JLabel("Seite 3"));

        cards.add(seite1, "1");
        cards.add(seite2, "2");
        cards.add(seite3, "3");

        CardLayout cl = (CardLayout)(cards.getLayout());

        JButton weiter = new JButton("Weiter");
        JButton zurueck = new JButton("Zurück");

        weiter.addActionListener(e -> cl.next(cards));
        zurueck.addActionListener(e -> cl.previous(cards));

        JPanel controlPanel = new JPanel();
        controlPanel.add(zurueck);
        controlPanel.add(weiter);

        frame.setLayout(new BorderLayout());
        frame.add(cards, BorderLayout.CENTER);
        frame.add(controlPanel, BorderLayout.SOUTH);

        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}