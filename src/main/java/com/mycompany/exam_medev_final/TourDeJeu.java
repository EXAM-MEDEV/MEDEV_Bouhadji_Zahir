package com.mycompany.exam_medev_final;

import java.util.HashSet;
import java.util.Set;

/**
 * Représente l'état interne d'une partie de pendu à un instant donné.
 * Gère le mot secret, les tentatives et le compteur d'erreurs.
 */
public class TourDeJeu {
    private final String motSecret;
    private final Set<Character> lettresProposees;
    private int erreursCommises;
    private final int maxErreurs;

    /**
     * @param motSecret Le mot à deviner.
     * @param maxErreurs Nombre d'erreurs autorisées avant la défaite[cite: 45].
     */
    public TourDeJeu(String motSecret, int maxErreurs) {
        this.motSecret = motSecret.toUpperCase();
        this.maxErreurs = maxErreurs;
        this.lettresProposees = new HashSet<>();
        this.erreursCommises = 0;
    }

    /**
     * Génère la représentation visuelle du mot (ex: A _ _ E)[cite: 55, 74].
     * @return Le mot avec les lettres non découvertes masquées par des underscores.
     */
    public String getMotAffiche() {
        StringBuilder sb = new StringBuilder();
        for (char c : motSecret.toCharArray()) {
            if (lettresProposees.contains(c)) {
                sb.append(c).append(' ');
            } else {
                sb.append("_ ");
            }
        }
        return sb.toString().trim();
    }

    // Getters et Setters pour la logique métier
    public String getMotSecret() { return motSecret; }
    public Set<Character> getLettresProposees() { return lettresProposees; }
    public int getErreursCommises() { return erreursCommises; }
    public void incrementerErreurs() { this.erreursCommises++; }
    public int getErreursRestantes() { return maxErreurs - erreursCommises; }
    public int getMaxErreurs() { return maxErreurs; }
}