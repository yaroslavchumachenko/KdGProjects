package ChessClub;

import java.util.Random;

public class Player {
    private String name;
    private float winratio;
    private int birthyear;
    private boolean retired;
    final int CURRENT_YEAR = 2025;


    public void setRetired(boolean retired) {
        this.retired = retired;
    }

    public void setBirthyear(int birthyear) {
        if  (birthyear < (CURRENT_YEAR-120) || birthyear > CURRENT_YEAR) {
            System.out.println("Birth year out of range");
        }
        else {
            this.birthyear = birthyear;
        }

    }

    public void setWinratio(float winratio) {
        if  (winratio >= 0 && winratio <= 1) {
            this.winratio = winratio;
        }
        else {
            System.out.println("Invalid winratio");
        }

    }

    public void setName(String name) {
        if (name.isEmpty()) {
            System.out.println("Invalid name");
        }
        else {
            this.name = name;
        }

    }


    public boolean getRetired() {
        return retired;
    }

    public int getBirthyear() {
        return birthyear;
    }

    public float getWinratio() {
        return winratio;
    }

    public String getName() {
        return name;
    }


    public Player(String name, int birthyear){
       this(name,birthyear, 1, false);
    }
    public Player(String name, int birthyear, float winratio,  boolean retired){
        setName(name);
        setBirthyear(birthyear);
        setWinratio(winratio);
        setRetired(retired);
    }

    static  void startGame(Player player){
        Random rand = new Random();
        double random = rand.nextDouble();
        boolean win = false;
        if (random < player.getWinratio()) {
            win = true;
            String playerStatus = (player.getRetired())? "retired":"active";
            System.out.printf("%s (%d: Winratio: %.2f " + playerStatus + ") win? %b \n", player.getName(), player.getBirthyear(), player.getWinratio(), win);
        }
        else {
            String playerStatus = (player.getRetired())? "retired":"active";
            System.out.printf("%s (%d: Winratio: %.2f "+ playerStatus + ") win? %b \n" , player.getName(), player.getBirthyear(), player.getWinratio(), win);
        }
    }
    static  void startGame(Player player1, Player player2) {
        Random rand = new Random();
        double randomFirst = rand.nextDouble();
        double randomSecond = rand.nextDouble();
        if ((player1.getWinratio() - randomFirst) > (player2.getWinratio() - randomSecond)) {
            String player1Status = (player1.getRetired()) ? "retired" : "active";

            System.out.printf("%s (%d: Winratio: %.2f " + player1Status + ") wins! \n", player1.getName(), player1.getBirthyear(), player1.getWinratio());
        } else if ((player1.getWinratio() - randomFirst) < (player2.getWinratio() - randomSecond)) {
            String playerStatus = (player2.getRetired()) ? "retired" : "active";
            System.out.printf("%s (%d: Winratio: %.2f " + playerStatus + ") wins! \n", player2.getName(), player2.getBirthyear(), player2.getWinratio());
        }
    }

}
