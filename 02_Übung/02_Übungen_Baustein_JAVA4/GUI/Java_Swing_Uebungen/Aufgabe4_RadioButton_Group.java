// 📝 Aufgabe 4: RadioButton + ButtonGroup

import javax.swing.*;
import java.awt.event.*;

public class Aufgabe4_RadioButton_Group {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Aufgabe 4");

        JRadioButton weiblich = new JRadioButton("Weiblich");
        JRadioButton maennlich = new JRadioButton("Männlich");

        ButtonGroup geschlechtGroup = new ButtonGroup();

        geschlechtGroup.add(weiblich);
        geschlechtGroup.add(maennlich);
        
        JButton button = new JButton("Bestätigen");

        button.addActionListener(e -> {
            if (weiblich.isSelected())
                System.out.println("Du hast ausgewählt: Weiblich");
            else if (maennlich.isSelected())
                System.out.println("Du hast ausgewählt: Männlich");
            else
                System.out.println("Keine Auswahl getroffen.");
        });

        JPanel panel = new JPanel();
        panel.add(weiblich);
        panel.add(maennlich);
        panel.add(button);

        frame.add(panel);
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}