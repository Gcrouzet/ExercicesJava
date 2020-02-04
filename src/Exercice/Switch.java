package Exercice;

import java.util.Scanner;
/** Découverte du switch et utilisation d'une constante (final)
 * @author Crouzet Gabriel
 * @version 1.0
 * @since 22/01/20
 *
 */
public class Switch {

	public static void main(String[] args) {
		final String LUNDI = "Monday";
		Scanner rectangle = new Scanner(System.in);
		System.out.println("Veuillez saisir un chiffre entier entre 1 et 7 :");
		int day = rectangle.nextInt();
		rectangle.close();

		switch (day) {
		case 1:
			System.out.println(LUNDI);
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Wednesday");
			break;
		case 4:
			System.out.println("Thursday");
			break;
		case 5:
			System.out.println("Friday");
			break;
		case 6:
			System.out.println("Saturday");
			break;
		case 7:
			System.out.println("Sunday");
			break;
		default:
			System.out.println("Entre 1 et 7 svp");
			break;
		}

	}

}