package com.mycompany.exam_medev_final;

import java.util.HashSet;
import java.util.Set;

/**
 * Représente l'état interne d'une partie de pendu à un instant donné.
 * Gère le mot secret, les tentatives et le compteur d'erreurs.
 */
public class TourDeJeu {
    /** Le mot à découvrir par le joueur. */
    private final String motSecret;

    /** Ensemble des lettres déjà tentées par le joueur pour éviter les doublons. */
    private final Set<Character> lettresProposees;

    /** Compteur du nombre d'erreurs effectuées depuis le début de la partie. */
    private int erreursCommises;

    /** Limite d'erreurs autorisées avant que la partie ne soit déclarée perdue. */
    private final int maxErreurs;

    /**
     * @param motSecret Le mot à deviner.
     * @param maxErreurs Nombre d'erreurs autorisées avant la défaite.
     */
    public TourDeJeu(String motSecret, int maxErreurs) {
        this.motSecret = motSecret.toUpperCase();
        this.maxErreurs = maxErreurs;
        this.lettresProposees = new HashSet<>();
        this.erreursCommises = 0;
    }

    /**
     * Génère la représentation visuelle du mot (ex: A _ _ E).
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
    /**
     * @return Le mot secret complet à deviner.
     */
    public String getMotSecret() { return motSecret; }

    /**
     * @return L'ensemble des caractères déjà proposés par le joueur.
     */
    public Set<Character> getLettresProposees() { return lettresProposees; }

    /**
     * @return Le nombre total d'erreurs commises jusqu'à présent.
     */
    public int getErreursCommises() { return erreursCommises; }

    /**
     * Incrémente de 1 le compteur d'erreurs commises.
     */
    public void incrementerErreurs() { this.erreursCommises++; }

    /**
     * Calcule le nombre de tentatives restantes.
     * @return La différence entre le maximum autorisé et les erreurs commises.
     */
    public int getErreursRestantes() { return maxErreurs - erreursCommises; }

    /**
     * @return Le nombre maximum d'erreurs autorisées pour la partie.
     */
    public int getMaxErreurs() { return maxErreurs; }
}