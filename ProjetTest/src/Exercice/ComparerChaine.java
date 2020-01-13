/**
 * 
 */
package Exercice;

import java.util.Scanner;

/**
 * @author CRM
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
		String mdp1 = "CDI1234";
		String login1 = "CRM";
		boolean mdp2 = mdp.equals(mdp1);
		boolean login2 = login.equals(login1);
		boolean connexion = login2 && mdp2;

		if (connexion != false) {
			System.out.println("Connexion réussie");

		} else {
			System.out.println("Identifiant érroné");
		}

	}

}
