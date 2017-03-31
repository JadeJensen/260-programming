/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.projectSNIPE.view;

import byui.cit260.projectSNIPE.control.GameControl;
import byui.cit260.projectSNIPE.exceptions.MapControlException;
import projectsnipe.ProjectSNIPE;

/**
 *
 * @author Jade
 */
public class MainMenuView extends View {

    public MainMenuView() {
        super("\n"
                + "\n-------------------"
                + "\n| Main Menu        |"
                + "\n-------------------"
                + "\nL - Load Previously Saved Game (This will lose any unsaved progress in the current game)"
                + "\nN - Start New Game (This will lose any unsaved progress in the current game)"
                + "\nR - Return to Player Location"
                + "\nS - Save Game"
                + "\nM - Rectangle"
                + "\nH - Help Menu"
                + "\nQ - Quit Game (Or previous Menu)"
                + "\n-------------------");
    }

    @Override
    public boolean doAction(String value) {
        value = value.toUpperCase();
        switch (value) {
            case "L": // Loads a saved game; current data lost
                this.loadSavedGame();
                break;
            case "N": {
                try {
                    // Starts a new game
                    this.startNewGame();
                } catch (MapControlException ex) {
                    System.out.println("Oops something went wrong here...");
                }
            }
            break;
            case "R": //Returns the player location
                this.playerLocation();
                break;
            case "S":
                this.saveGame();
                break;
            case "M":
                this.rectangle();
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
        this.console.println("\n\nEnter the file path for the file where the game is saved");
        String filePath = this.getInput();
        try {
            GameControl.getSavedGame(filePath);
        } catch (Exception ex) {
            ErrorView.display("MainMenuView", ex.getMessage());
        }
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.display();
    }

    private void startNewGame() throws MapControlException {
        GameControl.createNewGame(ProjectSNIPE.getPlayer());
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.display();
    }

    private void playerLocation() {
        System.out.println("playerLocation() called"); //To change body of generated methods, choose Tools | Templates.
    }

    private void saveGame() {
        this.console.println("\n\nEnter the file path for the file where the game is to be saved.");
        String filePath = this.getInput();
        try {
            GameControl.saveGame(ProjectSNIPE.getCurrentGame(), filePath);
        } catch (Exception ex) {
            ErrorView.display("MainMenuView", ex.getMessage());
        }
    }

    private void helpMenu() {
        HelpMenuView helpMenu = new HelpMenuView();
        helpMenu.display();
    }

    private void rectangle() {
        rectangleView rectangleView = new rectangleView();
        rectangleView.display();
    }
}
