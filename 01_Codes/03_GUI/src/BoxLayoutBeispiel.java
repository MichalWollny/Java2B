import javax.swing.*;
import java.awt.*;

public class BoxLayoutBeispiel {
    public static void main(String[] args) {
        JFrame frame = new JFrame("BoxLayout Y_AXIS");
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        panel.add(new JButton("Oben"));
        panel.add(new JButton("Mitte"));
        panel.add(new JButton("Unten"));

        frame.add(panel);
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}