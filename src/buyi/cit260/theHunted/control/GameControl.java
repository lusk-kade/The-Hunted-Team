/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buyi.cit260.theHunted.control;

import byui.cit1260.theHunted.model.Game;
import byui.cit1260.theHunted.model.Inventory;
import byui.cit1260.theHunted.model.Location;
import byui.cit1260.theHunted.model.Map;
import byui.cit1260.theHunted.model.Player;
import byui.cit1260.theHunted.model.Scene;
import byui.cit1260.theHunted.model.SceneType;
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


    
    static void assignScenesToLocation(Map map, Scene[] scenes) {
        Location[][] locations = map.getLocations();
        
        locations[0][0].setScene(scenes[SceneType.start.ordinal()]);
        locations[0][1].setScene(scenes[SceneType.highDesert.ordinal()]);
        locations[0][2].setScene(scenes[SceneType.nightDesert.ordinal()]);
        locations[0][3].setScene(scenes[SceneType.lowDesert.ordinal()]);
        locations[0][4].setScene(scenes[SceneType.blackRiver.ordinal()]);
        locations[1][0].setScene(scenes[SceneType.greenRiver.ordinal()]);
        locations[1][1].setScene(scenes[SceneType.loganRiver.ordinal()]);
        locations[1][2].setScene(scenes[SceneType.sanJuanRiver.ordinal()]);
        locations[1][3].setScene(scenes[SceneType.virginRiver.ordinal()]);
        locations[1][4].setScene(scenes[SceneType.whiteRiver.ordinal()]);
        locations[2][0].setScene(scenes[SceneType.denaliMountain.ordinal()]);
        locations[2][1].setScene(scenes[SceneType.mountForaker.ordinal()]);
        locations[2][2].setScene(scenes[SceneType.mountSaintElias.ordinal()]);
        locations[2][3].setScene(scenes[SceneType.mountBlackburn.ordinal()]);
        locations[2][4].setScene(scenes[SceneType.mountHunter.ordinal()]);
        locations[3][0].setScene(scenes[SceneType.okefenokeeSwamp.ordinal()]);
        locations[3][1].setScene(scenes[SceneType.corkscrewSwamp.ordinal()]);
        locations[3][2].setScene(scenes[SceneType.barleyBarberSwamp.ordinal()]);
        locations[3][3].setScene(scenes[SceneType.greenSwamp.ordinal()]);
        locations[3][4].setScene(scenes[SceneType.kissimmeeSwamp.ordinal()]);
        locations[4][0].setScene(scenes[SceneType.sierraNationalForest.ordinal()]);
        locations[4][1].setScene(scenes[SceneType.clevelandNationalForest.ordinal()]);
        locations[4][2].setScene(scenes[SceneType.chandelierForest.ordinal()]);
        locations[4][3].setScene(scenes[SceneType.yosemiteForest.ordinal()]);
        locations[4][4].setScene(scenes[SceneType.finish.ordinal()]);
    }
    
}
