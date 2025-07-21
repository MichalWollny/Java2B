import javax.swing.*;
import java.awt.*;

public class FlowLayoutBeispiel {
    public static void main(String[] args) {
        JFrame frame = new JFrame("FlowLayout");
        frame.setLayout(new FlowLayout());
        frame.setSize(300, 200);

        frame.add(new JButton("Button 1"));
        frame.add(new JButton("Button 2"));
        frame.add(new JButton("Button 3"));

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}