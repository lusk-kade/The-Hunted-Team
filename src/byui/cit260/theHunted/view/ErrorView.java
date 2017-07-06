/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.theHunted.view;

import java.io.PrintWriter;
import thehunted.TheHunted;

/**
 *
 * @author Justin
 */
public class ErrorView {
    
    private static final PrintWriter errorFile = TheHunted.getOutFile();
    private static final PrintWriter logFile = TheHunted.getLogFile();
    
    public static void display(String className, String errorMessage) {
        
        errorFile.println(
                    "---------------------------------------"
                  + "\n ERROR - " + errorMessage
                  + "\n---------------------------------------");
        
        // log error
        logFile.println(className + " - " + errorMessage);
    }
    
    
}
