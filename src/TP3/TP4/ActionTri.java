package TP3.TP4;

import TP3.Carre;
import TP3.Point2D;
import TP3.WrongSizeException;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ActionTri implements ActionListener {
    ZoneDessin zoneDessin;

    public ActionTri(ZoneDessin z) throws WrongSizeException {
        zoneDessin = z;
    }

    @Override
    public void actionPerformed(ActionEvent e){
        zoneDessin.myList.sort(null);
        zoneDessin.repaint();
    }
}
