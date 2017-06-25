/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buyi.cit260.theHunted.control;

import byui.cit1260.theHunted.model.Animal;
import byui.cit1260.theHunted.model.Map;
import byui.cit1260.theHunted.model.Scene;
import byui.cit1260.theHunted.model.SceneType;

/**
 *
 * @author Justin
 */
class MapControl {

    public static Map createMap() {
       Map map = new Map(5,5);
       
       Scene[] scenes = createScenes();
       
       //GameControl.assignScenesToLocations(map, scenes);
       
       return map;
    }
    private static Scene[] createScenes() {
        
        Scene[] scenes = new Scene[SceneType.values().length];
        
        Scene currentScene = new Scene();
        currentScene.setSymbol("ST");
        currentScene.setDescription("This is where your adventure starts!");
        scenes[SceneType.start.ordinal()] = currentScene;
        
        currentScene = new Scene();
        currentScene.setSymbol("BR");
        currentScene.setDescription("It's water!");
        currentScene.setAnimal(Animal.bear);
        scenes[SceneType.blackRiver.ordinal()] = currentScene;
        // Keep adding until we hit 25 scenes
        return scenes;
    }
    public static void movePlayerToStartingLocation(Map map) {
     // If starting location is not supposed to be 0,0 then use the correct values here.
     movePlayer(map, 0, 0); // or instead of 0,0 you can select a different starting location
}

public static void movePlayer(Map map, int row, int column) {
   map.setCurrentLocation(map.getLocations()[row][column]);
   map.getCurrentLocation().setVisited(true);
   map.setCurrentRow(row);
   map.setCurrentColumn(column);

}

    
}
