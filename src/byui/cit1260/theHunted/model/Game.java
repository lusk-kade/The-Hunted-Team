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
 * @author lus12
 */
public class Game implements Serializable {
 
   private int noPeople;

    public Game() {
    }


   
   

    public int getnoPeople() {
        return noPeople;
    }

    public void setNoPeople(int noPeople) {
        this.noPeople = noPeople;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 89 * hash + Objects.hashCode(this.noPeople);
        return hash;
    }

    @Override
    public String toString() {
        return "Game{" + "noPeople=" + noPeople + '}';
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
        final Game other = (Game) obj;
        if (!Objects.equals(this.noPeople, other.noPeople)) {
            return false;
        }
        return true;
    }

    
   
   
    }

