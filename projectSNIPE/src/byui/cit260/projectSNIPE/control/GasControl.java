/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.projectSNIPE.control;

/**
 *
 * @author JadeJ
 */
public class GasControl {

    public double calcPricePerGallon(double distance, double gallonsOfFuel, double pricePerGallon){
        if (distance < 10 || distance > 2000){
            return -1;
        }
        if (pricePerGallon > 6){
            return -1;
        }
        if (gallonsOfFuel < 1000 || gallonsOfFuel > 6000){
            return -1;
        }
        double pricePerMile = (gallonsOfFuel * pricePerGallon) / distance;
        return pricePerMile;
    }
}
