/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buyi.cit260.theHunted.control;

import byui.cit1260.theHunted.model.Inventory;
import byui.cit260.theHunted.exceptions.InventoryControlException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Justin
 */
public class InventoryControlTest {
    
    public InventoryControlTest() {
    }

    /**
     * Test of calcAnimalPoints method, of class InventoryControl.
     */
    @Test
    public void testCalcAnimalPoints() throws InventoryControlException {
        System.out.println("calcAnimalPoints");
        
        /************************
         * Test Case #1
         ***********************/
        System.out.println("\tTest Case #1");
        
        // Imput values for Test Case #1
        String name = "rabbit";
        double weight = 8;
        
        // Create instance of InventoryControl class
        InventoryControl instance = new InventoryControl();
        
        // Expected output returned value
        double expResult = 80;
        
        // Call function to run test
        double result = instance.calcAnimalPoints(name, weight);
        
        // Actual return - compare to expected return
        assertEquals(expResult, result, 0.0);
    }
    
    {    /************************
         * Test Case #2
         ***********************/
        System.out.println("\tTest Case #2");
        
        // Imput values for Test Case #2
        String name = "rabbit";
        double weight = -1;
        
        // Create instance of InventoryControl class
        InventoryControl instance = new InventoryControl();
        
        // Expected output returned value
        double expResult = -1;
        
        // Call function to run test
        double result = 0;
        try {
            result = instance.calcAnimalPoints(name, weight);
        } catch (InventoryControlException ex) {
            Logger.getLogger(InventoryControlTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        // Actual return - compare to expected return
        assertEquals(expResult, result, 0.0);

    }
    
    {    /************************
         * Test Case #3
         ***********************/
        System.out.println("\tTest Case #3");
        
        // Imput values for Test Case #3
        String name = "rabbit";
        double weight = 16;
        
        // Create instance of InventoryControl class
        InventoryControl instance = new InventoryControl();
        
        // Expected output returned value
        double expResult = -1;
        
        // Call function to run test
        double result = 0;
        try {
            result = instance.calcAnimalPoints(name, weight);
        } catch (InventoryControlException ex) {
            Logger.getLogger(InventoryControlTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        // Actual return - compare to expected return
        assertEquals(expResult, result, 0.0);

    }
    
    {    /************************
         * Test Case #4
         ***********************/
        System.out.println("\tTest Case #4");
        
        // Imput values for Test Case #4
        String name = "moose";
        double weight = 14;
        
        // Create instance of InventoryControl class
        InventoryControl instance = new InventoryControl();
        
        // Expected output returned value
        double expResult = 17500;
        
        // Call function to run test
        double result = 0;
        try {
            result = instance.calcAnimalPoints(name, weight);
        } catch (InventoryControlException ex) {
            Logger.getLogger(InventoryControlTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        // Actual return - compare to expected return
        assertEquals(expResult, result, 0.0);

    }
    
    
    {    /************************
         * Test Case #5
         ***********************/
        System.out.println("\tTest Case #5");
        
        // Imput values for Test Case #5
        String name = "deer";
        double weight = 415;
        
        // Create instance of InventoryControl class
        InventoryControl instance = new InventoryControl();
        
        // Expected output returned value
        double expResult = 332000;
        
        // Call function to run test
        double result = 0;
        try {
            result = instance.calcAnimalPoints(name, weight);
        } catch (InventoryControlException ex) {
            Logger.getLogger(InventoryControlTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        // Actual return - compare to expected return
        assertEquals(expResult, result, 0.0);
    }
    
    {    /************************
         * Test Case #6
         ***********************/
        System.out.println("\tTest Case #6");
        
        // Imput values for Test Case #6
        String name = "deer";
        double weight = 399;
        
        // Create instance of InventoryControl class
        InventoryControl instance = new InventoryControl();
        
        // Expected output returned value
        double expResult = -1;
        
        // Call function to run test
        double result = 0;
        try {
            result = instance.calcAnimalPoints(name, weight);
        } catch (InventoryControlException ex) {
            Logger.getLogger(InventoryControlTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        // Actual return - compare to expected return
        assertEquals(expResult, result, 0.0);

    }
    
    {    /************************
         * Test Case #7
         ***********************/
        System.out.println("\tTest Case #7");
        
        // Imput values for Test Case #7
        String name = "deer";
        double weight = 451;
        
        // Create instance of InventoryControl class
        InventoryControl instance = new InventoryControl();
        
        // Expected output returned value
        double expResult = -1;
        
        // Call function to run test
        double result = 0;
        try {
            result = instance.calcAnimalPoints(name, weight);
        } catch (InventoryControlException ex) {
            Logger.getLogger(InventoryControlTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        // Actual return - compare to expected return
        assertEquals(expResult, result, 0.0);

    }
    
    
    
    
    
    /*
    @Test
    public void testCalcPurchase(){
        Inventory item;
        double amount;
        double ret;
        double expectedReturn;
        
        System.out.println("calcPurchase Test Case #1");
        item = new Inventory();
        item.setInventoryType("weapon");
        item.setUnitPrice(25);
        amount = 2;
        expectedReturn = 54;

        ret = InventoryControl.calcPurchase(item, amount);
        assertEquals(expectedReturn, ret, 0.01);
        
        System.out.println("calcPurchase Test Case #2");
        item = new Inventory();
        item.setInventoryType("ammo");
        item.setUnitPrice(-5);
        amount = 3;
        expectedReturn = -2;

        ret = InventoryControl.calcPurchase(item, amount);
        assertEquals(expectedReturn, ret, 0.01);
        
        System.out.println("calcPurchase Test Case #3");
        item = new Inventory();
        item.setInventoryType("ammo");
        item.setUnitPrice(5);
        amount = 12;
        expectedReturn = -1;

        ret = InventoryControl.calcPurchase(item, amount);
        assertEquals(expectedReturn, ret, 0.01);
        
        System.out.println("calcPurchase Test Case #4");
        item = new Inventory();
        item.setInventoryType("gear");
        item.setUnitPrice(10);
        amount = 0;
        expectedReturn = -1;

        ret = InventoryControl.calcPurchase(item, amount);
        assertEquals(expectedReturn, ret, 0.01);
        
        System.out.println("calcPurchase Test Case #5");
        item = new Inventory();
        item.setInventoryType("weapon");
        item.setUnitPrice(5);
        amount = 1;
        expectedReturn = 5.40;

        ret = InventoryControl.calcPurchase(item, amount);
        assertEquals(expectedReturn, ret, 0.01);
        
        System.out.println("calcPurchase Test Case #6");
        item = new Inventory();
        item.setInventoryType("ammo");
        item.setUnitPrice(10);
        amount = 10;
        expectedReturn = 108;

        ret = InventoryControl.calcPurchase(item, amount);
        assertEquals(expectedReturn, ret, 0.01);
        
        System.out.println("calcPurchase Test Case #7");
        item = new Inventory();
        item.setInventoryType("gear");
        item.setUnitPrice(5);
        amount = 10;
        expectedReturn = 54;

        ret = InventoryControl.calcPurchase(item, amount);
        assertEquals(expectedReturn, ret, 0.01);
    }
*/
}
