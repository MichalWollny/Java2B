import javax.swing.*;

public class CheckBox {
    public  static  void  main(String[] args){
        JFrame frame = new JFrame("Check Box Beispiel");
        frame.setSize(300, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JCheckBox checkBox1 = new JCheckBox("Ich stimme zu");

        frame.add(checkBox1);
        frame.setVisible(true);
    }
}
