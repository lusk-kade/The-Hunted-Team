/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buyi.cit260.theHunted.control;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author benedictj
 */
public class InventoryControlTest {
    
    public InventoryControlTest() {
    }

    /**
     * Test of calcAnimalPoints method, of class InventoryControl.
     */
    @Test
    public void testCalcAnimalPoints() {
        System.out.println("calcAnimalPoints");
        
        /*******************************
         * Test Case #1
         ******************************/        
        System.out.println("\tTest Case #1");
        
        // Input values for Test Case #1
        String name = "rabbit";
        double weight = 8.0;
        
        // Create instance of InventoryControl class
        InventoryControl instance = new InventoryControl();
        
        // Expected output returned value
        double expResult = 80.0;
        
        // Call function to run test
        double result = instance.calcAnimalPoints(name, weight);
        
        // Compare expected return value with actual value returned
        assertEquals(expResult, result, 0.0);
    }
    
}
