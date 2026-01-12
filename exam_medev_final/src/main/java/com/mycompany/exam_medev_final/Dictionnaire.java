package com.mycompany.exam_medev_final;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Charge les mots depuis un fichier et sélectionne un mot aléatoire[cite: 80, 82].
 */
public class Dictionnaire {
    /** Liste stockant l'ensemble des mots chargés depuis le fichier dictionnaire. */
    private List<String> listeMots = new ArrayList<>();

    /**
     * Charge les mots en ignorant les lignes vides et les mots invalides[cite: 81].
     * @param chemin Chemin du fichier de dictionnaire.
     * @throws IOException Si le fichier est introuvable ou illisible. // Ajoutez cette ligne
    */
    public void chargerMots(String chemin) throws IOException {
        File file = new File(chemin);
        if (!file.exists()) throw new FileNotFoundException("Fichier dictionnaire absent[cite: 81].");

        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String ligne;
            while ((ligne = reader.readLine()) != null) {
                if (!ligne.trim().isEmpty()) {
                    listeMots.add(ligne.trim().toUpperCase());
                }
            }
        }
        if (listeMots.isEmpty()) throw new IOException("Le dictionnaire est vide[cite: 81].");
    }
/**
 * Sélectionne un mot de manière aléatoire parmi la liste des mots chargés.
* @return Une chaîne de caractères (String) représentant le mot secret choisi.
 */
    public String choisirMotAleatoire() {
        return listeMots.get(new Random().nextInt(listeMots.size()));
    }
}