package TP2;

import java.util.Date;
public class Player {

    private String nickName;
    private int yob;
    public int score;
    public int played;
    public int won;
    public static int numberPlayer;
    
    protected void finalize()  throws Throwable
    {
        numberPlayer-=1;
        super.finalize();
    }
    
    public String toString(){
     return this.nickName+":"+this.yob+":"+this.played+":"+this.won;
    }
    public Player(){
        
    }
    public Player(String Nickname, int yob, int score,int played, int won)
    {
        this.nickName=Nickname;
        this.yob=yob;
        this.score=score;
        this.played=played;
        this.won=won;
        this.numberPlayer+=1;
    }

    public int playerOld()
    {
        Date date = new Date();
        String[] time = date.toString().split(" ");
        int currentYear = Integer.parseInt(time[5]);
        return currentYear-this.yob ;
    }

    public int getScore()
    {
        return this.score;
    }

    public void reset()
    {
        this.score=0;
    }

    public int play()
    {
        System.out.printf(this.nickName+": What will we play ?"+"\n");
        return 0;
    }
    public void youRock()
    {
        System.out.printf("Hello "+this.nickName+" Congralutations ! You WIN "+"\n");
        this.score+=1;
        this.played+=1;
    }
    public static void main(String[] arguments)
    {

      //  DiceRoller test = new DiceRoller("zuce",2001);
        
    }
}
