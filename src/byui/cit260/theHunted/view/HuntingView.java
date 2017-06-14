/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.theHunted.view;


import java.io.BufferedReader;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Justin
 */
public class HuntingView {
    

    private String promptMessage;
    
    public HuntingView() {
        
        this.promptMessage = "\nYou are feeling lucky";
        try {
            TimeUnit.SECONDS.sleep(90);
        } catch (InterruptedException ex) {
            Logger.getLogger(HuntingView.class.getName()).log(Level.SEVERE, null, ex);
        }
        // display the banner when view is created
        this.displayBanner();
        
    }    
    
    
    private void displayBanner() {
        
        System.out.println(
                "\n***********************************"
               +"\n*                                 *"
               +"\n* You have been quiet and ready   *"
               +"\n* to hunt. This area is known to  *"
               +"\n* be the place where the most     *"
               +"\n* animals are spoted.  *"
               +"\n*                                 *"
               +"\n* Be ready at any moment, you     *"
               +"\n* never know when an animal will  *"
               +"\n* appear!                         *"
               +"\n*                                 *"
               +"\n***********************************"
               );     
    }     
    
    /*
    public void HuntingView(){
     
            try {
            TimeUnit.SECONDS.sleep(30);
        } catch (InterruptedException ex) {
            Logger.getLogger(HuntingView.class.getName()).log(Level.SEVERE, null, ex);
        }    
        
        if (location = 3) {
            System.out.println("\n***Animal has shown up***"
                   + "\nYou take the shot an make the kill."
                   + "\nYou move to inspect your kill."
                   + "\nYour rabbit weighs 9 pounds.");
        }
        
        
    }
    
    
   public String getAnimalName() {
       
       String animalName;
       double animalWeight;
       
       do{
           System.out.println("\nGreat shot!");
           animalName = this.getAnimalName();
           animalWeight = this.getAnimalWeight();
       }
       
       
   }
    
   */
}
