    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buyi.cit260.theHunted.control;

import byui.cit1260.theHunted.model.Inventory;

/**
 *
 * @author lus12
 */
public class InventoryControl { 
    
    private double nameValue;


  public double calcAnimalPoints(String name, double weight){

       double pointScalar = .1;

       switch (name) {
           case "rabbit":
            nameValue = 1;
            break;
           case "deer":
            nameValue = 80;
            break;
           case "moose":
            nameValue = 125;
            break;
           case "bear":
            nameValue = 200;
            break;
           default:
            return -2; //System.out.println("\n*** Invalide animal name *** Try again");
       }
       
       if ("rabbit".equals(name) & (weight > 15 || weight < 3)) {
           return -1;
       }
       
       if ("deer".equals(name) & (weight > 450 || weight < 400)) {
           return -1;
       }
               

	//if (name == null) {
	//	return -2;
        //}

        //if (!"rabbit".equals(name)) {
        //        return -2;
        //}

	//if (weight < 3) {
        //        return -1;
        //}

        //if (weight > 12) {
        //        return -1;
        //}

        //if ("rabbit".equals(name)) {
        //        nameValue = 1;
        //}

        //if ("deer".equals(name)) {
        //       nameValue = 80;
        //}

        //if ("moose".equals(name)) {
        //        nameValue = 125;
        //}

        //if ("bear".equals(name)) {
        //        nameValue = 200;
        //}

        double points = (weight * nameValue) / pointScalar;
                return points;
  }
  
  static public double calcPurchase(Inventory item, double amount) {

        double taxRate = .08;

        if ("weapons".equals(item.getInventoryType())){
            if (amount <= 0) 
                return -1;
            else if(amount > 3)
                return -1;
        }
        
        if ("ammo".equals(item.getInventoryType())) {
            if (amount <= 0) 
                return -1;
            else if(amount > 10)
                return -1;
        }
        if ("gear".equals(item.getInventoryType())) {
            if (amount <= 0) 
                return -1;
            else if(amount > 10)
                return -1;
        }
        if (item.getUnitPrice() <= 0) {
            return -2;
        }
        double cost = (item.getUnitPrice() * amount);
        double tax = cost * taxRate;
        double totalCost = cost + tax;
        return totalCost;

    }
}

