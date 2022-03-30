package TP3;

import java.awt.*;
import java.text.Normalizer;
import java.util.*;
import java.util.List;

public class main {
    public static void main(String[] arguments) throws WrongSizeException,WrongOriginException {
        ArrayList<Forme2D> myList = new ArrayList<Forme2D>();
        Point2D myOrigin = new Point2D();
        myOrigin.Set(1,1);
        for(int i=0;i<10;i++){
            if (i<5)
            {
                try
                {
                    Cercle cer = new Cercle(myOrigin,1+1*i,Color.green);
                    myList.add(cer);
                }
                catch (Exception e){}
            }
            else
            {
                try
                {
                    Carre car = new Carre(myOrigin,1 + 2 * i,null);
                    myList.add(car);
                }
                catch (Exception e){}
            }
        }

        myList.sort(null);

        for (Forme2D form : myList){
            form.Draw();
        }

        System.out.printf("Number circle :"+Cercle.numberCercle+"\n");
        System.out.printf("Number carre :"+Carre.numberCarre+"\n");
        System.out.printf("Number Form :"+Forme2D.numberForm+"\n");

        ArrayList<Forme2D> myCircles = new ArrayList<>();



    }
}
