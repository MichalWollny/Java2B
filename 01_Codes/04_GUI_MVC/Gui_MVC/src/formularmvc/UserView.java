package formularmvc;
import javax.swing.*;
import java.awt.*;
/**
 * View-Klasse für das Formular.
 * Stellt Textfelder für Name und E-Mail sowie einen Button dar.
 */
public class UserView extends JFrame {
    private JTextField nameField = new JTextField(20);
    private JTextField emailField = new JTextField(20);
    private JButton submitButton = new JButton("Abschicken");
    private JLabel messageLabel = new JLabel("");
    public UserView() {
        this.setTitle("Benutzerdaten Formular (MVC)");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(350, 200);
        this.setLayout(new GridLayout(4, 2));
        this.add(new JLabel("Name:"));
        this.add(nameField);
        this.add(new JLabel("E-Mail:"));
        this.add(emailField);
        this.add(submitButton);
        this.add(messageLabel);
    }public JTextField getNameField() {
        return nameField;
    }
    public JTextField getEmailField() {
        return emailField;
    }
    public JButton getSubmitButton() {
        return submitButton;
    }
    public void showMessage(String message) {
        messageLabel.setText(message);
    }
}