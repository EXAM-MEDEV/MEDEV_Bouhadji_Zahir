/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.exam_medev_final;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author user
 */
public class EtatJeuTest {
    
    public EtatJeuTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of jouerTour method, of class EtatJeu.
     */
    @Test
    public void testJouerTour() {
        System.out.println("jouerTour");
        char lettre = ' ';
        EtatJeu instance = null;
        boolean expResult = false;
        boolean result = instance.jouerTour(lettre);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of estGagne method, of class EtatJeu.
     */
    @Test
    public void testEstGagne() {
        System.out.println("estGagne");
        EtatJeu instance = null;
        boolean expResult = false;
        boolean result = instance.estGagne();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of estPerdu method, of class EtatJeu.
     */
    @Test
    public void testEstPerdu() {
        System.out.println("estPerdu");
        EtatJeu instance = null;
        boolean expResult = false;
        boolean result = instance.estPerdu();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEtat method, of class EtatJeu.
     */
    @Test
    public void testGetEtat() {
        System.out.println("getEtat");
        EtatJeu instance = null;
        TourDeJeu expResult = null;
        TourDeJeu result = instance.getEtat();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
