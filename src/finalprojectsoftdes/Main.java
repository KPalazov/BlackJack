/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package finalprojectsoftdes;

/**
 *
 * @author manuelmartinez
 */
public class Main 
{
    public static void main(String[] args) {
        //Say hi to the user
        System.out.println("Welcome to Blackjack");

        //Create and start the Game
        Game blackjack = new Game();
        
        Dealer myDealer = new Dealer();
        System.out.println("The dealer's name is: " + myDealer.getName());
        
        
    }
}
