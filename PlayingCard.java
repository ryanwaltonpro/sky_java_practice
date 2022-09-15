public class PlayingCard {
    private Rank rank;

    public Rank getRank() {
        return rank;
    }

    public void setRank(Rank rank) {
        this.rank = rank;
    }

    public Suit getSuit() {
        return suit;
    }

    public void setSuit(Suit suit) {
        this.suit = suit;
    }

    private Suit suit;
    public PlayingCard(){

    }
    public PlayingCard(Suit suit, Rank rank){
        this.suit = suit;
        this.rank = rank;
    }
}
