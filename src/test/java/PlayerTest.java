import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlayerTest {

    Player player;
    Card card;

    @Before
    public void before(){
        player = new Player("Player1");
        card = new Card(SuitType.HEARTS, RankType.ACE);
    }

    @Test
    public void hasName() {
        assertEquals("Player1", player.getName());
    }

    @Test
    public void hasHand() {
        assertEquals(0, player.countHand());
    }

    @Test
    public void canAddCard() {
        player.addCardToHand(card);
        assertEquals(1, player.countHand());
    }

    @Test
    public void canFindCardNumberValue() {
        player.addCardToHand(card);
        assertEquals(1, player.cardNumberValue());
    }
}
