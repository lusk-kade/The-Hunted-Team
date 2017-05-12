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
 
   private String NoPeople;

    public Game() {
    }


   
   

    public String getNoPeople() {
        return NoPeople;
    }

    public void setNoPeople(String NoPeople) {
        this.NoPeople = NoPeople;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 89 * hash + Objects.hashCode(this.NoPeople);
        return hash;
    }

    @Override
    public String toString() {
        return "Game{" + "NoPeople=" + NoPeople + '}';
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
        if (!Objects.equals(this.NoPeople, other.NoPeople)) {
            return false;
        }
        return true;
    }

    
   
   
    }

