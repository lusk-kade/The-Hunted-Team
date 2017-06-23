/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit1260.theHunted.model;

import java.awt.Point;
import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author Justin
 */
public enum Actor implements Serializable{
    
    
    ShopKeeper("");
    
        private final String description;
        private final Point coordinates;


    Actor(String description) {
        this.description = description;
        coordinates = new Point(1,1);
    }

    
    public String getDescription() {
        return description;
    }

    public Point getCoordinates() {
        return coordinates;
    }

    


        
    /*    
       @Override
    public String toString() {
        return "Actor{" + "name=" + name + ", description=" + description + '}';
    }
    */


}
