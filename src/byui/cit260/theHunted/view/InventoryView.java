/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.theHunted.view;

import byui.cit1260.theHunted.model.Inventory;
import java.util.ArrayList;
import thehunted.TheHunted;

/**
 *
 * @author Robert
 */
public class InventoryView extends View {
    
    public InventoryView() {
        
        super ("");
    }
    @Override
    public void display() {
    ArrayList<Inventory> backpack = TheHunted.getCurrentGame().getBackpack();
    int total = 0;
    // add a heading here.
    for(Inventory item:backpack) {
        System.out.println(total + ". " + item.getName());
        total++;
    }
     System.out.println("Total items in the backpack = "+ total);   
            
    }
    @Override
    public boolean doAction(String value) {
        
        value = value.toUpperCase(); // convert choice to upper case
        
        switch (value) {
            case "R":
                this.chooseRope();
                break;
            case "W":
                this.chooseWater();
                break;
            case "F":
                this.chooseFood();
                break;
            default:
                System.out.println("\n*** Invalid Selection *** Try again");
                break;
        }
        
        return false;
    }

    private void chooseRope() {
        System.out.println("*** chooseRope function called ***");
    }

    private void chooseWater() {
        System.out.println("*** Do not dehydrate function called ***");
    }

    private void chooseFood() {
        System.out.println("*** Starvation Prevention function called ***");
    }
    
}
