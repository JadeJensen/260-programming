/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.projectSNIPE.control;

import org.junit.AfterClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author JadeJ
 */
public class rectangleControlTest {
    
    public rectangleControlTest() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of rectangleVolumeCalc method, of class rectangleControl.
     */
    @Test
    public void testRectangleVolumeCalc() {
        System.out.println("Test Case #1");
        double length = 23.0;
        double width = 8.0;
        double height = 4.0;
        rectangleControl instance = new rectangleControl();
        double expResult = 736.0;
        double result = instance.rectangleVolumeCalc(length, width, height);
        assertEquals(expResult, result, 1.0);
        System.out.println("Test Case #2");
        length = 0;
        width = 43;
        height = 28;
        expResult = -1;
        result = instance.rectangleVolumeCalc(length, width, height);
        assertEquals(expResult, result, 1.0);
        System.out.println("Test Case #3");
        length = -10;
        width = 50;
        height = 9;
        expResult = -1;
        result = instance.rectangleVolumeCalc(length, width, height);
        assertEquals(expResult, result, 1.0);
        System.out.println("Test Case #4");
        length = 1100;
        width = 5;
        height = 6;
        expResult = -1;
        result = instance.rectangleVolumeCalc(length, width, height);
        assertEquals(expResult, result, 1.0);
        System.out.println("Test Case #5");
        length = 50;
        width = 50;
        height = 1;
        expResult = 2500;
        result = instance.rectangleVolumeCalc(length, width, height);
        assertEquals(expResult, result, 1.0);
        System.out.println("Test Case #6");
        length = 1;
        width = 50;
        height = 50;
        expResult = 2500;
        result = instance.rectangleVolumeCalc(length, width, height);
        assertEquals(expResult, result, 1.0);
        System.out.println("Test Case #7");
        length = 50;
        width = 1;
        height = 50;
        expResult = 2500;
        result = instance.rectangleVolumeCalc(length, width, height);
        assertEquals(expResult, result, 1.0);
    }
    
}
