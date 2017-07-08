/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.theHunted.view;

import java.util.Scanner;

/**
 * @author justin
**/

public class ViewScenes extends View {

   
   public ViewScenes() {   
    System.out.println(
            "\n ST"
            + "the starting point. This is also "
            + "where you find a hunting supply store."
            + " This is where your adventure starts!"
            + "\n"
            + "BR"
            + "Black River. The water is extremely cold."
            + " Brrrrrr!"
            + "\n"       
            + "HD"         
            + "the high desert location. The desert is hot and dry."
            + " You will need plenty of water."
            + "\n" 
            + "ND"
            + "the night desert location. This is where you need to use caution"
            + " and be aware of your surroundings."
            + " I hope you brought light to shine"
            + " in the darkness."
            + "\n"
            + "LD"
            + "\n"       
            + "the low desert area. There is very little cover here, so"
            + " you have to be fast to hunt game"
            + " in this area."
            + "\n"
            + "GR"
            + "Green River!"
            + "\n"
            + "LR"
            + "Logan River!"
            + "\n" 
            + "SR"
            + "San Juan River!"
            + "\n" 
            + "VR"
            + "Virgin River!"
            + "\n" 
            + "WR"
            + "White River!"
            + "\n"
            + "DM"
            + "Denali Mountain!"
            + "\n" 
            + "MF"
            + "Foraker Mountain!"
            + "\n"
            + "ME"
            + "Saint Elias Mountain!"
            + "\n"
            + "MB"
            + "Blackburn Moutain!"
            + "\n"
            + "MH"
            + "Hunter Mountain!"
            + "\n"
            + "OS"
            + "Okefenokee Swamp! Good luck pronouncing that."
            + "\n"
            + "CS"
            + "Cork Screw Swamp!"
            + "\n"
            + "BS"
            + "Barley Barbar Swamp!"
            + "\n" 
            + "GS"
            + "Green Swamp!"
            + "\n"
            + "KS"
            + "Kissimmee Swamp!"
            + "\n" 
            + "SF"
            + "Sierra National Forest!"
            + "\n"
            + "CN"
            + "Cleveland National Forest!"
            + "\n"
            + "CF"
            + "Chandelier Forest!"
            + "\n" 
            + "YR"
            + "Yosemite Forest. Watch for bears!"
            + "\n"
            + "FI"
            + "the end of the game."
            + " Great job! You played a great game.");

    }  

 
    @Override
    public boolean doAction(String value) {
        GameMenuView gameMenuView = new GameMenuView();
        gameMenuView.display();
        return false;
    }
    
}