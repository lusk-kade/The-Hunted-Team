/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.theHunted.view;


import byui.cit1260.theHunted.model.Animal;
import static byui.cit1260.theHunted.model.Animal.bear;
import static byui.cit1260.theHunted.model.Animal.rabbit;
import byui.cit1260.theHunted.model.Game;
import byui.cit1260.theHunted.model.Map;
import java.io.BufferedReader;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import thehunted.TheHunted;

/**
 *
 * @author Justin
 */
public class HuntingView extends View {
    


 
    
    public HuntingView() {

         super ( "\n***********************************"
               + "\n*                                 *"
               + "\n* As you may have noticed there   *"
               + "\n* is an animal near by and it is  *"
               + "\n* time to hunt.                   *"
               + "\n*                                 *"                 
               + "\n***********************************"
               + "\n                                   "
               + "\n F - Will fire your weapon         "
               + "\n S - Will skip this shot           "
               + "\n                                   "                 
               + "\n***********************************"); 
         
         
    }     
    
    @Override
    public boolean doAction(String value) {
        
        value = value.toUpperCase(); // convert choice to upper case
        
        switch (value) {
            case "F":
                this.fireWeapon();
                break;
            case "S":
                this.skipShot();
                break;
            default:
                ErrorView.display(this.getClass().getName(),
                        "\n*** Invalid Selection *** Try again");
                break;                
        }
        
        return false;
    }

    private void fireWeapon() {
        Game game = TheHunted.getCurrentGame();
        Animal animal = game.getAnimal();
        
        this.console.println("\n*** Good Shot! You aimed, fired, and have now collected your kill ***");
        
        if (animal == rabbit);
            this.console.println("Your rabbit weighs 6 pounds.");
        
       // if(buyi.cit260.theHunted.control.MapControl.createMap().getCurrentScene().getAnimal().ordinal() == Animal.rabbit.ordinal());
       
    }

    private void skipShot() {
        GameMenuView gameMenuView = new GameMenuView();
        gameMenuView.display();
    }

    
}
