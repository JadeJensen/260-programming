/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectsnipe;

import byui.cit260.projectSNIPE.model.Item;
import byui.cit260.projectSNIPE.model.Player;
import byui.cit260.projectSNIPE.model.Game;
import byui.cit260.projectSNIPE.model.Character;
import byui.cit260.projectSNIPE.model.Map;
import byui.cit260.projectSNIPE.model.Location;
import byui.cit260.projectSNIPE.model.Country;
import byui.cit260.projectSNIPE.model.City;
import byui.cit260.projectSNIPE.model.Scene;
import byui.cit260.projectSNIPE.model.Dossier;
import byui.cit260.projectSNIPE.model.MathPuzzles;
import byui.cit260.projectSNIPE.view.StartProgramView;

/**
 *
 * @author Jade
 */
public class ProjectSNIPE {
        private static Game currentGame = null;
        private static Player player = null;
    
    public static void main(String[] args) {
        StartProgramView startProgramView = new StartProgramView();
        startProgramView.displayStartProgramView();    
    }

    public static Game getCurrentGame() {
        return currentGame;
    }

    public static void setCurrentGame(Game currentGame) {
        ProjectSNIPE.currentGame = currentGame;
    }

    public static Player getPlayer() {
        return player;
    }

    public static void setPlayer(Player player) {
        ProjectSNIPE.player = player;
    }
}
