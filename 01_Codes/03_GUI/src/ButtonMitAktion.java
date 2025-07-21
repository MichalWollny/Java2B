import javax.swing.*;

public class ButtonMitAktion {
    public static void main(String[] args) {
        // Wir machen ein neues Fenster mit einer Überschrift oben
        JFrame fenster = new JFrame("Einfaches Fenster");

        // Wir sagen, wie groß das Fenster sein soll (Breite, Höhe)
        fenster.setSize(400, 300);

        // Wenn man oben auf das rote X klickt, soll das Programm aufhören
        fenster.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Erstellen wir ein Knopf mit der anschrift Klick mich
        JButton knopf = new JButton("Klick mich");
// Java Swing ActionListener Methoden – Überblick und Beispiele
// //Java Swing verwendet **ActionListener**, um Benutzerinteraktionen wie Button-Klicks,
// Menüauswahlen oder andere Aktionen zu verarbeiten.
// Wichtigste Methode

//void actionPerformed(ActionEvent e);

        knopf.addActionListener(e ->
                JOptionPane.showMessageDialog(fenster,"Hallo zusammen"));


        // legen wir den Knopf ins Fenster
        fenster.add(knopf);



        // Jetzt zeigen wir das Fenster an
        fenster.setVisible(true);
    }
}
