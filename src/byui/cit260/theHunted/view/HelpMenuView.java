/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.theHunted.view;

import java.util.Scanner;

/**
 *
 * @author Justin
 */
public class HelpMenuView {

    private String menu;
    
    
    public HelpMenuView() {
        this.menu= "\n"
                 + "\n-------------------------------"
                 + "\n   Help Menu                  "
                 + "\n-------------------------------"
                 + "\nG - What is the goal of the game?"
                 + "\nM - How to move to different locations"
                 + "\nT - Understanding the treasure box"
                 + "\nW - Understanding weapons and use"
                 + "\nL - Understanding locations"
                 + "\nQ - Quit"
                 + "\n-------------------------------";        
    }
    
    public void displayHelpMenuView() {
        
        boolean done = false; //set flag to not done
        do {
           //prompt for and get player's name
           String menuHelpOption = this.getMenuHelpOption();
           if(menuHelpOption.toUpperCase().equals("Q"))
               return;
           
           done = this.doAction(menuHelpOption);
        
        } while (!done);
    }

    private String getMenuHelpOption() {
        Scanner keyboard = new Scanner(System.in);
        String value = "";
        boolean valid = false;
        
        while (!valid) {
            System.out.println("\n" + this.menu);
            
            value = keyboard.nextLine();
            value = value.trim();
            
            if(value.length() < 1) {
                System.out.println("\nInvalid value; value can't be blank");
                continue;
                
            }
            break;
        }
        return value;
    }

    private boolean doAction(String menuHelpOption) {
        
        menuHelpOption = menuHelpOption.toUpperCase();
        
        switch (menuHelpOption) {
            case "G":
                this.displayGameObjective();
                break;
            case "M":
                this.displayHowToMove();
                break;
            case "T":
                this.TreasureBox();
                break;
            case "W":
                this.displayWeapons();
                break;
            case "L":
                this.displayLocations();
                break;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;               
        }
        return false;
 
    }
        
        
    private void displayGameObjective() {
        System.out.println("\n*** displayGameObjective function called ***");
    }

    private void displayHowToMove() {
        System.out.println("\n*** displayHowToMove function called ***");
    }

    private void TreasureBox() {
        System.out.println("\n*** TreasureBox function called ***");
    }

    private void displayWeapons() {
        System.out.println("\n*** displayWeapons function called ***");
    }

    private void displayLocations() {
        System.out.println("\n*** displayLocations function called ***");
    }

}