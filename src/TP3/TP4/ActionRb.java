package TP3.TP4;

import TP3.Cercle;
import TP3.Point2D;
import TP3.WrongSizeException;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ActionRb implements ActionListener {
public boolean cercle;
public boolean carré;

    public ActionRb(boolean c,boolean b) throws WrongSizeException {
    cercle=c;
    carré=b;
    }

    @Override
    public void actionPerformed(ActionEvent e){

    }
}
