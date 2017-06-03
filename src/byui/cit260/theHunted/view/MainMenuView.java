/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.theHunted.view;

import java.util.Scanner;

/**
 *
 * @author Justin
 */
public class MainMenuView {
    
    private String menu;
    
    
        public MainMenuView(){
        this.menu =   "\n"
                    + "\n-------------------------------------"
                    + "\n| Main Menu                         |"
                    + "\n-------------------------------------"
                    + "\nN - Start New Game"
                    + "\nG - Get and start saved game"
                    + "\nH - Get help on how to play the game"
                    + "\nS - Save Game"
                    + "\nQ - Quit"
                    + "\n-------------------------------------";      
        
    }

        
public void displayMainMenuView() {
    
        boolean done = false; // set flag to not done
        do {
            // prompt for and get players name
            String menuOption = this.getMenuOption();
            if (menuOption.toUpperCase().equals("Q")) // user wants to quit
                return; // exit the game
            
            // do the requested action and display the next view
            done = this.doAction(menuOption);
            
        } while (!done);  
    
}
        


    private String getMenuOption() {

        Scanner keyboard = new Scanner(System.in); // get infile for keyboard
        String value = ""; // value to be returned
        boolean valid = false; // initialize to not valid
         
        while (!valid) { // loop while an invalid value is entered
            System.out.println("\n" + this.menu);
            
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

    private boolean doAction(String choice) {
        
        choice = choice.toUpperCase(); // convert choice to upper case
        
        switch (choice) {
            case "N": // create and start a new game
                this.startNewGame();
                break;
            case "G": // get and start an existing game
                this.startExistingGame();
                break;
            case "H": // display the help menu
                this.displayHelpMenu();
                break;
            case "S": // save the current game
                this.saveGame();
                break;
            default:
                System.out.println("\n*** Invalid Selection *** Try again");
                break;
        }
        
        return false;
    }
    



    private void startNewGame() {
        System.out.println("*** startNewGame function called ***");
    }

    private void startExistingGame() {
         System.out.println("*** startExistingGame function called ***");
    }

    private void displayHelpMenu() {
        System.out.println("*** displatHelpMenu function called ***");
    }

    private void saveGame() {
        System.out.println("*** saveGame function called ***");
    }


    void display() {
        System.out.println("\n** displayMenu() function called ***");
    }

    
}
