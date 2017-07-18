/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.theHunted.view;

import byui.cit1260.theHunted.model.Inventory;
import byui.cit1260.theHunted.model.InventoryItemType;

/**
 *
 * @author Robert
 */
public class WeaponsView extends View {
    
    public WeaponsView(){
        
              super ("\n"
                    + "\n-------------------------------------"
                    + "\n|        Choose Your Weapon         |"
                    + "\n-------------------------------------"
                    + "\nR - Rifle"
                    + "\nB - Bow"
                    + "\nK - Knife"
                    + "\nS - Shotgun"
                    + "\nP - Pistol"
                    + "\nQ - Quit"
                    + "\n-------------------------------------");
    
    }
    @Override
    public boolean doAction(String value) {
        
        value = value.toUpperCase(); // convert choice to upper case
        
        switch (value) {
            case "R":
                this.chooseRifle();
                break;
            case "B":
                this.chooseBow();
                break;
            case "K":
                this.chooseKnife();
                break;
            case "S":
                this.chooseShotgun();
                break;
            case "P":
                this.choosePistol();
                break;
            default:
                ErrorView.display(this.getClass().getName(),
                        "\n*** Invalid Selection *** Try again");
                break;
        }
        
        return false;
    }
    

    private void chooseRifle() {    
        this.console.print("You have chosen to use your rifle.");
    }
        
    private void chooseBow() {
        this.console.print("You have chosen to use your bow.");
    }

    private void chooseKnife() {
        this.console.print("You have chosen to use your knife.");
    }

    private void chooseShotgun() {
        this.console.print("You have chosen to use your shotgun.");
    }

    private void choosePistol() {
        this.console.print("You have chosen to use your pistol.");
    }
    
    
}