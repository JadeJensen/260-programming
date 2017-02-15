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
public class HelpMenuView {
    private String menu;
        public HelpMenuView() {
        this.menu ="\n"
                + "\n-------------------"
                + "\n| Help Menu        |"
                + "\n-------------------"
                + "\nG - What is the goal of the game?"
                + "\nB - Game basics"
                + "\nL - List of available countries to visit"
                + "\nT - How to travel"
                + "\nQ - Quit"
                + "\n-------------------";
    }
    void displayHelpMenuView(){
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
            case "G":
                this.gameGoal();
                break;
            case "B":
                this.gameBasics();
                break;
            case "L":
                this.gameListCountries();
                break;
            case"T":
                this.gameTravel();
                break;
            default:
                System.out.println("\n***Invalid Selection *** Try Again");
                break;
    }
        return false;
    }

    private void gameGoal() {
        System.out.println("gameGoal() called");
    }

    private void gameBasics() {
        System.out.println("gameBasics() called");
}
    private void gameListCountries() {
        System.out.println("gameListCountries called");
    }

    private void gameTravel() {
        System.out.println("gameTravel() called");
    }
}
