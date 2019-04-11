import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class CardTest {
    Card card;



    @Before
    public void before(){
        card = new Card(SuitType.HEARTS, RankType.ACE);
    }

    @Test
    public void cardHasSuitType(){
        assertEquals(SuitType.HEARTS, card.getSuit());
    }

    @Test
    public void cardHasRankType(){
        assertEquals(RankType.ACE, card.getRank());
    }

    @Test
    public void cardHasValue() {
        assertEquals(1, card.getValueFromEnum());
    }


}
