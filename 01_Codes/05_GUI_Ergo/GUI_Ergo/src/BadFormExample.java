import javax.swing.*;

public class BadFormExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Nicht barrierefreies Formular");
        JPanel panel = new JPanel();

        JTextField nameField = new JTextField(20);
        JButton submitButton = new JButton("OK");

        panel.add(nameField);
        panel.add(submitButton);

        frame.add(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
