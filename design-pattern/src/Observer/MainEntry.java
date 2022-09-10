package Observer;

public class MainEntry {
    public static void main(String[] args) {

        DiceGame diceGame = new FairDiceGame();

        Player player1 = new EvenBettingPlayer("song1");
        Player player2 = new OddBettingPlayer("song2");
        Player player3 = new OddBettingPlayer("song3");

        diceGame.addPlayer(player1);
        diceGame.addPlayer(player2);
        diceGame.addPlayer(player3);


        for (int i = 0; i < 5; i++) {
            diceGame.play();
            System.out.println();
        }
    }
}
