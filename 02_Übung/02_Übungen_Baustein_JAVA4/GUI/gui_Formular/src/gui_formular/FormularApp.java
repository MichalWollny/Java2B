package gui_formular;

public class FormularApp {
    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(() -> {
            FormularFenster fenster = new FormularFenster();
            fenster.setVisible(true);
        });
    }
}
