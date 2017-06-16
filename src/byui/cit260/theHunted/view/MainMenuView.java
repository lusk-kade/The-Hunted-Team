/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.theHunted.view;

import buyi.cit260.theHunted.control.GameControl;
import java.util.Scanner;
import thehunted.TheHunted;

/**
 *
 * @author Justin
 */
public class MainMenuView extends View {
    
    public MainMenuView() {
    
               super ("\n"
                    + "\n-------------------------------------"
                    + "\n| Main Menu                         |"
                    + "\n-------------------------------------"
                    + "\nN - Start New Game"
                    + "\nG - Get and start saved game"
                    + "\nM - Game Menu"
                    + "\nH - Get help on how to play the game"
                    + "\nS - Save Game"
                    + "\nQ - Quit"
                    + "\n-------------------------------------");    
    }

       
        
    @Override
    public boolean doAction(String value) {
        
        value = value.toUpperCase(); // convert choice to upper case
        
        switch (value) {
            case "N": // create and start a new game
                this.startNewGame();
                break;
            case "G": // get and start an existing game
                this.startExistingGame();
                break;
            case "M": // get game menu
                this.displayGameMenu();
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
            // create a new game
        GameControl.createNewGame(TheHunted.getPlayer());
        
        // display the game menu
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.displayGameMenu();
    }

    private void startExistingGame() {
         System.out.println("*** startExistingGame function called ***");
    }

    private void displayHelpMenu() {
        HelpMenuView helpMenuView = new HelpMenuView();
        
        helpMenuView.displayHelpMenuView();
    }

    private void saveGame() {
        System.out.println("*** saveGame function called ***");
    }

    private void displayGameMenu() {
         GameMenuView gameMenu = new GameMenuView();
         gameMenu.displayGameMenu();
    }

    
}
