package TP3;
import java.awt.*;
import java.math.*;
import java.util.Random;

public class Cercle extends Forme2D {

    public static int numberCercle;
    protected double rayon;


    public Cercle(Point2D Origine, float r, Color Couleur) throws WrongSizeException,WrongOriginException{
        if(r<0){
            throw new WrongSizeException();
        }
        Origin=Origine;
        if (Couleur != null){
            SetColor(Couleur);
        }
        rayon=r;
        numberCercle+=1;
    };


    public String toString(){
        return "Cercle:"+Origin.toString()+":"+rayon+":"+Couleur.toString()+":"+Aire();
    }


    @Override

    public double Aire() {
        super.Aire = Math.PI*rayon*rayon;
        return super.Aire;
    }


    @Override
    public void Redimension(int x) throws WrongSizeException{

        if( rayon+x<0){
            throw new WrongSizeException();
        }

        rayon+=x;
    }

    @Override
    public void Here(float x,float y) {
        double norme = Math.sqrt(x*x+y*y);
        if(norme<rayon){
            System.out.printf("Intérieur du cercle"+"\n");
        }
        else if(norme==rayon){
            System.out.printf("Sur le cercle"+"\n");
        }
        else{
            System.out.printf("Pas dans le cercle"+"\n");
        }
    }

    protected void finalize() throws Throwable {
        this.numberCercle-=1;
        super.finalize();
    }

    public double Get(){
        return rayon;
    }

    @Override
    public void Draw() {
        System.out.printf(toString()+"\n");
    }
}
