/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buyi.cit260.theHunted.control;

import byui.cit1260.theHunted.model.Animal;
import byui.cit1260.theHunted.model.Location;
import byui.cit1260.theHunted.model.Map;
import byui.cit1260.theHunted.model.Scene;
import byui.cit1260.theHunted.model.SceneType;

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

        
        currentScene = new Scene();
        currentScene.setSymbol("HD");
        currentScene.setDescription(
                "The desert is hot and dry."
                + "You will need plenty of water.");
        currentScene.setAnimal(Animal.bear);
        scenes[SceneType.highDesert.ordinal()] = currentScene;
        // Keep adding until we hit 25 scenes


        currentScene = new Scene();
        currentScene.setSymbol("ND");
        currentScene.setDescription(
                "This is where you need to use caution"
                + "and be aware of your surroundings."
                + "I hope you brought light to shine"
                + "in the darkness.");
        currentScene.setAnimal(Animal.bear);
        scenes[SceneType.nightDesert.ordinal()] = currentScene;
        // Keep adding until we hit 25 scenes

        
        currentScene = new Scene();
        currentScene.setSymbol("LD");
        currentScene.setDescription(
                "There is very little cover here, so"
                + "you have to be fast to hunt game"
                + "in this area.");
        currentScene.setAnimal(Animal.bear);
        scenes[SceneType.lowDesert.ordinal()] = currentScene;
        // Keep adding until we hit 25 scenes
       

        currentScene = new Scene();
        currentScene.setSymbol("GR");
        currentScene.setDescription("It's water!");
        currentScene.setAnimal(Animal.bear);
        scenes[SceneType.greenRiver.ordinal()] = currentScene;
        // Keep adding until we hit 25 scenes
        
        
        currentScene = new Scene();
        currentScene.setSymbol("LR");
        currentScene.setDescription("It's water!");
        currentScene.setAnimal(Animal.bear);
        scenes[SceneType.loganRiver.ordinal()] = currentScene;
        // Keep adding until we hit 25 scenes
        

        currentScene = new Scene();
        currentScene.setSymbol("SR");
        currentScene.setDescription("It's water!");
        currentScene.setAnimal(Animal.bear);
        scenes[SceneType.sanJuanRiver.ordinal()] = currentScene;
        // Keep adding until we hit 25 scenes
        
        
        currentScene = new Scene();
        currentScene.setSymbol("VR");
        currentScene.setDescription("It's water!");
        currentScene.setAnimal(Animal.bear);
        scenes[SceneType.virginRiver.ordinal()] = currentScene;
        // Keep adding until we hit 25 scenes
        

        currentScene = new Scene();
        currentScene.setSymbol("WR");
        currentScene.setDescription("It's water!");
        currentScene.setAnimal(Animal.bear);
        scenes[SceneType.whiteRiver.ordinal()] = currentScene;
        // Keep adding until we hit 25 scenes
        
        
        currentScene = new Scene();
        currentScene.setSymbol("DM");
        currentScene.setDescription("It's water!");
        currentScene.setAnimal(Animal.bear);
        scenes[SceneType.denaliMountain.ordinal()] = currentScene;
        // Keep adding until we hit 25 scenes
        

        currentScene = new Scene();
        currentScene.setSymbol("MF");
        currentScene.setDescription("It's water!");
        currentScene.setAnimal(Animal.bear);
        scenes[SceneType.mountForaker.ordinal()] = currentScene;
        // Keep adding until we hit 25 scenes
        
        
        currentScene = new Scene();
        currentScene.setSymbol("ME");
        currentScene.setDescription("It's water!");
        currentScene.setAnimal(Animal.bear);
        scenes[SceneType.mountSaintElias.ordinal()] = currentScene;
        // Keep adding until we hit 25 scenes
        

        currentScene = new Scene();
        currentScene.setSymbol("MB");
        currentScene.setDescription("It's water!");
        currentScene.setAnimal(Animal.bear);
        scenes[SceneType.mountBlackburn.ordinal()] = currentScene;
        // Keep adding until we hit 25 scenes
        
        
        currentScene = new Scene();
        currentScene.setSymbol("MH");
        currentScene.setDescription("It's water!");
        currentScene.setAnimal(Animal.bear);
        scenes[SceneType.mountHunter.ordinal()] = currentScene;
        // Keep adding until we hit 25 scenes
        

        currentScene = new Scene();
        currentScene.setSymbol("OS");
        currentScene.setDescription("It's water!");
        currentScene.setAnimal(Animal.bear);
        scenes[SceneType.okefenokeeSwamp.ordinal()] = currentScene;
        // Keep adding until we hit 25 scenes
        
        
        currentScene = new Scene();
        currentScene.setSymbol("CS");
        currentScene.setDescription("It's water!");
        currentScene.setAnimal(Animal.bear);
        scenes[SceneType.corkscrewSwamp.ordinal()] = currentScene;
        // Keep adding until we hit 25 scenes
        

        currentScene = new Scene();
        currentScene.setSymbol("BS");
        currentScene.setDescription("It's water!");
        currentScene.setAnimal(Animal.bear);
        scenes[SceneType.barleyBarberSwamp.ordinal()] = currentScene;
        // Keep adding until we hit 25 scenes
        
        
        currentScene = new Scene();
        currentScene.setSymbol("GS");
        currentScene.setDescription("It's water!");
        currentScene.setAnimal(Animal.bear);
        scenes[SceneType.greenSwamp.ordinal()] = currentScene;
        // Keep adding until we hit 25 scenes
        

        currentScene = new Scene();
        currentScene.setSymbol("KS");
        currentScene.setDescription("It's water!");
        currentScene.setAnimal(Animal.bear);
        scenes[SceneType.kissimmeeSwamp.ordinal()] = currentScene;
        // Keep adding until we hit 25 scenes
        
        
        currentScene = new Scene();
        currentScene.setSymbol("SF");
        currentScene.setDescription("It's water!");
        currentScene.setAnimal(Animal.bear);
        scenes[SceneType.sierraNationalForest.ordinal()] = currentScene;
        // Keep adding until we hit 25 scenes
        

        currentScene = new Scene();
        currentScene.setSymbol("CF");
        currentScene.setDescription("It's water!");
        currentScene.setAnimal(Animal.bear);
        scenes[SceneType.clevelandNationalForest.ordinal()] = currentScene;
        // Keep adding until we hit 25 scenes
        
        
        currentScene = new Scene();
        currentScene.setSymbol("CF");
        currentScene.setDescription("It's water!");
        currentScene.setAnimal(Animal.bear);
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
        currentScene.setDescription("It's water!");
        currentScene.setAnimal(Animal.bear);
        scenes[SceneType.finish.ordinal()] = currentScene;
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



