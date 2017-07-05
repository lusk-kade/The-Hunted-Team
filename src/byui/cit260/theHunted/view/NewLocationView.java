/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.theHunted.view;

import java.util.Scanner;

/**
 *
 * @author palme
 */
public class NewLocationView {

    private String location;

    public void displayNewLocationView() {

        boolean done = false; // set flag to not done
        do {
            // prompt for and get new location
            int row = this.getIntInput("\nEnter row (-1 to cancel)");
            if (row < 0) // user wants to quit
            {
                return; // exit the game
            }
            int column = this.getIntInput("\nEnter column (-1 to cancel)");
            if (column < 0) // user wants to quit
            {
                return; // exit the game
            }
            // do the requested action and display the next view
            done = this.doAction(row, column);

        } while (!done);

    }


public int getIntInput(String prompt) {

   Scanner keyboard = new Scanner(System.in);
   boolean valid = false;
   int selection = 0;

   // While statement
   while (!valid) {
      System.out.println(prompt);
      selection = keyboard.nextInt();

      if (selection > 4) {
          System.out.println("\n*** Invalid selection *** Try Again");
          continue;
      }
       
      break;
    }

    return selection;
}

public boolean doAction(int row, int column) {
    System.out.println("You entered row: " + row + " and column: " + column);
    
    return true;
}

}