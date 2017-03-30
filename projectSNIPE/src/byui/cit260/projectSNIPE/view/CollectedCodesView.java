/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.projectSNIPE.view;

import java.util.Scanner;

/**
 *
 * @author Jade
 */
public class CollectedCodesView extends View{
    
    public CollectedCodesView(){
        super("\n"
                + "\n----------------"
                + "\n|Collected Codes Menu     |"
                + "\nM - Main Menu"
                + "\nG - Game Menu"
                + "\nH - Help Menu");
    }
   @Override
    public boolean doAction(String value) {
       value = value.toUpperCase();
            switch (value){
            case "M":
                this.mainMenu();
                break;
            case "H":
                this.helpMenu();
                break;
            case "G":
                this.gameMenu();
            default:
                System.out.println("\n***Invalid Selection *** Try Again");
                break;
    }
        return false;
    }
      private void mainMenu() {
       MainMenuView mainMenu = new MainMenuView();
       mainMenu.display();
    }

    private void helpMenu() {
       HelpMenuView helpMenu = new HelpMenuView();
        helpMenu.display();
    }
    private void gameMenu() {
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.display();
}
}