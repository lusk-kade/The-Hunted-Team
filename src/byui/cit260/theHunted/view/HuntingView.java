/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.theHunted.view;


import buyi.cit260.theHunted.control.InventoryControl;
import byui.cit260.theHunted.view.GameMenuView;
import byui.cit1260.theHunted.model.Animal;
import static byui.cit1260.theHunted.model.Animal.bear;
import static byui.cit1260.theHunted.model.Animal.rabbit;
import byui.cit1260.theHunted.model.Game;
import byui.cit1260.theHunted.model.Map;
import byui.cit260.theHunted.exceptions.InventoryControlException;
import java.io.BufferedReader;
import java.io.IOException;
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
    
    private double nameValue;
    private double gamePoints;
    private String promptMessage;
    private Object animalName;
    private int animalWeight;


 
    
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
        
        try {
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
        } catch (InventoryControlException ex) {
            Logger.getLogger(HuntingView.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(HuntingView.class.getName()).log(Level.SEVERE, null, ex);
        }
        return true;
    }

    private String fireWeapon() throws InventoryControlException, IOException {

        double pointScalar = .1;
        double animalWeight = 0;
            
        this.console.println("\n*** Good Shot! You aimed, fired, and have now collected your kill ***");
            
        this.console.println("\nPlease enter animal name");
            String animalName = this.getInput();
            
        this.console.println("\nPlease enter animal weight");
            animalWeight = this.getanimalWeight(animalName);
            
        return animalName;
            
  }
    
    private double getanimalWeight(String animalName) throws InventoryControlException, IOException {
        
       double pointScalar = .1;
       double animalWeight = 0;
       
       animalWeight = keyboard.read();
       
       switch (animalName) {
           case "rabbit":
            nameValue = 1;
            break;
           case "deer":
            nameValue = 80;
            break;
           case "moose":
            nameValue = 125;
            break;
           case "bear":
            nameValue = 200;
            break;
           default:
            throw new InventoryControlException("\n*** Invalide animal name *** Try again");
       }
/**       
       if ("rabbit".equals(animalName) & (animalWeight > 15 || animalWeight < 3)) {
            throw new InventoryControlException("\n*** Invalide animal name *** Try again");
       }
       
       if ("deer".equals(animalName) & (animalWeight > 450 || animalWeight < 400)) {
            throw new InventoryControlException("\n*** Invalide animal name *** Try again");
       }
**/
        double points = (animalWeight * nameValue) / pointScalar;
            return points;
           
   
    }
    
        private void skipShot() {
        GameMenuView gameMenuView = new GameMenuView();
        gameMenuView.display();
}

    
    
    }
    
    

