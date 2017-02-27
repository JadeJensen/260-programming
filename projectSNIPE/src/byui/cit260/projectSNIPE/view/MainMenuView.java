/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.projectSNIPE.view;

import byui.cit260.projectSNIPE.control.GameControl;
//import java.util.Scanner;
import projectsnipe.ProjectSNIPE;

/**
 *
 * @author Jade
 */
public class MainMenuView extends View {
    public MainMenuView(){
    super("\n"
                + "\n-------------------"
                + "\n| Main Menu        |"
                + "\n-------------------"
                + "\nL - Load Previously Saved Game (This will lose any unsaved progress in the current game)"
                + "\nN - Start New Game (This will lose any unsaved progress in the current game)"
                + "\nR - Return to Player Location"
                + "\nS - Save Game"
                + "\nH - Help Menu"
                + "\nQ - Quit Game (Or previous Menu)"
                + "\n-------------------");
    }
    @Override
       public boolean doAction(String value) {
        value = value.toUpperCase();
        switch (value){
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
        gameMenu.display();
    }

    private void playerLocation() {
        System.out.println("playerLocation() called"); //To change body of generated methods, choose Tools | Templates.
    }

    private void saveGame() {
        SaveGameView saveMenu = new SaveGameView();
        saveMenu.display();
    }

    private void helpMenu() {
        HelpMenuView helpMenu = new HelpMenuView();
        helpMenu.display();
    }
}
