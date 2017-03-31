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
import static java.lang.Integer.parseInt;
import java.util.logging.Level;
import java.util.logging.Logger;
import projectsnipe.ProjectSNIPE;

/**
 *
 * @author rubengonzalezflores
 */
public class GameMenuView extends View {

    public GameMenuView() {
        super("\n"
                + "\n----------------"
                + "\n|Game Menu     |"
                + "\nD - View Dossiers"
                + "\nC - View Collected Codes"
                + "\nP - View Player Health"
                + "\nT - Travel"
                + "\nV - Map Menu"
                + "\nM - Main Menu"
                + "\nH - Help Menu");
    }

    @Override
    public boolean doAction(String value) {
        value = value.toUpperCase();

        switch (value) {
            case "D":
                this.dossier();
                break;
            case "C":
                this.collectedCodes();
                break;
            case "P":
                this.playerHealth();
                break;
            case "T": {
                try {
                    this.gameTravel();
                } catch (MapControlException ex) {
                    Logger.getLogger(GameMenuView.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            break;
            case "V":
                this.displayMap();
                break;
            case "M":
                this.gameMenu();
                break;
            case "H":
                this.helpMenu();
                break;
            default:
                System.out.println("\n***Invalid Selection *** Try Again");
                break;
        }
        return false;
    }

    private void dossier() {
        DossierView DossierView = new DossierView();
        DossierView.display();
    }

    private void collectedCodes() {
        CollectedCodesView CollectedCodesView = new CollectedCodesView();
        CollectedCodesView.display();
    }

    private void playerHealth() {
        System.out.println("playerHealth() stub called.");
    }

    private void gameTravel() throws MapControlException {
        System.out.println("\nInput the new Row");
        int newRow = parseInt(this.getInput());
        System.out.println("\nInput the new Column");
        int newColumn = parseInt(this.getInput());
        Point newLocation = new Point(newRow, newColumn);
        Player Player = ProjectSNIPE.getPlayer();
        MapControl.movePlayerToLocation(Player, newLocation);
    }

    private void displayMap() {
        MapView mapView = new MapView();
        mapView.display();

    }

    private void gameMenu() {
        MainMenuView mainMenu = new MainMenuView();
        mainMenu.display();
    }

    private void helpMenu() {
        HelpMenuView helpMenu = new HelpMenuView();
        helpMenu.display();
    }
}
