// Package Definition (Optional, kann auch weggelassen werden)
package gui_formular;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

// Die Klasse FormularFenster erbt von JFrame (Fenster)
// => OOP Prinzip: Wir erstellen ein eigenes "Fenster" mit eigenen Feldern und Funktionen.
public class FormularFenster extends JFrame {

    // -------------------------
    // Komponenten als Attribute deklarieren => damit wir sie in mehreren Methoden nutzen können.
    // -------------------------
    private JTextField nameField, emailField;
    private JRadioButton maleButton, femaleButton;
    private JTextArea nachrichtArea;
    private JButton absendenButton;
    private JLabel statusLabel;

    // -------------------------
    // Konstruktor der Klasse => wird ausgeführt, wenn man eine Instanz erzeugt:
    // FormularFenster fenster = new FormularFenster();
    // -------------------------
    public FormularFenster() {
        // Titel für das Fenster oben
        setTitle("Einfaches Formular");

        // Größe des Fensters (Breite x Höhe)
        setSize(400, 450);

        // Beende das Programm, wenn das Fenster geschlossen wird
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Fenster wird zentriert dargestellt
        setLocationRelativeTo(null);

        // Aufruf der Methode, die alle GUI-Komponenten initialisiert
        initComponents();
    }

    // -------------------------
    // Initialisierung und Layout der GUI-Komponenten
    // -------------------------
    private void initComponents() {
        // Panel als Container für alle Eingabefelder, Layout: GridBagLayout für flexible Positionierung
        JPanel panel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();

        // Abstand zwischen den Komponenten (innen)
        gbc.insets = new Insets(10, 10, 10, 10);
        gbc.fill = GridBagConstraints.HORIZONTAL;

        // -------- Name Eingabefeld --------
        gbc.gridx = 0; gbc.gridy = 0;
        panel.add(new JLabel("Name:"), gbc);
        gbc.gridx = 1;
        nameField = new JTextField(20);
        panel.add(nameField, gbc);

        // -------- Email Eingabefeld --------
        gbc.gridx = 0; gbc.gridy++;
        panel.add(new JLabel("E-Mail:"), gbc);
        gbc.gridx = 1;
        emailField = new JTextField(20);
        panel.add(emailField, gbc);

        // -------- Geschlecht Radiobutton --------
        gbc.gridx = 0; gbc.gridy++;
        panel.add(new JLabel("Geschlecht:"), gbc);
        gbc.gridx = 1;
        JPanel genderPanel = new JPanel();

        // Radio Buttons
        maleButton = new JRadioButton("Männlich");
        femaleButton = new JRadioButton("Weiblich");

        // Gruppierung damit nur ein Button auswählbar ist
        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(maleButton);
        genderGroup.add(femaleButton);
        genderPanel.add(maleButton);
        genderPanel.add(femaleButton);
        panel.add(genderPanel, gbc);

        // -------- Nachricht Textarea --------
        gbc.gridx = 0; gbc.gridy++;
        panel.add(new JLabel("Nachricht:"), gbc);
        gbc.gridx = 1;
        nachrichtArea = new JTextArea(5, 20);

        // Scrollbar für Textarea
        JScrollPane scrollPane = new JScrollPane(nachrichtArea);
        panel.add(scrollPane, gbc);

        // -------- Absenden Button --------
        gbc.gridx = 0; gbc.gridy++;
        panel.add(new JLabel(), gbc);  // leeres Label zum Ausrichten
        gbc.gridx = 1;
        absendenButton = new JButton("Absenden");
        panel.add(absendenButton, gbc);

        // -------- Status Label --------
        gbc.gridx = 0; gbc.gridy++;
        gbc.gridwidth = 2;  // über zwei Spalten strecken
        statusLabel = new JLabel(" ");
        panel.add(statusLabel, gbc);

        // -------- Aktion für Button --------
        // Anonyme Klasse: hier definieren wir was passiert beim Button-Klick
        absendenButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                absendenAktion();
            }
        });

        // Panel zum Fenster hinzufügen
        add(panel);
    }

    // -------------------------
    // Methode für die Absenden-Logik
    // -------------------------
    private void absendenAktion() {
        // Eingaben auslesen
        String name = nameField.getText().trim();
        String email = emailField.getText().trim();

        // Prüfen welcher Radio-Button ausgewählt ist
        String geschlecht = maleButton.isSelected() ? "Männlich"
                : femaleButton.isSelected() ? "Weiblich"
                : "Nicht angegeben";

        String nachricht = nachrichtArea.getText().trim();

        // Validierung: alle Pflichtfelder prüfen
        if (name.isEmpty() || email.isEmpty() || nachricht.isEmpty()) {
            statusLabel.setText("Bitte alle Felder ausfüllen!");
        } else {
            statusLabel.setText("Danke " + name + " für Ihre Nachricht!");
        }
    }
}
