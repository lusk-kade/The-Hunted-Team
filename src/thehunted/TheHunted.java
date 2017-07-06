/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thehunted;

import byui.cit1260.theHunted.model.Actor;
import byui.cit1260.theHunted.model.Animal;
import byui.cit1260.theHunted.model.Game;
import byui.cit1260.theHunted.model.Inventory;
import byui.cit1260.theHunted.model.Location;
import byui.cit1260.theHunted.model.Map;
import byui.cit1260.theHunted.model.Player;
import byui.cit1260.theHunted.model.Question;
import byui.cit260.theHunted.view.StartProgramView;
import byui.cit260.theHunted.view.MainMenuView;
import byui.cit260.theHunted.view.GameMenuView;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author lus12
 */
public class TheHunted {
    
    private static Game currentGame = null;
    private static Player player = null;
    
    private static PrintWriter outFile = null;
    private static BufferedReader inFile = null;
    
    private static PrintWriter logFile = null;

    public static Game getCurrentGame() {
        return currentGame;
    }

    public static void setCurrentGame(Game currentGame) {
        TheHunted.currentGame = currentGame;
    }

    public static Player getPlayer() {
        return player;
    }

    public static void setPlayer(Player player) {
        TheHunted.player = player;
    }

    public static PrintWriter getOutFile() {
        return outFile;
    }

    public static void setOutFile(PrintWriter outFile) {
        TheHunted.outFile = outFile;
    }

    public static BufferedReader getInFile() {
        return inFile;
    }

    public static void setInFile(BufferedReader outFile) {
        TheHunted.inFile = outFile;
    }

    public static PrintWriter getLogFile() {
        return logFile;
    }

    public static void setLogFile(PrintWriter logFile) {
        TheHunted.logFile = logFile;
    }

    
    
    
    
    
    
     /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        

        

        
        try {
            
            TheHunted.inFile = 
                    new BufferedReader(new InputStreamReader(System.in));
            
            TheHunted.outFile = new PrintWriter(System.out, true);
            
            //open log file
            String filePath = "log.txt";
            TheHunted.logFile = new PrintWriter(filePath);
            
                // create StartProgramViewOrig and display the start program view
                StartProgramView startProgramView = new StartProgramView();
                startProgramView.displayStartProgramView();
                
        }   catch (Throwable e) {
                
                System.out.println("Exception: " + e.toString() +
                                   "\nCause: " + e.getCause() +
                                   "\nMessage: " + e.getMessage());
                
                e.printStackTrace();;
        }
        
        finally {
            try {
                if (TheHunted.inFile != null)
                    TheHunted.inFile.close();
                
                if (TheHunted.outFile != null);
                    TheHunted.outFile.close();
                    
                if (TheHunted.logFile != null);
                    TheHunted.logFile.close();    
            } catch (IOException ex) {
                System.out.println("Error closing files");
                return;
            }
            
        }
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
  // Initial code for Model Layer      
/*
        Location locRow = new Location();
        locRow.setRow(2);
        locRow.setColumn(1);
        locRow.isVisited();
        String locRowInfo = locRow.toString();
        System.out.println(locRowInfo);
        
        Actor name = new Actor();
        name.setName("Justin");
        name.setDescription("This is Me");
        System.out.println(name);

        Question ques = new Question();
        ques.setQuestion("What do you think of Justin?");
        ques.setAnswer1("Justin Rocks");
        ques.setAnswer2("Justin is Amazing");
        ques.setAnswer3("Don't become the prey");
        ques.setCorrectAnswerNumber(2);
        System.out.println(ques);
        
        
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
        animalOne.setPointsWorth(5);
        System.out.println(animalOne.toString());
        
        Inventory inventoryOne = new Inventory();
        inventoryOne.setInventoryType("Ammo");
        inventoryOne.setQuantityInStock(1);
        inventoryOne.setRequiredAmount(1);
        inventoryOne.setUnitPrice(10);
        System.out.println(inventoryOne.toString());
*/       



    }
    
    
}
