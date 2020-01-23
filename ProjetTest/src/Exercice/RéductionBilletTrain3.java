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
public class RéductionBilletTrain3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner rectangle = new Scanner(System.in);
		System.out.println("Veuillez saisir votre âge:");
		int age = rectangle.nextInt();
		rectangle.close();

		boolean age1 = age >= 25 && age <= 60 ? true : false;
		if (age1 == true) {
			System.out.println("Vous n'avez droit à aucune réduction.");
		} else {
			System.out.print("Vous avez le droit à une réduction");
		}
		if (age < 25) {
			System.out.println(" de 50%");
		} else if (age >= 60) {
			System.out.println(" de 30%");
		}
	}

}
