/**
 * 
 */
package Exercice;

import java.util.Scanner;

/**
 * @author CRM
 *
 */
public class MaxNombreV2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner rectangle = new Scanner(System.in);
		System.out.println("Veuillez saisir le premier nombre :");
		int nb1 = rectangle.nextInt();
		System.out.println("Veuillez saisir le second nombre :");
		int nb2 = rectangle.nextInt();
		System.out.println("Veuillez saisir le troisième nombre :");
		int nb3 = rectangle.nextInt();
		rectangle.close();

		if (nb1 < nb2) {
			if (nb2 < nb3) {
				System.out.println("Le plus grand nombre est: " + nb3);
			} else {
				System.out.println("Le plus grand nombre est: " + nb2);
			}
		} else {
			if (nb1 > nb3) {
				System.out.println("Le plus grand nombre est: " + nb1);
			}

		}
	}

}
