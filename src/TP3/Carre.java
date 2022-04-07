package TP3;

import javax.lang.model.util.Elements;
import javax.management.remote.SubjectDelegationPermission;
import java.awt.*;

public class Carre extends Forme2D{

    public static int numberCarre;
    protected int cote;



    public Carre(Point2D Origine,int px, Color Couleur) throws WrongSizeException,WrongOriginException{
        numberCarre+=1;
        super.Origin=Origine;
        if (Couleur != null){
            SetColor(Couleur);
        }

        if(px<0){
            throw new WrongSizeException();
        }

        cote=px;

    }

    protected void finalize() throws Throwable {
        this.numberCarre-=1;
        super.finalize();
    }
    public String toString(){
        return "Carré:"+Origin.toString()+":"+cote+"x"+cote+":"+Couleur.toString()+":"+Aire();
    }

    @Override
    public double Aire() {
        super.Aire = cote*cote;
        return super.Aire;
    }


    public int get(){
        return cote;
    }
    @Override
    public void Redimension(int x) throws WrongSizeException{

        if(cote+x<0){
            throw new WrongSizeException();
        }

        cote+=x;

    }

    @Override
    public void Here(float x, float y) {
        if(x>= Origin.x && x<= Origin.x+cote && y>= Origin.y && y<= Origin.y+cote){
            System.out.printf("Intérieur du carré"+"\n");
        }
        else if(x< Origin.x || x> Origin.x+cote || y< Origin.y || y> Origin.y+cote){
            System.out.printf("Extérieur du carré"+"\n");
        }
    }


    @Override
    public void Draw() {
        System.out.printf(toString()+"\n");
    }
}
