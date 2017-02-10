/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.projectSNIPE.control;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author rubengonzalezflores
 */
public class GasControlTest {
    
    public GasControlTest() {
    }

    /**
     * Test of calcPricePerGallon method, of class GasControl.
     */
    @Test
    public void testCalcPricePerGallon() {
        System.out.println("calcPricePerGallon");
        System.out.println("Test Case #1");
        double distance = 1000;
        double gallonsOfFuel = 3500;
        double pricePerGallon = 4;
        GasControl instance = new GasControl();
        double expResult = 14;
        double result = instance.calcPricePerGallon(distance, gallonsOfFuel, pricePerGallon);
        assertEquals(expResult, result, 1.0);
        // TODO review the generated test code and remove the default call to fail.
        
        System.out.println("Test Case #2");
        distance = 300;
        gallonsOfFuel = 500;
        pricePerGallon = 4;
        expResult = -1;
        result = instance.calcPricePerGallon(distance, gallonsOfFuel, pricePerGallon);
        assertEquals(expResult, result, 1.0);
        
        System.out.println("Test Case #2");
        distance = 300;
        gallonsOfFuel = 500;
        pricePerGallon = 4;
        expResult = -1;
        result = instance.calcPricePerGallon(distance, gallonsOfFuel, pricePerGallon);
        assertEquals(expResult, result, 1.0);
        
        System.out.println("Test Case #3");
        distance = 300;
        gallonsOfFuel = 6100;
        pricePerGallon = 4;
        expResult = -1;
        result = instance.calcPricePerGallon(distance, gallonsOfFuel, pricePerGallon);
        assertEquals(expResult, result, 1.0);
        
        System.out.println("Test Case #4");
        distance = 300;
        gallonsOfFuel = 2000;
        pricePerGallon = 7;
        expResult = -1;
        result = instance.calcPricePerGallon(distance, gallonsOfFuel, pricePerGallon);
        assertEquals(expResult, result, 1.0);
        
        System.out.println("Test Case #5");
        distance = 5;
        gallonsOfFuel = 2000;
        pricePerGallon = 4;
        expResult = -1;
        result = instance.calcPricePerGallon(distance, gallonsOfFuel, pricePerGallon);
        assertEquals(expResult, result, 1.0);
        
        System.out.println("Test Case #6");
        distance = 2500;
        gallonsOfFuel = 2000;
        pricePerGallon = 4;
        expResult = -1;
        result = instance.calcPricePerGallon(distance, gallonsOfFuel, pricePerGallon);
        assertEquals(expResult, result, 1.0);
        
        System.out.println("Test Case #7");
        distance = 100;
        gallonsOfFuel = 1001;
        pricePerGallon = 3;
        expResult = 30.03;
        result = instance.calcPricePerGallon(distance, gallonsOfFuel, pricePerGallon);
        assertEquals(expResult, result, 1.0);
        
        System.out.println("Test Case #8");
        distance = 2000;
        gallonsOfFuel = 5999;
        pricePerGallon = 3;
        expResult = 8.99;
        result = instance.calcPricePerGallon(distance, gallonsOfFuel, pricePerGallon);
        assertEquals(expResult, result, 1.0);
        
        System.out.println("Test Case #9");
        distance = 2000;
        gallonsOfFuel = 5999;
        pricePerGallon = 5.99;
        expResult = 17.97;
        result = instance.calcPricePerGallon(distance, gallonsOfFuel, pricePerGallon);
        assertEquals(expResult, result, 1.0);
        
        System.out.println("Test Case #10");
        distance = 10;
        gallonsOfFuel = 1000;
        pricePerGallon = 3;
        expResult = 300;
        result = instance.calcPricePerGallon(distance, gallonsOfFuel, pricePerGallon);
        assertEquals(expResult, result, 1.0);
    }
    
}
