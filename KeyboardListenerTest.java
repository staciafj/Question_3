/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.snakegame;

import java.awt.Component;
import java.awt.event.KeyEvent;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.junit.jupiter.params.shadow.com.univocity.parsers.common.NoopProcessorErrorHandler.instance;

/**
 *
 * @author Anastaisa Dauloloma
 */
public class KeyboardListenerTest {
    
    public KeyboardListenerTest() {
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
     * Test of keyPressed method, of class KeyboardListener.
     */
    @Test
    public void testKeyPressed() {
        System.out.println("keyPressed");
        KeyEvent e = null;
        KeyboardListener instance = new KeyboardListener();
        instance.keyPressed(e);
        // TODO review the generated test code and remove the default call to fail.
        }
    @Test
public void testRightArrowKeyPressed() {
    System.out.println("Right Arrow Key Pressed");
    KeyEvent e = new KeyEvent((Component) instance, KeyEvent.KEY_PRESSED, System.currentTimeMillis(), 0, KeyEvent.VK_RIGHT, KeyEvent.CHAR_UNDEFINED);
    KeyboardListener instance = new KeyboardListener();
    instance.keyPressed(e);
    assertEquals(1, ThreadsController.directionSnake);
}

@Test
public void testTopArrowKeyPressed() {
    System.out.println("Top Arrow Key Pressed");
    KeyEvent e = new KeyEvent((Component) instance, KeyEvent.KEY_PRESSED, System.currentTimeMillis(), 0, KeyEvent.VK_UP, KeyEvent.CHAR_UNDEFINED);
    KeyboardListener instance = new KeyboardListener();
    instance.keyPressed(e);
    assertEquals(3, ThreadsController.directionSnake);
}

@Test
public void testLeftArrowKeyPressed() {
    System.out.println("Left Arrow Key Pressed");
    KeyEvent e = new KeyEvent((Component) instance, KeyEvent.KEY_PRESSED, System.currentTimeMillis(), 0, KeyEvent.VK_LEFT, KeyEvent.CHAR_UNDEFINED);
    KeyboardListener instance = new KeyboardListener();
    instance.keyPressed(e);
    assertEquals(2, ThreadsController.directionSnake);
}

@Test
public void testBottomArrowKeyPressed() {
    System.out.println("Bottom Arrow Key Pressed");
    KeyEvent e = new KeyEvent((Component) instance, KeyEvent.KEY_PRESSED, System.currentTimeMillis(), 0, KeyEvent.VK_DOWN, KeyEvent.CHAR_UNDEFINED);
    KeyboardListener instance = new KeyboardListener();
    instance.keyPressed(e);
    assertEquals(4, ThreadsController.directionSnake);
}

@Test
public void testUnrecognizedKeyPressed() {
    System.out.println("Unrecognized Key Pressed");
    KeyEvent e = new KeyEvent((Component) instance, KeyEvent.KEY_PRESSED, System.currentTimeMillis(), 0, KeyEvent.VK_A, KeyEvent.CHAR_UNDEFINED);
    KeyboardListener instance = new KeyboardListener();
    instance.keyPressed(e);
    // Ensure that ThreadsController.directionSnake is not changed
    assertEquals(0, ThreadsController.directionSnake);
}
    
}
