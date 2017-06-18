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
public class HuntingView extends View {
    


    
/*    
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
  */  
    
    public HuntingView() {
    
         super ( "\n***********************************"
               + "\n*                                 *"
               + "\n* You have been quiet and ready   *"
               + "\n* to hunt. This area is known to  *"
               + "\n* be the place where the most     *"
               + "\n* animals are spoted.  *"
               + "\n*                                 *"
               + "\n* Be ready at any moment, you     *"
               + "\n* never know when an animal will  *"
               + "\n* appear!                         *"
               + "\n*                                 *"
               + "\n***********************************"); 
         
         
    }     
    
    @Override
    public boolean doAction(String value) {
        
        value = value.toUpperCase(); // convert choice to upper case
        
        switch (value) {
            case "F":
                this.fireWeapon();
                break;
            case "N":
                this.fireWeapon();
                break;
            default:
                System.out.println("\n*** Invalid Selection *** Try again");
                break;                
        }
        
        return false;
    }

    private void fireWeapon() {
        // May call the CalcAnimalPoints or Another View - Not sure yet
    }

    
}
