/*
 * SYST17796 - Fundamentals of Software Design and Development
 * Course Project - Deliverable 3
 */
package finalprojectsoftdes;

/**
 * @author ManuelMartinez 
 * @author KaloyanPalazov 
 * @author StephenPaton 
 * @author AhmadAyoub
 */
public class Card 
{
    //vars
    private Suit suit;
    private Rank rank;

    //create a card given a suit and a rank
    public Card(Suit suit, Rank rank)
    {
        this.suit = suit;
        this.rank = rank;
    }

    public int getValue()
    {
        return rank.rankValue;
    }

    public Suit getSuit()
    {
        return suit;
    }

    public Rank getRank()
    {
        return rank;
    }

    public String toString()
    {
        return ("["+rank+" of "+ suit + "] ("+this.getValue()+")");

    }
    
    public Card(Card card)
    {
        this.suit = card.getSuit();
        this.rank = card.getRank();
    }
    
}
