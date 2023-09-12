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

public class WindowTest {

    public WindowTest() {
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

    @Test
    public void testWindowInitialization() {
        // Create a Window instance and test its initialization
        Window window = new Window();

        // Add assertions to ensure the critical modules are functioning correctly
        assertNotNull(Window.Grid);
        assertEquals(20, Window.width);
        assertEquals(20, Window.height);

        // You can add more specific assertions related to the initialization here
    }

    @Test
    public void testGridInitialization() {
        // Test the initialization of the Grid ArrayList
        Window window = new Window();

        // Add assertions to ensure Grid is correctly initialized
        assertNotNull(Window.Grid);
        assertEquals(20, Window.Grid.size());

        
    }

    @Test
    public void testThreadsCreation() {
        // Test the creation of DataOfSquare instances in the Grid
        Window window = new Window();

        // Add assertions to ensure threads are correctly created and added to Grid
        assertNotNull(Window.Grid);
        assertEquals(20, Window.Grid.size());
        assertEquals(20, Window.Grid.get(0).size());

    }

    
}