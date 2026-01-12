package com.mycompany.exam_medev_final;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class InterfaceTexteTest {

    @Test
    public void testDemarrerPartieVictory() {
        String input = "H I\n"; // propose H puis I for word HI
        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        ByteArrayOutputStream out = new ByteArrayOutputStream();

        PrintStream originalOut = System.out;
        java.io.InputStream originalIn = System.in;
        try {
            System.setIn(in);
            System.setOut(new PrintStream(out));

            InterfaceTexte it = new InterfaceTexte();
            it.demarrerPartie("HI", 5);

            String printed = out.toString();
            assertTrue(printed.contains("Félicitations") || printed.contains("Félicitations !"));
            assertTrue(printed.contains("HI"));
        } finally {
            System.setOut(originalOut);
            System.setIn(originalIn);
        }
    }

    @Test
    public void testDemarrerPartieDefeat() {
        // provide three wrong letters for maxErreurs = 2 to ensure defeat
        String input = "A B C\n";
        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        ByteArrayOutputStream out = new ByteArrayOutputStream();

        PrintStream originalOut = System.out;
        java.io.InputStream originalIn = System.in;
        try {
            System.setIn(in);
            System.setOut(new PrintStream(out));

            InterfaceTexte it = new InterfaceTexte();
            it.demarrerPartie("Z", 2);

            String printed = out.toString();
            assertTrue(printed.contains("Perdu") || printed.contains("Perdu !"));
            assertTrue(printed.contains("Z"));
        } finally {
            System.setOut(originalOut);
            System.setIn(originalIn);
        }
    }
}
