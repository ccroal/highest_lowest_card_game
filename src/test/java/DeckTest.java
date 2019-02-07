import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DeckTest {
    Deck deck;

    @Before
    public void before() {
        deck = new Deck();
    }

    @Test
    public void canCreateDeck() {
        deck.createDeck();
        assertEquals(52, deck.deckCount());
    }

    @Test
    public void canDealFromUnshuffledDeck() {
        deck.createDeck();
        Card dealcard = deck.dealCard();
        assertEquals(SuitType.HEARTS, dealcard.getSuit());
        assertEquals(RankType.ACE, dealcard.getRank());
    }
}
