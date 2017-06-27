    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buyi.cit260.theHunted.control;

import byui.cit1260.theHunted.model.Inventory;
import java.util.ArrayList;

/**
 *
 * @author lus12
 */
public class InventoryControl { 
    
    private double nameValue;
    private double gamePoints;


  public double calcAnimalPoints(String animalName, double animalWeight){

       double pointScalar = .1;

       switch (animalName) {
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
       
       if ("rabbit".equals(animalName) & (animalWeight > 15 || animalWeight < 3)) {
           return -1;
       }
       
       if ("deer".equals(animalName) & (animalWeight > 450 || animalWeight < 400)) {
           return -1;
       }

        double points = (animalWeight * nameValue) / pointScalar;
                gamePoints = points;
                return points;
  }
  
  
 
  public void addTotalPoints(ArrayList<Total> gamePoints) {
      
      for (int i = 0; i <gamePoints.size(); i++) {
          
          Total total = gamePoints.get(i);
          System.out.println("\n New Point total is " + total.getGamePoints());
      }
      
      
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

    private static class Total {

        public Total() {
        }

        private String getGamePoints() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }
}

