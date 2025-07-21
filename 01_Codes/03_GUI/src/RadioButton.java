import javax.swing.*;
import java.awt.*;

public class RadioButton {
    public static void main(String[] args) {

        JFrame fenster = new JFrame("Radio Button");
        fenster.setSize(400, 300);
        fenster.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Erstellung von panel
        JPanel panel = new JPanel(new GridLayout(2,1));


        // Erstellung von zwei Radio Buttons
        JRadioButton option1 = new JRadioButton("Option 1");
        JRadioButton option2 = new JRadioButton("Option 2");

        // Erstellung von einem ButtonGroup
        ButtonGroup group = new ButtonGroup();
        group.add(option1);
        group.add(option2);

        // Add action zu den Knöpfen
        option1.addActionListener(e ->
                JOptionPane.showMessageDialog(fenster,"Option1 wurde ausgewählt"));

        option2.addActionListener(e ->
                JOptionPane.showMessageDialog(fenster,"Option2 wurde ausgewählt"));

        // legen wir den Knopf ins panel
        panel.add(option1);
        panel.add(option2);

        // Panel ins Fenster legen
        fenster.add(panel);

        // Jetzt zeigen wir das Fenster an
        fenster.setVisible(true);
    }

}
