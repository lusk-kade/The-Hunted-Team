/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buyi.cit260.theHunted.control;

import byui.cit1260.theHunted.model.Game;
import byui.cit1260.theHunted.model.Inventory;
import byui.cit1260.theHunted.model.InventoryItemType;
import byui.cit1260.theHunted.model.InventoryType;
import byui.cit1260.theHunted.model.Location;
import byui.cit1260.theHunted.model.Map;
import byui.cit1260.theHunted.model.Player;
import byui.cit1260.theHunted.model.Scene;
import byui.cit1260.theHunted.model.SceneType;
import byui.cit260.theHunted.exceptions.GameControlException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
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
        
        Inventory[] inventoryList = createInventoryList();
        game.setInventory(inventoryList);
        
        Map map = MapControl.createMap();
        game.setMap(map);
        
        MapControl.movePlayerToStartingLocation(map);
    }

    private static Inventory[] createInventoryList() {
        Inventory[] inventory = new Inventory[10];
        Inventory item = new Inventory();
        item.setInventoryType(InventoryType.weapon);
        item.setName("Knife");
        inventory[InventoryItemType.knife.ordinal()] = item;
        
        item = new Inventory();
        item.setInventoryType(InventoryType.weapon);
        item.setName("Shotgun");
        inventory[InventoryItemType.shotgun.ordinal()] = item;
        
        item = new Inventory();
        item.setInventoryType(InventoryType.weapon);
        item.setName("Rifle");
        inventory[InventoryItemType.rifle.ordinal()] = item;
        
        item = new Inventory();
        item.setInventoryType(InventoryType.weapon);
        item.setName("Bow");
        inventory[InventoryItemType.bow.ordinal()] = item;
        
        item = new Inventory();
        item.setInventoryType(InventoryType.weapon);
        item.setName("Pistol");
        inventory[InventoryItemType.pistol.ordinal()] = item;
        
        item = new Inventory();
        item.setInventoryType(InventoryType.water);
        item.setName("Canteen");
        inventory[InventoryItemType.canteen.ordinal()] = item;
        
        item = new Inventory();
        item.setInventoryType(InventoryType.food);
        item.setName("MRE");
        inventory[InventoryItemType.mre.ordinal()] = item;
        
        item = new Inventory();
        item.setInventoryType(InventoryType.food);
        item.setName("Crackers");
        inventory[InventoryItemType.crackers.ordinal()] = item;
        
        item = new Inventory();
        item.setInventoryType(InventoryType.food);
        item.setName("Cookies");
        inventory[InventoryItemType.cookies.ordinal()] = item;
        
        item = new Inventory();
        item.setInventoryType(InventoryType.food);
        item.setName("Jerky");
        inventory[InventoryItemType.jerky.ordinal()] = item;
        
        
        
        return inventory;
    }
    


    
    public static void assignScenesToLocations(Map map, Scene[] scenes) {
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

    public static void saveGame(Game game, String filePath)
            throws GameControlException {
        
        try( FileOutputStream fops = new FileOutputStream(filePath)) {
            ObjectOutputStream output = new ObjectOutputStream(fops);
            
            output.writeObject(game); // write the game object out to file
        }
        catch(Exception e) {
            throw new GameControlException(e.getMessage());
        }
    }

    public static void getSavedGame(String filePath) 
            throws GameControlException {
        Game game = null;
        
        try( FileInputStream fips = new FileInputStream(filePath)) {
            ObjectInputStream input = new ObjectInputStream(fips);
            
            game = (Game) input.readObject(); // read the game object from file
        }
        catch(Exception e) {
            throw new GameControlException(e.getMessage());
        }
        
        // close the output file
        TheHunted.setCurrentGame(game); // save in TheHunted
    }
    
    public static void addToBackPack(Inventory item, int quantity) {
          ArrayList<Inventory> backpack = TheHunted.getCurrentGame().getBackpack();
          // Check to see if the item is already in the backpack
          Inventory backPackItem = null;
          for(Inventory currentItem: backpack) {
              if(currentItem.getName() == item.getName()) {
                  backPackItem = item;
                  break;
              }
          }
          if(backPackItem == null) {
              backPackItem = new Inventory();
              backPackItem.setName(item.getName());
              backPackItem.setInventoryType(item.getInventoryType());
              backPackItem.setQuantityInStock(quantity);
              backpack.add(backPackItem);
              item.setQuantityInStock(item.getQuantityInStock() - quantity);
          }
          else {
              backPackItem.setQuantityInStock(backPackItem.getQuantityInStock() + quantity);
              item.setQuantityInStock(item.getQuantityInStock() - quantity);
          }
            
    }
    
            public static void viewScenes(Scene scene, String filePath)
            throws GameControlException {
        
        try( FileOutputStream fops = new FileOutputStream(filePath)) {
            ObjectOutputStream output = new ObjectOutputStream(fops);
            
            output.writeObject(scene); // write the game object out to file
        }
        catch(Exception e) {
            throw new GameControlException(e.getMessage());
        }
    }

    public static void printInventoryReport(Game currentGame, String filePath) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
