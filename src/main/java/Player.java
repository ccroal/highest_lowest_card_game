import java.util.ArrayList;

public class Player {
    private String name;
    private ArrayList<Card> playerHand;

    public Player (String name){
        this.name = name;
        this.playerHand = new ArrayList();
    }



    public String getName() {
        return this.name;
    }

    public int countHand() {
        return this.playerHand.size();
    }

    public void addCardToHand(Card card) {
        this.playerHand.add(card);
    }


    public int cardNumberValue() {
        return this.playerHand.get(0).getRank().getValue();
    }

    public void clearHand() {
        this.playerHand.clear();
    }
}
