package TP3.TP4;

import TP3.*;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;


public class ActionAjout implements ActionListener {
    ZoneDessin zoneDessin;
    JRadioButton Car;
    JRadioButton Cer;


    public ActionAjout(ZoneDessin z, JRadioButton carre,JRadioButton cercle) throws WrongSizeException {
        zoneDessin = z;
        Cer=cercle;
        Car=carre;
    }

    @Override
    public void actionPerformed(ActionEvent e){
        Point2D myOrigin = new Point2D();
        myOrigin.Set(200,150 );

        int size = 50 + (int)(Math.random() * ((150 - 50) + 1));
        try{
            if(Cer.isSelected()){
                Cercle cer = new Cercle(myOrigin,size, null);
                zoneDessin.myList.add(cer);
            }
            else if(Car.isSelected()){
                Carre car = new Carre(myOrigin,size, null);
                zoneDessin.myList.add(car);
            }

        }
        catch (WrongSizeException test){

        }
        zoneDessin.repaint();
    }
}
