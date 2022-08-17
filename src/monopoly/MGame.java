package monopoly;

public class MGame {

    private int roundCnt;
    private Die[] dice;
    private Player[] players;
    private Board board;

    private static final int N=20;

    public void playGame(){
        for (roundCnt = 0; roundCnt < N; roundCnt++) {
            playRound();
        }
    }

    public void playRound(){
        for(Player player : players) {
            player.takeTurn();
        }
    }

}