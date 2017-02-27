/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.projectSNIPE.view;

import java.util.Scanner;

/**
 *
 * @author rubengonzalezflores
 */
public class GameMenuView extends View{
    public GameMenuView(){
        super("\n"
                + "\n----------------"
                + "\n|Game Menu     |"
                + "\nD - View Dossiers"
                + "\nC - View Collected Codes"
                + "\nP - View Player Health"
                + "\nT - Travel"
                + "\nV - View Map"
                + "\nM - Main Menu"
                + "\nH - Help Menu");
    }
    @Override
    public boolean doAction(String value) {
       value = value.toUpperCase();
        
        switch (value){
            case "D":
                this.dossier();
                break;
            case "C":
                this.collectedCodes();
                break;
            case "P":
                this.playerHealth();
                break;
            case "T":
                this.gameTravel();
                break;
            case "V":
                this.map();
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
        
    }

    private void collectedCodes() {
       
    }

    private void playerHealth() {
        
    }

    private void gameTravel() {
       
    }

    private void map() {
       
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
