/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.exam_medev_final;

import java.util.Set;
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
public class TourDeJeuTest {
    
    public TourDeJeuTest() {
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
     * Test of getMotAffiche method, of class TourDeJeu.
     */
    @Test
    public void testGetMotAffiche() {
        System.out.println("getMotAffiche");
        TourDeJeu instance = null;
        String expResult = "";
        String result = instance.getMotAffiche();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMotSecret method, of class TourDeJeu.
     */
    @Test
    public void testGetMotSecret() {
        System.out.println("getMotSecret");
        TourDeJeu instance = null;
        String expResult = "";
        String result = instance.getMotSecret();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLettresProposees method, of class TourDeJeu.
     */
    @Test
    public void testGetLettresProposees() {
        System.out.println("getLettresProposees");
        TourDeJeu instance = null;
        Set<Character> expResult = null;
        Set<Character> result = instance.getLettresProposees();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getErreursCommises method, of class TourDeJeu.
     */
    @Test
    public void testGetErreursCommises() {
        System.out.println("getErreursCommises");
        TourDeJeu instance = null;
        int expResult = 0;
        int result = instance.getErreursCommises();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of incrementerErreurs method, of class TourDeJeu.
     */
    @Test
    public void testIncrementerErreurs() {
        System.out.println("incrementerErreurs");
        TourDeJeu instance = null;
        instance.incrementerErreurs();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getErreursRestantes method, of class TourDeJeu.
     */
    @Test
    public void testGetErreursRestantes() {
        System.out.println("getErreursRestantes");
        TourDeJeu instance = null;
        int expResult = 0;
        int result = instance.getErreursRestantes();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMaxErreurs method, of class TourDeJeu.
     */
    @Test
    public void testGetMaxErreurs() {
        System.out.println("getMaxErreurs");
        TourDeJeu instance = null;
        int expResult = 0;
        int result = instance.getMaxErreurs();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
