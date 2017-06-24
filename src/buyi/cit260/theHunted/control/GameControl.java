/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buyi.cit260.theHunted.control;

import byui.cit1260.theHunted.model.Game;
import byui.cit1260.theHunted.model.Inventory;
import byui.cit1260.theHunted.model.Map;
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
        
        Game game = new Game();
        TheHunted.setCurrentGame(game);
        
        game.setPlayer(player);
        
        Inventory[] inventoryList = GameControl.createInventoryList();
        game.setInventory(inventoryList);
        
        Map map = MapControl.createMap();
        game.setMap(map);
        
        MapControl.movePlayerToStartingLocation(map);
    }

    private static Inventory[] createInventoryList() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public static class Inventory {

        public Inventory() {
        }
    }


    
}
