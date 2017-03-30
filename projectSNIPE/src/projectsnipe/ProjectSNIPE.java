/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectsnipe;

import byui.cit260.projectSNIPE.model.Player;
import byui.cit260.projectSNIPE.model.Game;
import byui.cit260.projectSNIPE.view.StartProgramView;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;


/**
 *
 * @author Jade
 */
public class ProjectSNIPE {

    private static Game currentGame = null;
    private static Player player = null;

    private static PrintWriter outFile = null;
    private static BufferedReader inFile = null;

    private static PrintWriter logFile = null;

    public static void main(String[] args) {
        try {
            ProjectSNIPE.inFile = new BufferedReader(new InputStreamReader(System.in));
            ProjectSNIPE.outFile = new PrintWriter(System.out, true);
            String filePath = "log.txt";
            ProjectSNIPE.logFile = new PrintWriter(filePath);
            StartProgramView startProgramView = new StartProgramView();
            startProgramView.displayStartProgramView();
            return;
        } catch (Throwable te) {
            System.out.println(te.getMessage());
            te.printStackTrace();
        } finally {
            try {
                if (ProjectSNIPE.inFile != null) {
                    ProjectSNIPE.inFile.close();
                }
                if (ProjectSNIPE.outFile != null) {
                    ProjectSNIPE.outFile.close();
                }
                if (ProjectSNIPE.logFile != null) {
                    ProjectSNIPE.logFile.close();
                }
            } catch (IOException ex) {
                System.out.println("Error closing files");
                return;
            }

        }
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

    public static PrintWriter getOutFile() {
        return outFile;
    }

    public static void setOutFile(PrintWriter outFile) {
        ProjectSNIPE.outFile = outFile;
    }

    public static BufferedReader getInFile() {
        return inFile;
    }

    public static void setInFile(BufferedReader inFile) {
        ProjectSNIPE.inFile = inFile;
    }

    public static PrintWriter getLogFile() {
        return logFile;
    }

    public static void setLogFile(PrintWriter logFile) {
        ProjectSNIPE.logFile = logFile;
    }

}
