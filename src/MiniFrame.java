import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;


public class MiniFrame extends JFrame implements ActionListener{

    JButton[] chiffres;
    JButton[] operator;
    JButton clear;
    JTextField jf;
    public int A=0;
    public int B=0;


    public MiniFrame(){
        super("Calculatrice");

        setLayout(new FlowLayout());
        String [] dico = {"/","=",",","+","-","x"};

        chiffres = new JButton[10];
        operator = new JButton[6];
        clear = new JButton("CR");
        clear.addActionListener(this);
        jf = new JTextField(10);


        int i = 0;
        add(jf);
        add(clear);
        for (JButton chiffre : chiffres) {
            String titre = ""+i;
            chiffre = new JButton(titre);
            chiffre.addActionListener(this);
            i++;
            add(chiffre);
        }

        i=0;
        for (JButton operateur : operator) {
            operateur = new JButton(dico[i]);
            i++;
            operateur.addActionListener(this);
            add(operateur);
        }



        setSize(300,300);
        setVisible(true);

    }
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==clear)
        {
            jf.setText("");
        }
        if(e.getActionCommand()=="=")
        {
            if (B!=0 && A !=0)
              {
                 int result = A+B;
                 String text = ""+result;
                 jf.setText(text);
              }
            A=0;
            B=0;
        }
        if(e.getActionCommand()=="+")
        {

            if (B==0 && A==0)
            {
                A = Integer.parseInt(jf.getText());
            }
            else if (B==0 && A!=0)
            {
                B = Integer.parseInt(jf.getText());
            }
            jf.setText("");
        }
        else if (e.getActionCommand()!="=" && e.getSource()!=clear)
        {
            jf.setText(jf.getText()+e.getActionCommand());
        }
    }
}