/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thehunted;

import byui.cit1260.theHunted.model.Game;
import byui.cit1260.theHunted.model.Map;
import byui.cit1260.theHunted.model.Player;
import byui.cit1260.theHunted.model.Location;
import byui.cit1260.theHunted.model.Actor;
import byui.cit1260.theHunted.model.Question;
import byui.cit1260.theHunted.model.Scene;
/**
 *
 * @author lus12
 */
public class TheHunted {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Location locRow = new Location();
        locRow.equals(2);
        String locRowInfo = locRow.toString();
        System.out.println(locRowInfo);
        
        Actor name = new Actor();
        name.setName("Justin");
        System.out.println(name);

        Question ques = new Question();
        ques.getQuestion();
        ques.setAnswer1("Justin Rocks");
        ques.setAnswer2("Justin is Amazing");
        ques.setAnswer3("Don't become the prey");
        ques.getCorrectAnswerNumber();
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
                     
    }
    
    
}
