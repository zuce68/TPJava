import java.awt.*;
import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.OptionalDouble;
import javax.swing.JOptionPane;
import javax.swing.JButton;

import java.util.Random;
import java.util.OptionalInt;
import java.util.Random;

public class SymMat {


    public float[][] Matrice;

    public SymMat(int taille)
    {
        Matrice = new float[taille][taille];
        for(int i = 0;i<taille;i++)
        {
            for(int j = 0 ; j<=i ; j++)
            {
                Matrice[i][j]= getRandomNumberInRange(0, 100);
            }
        }
    }

    private static int getRandomNumberInRange(int min, int max) {

        if (min >= max) {
            throw new IllegalArgumentException("max must be greater than min");
        }

        Random r = new Random();
        return r.nextInt((max - min) + 1) + min;
    }

    public int[] get()
    {
        int[] res = new int[2];
        res[0] = Matrice.length;
        res[1] = Matrice.length;
        return res;
    }

    public float get(int i, int j)
    {
        return Matrice[i][j];
    }

    public void set(int i, int j, int val)
    {
       Matrice[i][j]=val;
    }

    public float trace()
    {
        float somme = 0;
        for(int i=0;i<Matrice.length;i++)
        {
                somme += Matrice[i][i];
        }
        return somme;
    }

    public double Norme()
    {
        float somme = 0;
        for(int i=0;i<Matrice.length;i++)
        {
            for(int j=0;j<=i;j++)
            {
                somme += Matrice[i][j]*Matrice[i][j];
            }
        }
        return java.lang.Math.sqrt(somme);
    }

    public static void main(String[] arguments)
    {
        SymMat maMatrice = new SymMat(3);
        float trace = maMatrice.trace();
        double norme = maMatrice.Norme();
    }
}

