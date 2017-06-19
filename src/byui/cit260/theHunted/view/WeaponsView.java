/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.theHunted.view;

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
                    + "\nS - Save Game"
                    + "\nQ - Quit"
                    + "\n-------------------------------------");
    
    }
    @Override
    public boolean doAction(String value) {
        
        value = value.toUpperCase(); // convert choice to upper case
        
        switch (value) {
            case "R": // create and start a new game
                this.chooseRifle();
                break;
            case "B": // get and start an existing game
                this.chooseBow();
                break;
            case "K": // get game menu
                this.chooseKnife();
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

    private void chooseRifle() {
        System.out.println("*** chooseRifle function called ***");
    }

    private void chooseBow() {
        System.out.println("*** chooseBow function called ***");
    }

    private void chooseKnife() {
        System.out.println("*** chooseKnife function called ***");
    }

    private void saveGame() {
        System.out.println("*** saveGame function called ***");
    }
    
    public void displayWeaponsView() {
         WeaponsView weaponsView = new WeaponsView(); 
         weaponsView.display();
    }
}