/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thehunted;

import byui.cit1260.theHunted.model.Animal;
import byui.cit1260.theHunted.model.Game;
import byui.cit1260.theHunted.model.Inventory;
import byui.cit1260.theHunted.model.Map;
import byui.cit1260.theHunted.model.Player;
import byui.cit1260.theHunted.model.weapons;

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
        onePlayer.setNoPeople(1);
        String gameInfo = onePlayer.toString();
        System.out.println(gameInfo);
        
        Player playerOne = new Player();
        playerOne.setName("Gastaun");
        String playerInfo = playerOne.toString();
        System.out.println(playerInfo);
       
        Player score = new Player();    
        score.setHighScore(100);
        String scoreInfo = score.toString();
        System.out.println(scoreInfo);
        
        Map startDesc = new Map();
        startDesc.setDescription("starting point");
        String descInfo = startDesc.toString();
        System.out.println(descInfo);
        
        Map whichRow = new Map();
        whichRow.setRowCount(1);
        String rowInfo = whichRow.toString();
        System.out.println(rowInfo);
        
        Map whichColumn = new Map();
        whichColumn.setColumnCount(1);
        String columnInfo = whichColumn.toString();
        System.out.println(columnInfo);
        
        Map whichScene = new Map();
        whichScene.setCurrentScene("Alaska");
        String sceneInfo = whichScene.toString();
        System.out.println(sceneInfo);
        
        Map myRow = new Map();
        myRow.setCurrentRow(1);
        String curRowInfo = myRow.toString();
        System.out.println(curRowInfo);
        
        Map myColumn = new Map();
        myColumn.setCurrentColumn(1);
        String curColumnInfo = myColumn.toString();
        System.out.println(curColumnInfo);
        
        Animal animalOne = new Animal();
        animalOne.setDescription ("Bear");
        String curAnimalInfo = animalOne.toString();
        System.out.println(curAnimalInfo);
        
        Animal pointScored = new Animal();
        pointScored.setPointsWorth (5);
        String curPoints = pointScored.toString();
        System.out.println(curPoints);
        
        Inventory inventoryOne = new Inventory();
        inventoryOne.setInventoryType ("Rifle");
        String curInventory = inventoryOne.toString();
        System.out.println(curInventory);
        
        Inventory quantity = new Inventory();
        quantity.setQuantityInStock (1);
        String curQuantity = quantity.toString();
        System.out.println(curQuantity);
        
        Inventory requiredAmountOne = new Inventory();
        requiredAmountOne.setRequiredAmount (1);
        String curAmount = requiredAmountOne.toString();
        System.out.println(curAmount);
        
        weapons typeOfWeapon = new weapons();
        typeOfWeapon.setWeaponType ("Remington");
        String curWeapon = typeOfWeapon.toString();
        System.out.println(curWeapon);
        
        weapons nameOfWeapon = new weapons();
        nameOfWeapon.setWeaponName ("Woodmaster 742");
        String curWeaponName = nameOfWeapon.toString();
        System.out.println(curWeaponName);
        
        weapons styleOfWeapon = new weapons();
        styleOfWeapon.setWeaponStyle ("Bolt Action");
        String curWeaponStyle = styleOfWeapon.toString();
        System.out.println(curWeaponStyle);
        
    }
    
    
}
