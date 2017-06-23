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
 * @author palme
 */
public enum Animal implements Serializable {
      
    
    rabbit("White"),
    deer("White Tale"),
    elk(""),
    moose(""),
    bear("Grizzly");
    
    
    // Instance variables
    private final String description;
    private final Point coordinates;
    //private final int pointsWorth;

    Animal(String description) {
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
    public int getPointsWorth() {
        return pointsWorth;
    }
    */
}
