/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.snakegame;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import java.awt.Color;

/**
 *
 * @author Anastaisa Dauloloma
 */
public class DataOfSquareTest {
    
    public DataOfSquareTest() {
      
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        
    }
    
    @After
    public void tearDown() {
       
    }

    /**
     * Test of lightMeUp method, of class DataOfSquare.
     */
    @Test
    public void testLightMeUp() {
        // Test case 1: Color change from dark gray to blue (covers switch-case)
        DataOfSquare instance1 = new DataOfSquare(0);
        instance1.lightMeUp(1);
        assertEquals(Color.BLUE, instance1.square.getBackground());

        // Test case 2: Color change from dark gray to white (covers switch-case)
        DataOfSquare instance2 = new DataOfSquare(0);
        instance2.lightMeUp(2);
        assertEquals(Color.WHITE, instance2.square.getBackground());

        // Test case 3: Color change from blue to dark gray (covers switch-case)
        DataOfSquare instance3 = new DataOfSquare(1);
        instance3.lightMeUp(0);
        assertEquals(Color.DARK_GRAY, instance3.square.getBackground());

        // Test case 4: Color change from blue to white (covers switch-case)
        DataOfSquare instance4 = new DataOfSquare(1);
        instance4.lightMeUp(2);
        assertEquals(Color.WHITE, instance4.square.getBackground());

        // Test case 5: Color change from white to dark gray (covers switch-case)
        DataOfSquare instance5 = new DataOfSquare(2);
        instance5.lightMeUp(0);
        assertEquals(Color.DARK_GRAY, instance5.square.getBackground());

        // Test case 6: Color change from white to blue (covers switch-case)
        DataOfSquare instance6 = new DataOfSquare(2);
        instance6.lightMeUp(1);
        assertEquals(Color.BLUE, instance6.square.getBackground());

        // Test case 7: Color change when color is already blue (covers if statement)
        DataOfSquare instance7 = new DataOfSquare(1);
        instance7.lightMeUp(1);
        assertEquals(Color.BLUE, instance7.square.getBackground());
    }
}