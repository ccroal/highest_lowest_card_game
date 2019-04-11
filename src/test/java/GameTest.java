import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class GameTest {
    Game game;
    Player player1;
    Player player2;
    Card card1;
    Card card2;

    @Before
    public void before(){
        game = new Game();
        player1 = new Player("Chris");
        player2 = new Player("Minal");
        card1 = new Card(SuitType.HEARTS, RankType.EIGHT);
        card2 = new Card(SuitType.CLUBS, RankType.EIGHT);
    }

    @Test
    public void addPlayer() {
        game.addPlayer(player1);
        assertEquals(1, game.playerCount());
    }




    @Test
    public void canPlayGame(){
      game.addPlayer(player1);
      game.addPlayer(player2);
      ArrayList<Player> players = game.getPlayers();
      Player winner = game.playHand(players);
      assertEquals(player1, winner);
    }

    @Test
    public void doesRecursionWork(){
        player1.addCardToHand(card1);
        player2.addCardToHand(card2);
        game.addPlayer(player1);
        game.addPlayer(player2);
        ArrayList<Player> winners = game.findWinner();
        Player winner = game.declareWinner(winners);
        assertEquals(player1, winner);
    }

}
