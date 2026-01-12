/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.exam_medev_final;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class EtatJeuTest {

    @Test
    public void testJouerTourValidLetter() {
        EtatJeu jeu = new EtatJeu("ABC", 5);
        boolean res = jeu.jouerTour('A');
        assertTrue(res);
        assertTrue(jeu.getEtat().getLettresProposees().contains('A'));
        assertEquals("A _ _", jeu.getEtat().getMotAffiche());
    }

    @Test
    public void testRepeatedLetterDoesNotIncreaseErrors() {
        EtatJeu jeu = new EtatJeu("WORD", 3);
        assertFalse(jeu.jouerTour('Z'));
        int erreurs = jeu.getEtat().getErreursCommises();
        assertEquals(1, erreurs);
        assertFalse(jeu.jouerTour('Z'));
        assertEquals(erreurs, jeu.getEtat().getErreursCommises());
    }

    @Test
    public void testInvalidLetterThrows() {
        EtatJeu jeu = new EtatJeu("A", 3);
        assertThrows(IllegalArgumentException.class, () -> jeu.jouerTour('1'));
        assertThrows(IllegalArgumentException.class, () -> jeu.jouerTour('!'));
    }

    @Test
    public void testVictoryDetectionWithRepeatedLetters() {
        EtatJeu jeu = new EtatJeu("ANNA", 5);
        assertTrue(jeu.jouerTour('A'));
        assertTrue(jeu.jouerTour('N'));
        assertTrue(jeu.estGagne());
        assertFalse(jeu.estPerdu());
    }

    @Test
    public void testDefeatDetection() {
        EtatJeu jeu = new EtatJeu("B", 1);
        assertFalse(jeu.jouerTour('A'));
        assertTrue(jeu.estPerdu());
    }

    @Test
    public void testNonRegressionMainRules() {
        EtatJeu jeu = new EtatJeu("CODE", 2);
        assertTrue(jeu.jouerTour('C'));
        assertFalse(jeu.jouerTour('X'));
        assertEquals(1, jeu.getEtat().getErreursCommises());
        assertFalse(jeu.jouerTour('X'));
        assertEquals(1, jeu.getEtat().getErreursCommises());
        assertThrows(IllegalArgumentException.class, () -> jeu.jouerTour('3'));
    }
}
