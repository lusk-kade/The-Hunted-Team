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
    
  public double calcAnimalPoints(double name, double weight){
  
       double pointScalar = .1;
       
	IF (name != name.value){
		return -2;
        }
	IF(weight < 3 OR weight > 12){
                return -1;
        }
        double points = (weight * name.value) / pointScalar;
                return points;
  }
}
