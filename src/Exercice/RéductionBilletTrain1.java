/**
 * 
 */
package Exercice;

import java.util.Scanner;

/** réduction billet de train en fonction de l'âge if/else
 * @author Crouzet Gabriel
 * @version 1.0
 * @since 22/01/20
 *
 */
public class RéductionBilletTrain1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner rectangle = new Scanner(System.in);
		System.out.println("Veuillez saisir votre âge:");
		int age = rectangle.nextInt();
		rectangle.close();

		if (age >= 25) {
			if (age >= 60) {
				System.out.println("Vous avez le droit à une réduction de 30%.");
			} else {
				System.out.println("Vous n'avez droit à aucune réduction.");
			}

		} else {
			System.out.println("Vous avez le droit à une réduction de 50%.");
		}
	}

}
