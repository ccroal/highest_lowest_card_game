import java.util.ArrayList;
import java.util.Collections;

public class Deck {
    private ArrayList<Card> cardDeck;

    public Deck (){
        this.cardDeck = new ArrayList();
    }


    public void createDeck(){

        for (SuitType suit : SuitType.values()  ){
            for (RankType rank : RankType.values()){
                Card cardCreated = new Card(suit, rank);
                this.cardDeck.add(cardCreated);
            }

        }

    }


    public int deckCount(){
       return this.cardDeck.size();
    }


    public void shuffleDeck(){
        Collections.shuffle(this.cardDeck);
    }


    public Card dealCard() {
        return this.cardDeck.remove(0);
    }
}
