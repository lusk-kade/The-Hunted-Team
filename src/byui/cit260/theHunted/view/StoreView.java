/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.theHunted.view;

import buyi.cit260.theHunted.control.GameControl;
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
        int itemIndex = 0;
        
        try {
            
            itemIndex = Integer.parseInt(value);
        }
        catch(NumberFormatException nfe) {
            
            this.console.println("You must enter a valid number, or 'Q' to quit.");
            return false;
        }
        // Add Try...Catch to protect this function.
        if(itemIndex < 0 || itemIndex >= stock.size()) {
            this.console.println("Enter a valid number.");
            return false;
        }
        Inventory item = stock.get(itemIndex);
        // this.console.println(item.getName());
        
        // Check to see if the item quantity in stock is > 0.
        if(stock.size() <= 0) {
            this.console.println("Sorry! We do not have that item in stock");
            return false;
        }
            
        // Prompt for how many the user wants.
        displayMessage = "How many " + item.getName() +
                " would you like to purchase? There are " + item.getQuantityInStock() +
                " available.";
        
        String sQuantity = getInput();
        getStockMessage();
        int quantity = 0;
         try {
            
            quantity = Integer.parseInt(sQuantity);
        }
        catch(NumberFormatException nfe) {
            
            this.console.println("You must enter a valid number, or 'Q' to quit.");
            return false;
        }
        // Check to see if the user has any of these items in the backpack.
        if(quantity <= 0 || quantity > item.getQuantityInStock()) {
            this.console.println("Sorry! This is an invalid request.");
            return false;
        }
        // Check to see if quantity * item.unitPrice < moneyInWallet
        double playerCash = TheHunted.getCurrentGame().getPlayer().getCash();
        if(quantity * item.getUnitPrice() > playerCash) {
            this.console.println("Sorry! You don't have enough money. You currently have $" + playerCash);
            return false;
        }
        TheHunted.getCurrentGame().getPlayer().setCash(playerCash - (quantity * item.getUnitPrice()));
        GameControl.addToBackPack(item, quantity);
        getStockMessage();
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
        displayMessage += "You currently have $" + TheHunted.getCurrentGame().getPlayer().getCash();
        displayMessage += "\n\rEnter the item you would like to purchase. (Press 'Q' to quit.)";
        
    }
    
}
