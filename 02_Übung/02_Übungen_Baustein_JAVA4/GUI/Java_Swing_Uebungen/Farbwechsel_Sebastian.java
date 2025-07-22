import javax.swing.*;
import java.awt.*;
import java.awt.GridLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class Farbwechsel_Sebastian
{
    public static void main(String[] args)
    {
        JFrame fenster = new JFrame("Einfaches Fenster");
        fenster.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fenster.setSize(400, 300);

        // ein panel mit einem grid-Layout
        JPanel panel = new JPanel(new GridLayout());

        // checkbox
        JRadioButton option1 = new JRadioButton("Option 1");
        JRadioButton option2 = new JRadioButton("Option 2");


        // Erstellung einer Button-Group um nur eine Auswahl möglich zu machen
        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(option1);
        buttonGroup.add(option2);


        //funktionalität der buttons
        option1.addItemListener(new ItemListener()
        {
            @Override
            public void itemStateChanged(ItemEvent e)
            {
                if(e.getStateChange()==ItemEvent.SELECTED){
                    option1.setBackground(Color.GREEN);
                    option1.setOpaque(true);
                }else{
                    option1.setBackground(null);
                    option1.setOpaque(false);
                }
            }
        });

            option2.addItemListener(new ItemListener()
            {
                @Override
                public void itemStateChanged(ItemEvent e)
                {
                    if(e.getStateChange()==ItemEvent.SELECTED){
                        option2.setBackground(Color.GREEN);
                        option2.setOpaque(true);
                    }else{
                        option2.setBackground(null);
                        option2.setOpaque(false);

                    }
                }
            });

        // ab hier erstellen wir was angezeigt wird
        // Knöpfe zum Panel hinzufügen
        panel.add(option1);
        panel.add(option2);


        // panel zum Fenster hinzufügen
        fenster.add(panel);

        // fenster sichtbar machen
        fenster.setVisible(true);


    }//mk


}//ck