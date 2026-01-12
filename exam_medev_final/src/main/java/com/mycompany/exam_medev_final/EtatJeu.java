package com.mycompany.exam_medev_final;

/**
 * Gère la logique métier, les validations et les transitions d'état du jeu[cite: 68, 93].
 */
public class EtatJeu {
    private final EtatJeu etat;

    public EtatJeu(String mot, int maxErreurs) {
        this.etat = new EtatJeu(mot, maxErreurs);
    }

    /**
     * Traite une proposition de lettre.
     * @param lettre La lettre proposée par le joueur.
     * @return true si la lettre est dans le mot, false sinon.
     * @throws IllegalArgumentException si le caractère n'est pas alphabétique[cite: 49].
     */
    public boolean jouerTour(char lettre) {
        lettre = Character.toUpperCase(lettre);

        if (!Character.isLetter(lettre)) {
            throw new IllegalArgumentException("Seuls les caractères alphabétiques sont autorisés[cite: 49].");
        }

        // Si déjà proposée, on ne fait rien (pas d'erreur supplémentaire)[cite: 46, 94].
        if (etat.getLettresProposees().contains(lettre)) {
            return false;
        }

        etat.getLettresProposees().add(lettre);

        if (etat.getMotSecret().indexOf(lettre) == -1) {
            etat.incrementerErreurs();
            return false;
        }
        return true;
    }

    /**
     * Vérifie si la partie est terminée[cite: 59].
     */
    public boolean estGagne() { return !etat.getMotAffiche().contains("_"); }
    public boolean estPerdu() { return etat.getErreursCommises() >= etat.getMaxErreurs(); }
    public EtatJeu getEtat() { return etat; }
}