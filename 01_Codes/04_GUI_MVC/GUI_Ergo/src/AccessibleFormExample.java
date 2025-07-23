import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class AccessibleFormExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Barrierefreies Formular");
        JPanel panel = new JPanel();
        panel.setBackground(Color.WHITE); // guter Kontrast zu schwarzer Schrift

        // Name Label mit Mnemonic und Verknüpfung zum Textfeld
        JLabel nameLabel = new JLabel("Name:");
        nameLabel.setDisplayedMnemonic('N');

        JTextField nameField = new JTextField(20);
        nameLabel.setLabelFor(nameField);
        nameField.setToolTipText("Geben Sie hier Ihren Namen ein");
        nameField.setForeground(Color.BLACK); // guter Textkontrast
        nameField.setBackground(Color.LIGHT_GRAY); // gut sichtbar

        // Button mit Mnemonic, Tooltip und ActionListener
        JButton submitButton = new JButton("OK");
        submitButton.setMnemonic('O');// Alt + O aktiviert den Button
        submitButton.setToolTipText("Bestätigen Sie die Eingabe");

        // ActionListener reagiert auf Button-Klick oder Alt+O
        submitButton.addActionListener((ActionEvent e) -> {
            String name = nameField.getText().trim();
            if (!name.isEmpty()) {
                JOptionPane.showMessageDialog(frame,
                    "Willkommen, " + name + "!", "Bestätigung", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(frame,
                    "Bitte geben Sie Ihren Namen ein.", "Hinweis", JOptionPane.WARNING_MESSAGE);
            }
        });

        panel.add(nameLabel);
        panel.add(nameField);
        panel.add(submitButton);

        frame.add(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setLocationRelativeTo(null); // zentriert das Fenster
        frame.setVisible(true);
    }
}

/*
Die Methode setMnemonic(char mnemonic) in Java Swing wird verwendet,
um Tastenkürzel (Keyboard Shortcuts) für Komponenten wie Buttons,
Labels oder Menüpunkte zu definieren.
Das ist ein wichtiges Element für barrierefreies und
effizientes GUI-Design, da Nutzer damit Elemente
per Tastatur aktivieren können,
ohne die Maus zu verwenden.
*/
