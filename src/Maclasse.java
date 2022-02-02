import java.util.Calendar;

import javax.swing.JOptionPane;

public class Maclasse {

    public static String[] tableau = new String[100];
    public static boolean myBool = true;


    public static void main(String[] arguments)
    {

            Object[] options = {"Nouvelle saisie", "Terminer"};
            for(int i=0;i<100;i++) {
                String monResultat = i+"";
                tableau[i]=monResultat;
            }

            String nomPrenom = JOptionPane.showInputDialog("Prénom Nom ?");
            String age = (String) JOptionPane.showInputDialog(null,"Age","Age", JOptionPane.QUESTION_MESSAGE,null,tableau,tableau[0]);
            int fin = JOptionPane.showOptionDialog(null,"Fin","Votre choix",JOptionPane.YES_NO_OPTION,JOptionPane.ERROR,null,options,options[0]);


            switch(fin) {
                case 0: {
                    System.out.println("Nouvelle Saisier");
                    break;
                }
                case 1: {
                    System.out.println("Terminer");
                    endProcess(nomPrenom, age);
                    break;
                }
            }

    }
    public static void endProcess(String nomPrenom, String age){}
    {

    }


}
