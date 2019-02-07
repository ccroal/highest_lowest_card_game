import java.util.ArrayList;
import java.util.Collections;

public class Game {
    public Deck getDeck;
    private ArrayList<Player> players;
    private Deck gameDeck;

    public Game (){
        this.players = new ArrayList();
        this.gameDeck = new Deck();
    }


    public int playerCount() {
        return this.players.size();
    }

    public void addPlayer(Player player){
        this.players.add(player);
    }

    public Deck getDeck(){
        return this.gameDeck;
    }

    public Player createPlayer(String name){
        Player player = new Player(name);
        return player;
    }

    public ArrayList getPlayers() {
        return this.players;
    }

    public Player getPlayers(int index) {
        return this.players.remove(index);
    }

    public void dealCards(ArrayList<Player> players) {
        Deck deckInPlay = this.gameDeck;
        deckInPlay.shuffleDeck();
        for(Player player : players){
            Card playerCard = deckInPlay.dealCard();
            player.addCardToHand(playerCard);
        }
    }


    public ArrayList findWinner() {
        ArrayList<Player> winners = new ArrayList();
        ArrayList<Player> others = new ArrayList();
        Player winningPlayer = this.players.get(0);


        for (int i = 1; i < this.players.size(); i++) {
            if (this.players.get(i).cardNumberValue() > winningPlayer.cardNumberValue()) {
                winningPlayer = this.players.get(i);
            } else {
                others.add(this.players.get(i));
            }
        }
        winners.add(winningPlayer);

//        Player firstWinner = winners.get(0);
//
//        for(Player player : others){
//            if (player.cardNumberValue() == firstWinner.cardNumberValue()) {
//                Player otherwinner = player;
//                winners.add(otherwinner);
//            }
//
//        }


        return winners;
    }





    public Player declareWinner(ArrayList foundWinners){
        ArrayList<Player> winners = foundWinners;
        if (winners.size() > 1){
            playHand(winners);
            }
            Player winner = winners.remove(0);
            return winner;
        }



    public Player playHand(ArrayList players){
        this.gameDeck.createDeck();
        dealCards(players);
        ArrayList<Player> winners = findWinner();
        return declareWinner(winners);
    }

}