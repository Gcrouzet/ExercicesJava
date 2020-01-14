/**
 * 
 */
package Exercice;

import java.util.Scanner;

/**
 * @author CRM
 *
 */
public class RéductionBilletTrain2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner rectangle = new Scanner(System.in);
		System.out.println("Veuillez saisir votre âge:");
		int age = rectangle.nextInt();
		rectangle.close();

		if (age < 25) {
			System.out.println("Vous avez le droit à une réduction de 50%.");
		} else if (age >= 60) {
			System.out.println("Vous avez le droit à une réduction de 30%.");
		}
		else {
			System.out.println("Vous n'avez droit à aucune réduction.");
		}

	}

}
