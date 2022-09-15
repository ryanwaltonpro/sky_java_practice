import java.util.ArrayList;
import java.util.List;

public class Deck {
    public static void main(String[] args ){
        Deck d = new Deck();
        d.printCards();
    }
    List<PlayingCard> cards = new ArrayList<>();

    public Deck(){
        createDeck();
    }
    private void createDeck(){
        for(Suit suit: Suit.values()){
            for(Rank rank: Rank.values()){
                PlayingCard card = new PlayingCard(suit, rank);
                cards.add(card);
            }
        }
    }
    public void printCards(){
        for(PlayingCard card : cards){
            System.out.println(card.getSuit() +  " " + card.getRank());

        }
    }



}
