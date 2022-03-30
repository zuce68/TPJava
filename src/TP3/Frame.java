package TP3;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Frame extends JFrame implements ActionListener
{
    JButton cercle;
    JButton carre;
    JButton trier;
    JButton delete;
    JTextField textField;
    JTextArea textArea;


    public Frame(){
        super("Form");

        cercle = new JButton("Circle");
        carre = new JButton("Square");
        trier = new JButton("Sort");
        delete = new JButton("Delete");
        textArea = new JTextArea();

        add(cercle);
        add(carre);
        add(trier);
        add(delete);

        setSize(200,200);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
