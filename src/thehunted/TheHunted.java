/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thehunted;

import byui.cit1260.theHunted.model.Game;

/**
 *
 * @author lus12
 */
public class TheHunted {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Game onePlayer = new Game();
        
        onePlayer.setNoPeople("One");
        
        String gameInfo = onePlayer.toString();
        System.out.println(gameInfo);
    }
    
}
