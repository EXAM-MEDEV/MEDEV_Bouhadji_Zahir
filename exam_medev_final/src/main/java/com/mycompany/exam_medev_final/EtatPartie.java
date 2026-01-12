/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package com.mycompany.exam_medev_final;

/**
 *
 * @author Yasmine Bouhadji & Ikram Zahir
 */

/**
 * Représente les différents états possibles d'une partie de pendu.
 */
public enum EtatPartie {
    /** La partie est toujours en cours, le joueur peut encore proposer des lettres. */
    EN_COURS,
    
    /** Le joueur a trouvé toutes les lettres du mot avant d'atteindre le maximum d'erreurs. */
    GAGNEE,
    
    /** Le joueur a épuisé son nombre d'essais sans trouver le mot. */
    PERDUE
}
