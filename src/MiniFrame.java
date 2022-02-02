import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.event.*;


public class MiniFrame extends JFrame{
    JButton myBoutonsChiffres[] = new JButton[9];
    JButton myBoutonsOperator[] = new JButton[5];
    JButton clear;
    JTextField text;

    public MiniFrame(){

        super("Calculatrice");

        setLayout(new FlowLayout());

        //INITIALISATION DES BOUTONS

        clear = new JButton("CLEAR");
        text = new JTextField(10);
        int i = 0;
        for (JButton bouton : myBoutonsChiffres) {
            String a = ""+i;
            bouton.setName(a);
            i++;
            add(bouton);
        }

        for (JButton Operator : myBoutonsOperator)
        {
            Operator.setName("+");
            add(Operator);
        }
        clear.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                text.setText("");
            }});

        add(text);
        add(clear);


        setSize(300,300);
        setVisible(true);

    }


}