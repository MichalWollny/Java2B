// 📝 Zusatzaufgabe: Einfaches Formular mit Zusammenfassung

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Zusatzaufgabe_Einfaches_Formular {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Formular");
        JPanel panel = new JPanel(new GridLayout(5, 1));

        JTextField nameField = new JTextField();
        JCheckBox newsletter = new JCheckBox("Newsletter abonnieren");
        JRadioButton weiblich = new JRadioButton("Weiblich");
        JRadioButton maennlich = new JRadioButton("Männlich");
        ButtonGroup geschlecht = new ButtonGroup();
        geschlecht.add(weiblich);
        geschlecht.add(maennlich);
        JButton abschicken = new JButton("Abschicken");

        abschicken.addActionListener(e -> {
            String name = nameField.getText();
            String newsletterStatus = newsletter.isSelected() ? "Ja" : "Nein";
            String geschlechtWahl = weiblich.isSelected() ? "Weiblich" :
                                     maennlich.isSelected() ? "Männlich" : "Keine Angabe";
            JOptionPane.showMessageDialog(frame,
                "Name: " + name + "\nNewsletter: " + newsletterStatus + "\nGeschlecht: " + geschlechtWahl);
        });

        panel.add(new JLabel("Name:"));
        panel.add(nameField);
        panel.add(newsletter);
        panel.add(weiblich);
        panel.add(maennlich);
        panel.add(abschicken);

        frame.add(panel);
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}