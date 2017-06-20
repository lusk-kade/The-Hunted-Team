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
 * @author Robert 
 */
public class GameMenuView extends View {
    
 
    
    
        public GameMenuView(){
                   super ("\n"
                        + "\n*************************************"
                        + "\n           Game Menu                 "
                        + "\n*************************************"
                        + "\nV - View Map                         " 
                        + "\nT - Select Terrain                   " 
                        + "\nA - View Ammo                        " 
                        + "\nW - Select Weapon                    " 
                        + "\nD - Select Desired Animal            " 
                        + "\nU - Use Weapon                       "   
                        + "\nR - Retrieve Animal                  " 
                        + "\nP - Player Status                    " 
                        + "\nG - View Gear                        " 
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
            case "T": // Select the terrain
                this.selectTerrain();
                break;
            case "A": // View the ammo
                this.viewAmmo();
                break;
            case "W": // Select your weapon
                this.selectWeapon();
                break;
            case "D": // Select the desired animal
                this.selectDesiredAnimal();
                break;
            case "U": // Select the desired animal
                this.useWeapon();
                break;
            case "R": // Select the desired animal
                this.retrieveAnimal();
                break;
            case "P": // Select the desired animal
                this.playerStats();
                break;
            case "G": // Select the desired animal
                this.viewGear();
                break;
            case "S": // Select the desired animal
                this.saveGame();
                break;
            case "H": // Select the desired animal
                this.displayHelpMenu();
                break;
            default:
                System.out.println("\n*** Invalid Selection *** Try again");
                break;
        }
        
        return false;
    }
    


    private void displayHelpMenu() {
        HelpMenuView helpMenuView = new HelpMenuView();
        
        helpMenuView.displayHelpMenuView();
    }

    private void saveGame() {
        System.out.println("*** saveGame function called ***");
    }

    private void viewMap() {
        System.out.println("*** viewMap function called ***");
    }

    private void selectTerrain() {
        System.out.println("*** selectTerrain function called ***");
    }

    private void viewAmmo() {
        System.out.println("*** viewAmmo function called ***");
    }

    private void selectWeapon() {
         WeaponsView weaponsView = new WeaponsView(); 
         weaponsView.display();
    }

    private void selectDesiredAnimal() {
        System.out.println("*** selectDesiredAnimal function called ***");
    }

    private void useWeapon() {
        System.out.println("*** useWeapon function called ***");
    }

    private void retrieveAnimal() {
        System.out.println("*** retrieveAnimal function called ***");
    }

    private void playerStats() {
        System.out.println("*** playerStats function called ***");
    }

    private void viewGear() {
        System.out.println("*** viewGear function called ***");
    }







    
}