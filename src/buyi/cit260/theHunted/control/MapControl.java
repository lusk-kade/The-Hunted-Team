/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buyi.cit260.theHunted.control;

import byui.cit1260.theHunted.model.Animal;
import byui.cit1260.theHunted.model.Inventory;
import byui.cit1260.theHunted.model.InventoryItemType;
import byui.cit1260.theHunted.model.InventoryType;
import byui.cit1260.theHunted.model.Location;
import byui.cit1260.theHunted.model.Map;
import byui.cit1260.theHunted.model.Scene;
import byui.cit1260.theHunted.model.SceneType;
import byui.cit260.theHunted.exceptions.MapControlException;
import byui.cit260.theHunted.view.GameMenuView;
import byui.cit260.theHunted.view.StartProgramView;
import java.util.ArrayList;
import thehunted.TheHunted;

/**
 *
 * @author Justin
 */
public class MapControl {

    public static Map createMap() {
       Map map = new Map(5,5);
       
       Scene[] scenes = createScenes();
       
       GameControl.assignScenesToLocations(map, scenes);
       
       return map;
    }
    public static Scene[] createScenes() {
        Inventory[] inventory = TheHunted.getCurrentGame().getInventory();
        Scene[] scenes = new Scene[SceneType.values().length];
        
        Scene currentScene = new Scene();
        currentScene.setSymbol("ST");
        currentScene.setDescription("the starting point. This is also "
                + "where you find a hunting supply store."
                + " This is where your adventure starts!");
        currentScene.setInventory(inventory[InventoryItemType.canteen.ordinal()]);
        ArrayList<Inventory> storeStock = new ArrayList<Inventory>();
        storeStock.add(new Inventory(InventoryType.food, "Crackers", 10, 0, .50));
        storeStock.add(new Inventory(InventoryType.food, "Cookies", 10, 0, 1.00));
        storeStock.add(new Inventory(InventoryType.food, "MRE", 10, 0, 5.00));
        storeStock.add(new Inventory(InventoryType.food, "Jerky", 10, 0, 5.00));
        storeStock.add(new Inventory(InventoryType.water, "Canteen", 20, 0, 2.00));
        storeStock.add(new Inventory(InventoryType.ammo, "Shotgun Shells", 50, 0, 50));
        storeStock.add(new Inventory(InventoryType.ammo, "Arrow", 50, 0, 20));
        storeStock.add(new Inventory(InventoryType.ammo, "Rifle Ammo", 50, 0, 30));
        storeStock.add(new Inventory(InventoryType.ammo, "Pistol Ammo", 50, 0, 15));
        storeStock.add(new Inventory(InventoryType.clothing, "Gloves", 10, 0, 15));
        storeStock.add(new Inventory(InventoryType.clothing, "Sunglasses", 10, 0, 10));
        storeStock.add(new Inventory(InventoryType.clothing, "Hat", 10, 0, 20));
        storeStock.add(new Inventory(InventoryType.clothing, "Ghillie Suit", 5, 0, 100));
        currentScene.setStoreStock(storeStock);
        currentScene.setStore(true);
        scenes[SceneType.start.ordinal()] = currentScene;
        
        currentScene = new Scene();
        currentScene.setSymbol("BR");
        currentScene.setDescription("Black River. The water is extremely cold."
                                    + " Brrrrrr!");
        currentScene.setInventory(inventory[InventoryItemType.rifle.ordinal()]);
        currentScene.setAnimal(Animal.elk);
        scenes[SceneType.blackRiver.ordinal()] = currentScene;
        // Keep adding until we hit 25 scenes

        
        currentScene = new Scene();
        currentScene.setSymbol("HD");
        currentScene.setDescription(                
                "the high desert location. The desert is hot and dry."
                + " You will need plenty of water.");
        scenes[SceneType.highDesert.ordinal()] = currentScene;
        // Keep adding until we hit 25 scenes


        currentScene = new Scene();
        currentScene.setSymbol("ND");
        currentScene.setDescription(
                "the night desert location. This is where you need to use caution"
                + " and be aware of your surroundings."
                + " I hope you brought light to shine"
                + " in the darkness.");
        scenes[SceneType.nightDesert.ordinal()] = currentScene;
        // Keep adding until we hit 25 scenes

        
        currentScene = new Scene();
        currentScene.setSymbol("LD");
        currentScene.setDescription(
                "the low desert area. There is very little cover here, so"
                + " you have to be fast to hunt game"
                + " in this area.");
        currentScene.setAnimal(Animal.snake);
        currentScene.setInventory(inventory[InventoryItemType.cookies.ordinal()]);
        scenes[SceneType.lowDesert.ordinal()] = currentScene;
        // Keep adding until we hit 25 scenes
       

        currentScene = new Scene();
        currentScene.setSymbol("GR");
        currentScene.setDescription("Green River!");
        currentScene.setInventory(inventory[InventoryItemType.shotgun.ordinal()]);
        currentScene.setAnimal(Animal.rabbit);
        scenes[SceneType.greenRiver.ordinal()] = currentScene;
        // Keep adding until we hit 25 scenes
        
        
        currentScene = new Scene();
        currentScene.setSymbol("LR");
        currentScene.setDescription("Logan River!");
        currentScene.setAnimal(Animal.bear);
        scenes[SceneType.loganRiver.ordinal()] = currentScene;
        // Keep adding until we hit 25 scenes
        

        currentScene = new Scene();
        currentScene.setSymbol("SR");
        currentScene.setDescription("San Juan River!");
        currentScene.setAnimal(Animal.alligator);
        currentScene.setInventory(inventory[InventoryItemType.bow.ordinal()]);
        scenes[SceneType.sanJuanRiver.ordinal()] = currentScene;
        // Keep adding until we hit 25 scenes
        
        
        currentScene = new Scene();
        currentScene.setSymbol("VR");
        currentScene.setDescription("Virgin River!");
        currentScene.setAnimal(Animal.moose);
        scenes[SceneType.virginRiver.ordinal()] = currentScene;
        // Keep adding until we hit 25 scenes
        

        currentScene = new Scene();
        currentScene.setSymbol("WR");
        currentScene.setDescription("White River!");
        currentScene.setAnimal(Animal.deer);
        currentScene.setInventory(inventory[InventoryItemType.crackers.ordinal()]);
        scenes[SceneType.whiteRiver.ordinal()] = currentScene;
        // Keep adding until we hit 25 scenes
        
        
        currentScene = new Scene();
        currentScene.setSymbol("DM");
        currentScene.setDescription("Denali Mountain!");
        currentScene.setInventory(inventory[InventoryItemType.jerky.ordinal()]);
        currentScene.setAnimal(Animal.bear);
        scenes[SceneType.denaliMountain.ordinal()] = currentScene;
        // Keep adding until we hit 25 scenes
        

        currentScene = new Scene();
        currentScene.setSymbol("MF");
        currentScene.setDescription("Foraker Mountain!");
        currentScene.setAnimal(Animal.elk);
        currentScene.setInventory(inventory[InventoryItemType.mre.ordinal()]);
        scenes[SceneType.mountForaker.ordinal()] = currentScene;
        // Keep adding until we hit 25 scenes
        
        
        currentScene = new Scene();
        currentScene.setSymbol("ME");
        currentScene.setDescription("Saint Elias Mountain!");
        currentScene.setAnimal(Animal.bear);
        scenes[SceneType.mountSaintElias.ordinal()] = currentScene;
        // Keep adding until we hit 25 scenes
        

        currentScene = new Scene();
        currentScene.setSymbol("MB");
        currentScene.setDescription("Blackburn Moutain!");
        currentScene.setAnimal(Animal.goat);
        scenes[SceneType.mountBlackburn.ordinal()] = currentScene;
        // Keep adding until we hit 25 scenes
        
        
        currentScene = new Scene();
        currentScene.setSymbol("MH");
        currentScene.setDescription("Hunter Mountain!"
                                   +"\nYou hear something behind you..."
                                   +"\nThe elk charged and speard you!"
                                   +"\nThe mighty hunter has fallen.");
        currentScene.setAnimal(Animal.elk);
        scenes[SceneType.mountHunter.ordinal()] = currentScene;  
        // Keep adding until we hit 25 scenes
        

        currentScene = new Scene();
        currentScene.setSymbol("OS");
        currentScene.setDescription("Okefenokee Swamp! Good luck pronouncing that.");
        currentScene.setAnimal(Animal.alligator);
        scenes[SceneType.okefenokeeSwamp.ordinal()] = currentScene;
        // Keep adding until we hit 25 scenes
        
        
        currentScene = new Scene();
        currentScene.setSymbol("CS");
        currentScene.setDescription("Cork Screw Swamp!");
        currentScene.setInventory(inventory[InventoryItemType.knife.ordinal()]);
        scenes[SceneType.corkscrewSwamp.ordinal()] = currentScene;
        // Keep adding until we hit 25 scenes
        

        currentScene = new Scene();
        currentScene.setSymbol("BS");
        currentScene.setDescription("Barley Barbar Swamp!");
        currentScene.setAnimal(Animal.bear);
        scenes[SceneType.barleyBarberSwamp.ordinal()] = currentScene;
        // Keep adding until we hit 25 scenes
        
        
        currentScene = new Scene();
        currentScene.setSymbol("GS");
        currentScene.setDescription("Green Swamp!");
        currentScene.setAnimal(Animal.deer);
        scenes[SceneType.greenSwamp.ordinal()] = currentScene;
        // Keep adding until we hit 25 scenes
        

        currentScene = new Scene();
        currentScene.setSymbol("KS");
        currentScene.setDescription("Kissimmee Swamp!");
        currentScene.setInventory(inventory[InventoryItemType.pistol.ordinal()]);
        currentScene.setAnimal(Animal.alligator);
        scenes[SceneType.kissimmeeSwamp.ordinal()] = currentScene;
        // Keep adding until we hit 25 scenes
        
        
        currentScene = new Scene();
        currentScene.setSymbol("SF");
        currentScene.setDescription("Sierra National Forest!");
        scenes[SceneType.sierraNationalForest.ordinal()] = currentScene;
        // Keep adding until we hit 25 scenes
        

        currentScene = new Scene();
        currentScene.setSymbol("CN");
        currentScene.setDescription("Cleveland National Forest!");
        currentScene.setAnimal(Animal.deer);
        scenes[SceneType.clevelandNationalForest.ordinal()] = currentScene;
        // Keep adding until we hit 25 scenes
        
        
        currentScene = new Scene();
        currentScene.setSymbol("CF");
        currentScene.setDescription("Chandelier Forest!");
        currentScene.setAnimal(Animal.elk);
        scenes[SceneType.chandelierForest.ordinal()] = currentScene;
        // Keep adding until we hit 25 scenes
        

        currentScene = new Scene();
        currentScene.setSymbol("YR");
        currentScene.setDescription("Yosemite Forest. Watch for bears!");
        currentScene.setAnimal(Animal.bear);
        scenes[SceneType.yosemiteForest.ordinal()] = currentScene;
        // Keep adding until we hit 25 scenes
        
        
        currentScene = new Scene();
        currentScene.setSymbol("FI");
        currentScene.setDescription("the end of the game."
                + " Great job! You played a great game.");
        scenes[SceneType.finish.ordinal()] = currentScene;
        // Keep adding until we hit 25 scenes
        return scenes;
        
    }
    public static void movePlayerToStartingLocation(Map map) {
     // If starting location is not supposed to be 0,0 then use the correct values here.
     try {
         movePlayer(map, 0, 0);
     } // or instead of 0,0 you can select a different starting location
     catch(MapControlException me) {
         // We need to fix this area. Something is messed up here.
     }
}

public static void movePlayer(Map map, int row, int column) throws MapControlException {
    
    if(map == null) {
        throw new MapControlException("\nMap is not initialized");        
    }
    
    if(row < 0 || row >= map.getRowCount()){
        throw new MapControlException("\nRow is out of range");
    }
    
    if(column < 0 || column >= map.getColumnCount()){
        throw new MapControlException("\nColumn is out of range");
    }
   map.setCurrentLocation(map.getLocations()[row][column]);
   map.getCurrentLocation().setVisited(true);
   map.setCurrentRow(row);
   map.setCurrentColumn(column);
 
}

}



