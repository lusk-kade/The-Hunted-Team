/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.theHunted.view;

import byui.cit1260.theHunted.model.Inventory;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import thehunted.TheHunted;

/**
 *
 * @author Robert
 */
public class InventoryView extends View {
    
    public InventoryView() {
        
        super("");
        displayMessage = getBackPackList(true);
        
    }
   
    public String getBackPackList(boolean forConsole) {
    ArrayList<Inventory> backpack = TheHunted.getCurrentGame().getBackpack();
    int total = 0;
    StringBuilder line = new StringBuilder("                                    ");
    String backPackItems =
       "\r\n------------------------------------------"
     + "\r\n    Here is your backpack inventory       "
     + "\r\n------------------------------------------";
    line.insert(4, "Item");
        line.insert(20, "Type");
        line.insert(28, "Quantity");
        backPackItems += "\r\n" + line.toString();
        backPackItems += "\r\n------------------------------------------";
        
    for(Inventory item:backpack) {
            line = new StringBuilder("                                    ");
            line.insert(0, total +". " + item.getName());
            line.insert(20, item.getInventoryType().name());
            line.insert(32, item.getQuantityInStock());
            backPackItems += "\r\n" + line.toString();
            total++;
        }
     backPackItems += "\r\n------------------------------------------";
     backPackItems += "\r\nTotal items in the backpack = "+ total; 
     if(forConsole) {
         backPackItems += "\r\nEnter a number to use an item?";
         backPackItems += "\r\nPress 'R' to save a report.";
         backPackItems += "\r\nPress 'Q' to go back to previous menu.";
     }
     return backPackItems;       
    }
    @Override
    public boolean doAction(String value) {
        
        value = value.toUpperCase(); // convert choice to upper case
        
        switch (value) {
            case "R":
                this.saveReport();
                break;
            default:
                this.selectItem(value);
                
                break;
        }
        
        return false;
    }


    private void saveReport() {
        displayMessage = "\r\nPlease enter a file name?";
        String fileName = getInput();
        try(PrintWriter outPut = new PrintWriter(fileName)) {
            outPut.printf(this.getBackPackList(false));
            this.console.println("Report file was saved successfully!");
        }
        catch(IOException ex) {
            ErrorView.display(this.getClass().getName(), ex.getMessage());
        }
        displayMessage = this.getBackPackList(true);
    }

    private void selectItem(String value) {
        ArrayList<Inventory> backpack = TheHunted.getCurrentGame().getBackpack();
        int itemIndex = 0;
        
        try {
            
            itemIndex = Integer.parseInt(value);
        }
        catch(NumberFormatException nfe) {
            
            this.console.println("You must enter a valid number.");
            return;
        }
        // Add Try...Catch to protect this function.
        if(itemIndex < 0 || itemIndex >= backpack.size()) {
            this.console.println("Enter a valid number.");
            return;
        }
        Inventory item = backpack.get(itemIndex);
        
        if(backpack.size() <= 0) {
            this.console.println("Sorry! That item is not in the Backpack.");
            return;
        }
        if(item.getQuantityInStock() <= 0) {
            this.console.println("There are none of these items in the Backpack.");
            return;
        }
        item.setQuantityInStock(item.getQuantityInStock() - 1);
        // To do: Update the health of the player based on what they chose
        displayMessage = this.getBackPackList(true);
    }
    
}
