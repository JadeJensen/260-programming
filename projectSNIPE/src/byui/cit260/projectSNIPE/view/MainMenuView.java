/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.projectSNIPE.view;

import byui.cit260.projectSNIPE.control.GameControl;
import java.util.Scanner;
import projectsnipe.ProjectSNIPE;

/**
 *
 * @author Jade
 */
public class MainMenuView {
    
    private String menu;
    public MainMenuView() {
        this.menu ="\n"
                + "\n-------------------"
                + "\n| Main Menu        |"
                + "\n-------------------"
                + "\nL - Load Previously Saved Game (This will lose any unsaved progress in the current game)"
                + "\nN - Start New Game (This will lose any unsaved progress in the current game)"
                + "\nR - Return to Player Location"
                + "\nS - Save Game"
                + "\nH - Help Menu"
                + "\nQ - Quit Game (This will lose any unsaved progress in the current game)"
                + "\n-------------------";
    }
    void displayMainMenuView() {
        boolean done = false; // set flag to not done
        do{
            String menuOption = this.getMenuOption();
            if (menuOption.toUpperCase().equals("Q"))
                return;
            done = this.doAction(menuOption);
            }while (!done);
    }

    private String getMenuOption() {
        Scanner keyboard = new Scanner(System.in);
        String value = "";
        boolean valid = false;
        
        while (!valid){
            System.out.println("\n" + this.menu);
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

    private boolean doAction(String choice) {
        choice = choice.toUpperCase();
        
        switch (choice){
            case "L": // Loads a saved game; current data lost
                this.loadSavedGame();
                break;
            case "N": // Starts a new game
                this.startNewGame();
                break;
            case "R": //Returns the player location
                this.playerLocation();
                break;
            case "S":
                this.saveGame();
                break;
            case "H":// Help Menu
                this.helpMenu();
                break;
            default:
                System.out.println("\n***Invalid Selection *** Try Again");
                break;
        }
        return false;
    }

    private void loadSavedGame() {
        System.out.println("loadSavedGame() called"); //To change body of generated methods, choose Tools | Templates.
    }

    private void startNewGame() {
        GameControl.createNewGame(ProjectSNIPE.getPlayer());
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.displayGameMenu();
    }

    private void playerLocation() {
        System.out.println("playerLocation() called"); //To change body of generated methods, choose Tools | Templates.
    }

    private void saveGame() {
        System.out.println("saveGame() called"); //To change body of generated methods, choose Tools | Templates.
    }

    private void helpMenu() {
        HelpMenuView helpMenu = new HelpMenuView();
        helpMenu.displayHelpMenuView();
    }
}
