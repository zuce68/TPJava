package TP3;
import java.awt.*;
import java.awt.color.*;
import java.text.Normalizer;

public abstract class Forme2D implements Comparable<Forme2D> {

    public Color Couleur;
    public double Aire;
    public Point2D Origin;
    public static int numberForm;

    public Forme2D() throws WrongOriginException {
        Point2D origin = new Point2D();
        if (origin.x<0 || origin.y<0){
            throw new WrongOriginException();
        }

        Origin=origin;
        Couleur=Color.blue;
        numberForm+=1;
    };


    protected void finalize() throws Throwable {
        this.numberForm-=1;
    }

    public abstract double Aire();

    public void Moove(float x, float y){
        Origin.Set(Origin.x+x, Origin.y+y);
    };

    public abstract void Redimension(int x) throws WrongSizeException;

    public abstract void Here(float x,float y);


    public abstract void Draw();

    public Color GetColor(){
        return Couleur;
    }

    public void SetColor(Color x){
        Couleur=x;
    }

    public String toString(){
        return Origin.toString()+":"+Couleur.toString();
    }

    @Override
    public int compareTo(Forme2D compareTo){

        if (Aire > compareTo.Aire) return 1;

        if (Aire < compareTo.Aire) return 0;

        return -1;
    }



}

