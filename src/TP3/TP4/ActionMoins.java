package TP3.TP4;

import TP3.Carre;
import TP3.Point2D;
import TP3.WrongSizeException;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ActionMoins implements ActionListener {
    ZoneDessin zoneDessin;

    public ActionMoins(ZoneDessin z) throws WrongSizeException {
        zoneDessin = z;
    }
@Override
    public void actionPerformed(ActionEvent e) {
        int ind = zoneDessin.myList.size();
        zoneDessin.myList.remove(ind-1);
        zoneDessin.repaint();
    }
}
