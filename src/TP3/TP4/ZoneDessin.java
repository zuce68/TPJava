package TP3.TP4;

import TP3.*;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.EventListener;
import java.awt.event.KeyAdapter;
import java.util.List;
import java.util.Random;

public class ZoneDessin extends Component{
    public List<Forme2D> myList;

    public ZoneDessin(List<Forme2D> p){
        setFocusable(true);

        Point2D myOrigin = new Point2D();
        myOrigin.Set(200,150 );
        int size = 50 + (int)(Math.random() * ((150 - 50) + 1));

        this.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent ke) {

                if(Character.compare(ke.getKeyChar(), 'c') == 0 ){
                    Cercle cer = null;
                    try {
                        cer = new Cercle(myOrigin,size, null);
                    } catch (WrongSizeException e) {
                        e.printStackTrace();
                    }
                    myList.add(cer);
                }

                if(Character.compare(ke.getKeyChar(), 'r') == 0){
                    Carre car = null;
                    try {
                        car = new Carre(myOrigin,size, null);
                    } catch (WrongSizeException e) {
                        e.printStackTrace();
                    }
                    myList.add(car);
                }

                if(Character.compare(ke.getKeyChar(), 'd') == 0){
                    int ind = myList.size();
                    myList.remove(ind-1);
                }

                repaint();

            }
        });
        myList=p;
    }

    @Override
    public void paint(Graphics g){
        Random rand = new Random();
        float red = rand.nextFloat();
        float green = rand.nextFloat();
        float blue = rand.nextFloat();

        for (Forme2D form : myList){
            float[] result;
            result=form.Origin.Get();
            if(form instanceof Cercle){
                g.fillOval((int) result[0],(int) result[1],(int) ((Cercle) form).Get(),(int) ((Cercle) form).Get());
                g.setColor(new Color(red, green, blue));

            }
            if(form instanceof Carre){
                g.fillRect((int) result[0],(int) result[1],((Carre) form).get(),((Carre) form).get());
                g.setColor(new Color(red, green, blue));

            }
        }
    }

}
