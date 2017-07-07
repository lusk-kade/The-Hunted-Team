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
                this.startSavedGame();
                break;
            case "H": // display the help menu
                this.displayHelpMenu();
                break;
            case "S": // save the current game
                this.saveGame();
                break;
            default:
                ErrorView.display(this.getClass().getName(),
                        "\n*** Invalid Selection *** Try again");
                break;
        }
        
        return false;
    }
    



    private void startNewGame() {
            // create a new game
        GameControl.createNewGame(TheHunted.getPlayer());
        
        // display the game menu
        GameMenuView gameMenuView = new GameMenuView();
        gameMenuView.display();
    }

    private void startSavedGame() {
        // prompt for and get the name of the file to save the game in
        this.console.println("\n\nEnter the file name of the"
                + "saved game.");
        String filePath = this.getInput();
        
        try {
            //save a saved game
            GameControl.getSavedGame(filePath);
        } catch (Exception ex) {
            ErrorView.display("MainMenuView", ex.getMessage());
        }
        
        // display the game menu
        GameMenuView gameMenuView = new GameMenuView();
        gameMenuView.display();
    }

    private void displayHelpMenu() {
        HelpMenuView helpMenuView = new HelpMenuView();
        
        helpMenuView.displayHelpMenuView();
    }

    private void saveGame() {
        // prompt for and get the name of the file to save the game in
        this.console.println("\n\nEnter the file name to save the game"
                + "** example Save.txt. **");
        String filePath = this.getInput();
        
        try {
            //save the game to the specified file
            GameControl.saveGame(TheHunted.getCurrentGame(), filePath);
        } catch (Exception ex) {
            ErrorView.display("MainMenuView", ex.getMessage());
        }
        
    }   
}
