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
public class Dealer extends Person
{

    /**
     * Create a new Dealer
     */
    public Dealer()
    {
        //Name the dealer "Dealer"
        super.setName("Dealer");
    }
    
    /**
 * Prints the dealer's first hand, with one card face down.
 */
    public void printFirstHand()
    {
        System.out.println("The dealer's hand looks like this:");
        System.out.println(super.getHand().getCard(0));
        System.out.println("The second card is face down.");
    }

}
