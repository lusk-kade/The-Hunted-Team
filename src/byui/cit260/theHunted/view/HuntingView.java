/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.theHunted.view;


import java.util.Scanner;
import thehunted.TheHunted;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import thehunted.MoveMenuView;

/**
 *
 * @author Justin
 */
public class HuntingView {
    
    
    String animalName;
    
        
    
    // Need to make 25 of these - Reads input from MoveMenuView
    if huntingSpot == 1 {
        System.out.println("\n*** Insert Description of View");
}
 
    if huntingSpot == 2 {
        System.out.println("\n*** Insert Description of View");
}    
    
    if huntingSpot == 3 {
        System.out.println("\n*** Insert Description of View");
}    
 
    if huntingSpot == 4 {
        System.out.println("\n*** Insert Description of View");
}    
    
    if huntingSpot == 5 {
        System.out.println("\n*** Insert Description of View");
}    



    
    


    
    
// Animal shows up ready to be hunted
    
    if huntingSpot == 3 {
        System.out.println("\n*** Insert Description of Animal");
}

    if huntingSpot == 7 {
        System.out.println("\n*** Insert Description of Animal");
}

    if huntingSpot == 14 {
        System.out.println("\n*** Insert Description of Animal");
}

    if huntingSpot == 19 {
        System.out.println("\n*** Insert Description of Animal");
}

    if huntingSpot == 23 {
        System.out.println("\n*** Insert Description of Animal");
}


 public String getAnimalName() {

        Scanner keyboard = new Scanner(System.in); // get infile for keyboard
        String value = ""; // value to be returned
        boolean valid = false; // initialize to not valid
         
        while (!valid) { // loop while an invalid value is entered
                        
            value = keyboard.nextLine(); // get next line typed on keyboard
            value = value.trim(); // trim off leading and trailing blanks            
            
            if (value.length() < 1) { // value is blank
                System.out.println("\nInvalid value: value can not be blank");
                continue;
            }
        
            break; // end the loop
        
    }
        
        return animalName;
  
 }

 
 
    private String doAction(String choice) {
        switch (choice) {
            case "rabbit":
                this.CalcAnmialPoints();
                break;
            case "deer":
                this.CalcAnmialPoints();
                break;
            case "moose":
                this.CalcAnmialPoints();
                break;
            case "bear":
                this.CalcAnmialPoints();
                break;
                return;
            default:
                System.out.println("\n*** Invalid selection *** Try Again");
                break;
        }
    }

    private void CalcAnmialPoints() {
        int value = GameContorl.calcAnimalPoints(theHunted.getAnimalName());
    }
 
 
 
 
 
 
 
 
 
}
