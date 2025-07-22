// 📝 Aufgabe 1: Button & Frame
// Einfache GUI mit Button und MessageDialog

import javax.swing.*;
import java.awt.event.*;

public class Aufgabe1_Button_Frame {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Aufgabe 1");
        JButton button = new JButton("Klick mich!");
        
        // ActionListener für Button
        button.addActionListener(e -> JOptionPane.showMessageDialog(frame, "Hallo, du hast geklickt"));
        
        frame.add(button);
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}