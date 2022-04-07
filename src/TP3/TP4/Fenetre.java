package TP3.TP4;

import TP3.Forme2D;
import TP3.WrongSizeException;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.util.List;

public class Fenetre extends javax.swing.JFrame{
    ZoneDessin myDrawZone;
    JRadioButton rBtn1;
    JRadioButton rBtn2;

    public Fenetre(List<Forme2D> list){

        super("Dessin");

        JPanel myPanel = new JPanel();
        JLabel myLabel = new JLabel();
        myDrawZone = new ZoneDessin(list);

        myLabel.setText("TP4");


        myPanel.setLayout(new BorderLayout());

        myPanel.setBackground(Color.lightGray);

        myPanel.add(myLabel,BorderLayout.NORTH);

        myPanel.add(myDrawZone,BorderLayout.CENTER);

        try {
            myPanel.add(creeBoutons(),BorderLayout.SOUTH);
        }
        catch (WrongSizeException e){

        }


        setContentPane(myPanel);
        setSize(600,500);
        setVisible(true);
    }

    private JPanel creeBoutons() throws WrongSizeException {
        // créé un panel avec des éléments alignés à gauche
        final JPanel panel =
                new JPanel(new FlowLayout(FlowLayout.CENTER,10,0));
        // création du bouton ajouter
        final JButton ajouter = new JButton("+");
        final JButton moins = new JButton("-");
        final JButton tri = new JButton("Tri");

        rBtn1=new JRadioButton("Carré");
        rBtn2=new JRadioButton("Cercle");


        ButtonGroup bg = new ButtonGroup();
        bg.add(rBtn1);
        bg.add(rBtn2);

        // création d’une action pour ajouter dans la liste



        ActionAjout actionAjout = new ActionAjout(myDrawZone,rBtn1,rBtn2);
        ActionMoins actionMoins = new ActionMoins(myDrawZone);
        ActionTri actionTri = new ActionTri(myDrawZone);

        // affectation de cette action au bouton
        ajouter.addActionListener(actionAjout);
        moins.addActionListener(actionMoins);
        tri.addActionListener(actionTri);


        // ajout du bouton dans la fenetre
        panel.add(ajouter);
        panel.add(moins);
        panel.add(tri);
        panel.add(rBtn1);
        panel.add(rBtn2);
        return panel;
    }
}
