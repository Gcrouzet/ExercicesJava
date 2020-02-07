/**
 * 
 */
package Exercice;

import java.util.Scanner;

/** Exercice tableau 2D
 * @author Crouzet Gabriel
 * @version 1.0
 * @since 01/02/20
 *
 */
public class Tableau2DJour {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Déclaration constante
		final String FR = "français";
		final String EN = "anglais";

		// Création tableau 2D
		String[][] tab2Dim = { { "Lundi", "Mardi", "Mercredi", "Jeudi", "Vendredi", "Samedi", "Dimanche" },
				{ "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday" } };
		// Ouverture scanner
		Scanner sc = new Scanner(System.in);
		// Saisie utilisateur langage
		System.out.println("Veuillez saisir la langue :");
		String langue = sc.nextLine();
		// Si l'utilisateur choisit le français
		if (langue.equalsIgnoreCase(FR)) {
			// Saisie jour
			System.out.println("Veuillez saisir un jour de la semaine en français");
			String jourFR = sc.nextLine();
			sc.close();
			// Parcours tableau 1
			for (int i = 0; i < tab2Dim[0].length; i++) {
				// Comparaison jour et tableau 1
				if (jourFR.equalsIgnoreCase(tab2Dim[0][i])) {
					// Afficher la traduction
					System.out.println(tab2Dim[1][i]);
					return;
				}
				// Si retour négatif = erreur
				
					
				

			}
			System.out.println("Erreur");
			// Si l'utilisateur choisit l'anglais
		} else if (langue.equalsIgnoreCase(EN)) {
			// Saisie jour
			System.out.println("Veuillez saisir un jour de la semaine en anglais");
			String jourEN = sc.nextLine();
			sc.close();
			// Parcours tableau 2
			for (int i = 0; i < tab2Dim[1].length; i++) {
				// Comparaison jour et tableau 2
				if (jourEN.equalsIgnoreCase(tab2Dim[1][i])) {
					// Afficher la traduction
					System.out.println(tab2Dim[0][i]);
					return;

				}
				
					
				
			}
			System.out.println("Erreur");
		} else {
			// langue inconnue
			System.out.println("Veuillez saisir Anglais ou Français");
		}

	}

}
