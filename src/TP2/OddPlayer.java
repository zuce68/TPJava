import TP2.Player;

import java.util.Random;

public class OddPlayer extends Player {
    private int score;
    public int oddPlayerNumber;

    public OddPlayer(String nickName, int yob) {
        super(nickName, yob, 0, 0, 0);
    }

    public int play()
    {
        int resultat = genererInt(1,3);
        if (resultat % 2 != 0){
            this.score+=resultat;
            this.score+=resultat;
            this.score+=resultat;
        }
        return 0;
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
