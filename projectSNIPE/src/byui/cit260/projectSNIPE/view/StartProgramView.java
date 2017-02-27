/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.projectSNIPE.view;

import byui.cit260.projectSNIPE.control.GameControl;
import byui.cit260.projectSNIPE.model.Player;
import java.util.Scanner;

/**
 *
 * @author Jade
 */
public class StartProgramView {
    private String promptMessage;
    private String playersName;
    public StartProgramView(){
         this.promptMessage = "\nPlease enter your name: ";
         this.displayBanner();
    }

    private void displayBanner() {
       System.out.println("\nThis is a text based international spy adventure game. "
               + "\nUpon completion of this final set of training missions, the user becomes a secret agent. "
               + "\nThe user is assigned a secret agent name and given a dossier containing a brief description of the country, the names of three cities which hold clues, and details about the physical or mental challenge in each city. "
               + "\nUpon successful completion of at least one challenge per country, the user receives part of a master code that is needed to win the game. "
               + "\nA user can become injured and lose health points, or die in physical challenges. "
               + "\nAgent trainees are allowed to rest and recover from injuries in safe houses as they work through their training mission. "
               + "\nSafe houses are also places to contact their handler and receive the dossier for the next mission. "
               + "\nEntry into a safe house requires decoding a riddle. "
               + "\nAs the game progresses, the user gathers clues, solves mysteries, and cracks codes en route to becoming a SNIPE Secret Agent. "
               + "\nTo win the game the user needs to make it through the entire series of locations solving mysteries without dying, then combine the pieces to complete the master code. "
               + "\nIf the user is successful, he will be inducted into the SNIPE academy as a secret agent.");
    }

    public void displayStartProgramView() {
        
        boolean done = false; // set flag to not done
        do{
            String playersName = this.getPlayersName();
            if (playersName.toUpperCase().equals("Q"))
                return;
            done = this.doAction(playersName);
            }while (!done);
    }

    private String getPlayersName() {
        Scanner keyboard = new Scanner(System.in);
        String value = "";
        boolean valid = false;
        
        while (!valid){
            System.out.println("\n" + this.promptMessage);
            value = keyboard.nextLine();
            value = value.trim();
            if (value.length() < 1){
                System.out.println("\nInvalid value: value can not be blank");
                continue;
        }
            break;
        }
        return value;
    }

    public boolean doAction(String playersName) {
        if (playersName.length() < 2){
        System.out.println("\nInvalid players name: \nThe name must be greater than than one character in length");
            return false;
        }
    
    Player player = GameControl.createPlayer(playersName);
    
    if (player == null){
    System.out.println("\nError creating the player.");
        return false;
    }
    this.displayNextView(player);
    return true;
}

    private void displayNextView(Player player) {
        System.out.println("\n===================================="
                         +"\nWelcome to the game "+ player.getName()+"!"
                         +"\nWe hope you have a lot of fun!"
                         +"\n====================================="
        );
        MainMenuView mainMenuView = new MainMenuView();
        mainMenuView.display();
    }
}
