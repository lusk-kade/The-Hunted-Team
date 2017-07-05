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
public class StoreView extends View {

    @Override
    public boolean doAction(String value) {
        //throw new UnsupportedOperationException("Not supported yet."); 
        
        ArrayList<Inventory> stock = TheHunted.getCurrentGame().getMap().getCurrentScene().getStoreStock();
        int itemIndex = Integer.parseInt(value);
        // Add Try...Catch to protect this function.
        //try {
        if(itemIndex < 0 || itemIndex >= stock.size()) {
            System.out.println("Enter a valid number.");
        } /*catch (InventoryControlException ex) {
               System.out.println("***Invalid entry***"); 
                } */
        Inventory item = stock.get(itemIndex);
        System.out.println(item.getName());
        
        // Check to see if the item quantity in stock is > 0.
        if(stock.size() > 0) {
            System.out.println("We have that item in stock");
            return false;
        }
            
        // Prompt for how many the user wants.
        
        // Check to see if the user has any of these items in the backpack.
        // Check 
        return false;
    }

    public StoreView() {
        super("");
        getStockMessage();
    }

    private void getStockMessage() {
        int count = 0;
        ArrayList<Inventory> stock = TheHunted.getCurrentGame().getMap().getCurrentScene().getStoreStock();
        displayMessage = "     Hunting Equipment Available!\n\r";
        StringBuilder line = new StringBuilder("                                    ");
        line.insert(0, "Item");
        line.insert(20, "Count");
        line.insert(28, "Price");
        displayMessage += line.toString() + "\n\r";
        displayMessage += "===================================\n\r";
        for(Inventory item:stock) {
            line = new StringBuilder("                                    ");
            line.insert(0, count +". " + item.getName());
            line.insert(20, item.getQuantityInStock());
            line.insert(28, item.getUnitPrice());
            displayMessage += line.toString() + "\n\r";
            count++;
            
        }
        displayMessage += "\n\rEnter the item you would like to purchase. (Press 'Q' to quit.)";
        
    }
    
}
