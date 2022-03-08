package TP2;
import java.util.Random;
public class DiceRoller extends TP2.Player {

    private int bonus;
    private int score;
    public static int diceRollerNumber;

    public String toString() {
        return "DiceRoller:" + super.toString();
    }


    protected void finalize() throws Throwable {
        this.diceRollerNumber-=1;
        super.finalize();
    }

    public DiceRoller(String nickName, int yob, int score,int played, int won){
        super(nickName,yob,score,played,won);
        this.score=0;
        this.bonus=0;
        this.diceRollerNumber+=1;
    }

    public int play(){
        int resultat = genererInt(1,7);
        this.score+=resultat;
        if(resultat==6)
        {
            this.bonus+=1;
        }
        System.out.printf("Dé : "+resultat+"\n");
        System.out.printf("Score : "+this.score+"\n");
        return 0;
    }

    public int getScore(){
        return  this.score*(this.bonus+1);
    }

    int genererInt(int borneInf, int borneSup){
        Random random = new Random();
        int nb;
        nb = borneInf+random.nextInt(borneSup-borneInf);
        return nb;
    }

}
