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
public class rectangleControl {
public double rectangleVolumeCalc(double length, double width, double height){
    
    if (length > 50 || length < 1){
        return -1;
    }
    if (width > 50 || width < 1){
        return -1;
    }
    if (height > 50 || height < 1){
        return -1;
    }
    double volume = length * width * height;
    return volume;
}
}
