// 📝 Aufgabe 6: Farbiges Panel mit Buttons zur Farbauswahl

import javax.swing.*;
import java.awt.*;

public class Aufgabe6_Farbwechsel_Panel {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Aufgabe 6");
        JPanel panel = new JPanel(new BorderLayout());

        JPanel buttonPanel = new JPanel();
        JButton rot = new JButton("Rot");
        JButton gruen = new JButton("Grün");
        JButton blau = new JButton("Blau");

        buttonPanel.add(rot);
        buttonPanel.add(gruen);
        buttonPanel.add(blau);

        rot.addActionListener(e -> panel.setBackground(Color.RED));
        gruen.addActionListener(e -> panel.setBackground(Color.GREEN));
        blau.addActionListener(e -> panel.setBackground(Color.BLUE));

        frame.add(panel, BorderLayout.CENTER);
        frame.add(buttonPanel, BorderLayout.SOUTH);
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}