/**
 * 
 */
package Exercice;

import java.util.Scanner;

/**
 * @author CRM
 *
 */
public class Switch2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		final String CDA = "Vous avez choisi de suivre la formation Concepteur Développeur d'Applications.";
		final String DWWM = "Vous avez choisi de suivre la formation Développeur Web, Web Mobile.";
		final String REO = "Vous avez choisi de vous réorienter.";
		final String REF ="Vous êtes en cours de réflexion.";
		Scanner rectangle = new Scanner(System.in);
		System.out.println("Choisissez une formation qualifiante parmi les propositions suivantes :" + "(C) : CDA"
				+ " (D) : DWWM" + " (R) : Réorientation" + " (E) : En cours de réflexion");
		char lettre = rectangle.next().charAt(0);
		rectangle.close();
		char choix = lettre;
		switch (choix) {
		case 'C':
			System.out.println(CDA);
			break;
		case 'D':
			System.out.println(DWWM);
			break;
		case 'R':
			System.out.println(REO);
			break;
		case 'E':
			System.out.println(REF);
			break;
		}
	}
}
