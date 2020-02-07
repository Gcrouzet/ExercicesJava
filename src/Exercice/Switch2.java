/**
 * 
 */
package Exercice;

import java.util.Scanner;

/** Découverte du switch et utilisation d'une constante (final)
 * @author Crouzet Gabriel
 * @version 2.0
 * @since 22/01/20
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
		final String REF = "Vous êtes en cours de réflexion.";
		final String CHOIXCDA = "C";
		final String CHOIXDWWM = "D";
		final String CHOIXREORIENTATION = "R";
		final String CHOIXREFLEXION = "E";
		Scanner rectangle = new Scanner(System.in);
		System.out.println("Choisissez une formation qualifiante parmi les propositions suivantes :" + "(C) : CDA"
				+ " (D) : DWWM" + " (R) : Réorientation" + " (E) : En cours de réflexion");
		String lettre = rectangle.nextLine();
		rectangle.close();
		String choix = lettre;
		switch (choix) {
		case CHOIXCDA:
			System.out.println(CDA);
			break;
		case CHOIXDWWM:
			System.out.println(DWWM);
			break;
		case CHOIXREORIENTATION:
			System.out.println(REO);
			break;
		case CHOIXREFLEXION:
			System.out.println(REF);
			break;
		default:
			System.out.println("Choisir entre C, D, R ou E");
		}
	}
}
