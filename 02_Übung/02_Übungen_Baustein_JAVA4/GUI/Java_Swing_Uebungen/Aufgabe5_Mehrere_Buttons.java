// 📝 Aufgabe 5: ActionListener für mehrere Buttons

import javax.swing.*;
import java.awt.event.*;

public class Aufgabe5_Mehrere_Buttons {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Aufgabe 5");
        JButton start = new JButton("Start");
        JButton stop = new JButton("Stop");
        JButton reset = new JButton("Reset");

        start.addActionListener(e -> System.out.println("Start gedrückt"));
        stop.addActionListener(e -> System.out.println("Stop gedrückt"));
        reset.addActionListener(e -> System.out.println("Reset gedrückt"));

        JPanel panel = new JPanel();
        panel.add(start);
        panel.add(stop);
        panel.add(reset);

        frame.add(panel);
        frame.setSize(300, 150);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}