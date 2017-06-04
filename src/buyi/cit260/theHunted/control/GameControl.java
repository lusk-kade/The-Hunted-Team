/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buyi.cit260.theHunted.control;

import byui.cit1260.theHunted.model.Player;
import thehunted.TheHunted;

/**
 *
 * @author Justin
 */
public class GameControl {
    
    
     public static Player createPlayer(String playerName) {
        
        
        if (playerName == null){
            return null;
        }
        
        Player player = new Player();
        player.setName(playerName);
        
        TheHunted.setPlayer(player); // save the player
        
        return player;
        }

    public static void createNewGame(Player player) {
        System.out.println("\n*** createNewGame stub function called ***");
    }
    
}
