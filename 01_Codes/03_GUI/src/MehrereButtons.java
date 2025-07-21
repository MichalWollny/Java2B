import javax.swing.*;
import java.awt.*;

public class MehrereButtons {
    public static void main(String[] args) {

        JFrame fenster = new JFrame("Einfaches Fenster");
        fenster.setSize(400, 300);
        fenster.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Erstellung von panel
        JPanel panel = new JPanel(new GridLayout(2,1));


        // Erstellung von Knöpfe
        JButton halloKnopf = new JButton("Hallo");
        JButton tschuessKnopf = new JButton("Tschüss");


        // Add action zu den Knöpfen
        halloKnopf.addActionListener(e ->
                JOptionPane.showMessageDialog(fenster,"Hallo zusammen"));

        tschuessKnopf.addActionListener(e ->
                JOptionPane.showMessageDialog(fenster,"Tschüss zusammen"));

        // legen wir den Knopf ins panel
        panel.add(halloKnopf);
        panel.add(tschuessKnopf);

        // Panel ins Fenster legen
        fenster.add(panel);

        // Jetzt zeigen wir das Fenster an
        fenster.setVisible(true);
    }
}
