// 📝 Aufgabe 3: Checkbox Auswahl mit Konsolenausgabe

import javax.swing.*;
import java.awt.event.*;

public class Aufgabe3_Checkbox_Auswahl {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Aufgabe 3");
        JCheckBox pizza = new JCheckBox("Pizza");
        JCheckBox burger = new JCheckBox("Burger");
        JButton button = new JButton("Auswählen");

        button.addActionListener(e -> {
            StringBuilder auswahl = new StringBuilder("Du hast ausgewählt: ");
            if (pizza.isSelected()) auswahl.append("Pizza ");
            if (burger.isSelected()) auswahl.append("Burger ");
            System.out.println(auswahl);
        });

        JPanel panel = new JPanel();
        panel.add(pizza);
        panel.add(burger);
        panel.add(button);

        frame.add(panel);
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}