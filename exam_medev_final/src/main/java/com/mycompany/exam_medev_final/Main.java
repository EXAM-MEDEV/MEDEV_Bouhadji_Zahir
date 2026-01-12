/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exam_medev_final;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        InterfaceTexte interfaceJeu = new InterfaceTexte();
        Dictionnaire dico = new Dictionnaire();

        System.out.println("=== BIENVENUE AU JEU DU PENDU (MEDEV 2026) ===");
        System.out.println("1. Mode Solo (Dictionnaire)");
        System.out.println("2. Mode Duel (Mot choisi par un ami)");
        System.out.print("Choisissez un mode : ");
        
        int choix = sc.nextInt();
        sc.nextLine(); // Consommer le retour ligne

        String motatrouver = "";
        int maxErreurs = 7; // Paramétrable selon le sujet [cite: 45]

        if (choix == 1) {
            try {
                // Chemin réel de votre fichier
                dico.chargerMots("mots.txt"); 
                motatrouver = dico.choisirMotAleatoire();
            } catch (IOException e) {
                System.err.println("Erreur de dictionnaire : " + e.getMessage());
                return;
            }
        } else {
            System.out.print("Joueur 1, entrez le mot secret : ");
            motatrouver = sc.nextLine();
            // On "efface" la console pour cacher le mot
            for(int i=0; i<50; i++) System.out.println(); 
        }

        // Lancement de la boucle de jeu via l'interface [cite: 53]
        interfaceJeu.demarrerPartie(motatrouver, maxErreurs);
        
        sc.close();
    }
}