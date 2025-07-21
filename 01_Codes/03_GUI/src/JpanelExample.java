import javax.swing.*;

public class JpanelExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Panel Example");
        JPanel panel = new JPanel();
        JLabel label = new JLabel("Text im Panel");

        panel.add(label);
        frame.add(panel);

        frame.setSize(300,400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
