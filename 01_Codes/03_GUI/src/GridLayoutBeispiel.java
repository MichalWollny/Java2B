import javax.swing.*;
import java.awt.*;

public class GridLayoutBeispiel {
    public static void main(String[] args) {
        JFrame frame = new JFrame("GridLayout");
        frame.setLayout(new GridLayout(2, 2)); // 2 Zeilen, 2 Spalten
        frame.setSize(300, 200);

        frame.add(new JButton("1"));
        frame.add(new JButton("2"));
        frame.add(new JButton("3"));
        frame.add(new JButton("4"));

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}