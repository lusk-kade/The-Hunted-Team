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
public class HelpMenuView extends View {

    private String menu;
    
    
    public HelpMenuView() {
            super ("\n"
                 + "\n-------------------------------"
                 + "\n   Help Menu                  "
                 + "\n-------------------------------"
                 + "\nG - What is the goal of the game?"
                 + "\nM - How to move to different locations"
                 + "\nT - Understanding the treasure box"
                 + "\nW - Understanding weapons and use"
                 + "\nL - Understanding locations"
                 + "\nQ - Quit"
                 + "\n-------------------------------");        
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
        
        String value = "";
        boolean valid = false;
    try {    
        while (!valid) {
            this.console.println("\n" + this.menu);
            
            value = this.keyboard.readLine();
            value = value.trim();
            
            if(value.length() < 1) {
                ErrorView.display(this.getClass().getName(),
                        "\nInvalid value; value can't be blank");
                continue;
                
            }
            break;
        }
    } catch (Exception e) {
        ErrorView.display(this.getClass().getName(),
                "Error reading input: " + e.getMessage());
    }
        return value;
    }
    
    @Override
    public boolean doAction(String menuHelpOption) {
        
        menuHelpOption = menuHelpOption.toUpperCase();
        
        switch (menuHelpOption) {
            case "G":
                this.displayGameObjective();
                break;
            case "M":
                this.displayHowToMove();
                break;
            default:
                ErrorView.display(this.getClass().getName(),
                        "\n*** Invalid selection *** Try again");
                break;               
        }
        return false;
 
    }
        
        
    private void displayGameObjective() {
        System.out.println("\n*** Hunt until you want to go home. ***"
                          +"\n*** Hunt unyil you become the hunted. *** ");
    }

    private void displayHowToMove() {
        System.out.println("\n*** Select the move option and enter two letter code. ***");
    }


}