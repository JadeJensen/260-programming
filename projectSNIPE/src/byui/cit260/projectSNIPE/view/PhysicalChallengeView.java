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
public class PhysicalChallengeView extends View {

    public PhysicalChallengeView() {
        super("\n"
                + "\n----------------"
                + "\n|Physical Challenge Menu     |"
                + "\nM - Main Menu"
                + "\nH - Help Menu");
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
}
