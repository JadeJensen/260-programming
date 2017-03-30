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
public class HelpMenuView extends View {

    public HelpMenuView() {
        super("\n"
                + "\n-------------------"
                + "\n| Help Menu        |"
                + "\n-------------------"
                + "\nG - What is the goal of the game?"
                + "\nB - Game basics"
                + "\nL - List of available countries to visit"
                + "\nT - How to travel"
                + "\nQ - Quit to Previous Menu"
                + "\n-------------------");
    }

    @Override
    public boolean doAction(String value) {
        value = value.toUpperCase();

        switch (value) {
            case "G":
                this.gameGoal();
                break;
            case "B":
                this.gameBasics();
                break;
            case "L":
                this.gameListCountries();
                break;
            case "T":
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
