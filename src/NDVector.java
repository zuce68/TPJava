import java.awt.*;
import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.OptionalDouble;
import javax.swing.JOptionPane;
import javax.swing.JButton;

import java.util.OptionalInt;

public class NDVector
{
    private int Dimension;
    private double[] Vecteurs;

    public NDVector(int D)
    {
        Dimension=D;
        Vecteurs = new double[Dimension];
    }

    public void set(int D,double V)
    {
        Vecteurs[D]=V;
    }

    public double get(int D)
    {
        return Vecteurs[D];
    }

    public double Max()
    {
        OptionalDouble max = Arrays.stream(Vecteurs).max();
        return max.getAsDouble();
    }

    public double Min()
    {
        OptionalDouble min = Arrays.stream(Vecteurs).min();
        return min.getAsDouble();
    }

    public double Moyenne()
    {
        double moyenne = 0;
        for(double i : Vecteurs)
        {
            moyenne+=i;
        }
        return moyenne/Vecteurs.length;
    }

    public double Norme()
    {
        double somme=0;
        for(double i : Vecteurs)
        {
            somme+=i*i;
        }
        return java.lang.Math.sqrt(somme);
    }

    public void Normalisation()
    {
        double somme=0;
        int ind=0;
        double Norme = Norme();
        for(double i : Vecteurs)
        {
            Vecteurs[ind] = i/Norme;
        }
    }
    public double ProduitScalaire(NDVector b)
    {
        int i=0;
        int somme=0;
        for(i=0;i<b.Dimension;i++)
        {
            somme+=Vecteurs[i]*b.Vecteurs[i];
        }

        return somme;
    }

    public static void main(String[] arguments)
    {
        NDVector monVecteur = new NDVector(Integer.parseInt(JOptionPane.showInputDialog("Donnez votre dimension : ")));
        NDVector monVecteur1 = new NDVector(3);

        for(int i=0;i<3;i++)
        {
        monVecteur.set(i,Double.parseDouble(JOptionPane.showInputDialog("Donnez votre chiffre : ")));
        }



        monVecteur1.set(0,156560);
        monVecteur1.set(1,156561);
        monVecteur1.set(2,156563);;

        String pattern = "00";
        DecimalFormat decimalFormat = new DecimalFormat(pattern);

        System.out.print("Moyenne  : " + monVecteur.Moyenne()+"\n");
        System.out.print("Maximum  : " + monVecteur.Max()+"\n");
        JOptionPane.showMessageDialog(null,"Norme : "+ decimalFormat.format(monVecteur.Norme()));
        System.out.print("Norme  : " + monVecteur.Norme()+"\n");
        System.out.print("Produit scalaire  : " + monVecteur.ProduitScalaire(monVecteur1)+"\n");



    }
}
