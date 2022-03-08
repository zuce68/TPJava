package TP2;
import java.io.File;
import java.util.Scanner;
import java.util.Vector;
import java.util.Collections;
import java.util.Comparator;


public class Main {
    public static void main(String[] arguments)
    {
        Vector<Player> myVector = new Vector();

        File doc = new File("/Users/pierremisiuk/IdeaProjects/TPJava/src/TP2/BestTimeOfMyLife");
        try {
            Scanner obj = new Scanner(doc);
            while (obj.hasNextLine())
            {
               String[] result = obj.nextLine().split(":");
               switch (result[0]){
                   case "OddPlayer":
                      OddPlayer myPlayer = new OddPlayer(result[1],Integer.parseInt(result[2]),Integer.parseInt(result[3]),Integer.parseInt(result[4]),Integer.parseInt(result[5]));
                       myVector.add(myPlayer);
                       break;
                   case "Player":
                       Player myPlayer1 = new Player(result[1],Integer.parseInt(result[2]),Integer.parseInt(result[3]),Integer.parseInt(result[4]),Integer.parseInt(result[5]));
                       myVector.add(myPlayer1);
                       break;
                   case "DiceRoller":
                       DiceRoller myPlayer2 = new DiceRoller(result[1],Integer.parseInt(result[2]),Integer.parseInt(result[3]),Integer.parseInt(result[4]),Integer.parseInt(result[5]));
                       myVector.add(myPlayer2);
                       break;
               }
            }

            System.out.printf("Nb total : "+Player.numberPlayer+"\n");
            System.out.printf("Nb total DiceRoler : "+DiceRoller.diceRollerNumber+"\n");
            System.out.printf("Nb total OddPlayer : "+OddPlayer.oddPlayerNumber+"\n");
            Collections.sort(myVector, new Comparator<Player>() {
                public int compare(Player a, Player b) {
                    if(Double.compare(a.ratio,b.ratio)>0){
                        return 1;
                    }
                    if(Double.compare(a.ratio,b.ratio)<0){
                        return 0;
                    }
                    return 0;
                }
            });
            int totalScore=0;
            while(totalScore<200)
            {
                for (Player test : myVector){
                    test.play();
                    if(totalScore<test.getScore()){
                        totalScore=test.getScore();
                    }
                }
            }
            for (Player test : myVector)
                {
                if(totalScore== test.getScore()){
                    test.youRock();
                }
                }

            myVector.toString();
        }
        catch (Exception e){
            System.out.println(e.toString());
            //None
        }

    }

}
