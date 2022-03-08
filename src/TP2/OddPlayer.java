package TP2;
import java.util.Random;

public class OddPlayer extends Player {
    private int score;
    public static int oddPlayerNumber;

    public OddPlayer(String nickName, int yob, int score, int played, int won)
    {
        super(nickName, yob, score, played, won);
        oddPlayerNumber+=1;
    }

    public int play()
    {
        int resultat = genererInt(1,3);
        if (resultat % 2 != 0){
            this.score+=resultat;
            this.score+=resultat;
            this.score+=resultat;
            System.out.printf("Scddore : "+this.score+"\n");
        }
        return 0;
    }

    public int getScore(){
        return  this.score;
    }

    protected void finalize() throws Throwable {
        this.oddPlayerNumber-=1;
        super.finalize();
    }
    @Override
    public String toString() {
        return "OddPlayer:"+super.toString();
    }

    int genererInt(int borneInf, int borneSup) {
        Random random = new Random();
        int nb;
        nb = borneInf + random.nextInt(borneSup - borneInf);
        return nb;
    }
}
