/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.projectSNIPE.view;

import byui.cit260.projectSNIPE.control.MapControl;
import byui.cit260.projectSNIPE.exceptions.MapControlException;
import byui.cit260.projectSNIPE.model.Game;
import byui.cit260.projectSNIPE.model.Location;
import byui.cit260.projectSNIPE.model.Map;
import byui.cit260.projectSNIPE.model.Player;
import java.awt.Point;
import static java.lang.Integer.parseInt;
import java.util.logging.Level;
import java.util.logging.Logger;
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
                + "\nD - Display Map WARNING: NOT FULLY DEVELOPED!!!"
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
            case "L": {
                try {
                    this.movePlayer();
                } catch (MapControlException ex) {
                    Logger.getLogger(MapView.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            break;
            case "P":
                this.printScene();
                break;
            case "D":
                this.displayMap();
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

    private void movePlayer() throws MapControlException {
        System.out.println("\nInput the new Row");
        int newRow = parseInt(this.getInput());
        System.out.println("\nInput the new Column");
        int newColumn = parseInt(this.getInput());
        Point newLocation = new Point(newRow, newColumn);
        Player Player = ProjectSNIPE.getPlayer();
        MapControl.movePlayerToLocation(Player, newLocation);
    }

    private void printScene() {
        this.console.println("\n\nEnter the file path for the file where the game is to be saved.");
        String filePath = this.getInput();
        try {
            MapControl.printMap(filePath);
        } catch (MapControlException ex) {
            ErrorView.display("MapView", ex.getMessage());
        }
    }

    private void displayMap() {
        Game game = ProjectSNIPE.getCurrentGame();
        Map map = game.getMap();
        Location[][] locations = map.getLocations();

        String dash = "-";
        String divider = new String(new char[55]).replace("\0", dash);

        System.out.println("The Map of The World");
        System.out.println(divider);
        for (int i = 0; i < locations.length; i++) {

            System.out.print(i + 1);
            for (Location location : locations[i]) {
                System.out.print("|");
                Location currentLocation = location;
                System.out.print(location.getScene().getMapSymbol());
            }
            System.out.print("|");
        }
        System.out.println("\n" + divider);
    }
}
