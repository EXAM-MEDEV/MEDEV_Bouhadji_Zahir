package com.mycompany.exam_medev_final;

import java.util.Scanner;

/**
 * Gère l'affichage et les interactions avec l'utilisateur[cite: 53].
 */
public class InterfaceTexte {
    private EtatJeu moteur;
    private final Scanner scanner = new Scanner(System.in);

    public void demarrerPartie(String motSecret, int maxErreurs) {
        moteur = new EtatJeu(motSecret, maxErreurs);

        while (!moteur.estGagne() && !moteur.estPerdu()) {
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
}