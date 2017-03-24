/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.projectSNIPE.view;

import byui.cit260.projectSNIPE.control.MapControl;
import byui.cit260.projectSNIPE.exceptions.MapControlException;
import byui.cit260.projectSNIPE.model.Player;
import java.awt.Point;
import java.util.Scanner;
import projectsnipe.ProjectSNIPE;

/**
 *
 * @author Jade
 */
public class MapView extends View {

    public MapView() {
        super("\n"
                + "\n----------------"
                + "\n|Map Menu     |"
                + "\nM - Main Menu"
                + "\nH - Help Menu"
                + "\nP - Print Scene names and descriptions to a file."
                + "\nL - Move Player");
    }

    @Override
    public boolean doAction(String value) {
        value = value.toUpperCase();

        switch (value) {
            case "M":
                this.gameMenu();
                break;
            case "H":
                this.helpMenu();
                break;
            case "L":
                this.movePlayer();
                break;
            case "P":
                this.printScene();
                break;
            default:
                System.out.println("\n***Invalid Selection *** Try Again");
                break;
        }
        return false;
    }

    private void gameMenu() {
        MainMenuView mainMenu = new MainMenuView();
        mainMenu.display();
    }

    private void helpMenu() {
        HelpMenuView helpMenu = new HelpMenuView();
        helpMenu.display();
    }

    private void movePlayer() {
        
        Player player = ProjectSNIPE.getPlayer();
        
//        try {
//            MapControl.movePlayerToLocation(player, coordinates);
//        } catch (MapControlException me) {
//            System.out.println(me.getMessage());
//        }
    }

    private void printScene() {
        this.console.println("\n\nEnter the file path for the file where the game is to be saved.");
        String filePath = this.getInput();
        try {
            MapControl.printMap(filePath);
        }catch (Exception ex){
            ErrorView.display("MapView", ex.getMessage());
        }
    }
}
