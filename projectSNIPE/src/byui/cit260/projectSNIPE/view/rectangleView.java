/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.projectSNIPE.view;

import java.util.Scanner;
import byui.cit260.projectSNIPE.control.rectangleControl;
import byui.cit260.projectSNIPE.exceptions.JadeExceptionClass;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Jade
 */
public class rectangleView {

    public rectangleView() {
    }
    public void display(){
        System.out.println("\n"
                + "\n----------------"
                + "\n|Rectangle Volume Calculator |"
                + "\nPlease enter a length, width, and height each must be less than 50 units");
        System.out.println(getInput());
    }
   public static double getInput() {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter length");
        String l = "";
            l = keyboard.nextLine();
            l = l.trim();
        System.out.println("Enter width");
        String w = "";
            w = keyboard.nextLine();
            w = w.trim();
        System.out.println("Enter height");
        String h = "";
            h = keyboard.nextLine();
            h = h.trim();
            double length = 0;
            double width = 0;
            double height = 0;
            try{
            length = Double.parseDouble(l);
            }
            catch (NumberFormatException nf){
                System.out.println("\nYou must enter a valid number.");
            }
            try{
        width = Double.parseDouble(w);
            }
            catch (NumberFormatException nf){
                System.out.println("\nYou must enter a valid number.");
            }
            try{
        height = Double.parseDouble(h);
            }
        catch (NumberFormatException nf){
                System.out.println("\nYou must enter a valid number.");
        }
        try {
        rectangleControl.rectangleVolumeCalc(length, width, height);
        } catch (JadeExceptionClass ex) {
            System.out.println(ex + "\nError in inputs");
        }
        double returnvalue = length * width * height;
        return returnvalue;
        }
    }