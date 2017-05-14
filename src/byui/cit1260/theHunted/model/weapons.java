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
public class weapons implements Serializable{

    public weapons() {
    }
    
    
    // class instance variables
    private String weaponType;
    private String weaponName;
    private String weaponStyle;

    public String getWeaponType() {
        return weaponType;
    }

    public void setWeaponType(String weaponType) {
        this.weaponType = weaponType;
    }

    public String getWeaponName() {
        return weaponName;
    }

    public void setWeaponName(String weaponName) {
        this.weaponName = weaponName;
    }

    public String getWeaponStyle() {
        return weaponStyle;
    }

    public void setWeaponStyle(String weaponStyle) {
        this.weaponStyle = weaponStyle;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + Objects.hashCode(this.weaponType);
        hash = 97 * hash + Objects.hashCode(this.weaponName);
        hash = 97 * hash + Objects.hashCode(this.weaponStyle);
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
        final weapons other = (weapons) obj;
        if (!Objects.equals(this.weaponType, other.weaponType)) {
            return false;
        }
        if (!Objects.equals(this.weaponName, other.weaponName)) {
            return false;
        }
        if (!Objects.equals(this.weaponStyle, other.weaponStyle)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "weapons{" + "weaponType=" + weaponType + ", weaponName=" + weaponName + ", weaponStyle=" + weaponStyle + '}';
    }

    
    
    
    
    
}
