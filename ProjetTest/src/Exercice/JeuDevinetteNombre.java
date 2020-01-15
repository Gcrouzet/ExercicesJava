/**
 * 
 */
package Exercice;

import java.util.Scanner;

/**
 * @author CRM
 *
 */
public class JeuDevinetteNombre {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int essai = 1;
		int nbrAleatoire = (int) (Math.random() * (100));
	 System.out.println(nbrAleatoire);

		Scanner nbrChoisi = new Scanner(System.in);
		System.out.println("Veuillez saisir un nombre entre 1 et 100 :");
		int nbr = nbrChoisi.nextInt();

		while (nbr != nbrAleatoire) {
			if (nbr < nbrAleatoire) {
				System.out.print("C'est plus, ");

			} else {
				System.out.print("C'est moins, ");
			}
			System.out.println("veuillez saisir un nombre entre 1 et 100 :");
			nbr = nbrChoisi.nextInt();
			essai++;
			
			if (nbr == nbrAleatoire) {
				System.out.println("Bravo!!!");
				System.out.println("Vous l'avez trouvé en "+essai+" essais");
			}
		}
		nbrChoisi.close();

	}
}