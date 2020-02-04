/**
 * 
 */
package Exercice;

import java.util.Scanner;

/**
 * @author CRM
 *
 */
public class Login2D {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Création tableau 2D
		String[][] tab2D = { { "Joanna", "Sylvain", "Reda", "Laurent", "Tim" },
				{ "152z", "elephant", "carambar", "???", "0234" } };
		// Ouverture scanner
		Scanner sc = new Scanner(System.in);
		// Saisie utilisateur login
		System.out.println("Veuillez saisir votre login:");
		String login1 = sc.nextLine();
		// Parcours tableau
		for (int i = 0; i < tab2D[0].length; i++) {
			// Compare scanner et tableau
			if (tab2D[0][i].equalsIgnoreCase(login1)) {
				// Stock le mdp
				String mdp1 = tab2D[1][i];
				// Saisie utilisateur mdp
				System.out.println("Veuillez saisir votre mot de passe:");
				String mdp = sc.nextLine();
				sc.close();
				// Compare mdp
				if (mdp.equalsIgnoreCase(mdp1)) {
					System.out.println("Connexion reussie");
					return;
				} else {
					System.out.println("Mauvais Mot de Passe");
				}
			} else if (i == tab2D[0].length - 1) {
				System.out.println("Mauvais Login!");
			}
			
		}
		
	}

}
