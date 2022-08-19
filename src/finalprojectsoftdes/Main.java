/*
 * SYST17796 - Fundamentals of Software Design and Development
 * Course Project - Deliverable 3
 */
package finalprojectsoftdes;

/**
 * @author ManuelMartinez 
 * @author HaloyanPalazov 
 * @author StephenPaton 
 * @author AhmadAyoub
 */
public class Main 
{
    public static void main(String[] args) 
    {
        //Welcome the user to the game
        System.out.println("Welcome to Blackjack");

        //Create and start the Game object
        Game blackjack = new Game();
        
        //Create Dealer
        Dealer myDealer = new Dealer();
        
        System.out.println("The dealer's name is: " + myDealer.getName()); 
    }
}
