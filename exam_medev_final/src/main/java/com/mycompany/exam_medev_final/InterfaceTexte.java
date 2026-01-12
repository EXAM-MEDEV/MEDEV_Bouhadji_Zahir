package com.mycompany.exam_medev_final;

import java.util.Scanner;

/**
 * Gère l'affichage et les interactions avec l'utilisateur.
 */
public class InterfaceTexte {

    /**
     * * Référence vers le moteur de jeu qui gère la logique et l'état du pendu.
     */
    private EtatJeu moteur;

    /**
     * * Outil de lecture des entrées utilisateur via la console.
     */
    private final Scanner scanner = new Scanner(System.in);

    /**
     * Initialise et démarre une nouvelle session de jeu.
     *
     * @param motSecret Le mot que le joueur doit découvrir.
     * @param maxErreurs Le nombre de tentatives autorisées avant la fin de la
     * partie.
     */
    public void demarrerPartie(String motSecret, int maxErreurs) {
        moteur = new EtatJeu(motSecret, maxErreurs);

        while (!moteur.estGagne() && !moteur.estPerdu()) {
            // 1. Affichage du dessin
            dessinerPendu(moteur.getEtat().getErreursCommises());
            System.out.println("\nMot : " + moteur.getEtat().getMotAffiche());
            System.out.println("Tentatives : " + moteur.getEtat().getLettresProposees());
            System.out.println("Erreurs restantes : " + moteur.getEtat().getErreursRestantes());
            System.out.print("Proposez une lettre : ");

            try {
                char c = scanner.next().charAt(0);
                moteur.jouerTour(c);
            } catch (IllegalArgumentException e) {
                System.out.println("Erreur : " + e.getMessage());
            }
        }

        if (moteur.estGagne()) {
            System.out.println("Félicitations ! Le mot était : " + motSecret);
        } else {
            System.out.println("Perdu ! Le mot était : " + motSecret);
        }
    }

    /**
     * Affiche le dessin de la potence en fonction du nombre d'erreurs.
     *
     * @param nbErreurs Nombre d'erreurs commises par le joueur.
     */
    private void dessinerPendu(int nbErreurs) {
        switch (nbErreurs) {
            case 0:
                System.out.println("\n\n\n\n\n========");
                break;
            case 1:
                System.out.println("  +---+\n  |   |\n      |\n      |\n      |\n      |\n========");
                break;
            case 2:
                System.out.println("  +---+\n  |   |\n  O   |\n      |\n      |\n      |\n========");
                break;
            case 3:
                System.out.println("  +---+\n  |   |\n  O   |\n  |   |\n      |\n      |\n========");
                break;
            case 4:
                System.out.println("  +---+\n  |   |\n  O   |\n /|   |\n      |\n      |\n========");
                break;
            case 5:
                System.out.println("  +---+\n  |   |\n  O   |\n /|\\  |\n      |\n      |\n========");
                break;
            case 6:
                System.out.println("  +---+\n  |   |\n  O   |\n /|\\  |\n /    |\n      |\n========");
                break;
            case 7:
                System.out.println("  +---+\n  |   |\n  O   |\n /|\\  |\n / \\  |\n      |\n========");
                break;
        }
    }
}
