// 📝 Aufgabe 2: Zwei Panels mit unterschiedlichen Layouts

import javax.swing.*;
import java.awt.*;

public class Aufgabe2_Zwei_Panels {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Aufgabe 2");
        frame.setLayout(new BorderLayout());

        // Oben: FlowLayout mit 3 Buttons
        JPanel topPanel = new JPanel(new FlowLayout());
        topPanel.add(new JButton("Button 1"));
        topPanel.add(new JButton("Button 2"));
        topPanel.add(new JButton("Button 3"));

        // Mitte: GridLayout 2x2
        JPanel centerPanel = new JPanel(new GridLayout(2, 2));
        centerPanel.add(new JButton("Feld 1"));
        centerPanel.add(new JButton("Feld 2"));
        centerPanel.add(new JButton("Feld 3"));
        centerPanel.add(new JButton("Feld 4"));

        frame.add(topPanel, BorderLayout.NORTH);
        frame.add(centerPanel, BorderLayout.CENTER);
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}