/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.theHunted.view;

import java.io.BufferedReader;
import java.io.PrintWriter;
import java.util.Scanner;
import thehunted.TheHunted;

/**
 *
 * @author The Hunted Team
 */
public abstract class View implements ViewInterface {
    
    protected String displayMessage;
        private String message;
    
    
    protected final BufferedReader keyboard = TheHunted.getInFile();
    protected final PrintWriter console = TheHunted.getOutFile();
    

    public View() {
    }
    
    public View(String message) {
        this.displayMessage = message;
    }
    
    @Override
    public void display() {
    
        boolean done = false; // set flag to not done
        do {
            // prompt for and get players name
            String value = this.getInput();
            if (value.toUpperCase().equals("Q")) // user wants to quit
                return; // exit the game
            
            // do the requested action and display the next view
            done = this.doAction(value);
            
        } while (!done);
    }
    
    @Override
    public String getInput() {

        String value = null; // value to be returned
        boolean valid = false; // initialize to not valid
    try {     
        while (!valid) { // loop while an invalid value is entered
            this.console.println("\n" + this.displayMessage);
            
            value = this.keyboard.readLine(); // get next line typed on keyboard
            value = value.trim(); // trim off leading and trailing blanks            
            
            if (value.length() < 1) { // value is blank
                ErrorView.display(this.getClass().getName(),
                        "\nInvalid value: value can not be blank");
                continue;
            }
        
            break; // end the loop
        }    
    }   catch (Exception e) {
            ErrorView.display(this.getClass().getName(),
                    "Error reading input: " + e.getMessage());
            }
    
    return value; // return the value entered   
    
    }
}
