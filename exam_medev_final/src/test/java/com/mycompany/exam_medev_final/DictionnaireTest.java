package com.mycompany.exam_medev_final;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class DictionnaireTest {

    @Test
    public void testChargerMotsAndChoisirMot() throws IOException {
        File tmp = Files.createTempFile("dico", ".txt").toFile();
        tmp.deleteOnExit();
        Files.write(tmp.toPath(), Arrays.asList("apple", "banana", "Cherry"));

        Dictionnaire d = new Dictionnaire();
        d.chargerMots(tmp.getAbsolutePath());

        String chosen = d.choisirMotAleatoire();
        assertNotNull(chosen);
        // words are stored upper-cased
        assertTrue(Arrays.asList("APPLE", "BANANA", "CHERRY").contains(chosen));
    }

    @Test
    public void testChargerMotsFileNotFound() {
        Dictionnaire d = new Dictionnaire();
        assertThrows(IOException.class, () -> d.chargerMots("non-existent-file-xyz.txt"));
    }

    @Test
    public void testChargerMotsEmptyFile() throws IOException {
        File tmp = Files.createTempFile("dico-empty", ".txt").toFile();
        tmp.deleteOnExit();
        // leave file empty

        Dictionnaire d = new Dictionnaire();
        assertThrows(IOException.class, () -> d.chargerMots(tmp.getAbsolutePath()));
    }
}
