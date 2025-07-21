import javax.swing.*;
import java.awt.*;

public class BorderLayoutBeispiel {
    public static void main(String[] args) {
        JFrame frame = new JFrame("BorderLayout");
        frame.setLayout(new BorderLayout());
        frame.setSize(400, 300);

        frame.add(new JButton("NORTH"), BorderLayout.NORTH);
        frame.add(new JButton("SOUTH"), BorderLayout.SOUTH);
        frame.add(new JButton("EAST"), BorderLayout.EAST);
        frame.add(new JButton("WEST"), BorderLayout.WEST);
        frame.add(new JButton("CENTER"), BorderLayout.CENTER);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}