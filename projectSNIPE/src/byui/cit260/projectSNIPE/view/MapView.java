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
public class MapView {
    private String menu;
    public MapView(){
        this.menu = "\n"
                + "\n----------------"
                + "\n|Map Menu     |"
                + "\nM - Main Menu"
                + "\nH - Help Menu";
    }
    void displayGameMenu(){
       boolean done = false;
        do{
            String menuOption = this.getMenuOption();
            if (menuOption.toUpperCase().equals("Q"))
                return;
            done = this.doAction(menuOption);
        }
        while(!done);
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
       mainMenu.displayMainMenuView();
    }

    private void helpMenu() {
       HelpMenuView helpMenu = new HelpMenuView();
        helpMenu.displayHelpMenuView();
    }
}
