package TP3.TP4;

import TP3.*;

import java.awt.*;
import java.util.ArrayList;

public class main {
  
    public static void main(String[] arguments) throws WrongSizeException,WrongOriginException
    {
        ArrayList<Forme2D> myList = new ArrayList<Forme2D>();

        for(int i=0;i<10;i++){
            Point2D myOrigin = new Point2D();
            myOrigin.Set((int)(Math.random() * ((400 - 0) + 1)),(int)(Math.random() * ((400 - 0) + 1)));
            if (i<5)
            {

                try
                {
                    Cercle cer = new Cercle(myOrigin,50 + (int)(Math.random() * ((100- 50) + 1)), Color.green);
                    myList.add(cer);
                }
                catch (Exception e){}
            }
            else
            {
                try
                {
                    Carre car = new Carre(myOrigin,50 + (int)(Math.random() * ((100- 50) + 1)),null);
                    myList.add(car);
                }
                catch (Exception e){}
            }
        }

        myList.sort(null);

        Fenetre myWindow = new Fenetre(myList);
    }
}
