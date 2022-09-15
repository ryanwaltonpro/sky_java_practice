import java.util.ArrayList;
import java.util.List;

public class Deck {

    public static void main(String[] args ){
        Deck d = new Deck();
        d.printCards();
        d.printNumbersAndString("hello",2,1,4,12);
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

    public void printNumbersAndString(String title, int...numbers){
        System.out.println(title);
        printNumbers(numbers);
    }
    public void printNumbers(int... numbers){
        System.out.println();

        System.out.println("===varargs===");
        System.out.println(numbers.length + " arguments");
        for(int number: numbers){
            System.out.print(number + " ");
        }
    }


}
