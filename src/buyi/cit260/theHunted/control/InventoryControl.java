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
    private String animalName;
    
  public double calcAnimalPoints(String name, double weight){
  
       double pointScalar = .1;
       //String animalName = ("deer,rabbit,moose,bear");

       
	if (name == null) {
		return -2;
        }
        
        if (name != "deer,rabbit,moose,bear") {
                return -2;
        }
        
	if (weight < 3) {
                return -1;
        }
                
        if (weight > 12) {
                return -1;
        }
        
        if (name == "deer,rabbit,moose,bear") {
                animalName = name;
        }
        
        if (animalName == "deer") {
                nameValue = 80;
        }

        if (animalName == "rabit") {
                nameValue = 1;
        }
        
        if (animalName == "moose") {
                nameValue = 125;
        }
        
        if (animalName == "bear") {
                nameValue = 200;
        }
            
        double points = (weight * nameValue) / pointScalar;
                return points;
  }
}
