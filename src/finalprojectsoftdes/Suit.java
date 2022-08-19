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

public enum Suit 
{
    CLUB("Clubs"),
    DIAMOND("Diamonds"),
    HEART("Hearts"),
    SPADE("Spades");

    String suitName;

    Suit(String suitName) 
    {
        this.suitName = suitName;
    }

    public String toString()
    {
        return suitName;
    }
    
}
