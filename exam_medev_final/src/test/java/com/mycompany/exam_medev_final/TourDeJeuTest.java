/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.exam_medev_final;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class TourDeJeuTest {

    @Test
    public void testGetMotAfficheInitial() {
        TourDeJeu td = new TourDeJeu("JAVA", 5);
        assertEquals("_ _ _ _", td.getMotAffiche());
    }

    @Test
    public void testGetMotAfficheAfterGuesses() {
        TourDeJeu td = new TourDeJeu("JAVA", 5);
        td.getLettresProposees().add('J');
        td.getLettresProposees().add('V');
        assertEquals("J _ V _", td.getMotAffiche());
    }

    @Test
    public void testIncrementerErreursAndRestantes() {
        TourDeJeu td = new TourDeJeu("TEST", 3);
        assertEquals(3, td.getErreursRestantes());
        td.incrementerErreurs();
        assertEquals(1, td.getErreursCommises());
        assertEquals(2, td.getErreursRestantes());
    }

    @Test
    public void testGetMaxErreurs() {
        TourDeJeu td = new TourDeJeu("X", 7);
        assertEquals(7, td.getMaxErreurs());
    }
}
