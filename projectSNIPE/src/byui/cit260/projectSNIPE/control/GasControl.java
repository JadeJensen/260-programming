/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.projectSNIPE.control;

import java.util.Scanner;

/**
 *
 * @author JadeJ
 */
public class GasControl {

    public double calcPricePerGallon(double distance, double gallonsOfFuel, double pricePerGallon) {

        if (distance < 10 || distance > 2000) {
            return -1;
        }
        if (pricePerGallon > 6) {
            return -1;
        }
        if (gallonsOfFuel < 1000 || gallonsOfFuel > 6000) {
            return -1;
        }
        double pricePerMile = (gallonsOfFuel * pricePerGallon) / distance;
        return pricePerMile;
    }

    public String getInput() {
        Scanner keyboard = new Scanner(System.in);
        String value = "";
        boolean valid = false;
        while (!valid) {
            value = keyboard.nextLine();
            value = value.trim();
            if (value.length() < 1) {
                System.out.println("\nInvalid value: value can not be blank");
                continue;
            }
            break;
        }
        return value;
    }

    public Double getIntNumber() {
        Double number = null;
        while (number == null) {
            String value = this.getInput();
            value = value.trim().toUpperCase();
            if (value.equals("Q")) {
                break;
            }
            try {
                number = Double.parseDouble(value);
            } catch (NumberFormatException nf) {
                System.out.println("\nYou must enter a valid number.");
            }
        }
        return number;
    }
}
