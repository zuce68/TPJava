import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;


public class MiniFrame extends JFrame{

    JButton[] chiffres;
    JButton[] operator;
    JTextField jf;

    public MiniFrame(){
        super("Ma mini frame");

        setLayout(new FlowLayout());

        chiffres = new JButton[5];
        operator = new JButton[5];
        jf = new JTextField(10);


        int i = 0;

        for (JButton chiffre : chiffres) {
            String titre = ""+i;
            chiffre.setText(titre);
            i++;
            add(chiffre);
        }

        add(jf);



        setSize(300,300);
        setVisible(true);

    }
}