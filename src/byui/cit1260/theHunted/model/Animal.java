/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit1260.theHunted.model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author palme
 */
public class Animal implements Serializable {
      
    
    // Instance variables
    private String description;
    private int pointsWorth;

    public Animal() {
    }
    
    

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPointsWorth() {
        return pointsWorth;
    }

    public void setPointsWorth(int pointsWorth) {
        this.pointsWorth = pointsWorth;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + Objects.hashCode(this.description);
        hash = 59 * hash + this.pointsWorth;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Animal other = (Animal) obj;
        if (this.pointsWorth != other.pointsWorth) {
            return false;
        }
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Animal{" + "description=" + description + ", pointsWorth=" + pointsWorth + '}';
    }

    
    
    
    
}
