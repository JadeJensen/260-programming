/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.projectSNIPE.view;

import java.io.PrintWriter;
import projectsnipe.ProjectSNIPE;

/**
 *
 * @author Jade
 */
public class ErrorView {

    private static final PrintWriter errorFile = ProjectSNIPE.getOutFile();
    private static final PrintWriter logFile = ProjectSNIPE.getLogFile();

    public static void display(String className, String errorMessage) {
        errorFile.println(
                "-------------------------------------------------"
                + "\n - ERROR - " + errorMessage
                + "\n------------------------------------------------");
        logFile.println(className + " - " + errorMessage);
    }
}
