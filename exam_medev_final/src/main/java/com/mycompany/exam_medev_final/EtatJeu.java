package com.mycompany.exam_medev_final;

/**
 * Gère la logique métier, les validations et les transitions d'état du jeu.
 */
public class EtatJeu {
    /** 
     * Référence vers l'état actuel du tour de jeu. 
     * Cet objet contient les informations sur le mot en cours et les erreurs.
     */
    private final TourDeJeu etat;

    /**
     * Constructeur de la classe EtatJeu.
     * @param mot Le mot secret à deviner pour la partie.
     * @param maxErreurs Le nombre maximal d'erreurs autorisées avant la défaite.
     */
    public EtatJeu(String mot, int maxErreurs) {
        this.etat = new TourDeJeu(mot, maxErreurs);
    }

    /**
     * Traite une proposition de lettre.
     * @param lettre La lettre proposée par le joueur.
     * @return true si la lettre est dans le mot, false sinon.
     * @throws IllegalArgumentException si le caractère n'est pas alphabétique.
     */
    public boolean jouerTour(char lettre) {
        lettre = Character.toUpperCase(lettre);

        if (!Character.isLetter(lettre)) {
            throw new IllegalArgumentException("Seuls les caractères alphabétiques sont autorisés[cite: 49].");
        }

        // Si déjà proposée, on ne fait rien (pas d'erreur supplémentaire).
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
     * Vérifie si la partie est gagnée.
     * @return true si le mot ne contient plus de caractères masqués ('_'), false sinon.
     */
    public boolean estGagne() { return !etat.getMotAffiche().contains("_"); }

    /**
     * Vérifie si la partie est perdue.
     * @return true si le nombre d'erreurs commises atteint ou dépasse le maximum autorisé.
     */
    public boolean estPerdu() { return etat.getErreursCommises() >= etat.getMaxErreurs(); }
    /**
     * Fournit l'accès à l'état actuel de la partie.
     * @return L'objet TourDeJeu contenant les données de la partie en cours.
     */
    public TourDeJeu getEtat() { return etat; }
}