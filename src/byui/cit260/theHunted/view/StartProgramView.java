/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.theHunted.view;

import buyi.cit260.theHunted.control.GameControl;
import byui.cit1260.theHunted.model.Player;
import java.util.Scanner;

/**
 *
 * @author Justin
 */
public class StartProgramView {
    
    private String promptMessage;
    
    public StartProgramView() {
        
        this.promptMessage = "\nPlease enter your name:";
        // display the banner when view is created
        this.displayBanner();
        
    }

    private void displayBanner() {
        
        System.out.println(
                "\n***********************************"
               +"\n*                                 *"
               +"\n* The Hunt is a text-based game   *"
               +"\n* where you will be hunting wild  *"
               +"\n* game. As the hunter, you will   *"
               +"\n* travel to different locations,  *"
               +"\n* from the mountains of Alaska    *"
               +"\n* to the swamps of Florida, in    *"
               +"\n* search of game such as deer,    *"
               +"\n* alligator and more.             *"
               +"\n*                                 *"
               +"\n* The hunter begins as a novice   *"
               +"\n* hunter. As you progress from    *"
               +"\n* smaller to bigger hunts, you    *"
               +"\n* will gain weapons, ammo, other  *"
               +"\n* gear, and experience. At each   *"
               +"\n* location you will encounter     *"
               +"\n* different terrains and weather. *"
               +"\n* You win when you complete all   *"
               +"\n* of the hunts, but beware of the *"
               +"\n* predators. If they catch their  *"
               +"\n* prey, you lose.                 *"
               +"\n***********************************"
               );
        
        
    }
    // displays the start program view
    public void displayStartProgramView() {
        
        boolean done = false; // set flag to not done
        
        do {  
            // Prompt for and get players name
            String playersName = this.getPlayersName();
            if (playersName.toUpperCase().equals("Q")) // user wants to quit 
                return; // exit the game

            // do requested action and display the next view
            done = this.doAction(playersName);
            
        } while (!done);
                
    }

    private String getPlayersName() {
        
        Scanner keyboard = new Scanner(System.in); // get infile for keyboard
        String value = ""; // value to be returned
        boolean valid = false; // initialize to not valid
         
        while (!valid) { // loop while an invalid value is entered
            System.out.println("\n" + this.promptMessage);
            
            value = keyboard.nextLine(); // get next line typed on keyboard
            value = value.trim(); // trim off leading and trailing blanks
            
            
            if (value.length() < 1) { // value is blank
                System.out.println("\nInvalid value: value can not be blank");
                continue;
            }
        
            break; // end the loop
            
    }
    
    return value; // return the value entered

}    
    
    private boolean doAction(String playersName) {
        
        if (playersName.length() < 2) {
            System.out.println("\nInvalid players name: "
                     + "The name must be greater than one character in lenght");
            return false;
        }
    
    // call createPlayer() control function
    Player player = GameControl.createPlayer(playersName);
    
        if (player == null) { // if unsuccessful
            System.out.println("\nError creating the player.");
            return false;
        }
    
    // display next view
    this.displayNextView(player);
    
    return true; // success!
     
    }

    private void displayNextView(Player player) {

        // display a custom welcome message
        System.out.println("\n======================================"
                          + "\n Welcome to The Hunted " + player.getName() + "!"
                          + "\n====================================="
                          );
        
        // Create MainMenuView object
        MainMenuView mainMenuView = new MainMenuView();
        
        mainMenuView.displayMainMenuView();
    }
}