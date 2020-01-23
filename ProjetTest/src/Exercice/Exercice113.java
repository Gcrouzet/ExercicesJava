package Exercice;
import java.util.Scanner;
/** Exercice 1.1.3 algo
 * @author Crouzet Gabriel
 * @version 1.0
 * @since 22/01/20
 *
 */
public class Exercice113 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char reponse = 'O';
		float resultat, moyenne;
		int somme = 0;
		resultat = 0;

		while (reponse == 'O') {

			System.out.println("veuillez saisir un nombre :");
			float x = sc.nextFloat();
			resultat = x + resultat;
			somme = somme +1;
			System.out.println("Voulez-vous ajoutez un nombre ? (O/N)");
			Scanner sc2 = new Scanner(System.in);
			reponse = sc2.nextLine().charAt(0);
		}
			
			moyenne = resultat/somme;
			
			System.out.println("La moyenne est de " + moyenne);

			

		System.out.println("Au revoir…");
	}
}



