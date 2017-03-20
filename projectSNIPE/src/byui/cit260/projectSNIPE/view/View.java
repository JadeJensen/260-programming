/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.projectSNIPE.view;

import java.io.BufferedReader;
import java.io.PrintWriter;
import java.util.Scanner;
import projectsnipe.ProjectSNIPE;

/**
 *
 * @author Jade
 */
public abstract class View implements ViewInterface {
    protected String displayMessage;
    
    protected final BufferedReader keyboard = ProjectSNIPE.getInFile();
    protected final PrintWriter console = ProjectSNIPE.getOutFile();
    public View(){
        
    }
    public View(String message){
        this.displayMessage = message;
    }
    @Override
    public void display(){
        boolean done = false;
        do{
            String value = this.getInput();
            if (value.toUpperCase().equals("Q"))
                return;
            done = this.doAction(value);
        } while (!done);
    }
    @Override
    public String getInput() {
        boolean valid = false;
        String selection = null;
        try{
        while (!valid){
            System.out.println("\n" + this.displayMessage);
            selection = this.keyboard.readLine();
            selection = selection.trim();
            if (selection.length() < 1){
                ErrorView.display(this.getClass().getName(), "You must enter a value.");
                continue;
        }
            break;
        }
        } catch (Exception e){
            ErrorView.display(this.getClass().getName(), "Error reading input: "+ e.getMessage());
            return null;
        }
        return selection;
    }
    
}
