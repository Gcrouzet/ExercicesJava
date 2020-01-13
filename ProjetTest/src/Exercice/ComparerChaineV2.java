/**
 * 
 */
package Exercice;

import java.util.Scanner;

/**
 * @author CRM
 *
 */
public class ComparerChaineV2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		final String LOGIN = "CRM";
		final String MDP = "CDI1234";
		Scanner rectangle = new Scanner(System.in);
		System.out.println("Veuillez saisir votre Login :");
		String login = rectangle.nextLine();
		boolean log = login.equals(LOGIN);
		if (log == true) {
			System.out.println("Veuillez saisir votre mdp :");
			String mdp = rectangle.nextLine();
			rectangle.close();
			boolean motDePasse = mdp.equals(MDP);
			if (motDePasse == true) {
				System.out.println("Connexion réussie");
			} else {
				System.out.println("Mot de passe érroné");
			}
		} else {
			System.out.println("Login inconnu");
		}

	}

}
