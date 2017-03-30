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
public class InventoryControlTest {

    public InventoryControlTest() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of calcNewMoney method, of class InventoryControl.
     */
    @Test
    public void testCalcNewMoney() {
        System.out.println("Test case #1");
        double money = 400.0;
        double exchangeRate = 20.0;
        InventoryControl instance = new InventoryControl();
        double expResult = 7600.0;
        double result = instance.calcNewMoney(money, exchangeRate);
        assertEquals(expResult, result, 1.0);
        //#2
        System.out.println("Test case #2");
        money = 0.0;
        exchangeRate = 20.0;
        expResult = -1;
        result = instance.calcNewMoney(money, exchangeRate);
        assertEquals(expResult, result, 1.0);
        //3
        System.out.println("Test case #3");
        money = 1001.0;
        exchangeRate = 10.0;
        expResult = -1;
        result = instance.calcNewMoney(money, exchangeRate);
        assertEquals(expResult, result, 1.0);
        //4
        System.out.println("Test case #4");
        money = 400.0;
        exchangeRate = 65.0;
        expResult = -1;
        result = instance.calcNewMoney(money, exchangeRate);
        assertEquals(expResult, result, 1.0);
        //5
        System.out.println("Test case #5");
        money = 10.0;
        exchangeRate = 45.0;
        expResult = 427.5;
        result = instance.calcNewMoney(money, exchangeRate);
        assertEquals(expResult, result, 1.0);
        //6
        System.out.println("Test case #6");
        money = 1000.0;
        exchangeRate = 23.0;
        expResult = 21850;
        result = instance.calcNewMoney(money, exchangeRate);
        assertEquals(expResult, result, 1.0);
        //7
        System.out.println("Test case #7");
        money = 345.0;
        exchangeRate = 10.0;
        expResult = 3277.5;
        result = instance.calcNewMoney(money, exchangeRate);
        assertEquals(expResult, result, 1.0);
        //8
        System.out.println("Test case #8");
        money = 657.0;
        exchangeRate = 59.0;
        expResult = 36824.85;
        result = instance.calcNewMoney(money, exchangeRate);
        assertEquals(expResult, result, 1.0);
    }
}
