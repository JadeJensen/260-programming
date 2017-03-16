/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.projectSNIPE.control;

import byui.cit260.projectSNIPE.exceptions.JadeExceptionClass;

/**
 *
 * @author JadeJ
 */
public class rectangleControl {
public static double rectangleVolumeCalc(double length, double width, double height) throws JadeExceptionClass{
    
    if (length > 50 || length < 1){
        throw new JadeExceptionClass("Invalid length");
    }
    if (width > 50 || width < 1){
        throw new JadeExceptionClass("Invalid width");
    }
    if (height > 50 || height < 1){
        throw new JadeExceptionClass("Invalid height");
    }
    double volume = length * width * height;
    return volume;
}
}
