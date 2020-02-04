/**
 * 
 */
package Exercice;

import java.util.Scanner;

/**  Jeu de devinette, utilisation de while/if/Math.random
 * @author Crouzet Gabriel
 * @version 1.0
 * @since 22/01/20
 *
 */
public class JeuDevinetteNombre {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		byte nbrAleatoire = (byte) (Math.random() * (100));
		// System.out.println(nbrAleatoire);

		Scanner nbrChoisi = new Scanner(System.in);
		System.out.println("Veuillez saisir un nombre entier entre 0 et 100 :");

		byte nbr = nbrChoisi.nextByte();

		while (nbr != nbrAleatoire) {
			if (nbr < nbrAleatoire) {
				System.out.print("C'est plus, ");

			} else {
				System.out.print("C'est moins, ");
			}
			System.out.println("veuillez saisir un nombre entre 0 et 100 :");
			nbr = nbrChoisi.nextByte();
		}

		if (nbr == nbrAleatoire) {
			System.out.println("Bravo!!!");
		}

		nbrChoisi.close();

	}

}
