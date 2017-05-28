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
 * @author Justin
 */
public class TreasureQuestionControlTest {
    
    public TreasureQuestionControlTest() {
    }

    /**
     * Test of calcTreasureQuestion method, of class TreasureQuestionControl.
     */
    @Test
    public void testCalcTreasureQuestion() {
        System.out.println("calcTreasureQuestion");
        
        /************************
         * Test Case #1
         ***********************/
        System.out.println("\tTest Case #1");
        
        
        // Imput values for Test Case #1        
        double freq = 17.0;
        double amplitude = 0.1;
        
        // Create instance of InventoryControl class        
        TreasureQuestionControl instance = new TreasureQuestionControl();
        
        // Expected output returned value        
        double expResult = 5.1000000000000005;
        
        // Call function to run test        
        double result = instance.calcTreasureQuestion(freq, amplitude);
        
        // Actual return - compare to expected return        
        assertEquals(expResult, result, 0.0);

    }
    
    {    /************************
         * Test Case #2
         ***********************/
        System.out.println("\tTest Case #2");
        
        
        // Imput values for Test Case #2        
        double freq = -1;
        double amplitude = .22;
        
        // Create instance of InventoryControl class        
        TreasureQuestionControl instance = new TreasureQuestionControl();
        
        // Expected output returned value        
        double expResult = -1;
        
        // Call function to run test        
        double result = instance.calcTreasureQuestion(freq, amplitude);
        
        // Actual return - compare to expected return        
        assertEquals(expResult, result, 0.0);

    }
    
    {    /************************
         * Test Case #3
         ***********************/
        System.out.println("\tTest Case #3");
        
        
        // Imput values for Test Case #3        
        double freq = 20;
        double amplitude = -1;
        
        // Create instance of InventoryControl class        
        TreasureQuestionControl instance = new TreasureQuestionControl();
        
        // Expected output returned value        
        double expResult = -1;
        
        // Call function to run test        
        double result = instance.calcTreasureQuestion(freq, amplitude);
        
        // Actual return - compare to expected return        
        assertEquals(expResult, result, 0.0);

    }
    
    {    /************************
         * Test Case #4
         ***********************/
        System.out.println("\tTest Case #4");
        
        
        // Imput values for Test Case #4        
        double freq = 26;
        double amplitude = .1;
        
        // Create instance of InventoryControl class        
        TreasureQuestionControl instance = new TreasureQuestionControl();
        
        // Expected output returned value        
        double expResult = -1;
        
        // Call function to run test        
        double result = instance.calcTreasureQuestion(freq, amplitude);
        
        // Actual return - compare to expected return        
        assertEquals(expResult, result, 0.0);

    }

    {    /************************
         * Test Case #5
         ***********************/
        System.out.println("\tTest Case #5");
        
        
        // Imput values for Test Case #5        
        double freq = 21;
        double amplitude = .2;
        
        // Create instance of InventoryControl class        
        TreasureQuestionControl instance = new TreasureQuestionControl();
        
        // Expected output returned value        
        double expResult = -1;
        
        // Call function to run test        
        double result = instance.calcTreasureQuestion(freq, amplitude);
        
        // Actual return - compare to expected return        
        assertEquals(expResult, result, 0.0);    
 
    }
        
}
