/**
 * 
 */
package Exercice;

import java.util.Scanner;

/**
 * @author Crouzet Gabriel
 * @version 1.0
 * @since 22/01/20
 *
 */
public class ComparerChaine {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner rectangle = new Scanner(System.in);
		System.out.println("Veuillez saisir votre Login :");
		String login = rectangle.nextLine();
		System.out.println("Veuillez saisir votre mdp :");
		String mdp = rectangle.nextLine();
		rectangle.close();
		final String MDP = "CDI1234";
		final String LOGIN = "CRM";
		boolean mdp2 = mdp.equals(MDP);
		boolean login2 = login.equals(LOGIN);
		boolean connexion = login2 && mdp2;

		if (connexion != false) {
			System.out.println("Connexion réussie");

		} else {
			System.out.println("Identifiant érroné");
		}

	}

}
