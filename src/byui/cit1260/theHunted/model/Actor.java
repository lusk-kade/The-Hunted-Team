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
 * @author Justin
 */
public class Actor implements Serializable{
    
        private String name ;

    public Actor() {
    }

    @Override
    public String toString() {
        return "Actor{" + "name=" + name + ", description=" + description + '}';
    }

         
        
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getDescription() {
        return description;
    }

    public void setDescription(double description) {
        this.description = description;
    }
        private double description;
    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 43 * hash + Objects.hashCode(this.name);
        hash = 43 * hash + (int) (Double.doubleToLongBits(this.description) ^ (Double.doubleToLongBits(this.description) >>> 32));
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
        final Actor other = (Actor) obj;
        if (Double.doubleToLongBits(this.description) != Double.doubleToLongBits(other.description)) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        return true;
    }

        
        
    
}
