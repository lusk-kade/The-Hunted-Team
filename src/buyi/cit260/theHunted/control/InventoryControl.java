/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buyi.cit260.theHunted.control;

/**
 *
 * @author lus12
 */
public class InventoryControl { 
    
    private double nameValue;


  public double calcAnimalPoints(String name, double weight){

       double pointScalar = .1;



	if (name == null) {
		return -2;
        }

        if (!"rabbit".equals(name)) {
                return -2;
        }

	if (weight < 3) {
                return -1;
        }

        if (weight > 12) {
                return -1;
        }

        if ("rabbit".equals(name)) {
                nameValue = 1;
        }

        if ("deer".equals(name)) {
                nameValue = 80;
        }

        if ("moose".equals(name)) {
                nameValue = 125;
        }

        if ("bear".equals(name)) {
                nameValue = 200;
        }

        double points = (weight * nameValue) / pointScalar;
                return points;
  }
}

