/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.theHunted.view;

import buyi.cit260.theHunted.control.GameControl;
import byui.cit1260.theHunted.model.Animal;
import byui.cit1260.theHunted.model.Game;
import byui.cit1260.theHunted.model.Inventory;
import byui.cit1260.theHunted.model.InventoryItemType;
import byui.cit1260.theHunted.model.Location;
import byui.cit1260.theHunted.model.Map;
import byui.cit260.theHunted.exceptions.GameControlException;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
import thehunted.TheHunted;

/**
 *
 * @author Robert 
 */
public class GameMenuView extends View {
    
 
    
    
        public GameMenuView(){
                   super ("\n"
                        + "\n*************************************"
                        + "\n           Game Menu                 "
                        + "\n*************************************"
                        + "\nV - View Map                         " 
                        + "\nM - Move to new location             "
                        + "\nW - Select Weapon                    "
                        + "\nI - Pick up item                     "   
                        + "\nG - View Gear in Backpack            "
                        + "\nE - View Scenes & Descriptions       "                            
                        + "\nS - Save Game                        " 
                        + "\nH - Help                             " 
                        + "\nQ - Quit                             "
                        + "\n-------------------------------------"); 

}
        

    @Override // Need some help with the switch.
    public boolean doAction(String choice) {
        
        choice = choice.toUpperCase(); // convert choice to upper case
        
        switch (choice) {
            case "V": // View the map
                this.viewMap();
                break;
            case "M": // View the map
                this.movePlayer();
                break;
            case "W": // Select your weapon
                this.selectWeapon();
                break;
            case "I": 
                this.pickUpItem();
                break;
            case "G": // Select the desired animal
                this.viewGear();
                break;
            case "E": // Select the desired animal
                this.viewScenes();
                break;                
            case "S": // Select the desired animal
                this.saveGame();
                break;
            case "H": // Select the desired animal
                this.displayHelpMenu();
                break;
            default:
                ErrorView.display(this.getClass().getName(),
                        "\n*** Invalid Selection *** Try again");
                break;
        }
        
        return false;
    }
    


    private void displayHelpMenu() {
        HelpMenuView helpMenuView = new HelpMenuView();
        helpMenuView.displayHelpMenuView();
    }

    private void saveGame() {
        // prompt for and get the name of the file to save the game in
        this.console.println("\n\nEnter the file name to save the game"
                + "** example Save.txt **");
        String filePath = this.getInput();
        
        try {
            //save the game to the specified file
            GameControl.saveGame(TheHunted.getCurrentGame(), filePath);
        } catch (Exception ex) {
            ErrorView.display("MainMenuView", ex.getMessage());
        }
    }
    
    
    public void viewMap() {
  String leftIndicator;
  String rightIndicator;

  Game game = TheHunted.getCurrentGame(); // retreive the game
  Map map = game.getMap(); // retreive the map from game
  Location[][] locations = map.getLocations(); // retreive the locations from map
    // Build the heading of the map
    this.console.print("  |");
    for( int column = 0; column < locations[0].length; column++){
      // print col numbers to side of map
      this.console.print("  " + column + " |"); 
    }
    // Now build the map.  For each row, show the column information
    this.console.println();
    for( int row = 0; row < locations.length; row++){
     this.console.print(row + " "); // print row numbers to side of map
      for( int column = 0; column < locations[row].length; column++){
        // set default indicators as blanks
        leftIndicator = " ";
        rightIndicator = " ";
        if(locations[row][column] == map.getCurrentLocation()){
          // Set star indicators to show this is the current location.
          leftIndicator = "*"; 
          rightIndicator = "*"; 
        } 
        else if(locations[row][column].isVisited()){
           // Set < > indicators to show this location has been visited.
           leftIndicator = ">"; // can be stars or whatever these are indicators showing visited
           rightIndicator = "<"; // same as above
        }
       this.console.print("|"); // start map with a |
        if(locations[row][column].getScene() == null)
        {
             // No scene assigned here so use ?? for the symbol
             this.console.print(leftIndicator + "??" + rightIndicator);
        }
        else
          this.console.print(leftIndicator
             + locations[row][column].getScene().getSymbol()
             + rightIndicator);
      }
     this.console.println("|");
    }
    this.console.println("You are currently at "+ map.getCurrentScene().getDescription());
    
    if(map.getCurrentScene().getAnimal().ordinal() != Animal.noAnimal.ordinal())
        this.console.println("There is a "+ map.getCurrentScene().getAnimal().name() + " near by.");
        
    if(map.getCurrentScene().getAnimal().ordinal() != Animal.noAnimal.ordinal())
        huntingView();
    
    if(map.getCurrentScene().getInventory()!= null)
        this.console.println("There is a "+ map.getCurrentScene().getInventory().getName() + " near by.");
 }


    private void selectWeapon() {
        WeaponsView weaponsView = new WeaponsView(); 
        weaponsView.display();
    }


    private void viewGear() {
        InventoryView inventoryView = new InventoryView();
        inventoryView.display();
        
    }

    private void movePlayer() {
        viewMap();
        MoveView moveView = new MoveView();
        moveView.display();
        if(TheHunted.getCurrentGame().getMap().getCurrentScene().isStore()) {
            StoreView storeView = new StoreView();
            storeView.display();
        }
        else
        viewMap();
    }

    private void pickUpItem() {
        Map map = TheHunted.getCurrentGame().getMap();
        if(map.getCurrentScene().getInventory()!= null) {
          ArrayList<Inventory> backpack = TheHunted.getCurrentGame().getBackpack();
          backpack.add(map.getCurrentScene().getInventory());
          map.getCurrentScene().setInventory(null);
        }
        else {
            this.console.println("There are no items here!");
        }
            
    }

    private void huntingView() {
        HuntingView huntingView = new HuntingView();
        huntingView.display();
    }

    private void viewScenes() {
        ViewScenes viewScenes = new ViewScenes();
        viewScenes.display();
    }    
}
