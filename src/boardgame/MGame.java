package boardgame;

public class MGame {
    private int roundCnt;
    private Die[] dice;
    private Board board;
    private Player[] players;
    private static int N = 20;
    public void playGame(){
        for(roundCnt=0;roundCnt<N;roundCnt++){
            playRound();
        }
    }
    private void playRound(){
        for(Player player : players){
            player.takeTurn();
        }
    }
}
